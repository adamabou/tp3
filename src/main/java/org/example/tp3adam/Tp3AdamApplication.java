package org.example.tp3adam;

import org.example.tp3adam.entities.Patient;
import org.example.tp3adam.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp3AdamApplication  implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tp3AdamApplication.class, args);}
        @Override
        public void run (String...args) throws Exception {
            // Creation avec cons sans param
        /*Patient patient=new Patient();
        patient.setId(null);
        patient.setNom("Mohammed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);*/
            // Creation avec cons avec param
            //Patient patient2=new Patient(null,"Yassine",new Date(),false,123);
            // Creation avec builder
        /*Patient patient3=Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .score(56)
                .malade(true)
                .build();*/
            patientRepository.save(new Patient(null, "Imane", new Date(), true, 12));
            patientRepository.save(new Patient(null, "Yassine", new Date(), false, 13));
            patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 123));

        }

    }
