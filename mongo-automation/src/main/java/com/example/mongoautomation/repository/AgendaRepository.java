package com.example.mongoautomation.repository;

import com.example.mongoautomation.entity.AgendaName;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendaRepository extends MongoRepository<AgendaName , String> {

}
