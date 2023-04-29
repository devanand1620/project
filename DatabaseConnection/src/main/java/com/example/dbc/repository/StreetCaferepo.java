package com.example.dbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dbc.model.StreetCafe;

public interface StreetCaferepo extends JpaRepository<StreetCafe, Integer> {
	
}
