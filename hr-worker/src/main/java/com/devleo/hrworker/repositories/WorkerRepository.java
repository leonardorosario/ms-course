package com.devleo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devleo.hrworker.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
	

}
