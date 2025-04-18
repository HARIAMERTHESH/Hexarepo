package com.userapp.main;

import com.userapp.service.IUserService;
import com.userapp.service.UserServiceImpl;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUserService userService = new UserServiceImpl();

        userService.validateUsername("hari");
        userService.checkPassword("hari123");

	}

}
