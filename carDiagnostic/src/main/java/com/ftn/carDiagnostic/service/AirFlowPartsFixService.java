package com.ftn.carDiagnostic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.carDiagnostic.model.fix.AirFlowPartsFix;
import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;
import com.ftn.carDiagnostic.repository.AirFlowPartsFixRepository;
@Service
public class AirFlowPartsFixService {
	
	@Autowired
	private AirFlowPartsFixRepository airFlowPartsFixRepository;

	public AirFlowPartsFix saveAFPF(AirFlowPartsFix afpf) {
		airFlowPartsFixRepository.save(afpf);
		return afpf;
	}
	
	public AirFlowPartsFix getAFPF(Long id) {
		return airFlowPartsFixRepository.getOne(id);
	}
	
	public List<AirFlowPartsFix> findAll(){
		return airFlowPartsFixRepository.findAll();
	}

}
