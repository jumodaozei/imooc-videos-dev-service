package com.imooc.service;

import java.util.List;

import com.imooc.pojo.Videos;
import com.imooc.utils.PagedResult;

public interface VideoService {
	
	public String saveVideo(Videos video);
	
	public void updateVideo(String videoId,String coverPath);
	
	public PagedResult getAllVideos(Videos video, Integer isSaveRecord, Integer page,Integer pageSize);
	
	public List<String> getHotWords();
}
