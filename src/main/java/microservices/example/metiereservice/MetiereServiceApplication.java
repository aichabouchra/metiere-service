package microservices.example.metiereservice;

import microservices.example.metiereservice.Entities.Matiere;
import microservices.example.metiereservice.Repositories.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MetiereServiceApplication implements CommandLineRunner {
	@Autowired
	MatiereRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(MetiereServiceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Matiere m1 = Matiere.builder().nom("Java").nbHeures(24).coefficient(2).build();
		Matiere m2 = Matiere.builder().nom("UML").nbHeures(16).coefficient(3).build();
		repository.save(m1);
		repository.save(m2);
	}
}
