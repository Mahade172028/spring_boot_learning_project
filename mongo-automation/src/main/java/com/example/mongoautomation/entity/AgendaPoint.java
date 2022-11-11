package com.example.mongoautomation.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "agenda")
public class AgendaPoint {
    @Id
    private String id;


    private String type;


    private String organizationId;


    private String clientId;


    private String portalId;


    private String startTime;


    private String endTime;


    private String topic;


    private String description;


    private List<String> speakers;


    private String webcast;


    private List<Object> breakOutRoomSessions;


    private boolean displayStatus;


    private boolean status;


    private LocalDateTime createdDate;


    private LocalDateTime updatedDate;

    private List<SpeakerResponse> speakerData;


    private String agenda_id;

    public String getAgenda_id() {
        return agenda_id;
    }

    public void setAgenda_id(String agenda_id) {
        this.agenda_id = agenda_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPortalId() {
        return portalId;
    }

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<String> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<String> speakers) {
        this.speakers = speakers;
    }

    public String getWebcast() {
        return webcast;
    }

    public void setWebcast(String webcast) {
        this.webcast = webcast;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getBreakOutRoomSessions() {
        return breakOutRoomSessions;
    }

    public void setBreakOutRoomSessions(List<Object> breakOutRoomSessions) {
        this.breakOutRoomSessions = breakOutRoomSessions;
    }

    public boolean getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(boolean displayStatus) {
        this.displayStatus = displayStatus;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public List<SpeakerResponse> getSpeakerData() {
        return speakerData;
    }

    public void setSpeakerData(List<SpeakerResponse> speakerData) {
        this.speakerData = speakerData;
    }
}
