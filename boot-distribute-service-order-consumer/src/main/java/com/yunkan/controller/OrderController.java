package com.yunkan.controller;

import java.util.List;

import org.apache.entity.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunkan.service.OrderServiceImpl;

@RestController
public class OrderController {
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	@RequestMapping("/init")
	public List<UserAddress> initOrder(String userId){
		return orderServiceImpl.initOrder(userId);
	}
}
