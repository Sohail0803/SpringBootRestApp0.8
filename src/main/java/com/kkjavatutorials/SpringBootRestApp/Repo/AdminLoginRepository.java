package com.kkjavatutorials.SpringBootRestApp.Repo;

import com.kkjavatutorials.SpringBootRestApp.model.AdminLoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AdminLoginRepository extends JpaRepository<AdminLoginModel,Long> {

}
