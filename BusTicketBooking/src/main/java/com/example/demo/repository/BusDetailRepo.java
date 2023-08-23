package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BusDetails;

public interface BusDetailRepo extends JpaRepository<BusDetails, Integer> {

}
