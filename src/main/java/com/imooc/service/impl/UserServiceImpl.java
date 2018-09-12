package com.imooc.service.impl;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import com.imooc.service.UserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersMapper userMapper;
	
	@Autowired
	private Sid sid;

	@Transactional(propagation = Propagation.SUPPORTS)
	@Override
	public boolean queryUserNameIsExists(String username) {
		Users user = new Users();
		user.setUsername(username);
		Users result = userMapper.selectOne(user);
		// TODO Auto-generated method stub
		return result == null ? false : true;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void saveUser(Users user) {
		// TODO Auto-generated method stub
		String userId = sid.nextShort();
		user.setId(userId);
		userMapper.insert(user);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public Users queryUserForLogin(String username, String password) {
		// TODO Auto-generated method stub
		Example userExample = new Example(Users.class);
		Criteria criteria = userExample.createCriteria();
		criteria.andEqualTo("username",username);
		criteria.andEqualTo("password",password);
		Users result = userMapper.selectOneByExample(userExample);
		return result;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void updateUserInfo(Users user) {
		// TODO Auto-generated method stub
		Example userExample = new Example(Users.class);
		Criteria criteria = userExample.createCriteria();
		criteria.andEqualTo("id",user.getId());
		userMapper.updateByExampleSelective(user, userExample);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	@Override
	public Users queryUserInfo(String userId) {
		// TODO Auto-generated method stub
		Example userExample = new Example(Users.class);
		Criteria criteria = userExample.createCriteria();
		criteria.andEqualTo("id",userId);
		return userMapper.selectOneByExample(userExample);
	}

}
