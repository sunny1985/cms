package com.xinxinyu.cms.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xinxinyu.cms.pojo.UserInfo;
import com.xinxinyu.framework.BaseTest;

public class UserInfoDaoTest extends BaseTest{
	
	@Autowired
	private IUserInfoDao dao;

	@Test
	public void saveTest(){
		UserInfo user = new UserInfo();
		
		user.setId(111);
		user.setAge(21);
		user.setName("aaa");
		
		dao.save(user);
	}
}
