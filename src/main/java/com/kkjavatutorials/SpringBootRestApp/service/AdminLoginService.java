package com.kkjavatutorials.SpringBootRestApp.service;



import com.kkjavatutorials.SpringBootRestApp.model.AdminLoginModel;

import java.util.List;
import java.util.Optional;

public interface AdminLoginService {
    List<AdminLoginModel> findAllAdmin();
    Optional<AdminLoginModel> findById(Long id);
}
