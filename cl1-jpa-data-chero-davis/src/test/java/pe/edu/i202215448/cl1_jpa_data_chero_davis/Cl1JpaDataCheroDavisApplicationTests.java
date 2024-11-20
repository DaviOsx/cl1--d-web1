package pe.edu.i202215448.cl1_jpa_data_chero_davis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.i202215448.cl1_jpa_data_chero_davis.repository.CountryRepository;

import java.util.*;

@SpringBootTest
class Cl1JpaDataCheroDavisApplicationTests implements CommandLineRunner {

@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {

		SpringApplication.run(Cl1JpaDataCheroDavisApplicationTests.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 *ELIMINAR 1 SOLO ID
		 */

        String id = "AGO";
        if (countryRepository.existsById(id)) {
			countryRepository.deleteById(id);
        } else {
            System.out.println("COUNSTRY with id " + id + " does not exist");}





		countryRepository.findAll().forEach(System.out::println);
	}
}
