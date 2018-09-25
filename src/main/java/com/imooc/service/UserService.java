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
	
	/**
	 * 判断用户是否存在
	 * @return
	 */
	public Users queryUserForLogin(String username,String password);
	
	/**
	 * 用户修改信息
	 * @param user
	 */
	public void updateUserInfo(Users user);
	
	/**
	 * 查询用户信息
	 * @param userId
	 * @return
	 */
	public Users queryUserInfo(String userId);
	
	public boolean isUserLikeVideo(String userId,String videoId);
	
	/**
	 * 增加用户和粉丝的关系
	 * @param userId
	 * @param fanId
	 */
	public void saveUserFanRelation(String userId,String fanId);
	
	/**
	 * 删除用户和粉丝的关系
	 * @param userId
	 * @param fanId
	 */
	public void deleteUserFanRelation(String userId,String fanId);
	
	
	public boolean queryIsFollow(String userId,String fanId);
}
