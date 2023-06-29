package br.com.apcstart.ApcStart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apcstart.ApcStart.model.Pedagoga;

public interface PedagogaRepository extends JpaRepository<Pedagoga, Integer> {
  
}
