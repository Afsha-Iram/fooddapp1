package com.food.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.app.model.Neworders;

public interface NewordersRepo extends JpaRepository<Neworders, Long> {

}
