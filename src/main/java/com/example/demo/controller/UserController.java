package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.BeanUtils;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController

@CrossOrigin(origins="*", maxAge = 3600)

@RequestMapping("/user")

public class UserController {
	
	final UserService userService;

	 public UserController(UserService userService) {
	        this.userService = userService;
	 }

    @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody @Valid  UserDTO userDTO, BindingResult result) {
    	if(result.hasErrors()) {
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Deu erro");
    	}
    	
    	var userModel = new User();
    	 BeanUtils.copyProperties(userDTO, userModel);

 
    	return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    	
    }
 

   
}
