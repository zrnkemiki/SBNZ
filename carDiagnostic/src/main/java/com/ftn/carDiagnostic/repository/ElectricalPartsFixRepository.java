package com.ftn.carDiagnostic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.carDiagnostic.model.fix.ElectricalPartsFix;
@Repository
public interface ElectricalPartsFixRepository extends JpaRepository<ElectricalPartsFix, Long> {

	@SuppressWarnings("unchecked")
	ElectricalPartsFix save(ElectricalPartsFix epf);
}
