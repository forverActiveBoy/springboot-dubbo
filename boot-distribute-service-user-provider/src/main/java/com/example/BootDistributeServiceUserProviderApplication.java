package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
//开启dubbo功能
@SpringBootApplication
@DubboComponentScan("com.example.service")
public class BootDistributeServiceUserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDistributeServiceUserProviderApplication.class, args);
	}

}

