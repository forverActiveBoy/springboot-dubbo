package com.yunkan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
@SpringBootApplication
@DubboComponentScan("com.yunkan.service")
public class BootDistributeServiceOrderConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDistributeServiceOrderConsumerApplication.class, args);
	}

}

