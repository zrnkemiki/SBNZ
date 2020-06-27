package com.ftn.carDiagnostic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;
import com.ftn.carDiagnostic.repository.MechanicalPartsFixRepository;

@Service
public class MechanicalPartsFixService {
	@Autowired
	private MechanicalPartsFixRepository mechanicalPartsFixRepository;

	public MechanicalPartsFix saveMPF(MechanicalPartsFix epf) {
		mechanicalPartsFixRepository.save(epf);
		return epf;
	}
	
	public MechanicalPartsFix getMPF(Long id) {
		return mechanicalPartsFixRepository.findById(id).orElse(null);
	}
	
	public List<MechanicalPartsFix> findAll(){
		return mechanicalPartsFixRepository.findAll();
	}

}
