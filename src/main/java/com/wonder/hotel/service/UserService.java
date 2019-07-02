package com.wonder.hotel.service;

import java.util.List;

import com.wonder.hotel.entity.User;


public interface UserService {
		public List<User> getUserList();
		
		/**
		 * 根据用户名查询
		 * @return
		 */
		public User getUserByName(String userName);
}
