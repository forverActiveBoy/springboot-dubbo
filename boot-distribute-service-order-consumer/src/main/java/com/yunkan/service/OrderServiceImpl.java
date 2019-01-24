package com.yunkan.service;

import java.util.List;
import org.apache.entity.UserAddress;
import org.apache.inter.OrderService;
import org.apache.inter.UserService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
@Service
@com.alibaba.dubbo.config.annotation.Service
public class OrderServiceImpl implements OrderService {
	//阿里系调用服务注解
	@Reference
	private UserService userService;
	@Override
	public List<UserAddress> initOrder(String userId) {
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}
	
	

}
