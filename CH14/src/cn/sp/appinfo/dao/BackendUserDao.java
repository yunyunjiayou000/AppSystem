package cn.sp.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sp.appinfo.entity.BackendUser;

public interface BackendUserDao {

	//��ѯָ���˻��������Ϣ
	public BackendUser Select_BackendUser(@Param("userCode")String userCode,@Param("userPassword")String userPassword);
}
