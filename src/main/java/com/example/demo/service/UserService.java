package com.example.demo.service;
import javax.transaction.Transactional;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	   final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @Transactional
	    public User save(User user) {
	        return userRepository.save(user);
	    }
}