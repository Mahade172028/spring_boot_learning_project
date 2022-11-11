package com.example.mongoautomation.repository;

import com.example.mongoautomation.entity.AgendaPoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface AgendaPointRepository extends MongoRepository<AgendaPoint , String> {
    @Query("{'portalId': ?0 }")
    List<AgendaPoint> findAgendaPointByPortalId(String portalId);

}
