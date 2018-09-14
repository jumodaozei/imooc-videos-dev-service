package com.imooc.service;

import com.imooc.pojo.Videos;

public interface VideoService {
	
	public String saveVideo(Videos video);
	
	public void updateVideo(String videoId,String coverPath);
}
