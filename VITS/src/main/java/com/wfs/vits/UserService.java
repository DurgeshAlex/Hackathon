package com.wfs.vits;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfs.vits.dao.User;
import com.wfs.vits.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public List<User> findUser() {
		return userRepository.findAll();
	}

}
