package com.ftn.carDiagnostic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.fix.FuelInjectionPartsFix;
import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;
import com.ftn.carDiagnostic.repository.FuelInjectionPartsFixRepository;
@Service
public class FuelInjectionPartsFixService {
	
	@Autowired
	private FuelInjectionPartsFixRepository fuelInjectionPartsFixRepository;

	public FuelInjectionPartsFix saveFIPF(FuelInjectionPartsFix fipf) {
		fuelInjectionPartsFixRepository.save(fipf);
		return fipf;
	}
	
	public FuelInjectionPartsFix getFIPF(Long id) {
		return fuelInjectionPartsFixRepository.findById(id).orElse(null);
	}
	
	public List<FuelInjectionPartsFix> findAll(){
		return fuelInjectionPartsFixRepository.findAll();
	}

}
