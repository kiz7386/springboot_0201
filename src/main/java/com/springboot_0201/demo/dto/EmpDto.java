package com.springboot_0201.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot_0201.demo.bo.EmpBO;
import com.springboot_0201.demo.po.EmpPO;
import org.springframework.beans.BeanUtils;

import java.sql.Date;

//前端接收过来的值(所以要验证)
public class EmpDto {

    private String empno;
    private String ename;
    private String job;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;

    public static EmpDto createByEmpPO(EmpPO po){
        EmpDto dto = new EmpDto();
        BeanUtils.copyProperties(po , dto);
        return dto;
    }

    @JsonIgnore
    public EmpBO getEmpBO(){
        EmpBO bo = new EmpBO();
        BeanUtils.copyProperties(this, bo);
        return bo;
    }

    @JsonIgnore
    public EmpPO getEmpPO(){
        EmpPO po = new EmpPO();
        BeanUtils.copyProperties(EmpDto.class, po);
        return po;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}
