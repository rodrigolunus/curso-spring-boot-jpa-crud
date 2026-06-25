package org.rodrigolunus.codexhyrule.repositories;

import org.rodrigolunus.codexhyrule.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
