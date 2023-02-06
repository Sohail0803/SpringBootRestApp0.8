package com.kkjavatutorials.SpringBootRestApp.Repo;


import com.kkjavatutorials.SpringBootRestApp.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditLogDao extends JpaRepository<AuditLog, Long> {

    List<AuditLog> findAllByOrderByIdDesc();
}
