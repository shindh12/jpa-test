package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Subs;

public interface SubsRepository extends JpaRepository<Subs, Long>{
	Subs findByUserId(Long userId);
}
