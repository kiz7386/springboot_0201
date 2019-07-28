package com.springboot_0201.demo.po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "EMP")
@DynamicInsert
@DynamicUpdate
public class EmpPO {

    @Id
    @Column(name = "EMPNO" , nullable = false , length = 24)
    private String empno;

    @Column(name = "ENAME" , nullable = false )
    private String ename;

    @Column(name ="JOB" , nullable = false)
    private String job;

    @Column(name = "HIREDATE" , nullable = false)
    private Date hiredate;

    @Column(name = "SAL" , nullable = false)
    private Double sal;

    @Column(name = "COMM")
    private Double comm;

    @Column(name = "DEPTNO" , nullable = false)
    private Integer deptno;

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
