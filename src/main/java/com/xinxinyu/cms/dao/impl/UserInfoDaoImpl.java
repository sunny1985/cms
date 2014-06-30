package com.xinxinyu.cms.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.xinxinyu.cms.dao.IUserInfoDao;
import com.xinxinyu.cms.pojo.UserInfo;
import com.xinxinyu.framework.dao.BaseDao;

@Repository
public class UserInfoDaoImpl extends BaseDao<UserInfo> implements IUserInfoDao{

	@Override
	public void save(UserInfo user) {
		// TODO Auto-generated method stub
		super.save(user);
	}
}
