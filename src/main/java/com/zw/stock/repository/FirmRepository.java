package com.zw.stock.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zw.stock.model.Firm;

@Repository
public interface FirmRepository extends MongoRepository<Firm, String>{
	
	List<Firm> findByName(String name);
	
    Firm findByCode(String code);
}