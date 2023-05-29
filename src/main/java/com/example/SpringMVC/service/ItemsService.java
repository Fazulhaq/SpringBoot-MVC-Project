package com.example.SpringMVC.service;

import com.example.SpringMVC.model.Items;
import com.example.SpringMVC.repository.ItemRepositoryInterface;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemsService {

    @Autowired
    ItemRepositoryInterface itr;

    public Optional<Items> get(Integer itemId){
        return itr.findById(itemId);
    }

    public List<Items> getAll(){
        return (List<Items>) itr.findAll();
    }
    public Items update(Items items){
        return itr.save(items);
    }
    public void delete(Items items){
        itr.delete(items);
    }
}
