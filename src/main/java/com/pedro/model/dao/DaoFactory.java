package com.pedro.model.dao;

import com.pedro.db.DB;
import com.pedro.model.dao.impl.DepartmentDaoJDBC;
import com.pedro.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDaoJDBC createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}