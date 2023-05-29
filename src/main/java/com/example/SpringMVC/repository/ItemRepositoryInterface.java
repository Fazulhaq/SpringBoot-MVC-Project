package com.example.SpringMVC.repository;

import com.example.SpringMVC.model.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepositoryInterface extends CrudRepository<Items, Integer> {
    public List<Items> findItemsByItemName(String itemName);
}
