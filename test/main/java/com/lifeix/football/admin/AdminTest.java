package com.lifeix.football.admin;

import java.util.List;

import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.api.AdminsApi;
import io.swagger.client.model.Admin;
import junit.framework.Assert;

public class AdminTest {

	AdminsApi adminsApi = new AdminsApi();

	@Test
	public void test() throws ApiException {
		Admin admin = createRandomAdmin();
		/**
		 * 注册一个Admin
		 */
		Admin registResult = adminsApi.registAdmin(admin);
		assertResult(registResult, admin);
		/**
		 * Admin 登录
		 */
		Admin loginResult = adminsApi.loginAdmin(admin);
		assertResult(loginResult, admin);
		/**
		 * 获得Admins列表
		 */
		List<Admin> adminList = adminsApi.getAdminList(loginResult.getKey());
		Assert.assertNotNull(adminList);
		boolean exist = false;
		for (Admin temp : adminList) {
			if (admin.getEmail().equals(temp.getEmail())) {
				exist = true;
			}
		}
		if (!exist) {
			Assert.fail();
		}
	}

	private void assertResult(Admin acture, Admin expect) {
		Assert.assertNotNull(acture);
		Assert.assertNotNull(acture.getId());
		Assert.assertNull(acture.getPassword());
		Assert.assertEquals(expect.getEmail(), acture.getEmail());
		Assert.assertEquals(expect.getName(), acture.getName());
		Assert.assertNotNull(acture.getKey());
	}

	private Admin createRandomAdmin() {
		Admin admin = new Admin();
		admin.setEmail(System.currentTimeMillis() + "@l99.com");
		admin.setPassword("123456");
		admin.setName("guangwei" + System.currentTimeMillis());
		return admin;
	}
}
