package com.pedro.model.services;

import java.util.List;

import com.pedro.model.dao.DaoFactory;
import com.pedro.model.dao.DepartamentDao;
import com.pedro.model.entities.Department;

public class DepartmentService {
    private DepartamentDao dao=DaoFactory.createDepartmentDao();

    public List<Department> findAll(){
        return dao.findAll();
    }
}
