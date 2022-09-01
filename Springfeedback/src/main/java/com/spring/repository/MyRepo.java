package com.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Feedback;


@Repository
public interface MyRepo extends CrudRepository <Feedback, Integer> {

}
