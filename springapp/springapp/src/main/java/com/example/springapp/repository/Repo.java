package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.DSgarden;


public interface Repo extends JpaRepository<DSgarden,Integer>{

    
}