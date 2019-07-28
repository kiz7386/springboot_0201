package com.springboot_0201.demo.service;

import com.springboot_0201.demo.dao.EmpDAO;
import com.springboot_0201.demo.po.EmpPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    private static final Logger log = LoggerFactory.getLogger(EmpService.class);

    @Autowired
    private EmpDAO empDAO;

    public Iterable<EmpPO> getAllEmp(){
        log.info("empDAOA.getAllEmp(){[]}",empDAO.findAll());
        return empDAO.findAll();
    }
}
