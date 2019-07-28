package com.springboot_0201.demo.dao;

import com.springboot_0201.demo.po.EmpPO;
import org.springframework.data.repository.CrudRepository;

public interface EmpDAO extends CrudRepository<EmpPO, Integer> {


}
