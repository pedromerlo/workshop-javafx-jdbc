package com.pedro.model.dao;

import java.util.List;

import com.pedro.model.entities.Department;

public interface DepartamentDao {
    void insert(Department obj);
    void update(Department obj);
    void delete(Department obj);
    Department findById(Integer id);
    List<Department> findAll();
}
