package br.com.apcstart.ApcStart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.apcstart.ApcStart.model.Pedagogo;

public interface PedagogoRepository extends JpaRepository<Pedagogo, Integer> {
  
}
