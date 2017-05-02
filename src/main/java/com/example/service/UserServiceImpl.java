package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public void addUser(User user) {

		userRepo.save(user);

	}

	@Override
	public void updateUser(User user) {
		userRepo.save(user);

	}

	@Override
	public void deleteUser(User user) {

		userRepo.delete(user);

	}

	@Override
	public List<User> getAllUser() {

		return (List<User>) userRepo.findAll();
	}

	@Override
	public User getUser(int userId) {
		User user = new User();
		user = userRepo.findOne(userId);

		return user;
	}

}
