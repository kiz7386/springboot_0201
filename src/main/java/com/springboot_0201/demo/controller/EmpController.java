package com.springboot_0201.demo.controller;

import com.springboot_0201.demo.po.EmpPO;
import com.springboot_0201.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;


    @GetMapping(value = "/getallemp")
    public Iterable<EmpPO> empGetAll(){
        return empService.getAllEmp();
    }

    @PostMapping(value = "/addnewemp")
    public Emp
}
