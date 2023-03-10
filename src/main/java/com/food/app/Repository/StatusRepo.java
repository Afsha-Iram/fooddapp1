package com.food.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.app.model.Status;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {

}
