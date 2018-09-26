package com.imooc.service;

import java.util.List;

import com.imooc.pojo.Comments;
import com.imooc.pojo.Videos;
import com.imooc.utils.PagedResult;

public interface VideoService {
	
	public String saveVideo(Videos video);
	
	public void updateVideo(String videoId,String coverPath);
	
	public PagedResult getAllVideos(Videos video, Integer isSaveRecord, Integer page,Integer pageSize);
	
	public List<String> getHotWords();
	
	/**
	 * 
	 * @param userId 喜欢视频的用户的id
	 * @param videoId 喜欢的视频的id
	 * @param videoCreaterId 喜欢的视频发布者的id
	 */
	public void userLikeVideo(String userId,String videoId,String videoCreaterId);
	
	
	/**
	 * 
	 * @param userId 喜欢视频的用户的id
	 * @param videoId 喜欢的视频的id
	 * @param videoCreaterId 喜欢的视频发布者的id
	 */
	public void userUnLikeVideo(String userId,String videoId,String videoCreaterId);
	
	/**
	 * @Description: 查询我喜欢的视频列表
	 */
	public PagedResult queryMyLikeVideos(String userId, Integer page, Integer pageSize);
	
	/**
	 * @Description: 查询我关注的人的视频列表
	 */
	public PagedResult queryMyFollowVideos(String userId, Integer page, Integer pageSize);
	
	/**
	 * @Description: 用户留言
	 */
	public void saveComment(Comments comment);
	
	/**
	 * @Description: 留言分页
	 */
	public PagedResult getAllComments(String videoId, Integer page, Integer pageSize);
}
