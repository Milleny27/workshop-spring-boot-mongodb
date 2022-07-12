package com.portfolio.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.workshopmongo.domain.User;
import com.portfolio.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository rep;

	public List<User> findAll() {
		return rep.findAll();
	}
}
