package org.rodrigolunus.codexhyrule.repositories;

import org.rodrigolunus.codexhyrule.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
