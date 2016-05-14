package com.lifeix.football.timeline;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.lifeix.football.BaseTest;

import io.swagger.client.ApiException;
import io.swagger.client.api.TlcompetitionApi;
import io.swagger.client.api.TlteamApi;
import io.swagger.client.model.TLCompetition;
import io.swagger.client.model.TLTeam;

public class TimelineTest {

    TlcompetitionApi tlcompetitionApi = new TlcompetitionApi();

    TlteamApi tlteamApi = new TlteamApi();

    String apiKey = BaseTest.getAdminAPIKey();

    @Test
    public void test() throws ApiException {
        /**
         * 获得12场比赛信息
         */
        List<TLCompetition> competitionList = tlcompetitionApi.getTLCompetitions(apiKey);
        Assert.assertNotNull(competitionList);
        for (TLCompetition tlCompetition : competitionList) {
        }

        /**
         * 获得国家队ID
         */
        String tlteamId = null;
        TLTeam tlTeam = tlteamApi.getTLTeam(apiKey, tlteamId);
        Assert.assertNotNull(tlTeam);
        Assert.assertNotNull(tlTeam.getPlayers());

    }

}
