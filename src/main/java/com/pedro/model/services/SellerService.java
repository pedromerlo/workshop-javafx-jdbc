package com.pedro.model.services;

import java.util.List;

import com.pedro.model.dao.DaoFactory;
import com.pedro.model.dao.SellerDao;
import com.pedro.model.entities.Seller;

public class SellerService {
    private SellerDao dao=DaoFactory.createSellerDao();

    public List<Seller> findAll(){
        return dao.findAll();
    }

    public void saveOrUpdate(Seller obj){
        if(obj.getId()==null){
            dao.insert(obj);
        }else{
            dao.update(obj);
        }
    }

    public void remove(Seller Obj){
        dao.deleteById(Obj.getId());
    }
}
