package org.rodrigolunus.codexhyrule.services;

import org.rodrigolunus.codexhyrule.domain.Pedido;
import org.rodrigolunus.codexhyrule.repositories.PedidoRepository;
import org.rodrigolunus.codexhyrule.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
