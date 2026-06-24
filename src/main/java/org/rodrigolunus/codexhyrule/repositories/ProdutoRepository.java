package org.rodrigolunus.codexhyrule.repositories;


import org.rodrigolunus.codexhyrule.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
