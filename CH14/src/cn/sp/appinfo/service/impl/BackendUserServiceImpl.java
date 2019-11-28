package cn.sp.appinfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sp.appinfo.dao.BackendUserDao;
import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.service.BackendUserService;
@Service
public class BackendUserServiceImpl implements BackendUserService{

	@Resource
	private BackendUserDao backendUserDao;
	@Override
	public BackendUser Select_BackendUser(String userCode, String userPassword) {
		return backendUserDao.Select_BackendUser(userCode, userPassword);
	}

}
