package cn.sp.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.DevUser;

public interface DevUserDao {

	//≤È—Ø «∑Ò¥Ê‘⁄
	public DevUser Select_DevUser(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
