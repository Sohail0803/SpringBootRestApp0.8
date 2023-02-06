package com.kkjavatutorials.SpringBootRestApp.service;



import com.kkjavatutorials.SpringBootRestApp.model.AuditLog;

import java.util.List;


public interface AuditLogService {

    List<AuditLog> getLogs();



    AuditLog addLog(AuditLog log);
}
