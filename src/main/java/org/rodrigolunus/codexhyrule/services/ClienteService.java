package org.rodrigolunus.codexhyrule.services;

import org.rodrigolunus.codexhyrule.domain.Cliente;
import org.rodrigolunus.codexhyrule.repositories.ClienteRepository;
import org.rodrigolunus.codexhyrule.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
