package org.example.tp3adam.repository;

import org.example.tp3adam.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    Page<Patient> findByNomContains(String keyword, Pageable pageable);


   // @Query("select p from Patient p where p.nom like: x")
    //Page<Patient> Chercher(@Param("x") String keyword ,Pageable pageable1);
}
