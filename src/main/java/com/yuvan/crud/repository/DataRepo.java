package com.yuvan.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yuvan.crud.model.DataModel;

@Repository
public interface DataRepo extends JpaRepository<DataModel, Long> {

}
