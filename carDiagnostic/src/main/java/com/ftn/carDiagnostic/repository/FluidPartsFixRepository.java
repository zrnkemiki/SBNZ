package com.ftn.carDiagnostic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.carDiagnostic.model.fix.AirFlowPartsFix;
import com.ftn.carDiagnostic.model.fix.FluidPartsFix;
@Repository
public interface FluidPartsFixRepository extends JpaRepository<FluidPartsFix, Long> {

	@SuppressWarnings("unchecked")
	FluidPartsFix save(FluidPartsFix fpf);
}
