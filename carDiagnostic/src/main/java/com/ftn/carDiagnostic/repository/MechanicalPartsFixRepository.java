package com.ftn.carDiagnostic.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.carDiagnostic.model.fix.FuelInjectionPartsFix;
import com.ftn.carDiagnostic.model.fix.MechanicalPartsFix;

@Repository
public interface MechanicalPartsFixRepository extends JpaRepository<MechanicalPartsFix, Long>{

	@SuppressWarnings("unchecked")
	MechanicalPartsFix save(MechanicalPartsFix fipf);
}
