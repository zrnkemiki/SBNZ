package com.ftn.carDiagnostic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.carDiagnostic.model.fix.AirFlowPartsFix;
import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
@Repository
public interface AirFlowPartsFixRepository extends JpaRepository<AirFlowPartsFix, Long> {

	@SuppressWarnings("unchecked")
	AirFlowPartsFix save(AirFlowPartsFix apf);
}
