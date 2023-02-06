package com.kkjavatutorials.SpringBootRestApp.controller;



import com.kkjavatutorials.SpringBootRestApp.model.AdminLoginModel;
import com.kkjavatutorials.SpringBootRestApp.service.AdminLoginService;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminLoginController {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(AuditlogController.class);



    private final AdminLoginService adminLoginService;

    public AdminLoginController(AdminLoginService adminLoginService) {
        this.adminLoginService = adminLoginService;
    }

    @GetMapping
    public List<AdminLoginModel>findAllAdmin(){
        logger.info("Getting all Admin List");
        return adminLoginService.findAllAdmin();
    }
    @PostMapping("/id")
    public Optional<AdminLoginModel> findAdminById(@RequestBody AdminLoginModel id){
        logger.info("Getting Admin by there respective id {}",id);
         Long Id=id.getId();

        return adminLoginService.findById(Id);
    }

}
