package com.jtc;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.DependsOn;
@Service
@DependsOn("userDao")
public class UserService {
	
	public UserService() {
		System.out.println("getting datafrom redis....");
	}

}
