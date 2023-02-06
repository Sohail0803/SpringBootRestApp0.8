package com.kkjavatutorials.SpringBootRestApp.service;


import com.kkjavatutorials.SpringBootRestApp.Repo.AuditLogDao;
import com.kkjavatutorials.SpringBootRestApp.model.AuditLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuditLogServiceImpl implements AuditLogService {

	@Autowired
	private AuditLogDao auditLogDao;


	//	to get all the log
	@Override
	public List<AuditLog> getLogs() {
		return auditLogDao.findAllByOrderByIdDesc();
	}



	//	to add new the log
	@Override
	public AuditLog addLog(AuditLog log) {
		auditLogDao.save(log);
		return log;
	}


}

