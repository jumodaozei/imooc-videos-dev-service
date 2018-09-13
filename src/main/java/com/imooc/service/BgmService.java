package com.imooc.service;

import java.util.List;

import com.imooc.pojo.Bgm;

public interface BgmService {
	
	/**
	 * 查询bgm列表
	 * @return
	 */
	public List<Bgm> queryBgmList();
	
	/**
	 * 根据bgmid查询bgm信息
	 * @param bgmId
	 * @return
	 */
	public Bgm querBgmById(String bgmId);
}
