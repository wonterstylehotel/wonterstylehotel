package com.wonder.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wonder.hotel.dao.UserMapper;
import com.wonder.hotel.entity.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> getUserList() {
		return userMapper.getUserList();
	}
	@Override
	public User getUserByName(String userName) {
		return userMapper.getUserByName(userName);
	}

}
