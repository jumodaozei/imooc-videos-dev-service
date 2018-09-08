package com.imooc.service;

import com.imooc.pojo.Users;

public interface UserService {
	/**
	 * 判断用户名是否存在
	 * @param username
	 * @return
	 */
	public boolean queryUserNameIsExists(String username);
	
	/**
	 * 保存用户信息
	 * @param user
	 */
	public void saveUser(Users user);
}
