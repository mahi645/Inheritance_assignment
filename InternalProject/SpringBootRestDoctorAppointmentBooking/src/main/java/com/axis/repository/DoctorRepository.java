package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{

}
