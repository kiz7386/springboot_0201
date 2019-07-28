package com.springboot_0201.demo.service;

import com.springboot_0201.demo.dao.EmpDAO;
import com.springboot_0201.demo.dto.EmpDto;
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

    public EmpDto addOneEmp(EmpDto dto){
        EmpPO po = new EmpPO();
        EmpDto.createByEmpPO(po);
        log.info("empno[{}]",dto.getEmpno());
        log.info("ename[{}]",dto.getEname());
        log.info("job[{}]",dto.getJob());
        log.info("hiredate[{}]",dto.getHiredate());
        log.info("sal[{}]",dto.getSal());
        log.info("comm[{}]",dto.getComm());
        log.info("deptno[{}]",dto.getDeptno());
        po.setEmpno(dto.getEmpno());
        po.setEname(dto.getEname());
        po.setJob(dto.getJob());
        po.setHiredate(dto.getHiredate());
        po.setSal(dto.getSal());
        po.setComm(dto.getComm());
        po.setDeptno(dto.getDeptno());
        empDAO.save(po);
        return dto;
    }
}
