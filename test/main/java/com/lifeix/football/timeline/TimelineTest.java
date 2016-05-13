package com.lifeix.football.timeline;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.lifeix.football.BaseTest;

import io.swagger.client.api.TlcompetitionApi;
import io.swagger.client.api.TlteamApi;
import io.swagger.client.model.TLCompetition;
import io.swagger.client.model.TLPlayer;
import io.swagger.client.model.TLTeam;

public class TimelineTest {

	private static final int NUM = 12;

	TlcompetitionApi tlcompetitionApi = new TlcompetitionApi();

	TlteamApi tlteamApi = new TlteamApi();

	@Test
	public void test() throws Exception {
		List<TLTeam> teams = readTeams();
		Assert.assertNotNull(teams);
		Assert.assertEquals(NUM, teams.size());
		for (TLTeam tlTeam : teams) {
			Assert.assertNotNull(tlTeam);
			Assert.assertNotNull(tlTeam.getId());
			Assert.assertNotNull(tlTeam.getName());
			Assert.assertNotNull(tlTeam.getIcon());
			Assert.assertNotNull(tlTeam.getPlayers());
			List<TLPlayer> players = tlTeam.getPlayers();
			for (TLPlayer tlPlayer : players) {
				Assert.assertNotNull(tlPlayer);
				Assert.assertNotNull(tlPlayer.getId());
				Assert.assertNotNull(tlPlayer.getName());
				Assert.assertEquals(tlTeam.getName(), tlPlayer.getTeam());
				Assert.assertNotNull(tlPlayer.getCountry());
				Assert.assertNotNull(tlPlayer.getPosition());
				Assert.assertNotNull(tlPlayer.getShowNum());
				// Assert.assertNotNull(tlPlayer.getClub());
			}
		}
		/**
		 * 校验队伍
		 */
		List<TLCompetition> competitions = readCompetitions();
		Assert.assertNotNull(competitions);
		Assert.assertEquals(NUM, competitions.size());

		/**
		 * 查看数据都是一致的
		 */
		for (TLCompetition tlCompetition : competitions) {
			TLTeam hostTeam = tlCompetition.getHostTeam();
			checkTeam(teams, hostTeam);

			TLTeam guestTeam = tlCompetition.getGuestTeam();
			checkTeam(teams, guestTeam);
		}
	}

	private void checkTeam(List<TLTeam> teams, TLTeam team) {
		TLTeam result = findTeam(teams, team.getName());
		Assert.assertNotNull(result);
		compare(result, team);
	}

	private void compare(TLTeam expect, TLTeam acture) {
		Assert.assertEquals(expect.getId(), acture.getId());
		Assert.assertEquals(expect.getName(), acture.getName());
		Assert.assertEquals(expect.getIcon(), acture.getIcon());
	}

	private TLTeam findTeam(List<TLTeam> teams, String name) {
		for (TLTeam tlTeam : teams) {
			if (tlTeam.getName().equals(name)) {
				return tlTeam;
			}
		}
		return null;
	}

	private List<TLTeam> readTeams() throws Exception {
		return tlteamApi.getTLTeamList(BaseTest.getVisitorKey());
	}

	private List<TLCompetition> readCompetitions() throws Exception {
		return tlcompetitionApi.getTLCompetitions(BaseTest.getVisitorKey());
	}

}
