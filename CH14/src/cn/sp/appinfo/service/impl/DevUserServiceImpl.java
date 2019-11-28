package cn.sp.appinfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sp.appinfo.dao.DevUserDao;
import cn.sp.appinfo.entity.DevUser;
import cn.sp.appinfo.service.DevUserService;
@Service
public class DevUserServiceImpl implements DevUserService{

	@Resource
	private DevUserDao devUserDao;
	@Override
	public DevUser Select_DevUser(String devCode, String devPassword) {
		return devUserDao.Select_DevUser(devCode, devPassword);
	}

}
