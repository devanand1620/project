package com.example.dbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dbc.model.Usermodel;

public interface UserRepository extends JpaRepository<Usermodel,Integer> {

	Usermodel findByusername(String username);

}
