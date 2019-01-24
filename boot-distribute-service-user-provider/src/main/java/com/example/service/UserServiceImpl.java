package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.apache.entity.UserAddress;
import org.apache.inter.UserService;

import com.alibaba.dubbo.config.annotation.Service;

//阿里的服务暴露注解
@Service
public class UserServiceImpl implements UserService{
	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
		return Arrays.asList(address1,address2);
	}

}
