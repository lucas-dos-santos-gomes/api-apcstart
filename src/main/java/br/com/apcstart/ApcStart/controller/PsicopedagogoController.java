package br.com.apcstart.ApcStart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apcstart.ApcStart.model.Psicopedagogo;
import br.com.apcstart.ApcStart.repository.PsicopedagogoRepository;

@RestController
@RequestMapping("/psicopedagogo")
public class PsicopedagogoController {
  @Autowired
  private PsicopedagogoRepository psicopedagogoRepository;

  @PostMapping
  public String cadastrarPsicopedagogo(@RequestBody Psicopedagogo psicopedagogo) {
    psicopedagogoRepository.save(psicopedagogo);
    return "Psicopedagogo cadastrado com sucesso!";
  }

  @GetMapping
  public List<Psicopedagogo> mostrarPsicopedagogos() {
    return psicopedagogoRepository.findAll();
  }
  
  @PutMapping
  public String atualizarPsicopedagogo(@RequestBody Psicopedagogo psicopedagogo) {
    psicopedagogoRepository.save(psicopedagogo);
    return "Os dados do psicopedagogo foram atualizados!";
  }

  @DeleteMapping("/{id}")
  public String deletarPsicopedagogo(@PathVariable("id") int id) {
    psicopedagogoRepository.deleteById(id);
    return "Psicopedagogo descadastrado";
  }
}
