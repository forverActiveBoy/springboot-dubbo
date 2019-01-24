package org.apache.inter;

import java.util.List;

import org.apache.entity.UserAddress;

public interface UserService {
	
	/**
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);

}
