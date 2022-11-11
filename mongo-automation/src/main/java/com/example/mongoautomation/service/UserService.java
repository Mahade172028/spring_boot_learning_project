package com.example.mongoautomation.service;

import com.example.mongoautomation.entity.AgendaName;
import com.example.mongoautomation.entity.AgendaPoint;
import com.example.mongoautomation.repository.AgendaPointRepository;
import com.example.mongoautomation.repository.AgendaRepository;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService{

    @Autowired
    AgendaRepository agendaRepository;

    @Autowired
    AgendaPointRepository agendaPointRepository;


    public void test() {

        List<AgendaPoint> agendaPointList = agendaPointRepository.findAll();
        System.out.println(agendaPointList.size());
        Set<String> portalList = new HashSet<>();
        agendaPointList.forEach(x->{
            //System.out.println("AgendaPoint id: "+x.getId()+" portalId "+x.getPortalId());
            if(x.getPortalId()!=null)
               portalList.add(x.getPortalId());

        });

        System.out.println(portalList.size());

        portalList.forEach(x->{
            System.out.println("PortalId : "+x);
            System.out.println("portalList agenda Point ------------------------");
            System.out.println("----------------------");

            AgendaName agendaName = new AgendaName();
            agendaName.setTitle("agenda");
            agendaName.setCreatedDate(LocalDateTime.now());
            agendaName.setDeleteStatus(false);
            agendaName.setUserSelectedDate("2022-07-1");
            agendaName.setPortalId(x);
            agendaName.setStatus(true);
            AgendaName agendaNameResponse = agendaRepository.save(agendaName);
            System.out.println("Agenda Name created with Id: "+agendaNameResponse.getId());

            List<AgendaPoint> agendaPointsList = agendaPointRepository.findAgendaPointByPortalId(x);
            agendaPointsList.forEach(y->{
                System.out.println("Before Agenda point with Id: "+y.getId());
                y.setAgenda_id(agendaNameResponse.getId());
                AgendaPoint agendaPoint = agendaPointRepository.save(y);
                System.out.println("After update Agenda Point Id: "+agendaPoint.getId()+" portal Id: "+agendaPoint.getPortalId());
            });
        });


    }
}
