package org.rodrigolunus.codexhyrule.repositories;

import org.rodrigolunus.codexhyrule.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
