package com.zw.stock.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zw.stock.model.HistoryDetail;

@Repository
public interface HistoryDetailRepository extends MongoRepository<HistoryDetail, String>{
	
}