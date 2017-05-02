package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public List<User> getAllUser();

	public User getUser(int userId);

}
