package com.wonder.hotel.dao;

import java.util.List;

import com.wonder.hotel.entity.User;


public interface UserMapper  {
	public List<User> getUserList();
	/**
	 * 根据用户名查询
	 * @return
	 */
	public User getUserByName(String userName);
}
