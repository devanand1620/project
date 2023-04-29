package com.example.dbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dbc.model.Usermodel;
import com.example.dbc.repository.UserRepository;

@Service
public class Userservice {
	
	@Autowired
	UserRepository userepo;
	
	
	
	public Usermodel saveInfo(Usermodel hyy) {
		return userepo.save(hyy);
	}

	
	
	public String loginCheckData(String username,String password)
	{
		Usermodel user = userepo.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}

}
