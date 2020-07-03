package com.ftn.carDiagnostic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.fix.FluidPartsFix;
import com.ftn.carDiagnostic.repository.FluidPartsFixRepository;

@Service
public class FluidPartsFixService {

	@Autowired
	FluidPartsFixRepository fluidPartsFixRepository;
	
	public FluidPartsFix saveFPF(FluidPartsFix fpf) {
		fluidPartsFixRepository.save(fpf);
		return fpf;
	}
	
	public FluidPartsFix getFPF(Long id) {
		return fluidPartsFixRepository.findById(id).orElse(null);
	}
	
	public List<FluidPartsFix> findAll(){
		return fluidPartsFixRepository.findAll();
	}
}
