package br.com.aplicacao2.repository;

import br.com.aplicacao2.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GeradorDeCadastroRepository extends JpaRepository<PessoaEntity, Long> {
}
