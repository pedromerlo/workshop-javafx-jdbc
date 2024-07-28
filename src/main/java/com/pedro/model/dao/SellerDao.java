package com.pedro.model.dao;

import java.util.List;

import com.pedro.model.entities.Department;
import com.pedro.model.entities.Seller;

public interface SellerDao {
 void insert(Seller obj);
    void update(Seller obj);
    void delete(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}