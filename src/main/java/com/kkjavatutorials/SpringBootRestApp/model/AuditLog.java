package com.kkjavatutorials.SpringBootRestApp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "request",length = 1000)
    private String request;

    @Column(name = "Successfull_request",length=1000)
    private String successfull_request;

    @Column(name = "status")
    private String status;


    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date createdAt = new Date(System.currentTimeMillis());

    @Column(name = "created_atDate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date createdAtDate = new Date(System.currentTimeMillis());

    public AuditLog(long id, Date createdAt, Date createdAtDate, String request, String status, String successfull_request) {
        this.id = id;
        this.createdAt = createdAt;
        this.createdAtDate = createdAtDate;
        this.request = request;
        this.status = status;
        this.successfull_request=successfull_request;
    }


    public String getSuccessfull_request() {
        return successfull_request;
    }


    public void setSuccessfull_request(String successfull_request) {
        this.successfull_request = successfull_request;
    }


    public AuditLog() {
    }

    public Date getCreatedAtDate() {
        return createdAtDate;
    }

    public void setCreatedAtDate(Date createdAtDate) {
        this.createdAtDate = createdAtDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

