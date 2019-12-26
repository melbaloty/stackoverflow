package com.stackoverflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.repository.CateogryRepository;

@Service
public class CateogryServiceImpl {

	@Autowired
	private CateogryRepository cateogryRepository;

}
