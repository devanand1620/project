package com.example.dbc.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.dbc.model.StreetCafe;
import com.example.dbc.repository.StreetCaferepo;
@Service
public class StreetCafeserv {
	@Autowired
	public StreetCaferepo crepo;
	
	public StreetCafe saveInfo(StreetCafe hyy) {
		return crepo.save(hyy);
	}

	public void deletedetails(int hii) {
		// TODO Auto-generated method stub
		crepo.deleteById(hii);
	}
	
	public List<StreetCafe> getall() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	public Optional<StreetCafe> getdetails(int hii) {
		// TODO Auto-generated method stub
		return crepo.findById(hii);
	}

	public StreetCafe updatedetails(StreetCafe hii) {
		// TODO Auto-generated method stub
		return crepo.saveAndFlush(hii);
	}

	public List<StreetCafe> sorting(String name) {
		// TODO Auto-generated method stub
		return crepo.findAll(Sort.by(name).descending());
	}
	
	public List<StreetCafe> page(int num, int size) {
		Page<StreetCafe> p=crepo.findAll(PageRequest.of(num, size));
		return p.getContent();
	}

	public List<StreetCafe> paginationsorting(int pnum, int psize, String name) {
		// TODO Auto-generated method stub
		Page<StreetCafe> p=crepo.findAll(PageRequest.of(pnum, psize, Sort.by(name).descending()));
		return p.getContent();
	}
}
