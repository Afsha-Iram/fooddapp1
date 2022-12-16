package com.food.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.app.model.Items;

@Repository
public interface ItemsRepo extends JpaRepository<Items, String>{

}
