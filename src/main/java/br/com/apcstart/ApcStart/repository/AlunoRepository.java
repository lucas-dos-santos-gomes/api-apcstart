package br.com.apcstart.ApcStart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.apcstart.ApcStart.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}