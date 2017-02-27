package com.jd.bdp.hydra.dubbomonitor.provider.impl;

import java.io.IOException;
import java.util.List;

import com.jd.bdp.hydra.Span;
import com.jd.bdp.hydra.dubbomonitor.HydraService;

/**
 * TODO 将服务跟踪数据异步写入MongoDB
 * 
 * @author yong.ma
 *
 */
public class HydraMongoServiceImpl implements HydraService {

	@Override
	public boolean push(List<Span> span) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

}
