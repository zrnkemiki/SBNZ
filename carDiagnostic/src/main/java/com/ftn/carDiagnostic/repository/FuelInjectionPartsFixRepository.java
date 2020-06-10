package com.ftn.carDiagnostic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.carDiagnostic.model.fix.FuelInjectionPartsFix;
@Repository
public interface FuelInjectionPartsFixRepository extends JpaRepository<FuelInjectionPartsFix, Long>{

}
