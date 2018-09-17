package com.imooc.service;

import com.imooc.pojo.Videos;
import com.imooc.utils.PagedResult;

public interface VideoService {
	
	public String saveVideo(Videos video);
	
	public void updateVideo(String videoId,String coverPath);
	
	public PagedResult getAllVideos(Integer page,Integer pageSize);
}
