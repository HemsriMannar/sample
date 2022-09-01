package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Feedback;
import com.spring.repository.MyRepo;

@Service
public class AppService {

@Autowired
private MyRepo myRepo;

public boolean addFeedback( Feedback f) {
	myRepo.save(f);
	return true;
}
}
