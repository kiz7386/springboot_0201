package com.springboot_0201.demo.controller;

import com.springboot_0201.demo.aop.aspect.LoggerAspect;
import com.springboot_0201.demo.dto.EmpDto;
import com.springboot_0201.demo.po.EmpPO;
import com.springboot_0201.demo.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {
    private static final Logger log = LoggerFactory.getLogger(EmpController.class);

    @Autowired
    private LoggerAspect loggerAspect;

    @Autowired
    private EmpService empService;


    @GetMapping(value = "/getallemp")
    public Iterable<EmpPO> empGetAll(){
        return empService.getAllEmp();
    }

    @PostMapping(value = "/addnewemp" , produces = "application/json;charset=utf-8")
    public EmpDto addOneEmp(@RequestBody EmpDto dto){
        log.info("empno[{}]",dto.getEmpno());
        log.info("ename[{}]",dto.getEname());
        log.info("job[{}]",dto.getJob());
        log.info("hiredate[{}]",dto.getHiredate());
        log.info("sal[{}]",dto.getSal());
        log.info("comm[{}]",dto.getComm());
        log.info("deptno[{}]",dto.getDeptno());
        return empService.addOneEmp(dto);

    }
}
