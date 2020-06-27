package com.ftn.carDiagnostic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;
import com.ftn.carDiagnostic.repository.ElectricalPartsFixRepository;

@Service
public class ElectricalPartsFixService {
	
	@Autowired
	private ElectricalPartsFixRepository electricalPartsFixRepo;

	public ElectricalPartsFix saveEPF(ElectricalPartsFix epf) {
		electricalPartsFixRepo.save(epf);
		return epf;
	}
	
	public ElectricalPartsFix getEPF(Long id) {
		return electricalPartsFixRepo.getOne(id);
	}
	
	public List<ElectricalPartsFix> findAll(){
		return electricalPartsFixRepo.findAll();
	}
}
