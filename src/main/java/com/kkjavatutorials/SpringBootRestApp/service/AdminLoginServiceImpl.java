package com.kkjavatutorials.SpringBootRestApp.service;


import com.kkjavatutorials.SpringBootRestApp.Repo.AdminLoginRepository;
import com.kkjavatutorials.SpringBootRestApp.model.AdminLoginModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{

    private final AdminLoginRepository adminLoginRepository;

    public AdminLoginServiceImpl(AdminLoginRepository adminLoginRepository) {
        this.adminLoginRepository = adminLoginRepository;
    }


    @Override
    public List<AdminLoginModel> findAllAdmin() {
        return adminLoginRepository.findAll();
    }

    @Override
    public Optional<AdminLoginModel> findById(Long id) {
        return adminLoginRepository.findById(id);
    }
}

