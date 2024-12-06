package com.example.JavaMachineTest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaMachineTest.Entity.Category;

@Repository
public interface CategoryRepo  extends JpaRepository<Category, Long>{

}
