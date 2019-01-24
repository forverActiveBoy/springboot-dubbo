package org.apache.inter;

import java.util.List;

import org.apache.entity.UserAddress;


public interface OrderService {
	
	/**
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
