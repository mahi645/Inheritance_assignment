package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.axis.model.Doctor;

public interface DoctorService {
	public Doctor addDoctor(Doctor doctor);
	public List<Doctor> getAllDoctors();
	public Doctor getDoctorById(int id);
	public Doctor updateDoctorById(int id,Doctor doctor);
	public String deleteDoctor(int id);
}
