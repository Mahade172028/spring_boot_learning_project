package com.example.mongoautomation.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "agenda_name")
public class AgendaName {
    @Id
    private String id;
    private String title;
    private String userSelectedDate;
    private boolean deleteStatus;
    private boolean status;
    private String portalId;
    private LocalDateTime createdDate;

    public AgendaName(){deleteStatus=false;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserSelectedDate() {
        return userSelectedDate;
    }

    public void setUserSelectedDate(String userSelectedDate) {
        this.userSelectedDate = userSelectedDate;
    }

    public boolean isDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPortalId() {
        return portalId;
    }

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }
}
