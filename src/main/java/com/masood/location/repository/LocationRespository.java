package com.masood.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masood.location.entites.Location;

public interface LocationRespository extends JpaRepository<Location, Long> {

}
