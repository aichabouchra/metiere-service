package microservices.example.metiereservice.Controllers;

import java.util.List;

import microservices.example.metiereservice.Entities.Matiere;
import microservices.example.metiereservice.Repositories.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matieres")
public class MatiereController {
    @Autowired
    MatiereRepository repository;

    @GetMapping
    public List<Matiere> getAllMatieres() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Matiere getMatiereById(@PathVariable("id") Long x) {
        return repository.findById(x).get();
    }

    @PostMapping
    public Matiere saveMatiere(@RequestBody Matiere e) {
        return repository.save(e);
    }

}
