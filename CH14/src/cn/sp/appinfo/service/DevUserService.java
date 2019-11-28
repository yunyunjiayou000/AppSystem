package cn.sp.appinfo.service;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.DevUser;

public interface DevUserService {

	// ≤È—Ø «∑Ò¥Ê‘⁄
	public DevUser Select_DevUser(@Param("devCode") String devCode, @Param("devPassword") String devPassword);
}
