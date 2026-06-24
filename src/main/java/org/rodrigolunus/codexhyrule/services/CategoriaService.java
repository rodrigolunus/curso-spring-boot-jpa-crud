package org.rodrigolunus.codexhyrule.services;

import org.rodrigolunus.codexhyrule.domain.Categoria;
import org.rodrigolunus.codexhyrule.repositories.CategoriaRepository;
import org.rodrigolunus.codexhyrule.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
