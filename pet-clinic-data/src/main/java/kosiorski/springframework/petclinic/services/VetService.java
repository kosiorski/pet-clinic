package kosiorski.springframework.petclinic.services;

import kosiorski.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById (Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
