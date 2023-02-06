package com.kkjavatutorials.SpringBootRestApp.controller;


import com.kkjavatutorials.SpringBootRestApp.model.AuditLog;
import com.kkjavatutorials.SpringBootRestApp.service.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class AuditlogController {

    @Autowired
    private AuditLogService service;

    // Get The all the logs

    @GetMapping("/auditlogs")
    public List<AuditLog> getLogs() {
        return service.getLogs();

    }




    // To add the audit logs

    @PostMapping(path = "/auditlogs", consumes = "application/json")
    public AuditLog addLog(@RequestBody AuditLog log) {
        return this.service.addLog(log);
    }
}
