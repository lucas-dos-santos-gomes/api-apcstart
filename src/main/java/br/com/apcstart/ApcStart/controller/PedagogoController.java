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

import br.com.apcstart.ApcStart.model.Pedagogo;
import br.com.apcstart.ApcStart.repository.PedagogoRepository;
import br.com.apcstart.ApcStart.service.PedagogoService;

@RestController
@RequestMapping("/pedagogo")
public class PedagogoController {
  @Autowired
  private PedagogoRepository pedagogoRepository;

  @Autowired
  private PedagogoService pedagogoService;

  @PostMapping
  public String cadastrarPedagogo(@RequestBody Pedagogo pedagogo) {
    pedagogoRepository.save(pedagogo);
    return "Pedagogo cadastrada com sucesso!";
  }

  @GetMapping
  public List<Pedagogo> mostrarPedagogos() {
    return pedagogoRepository.findAll();
  }

  @GetMapping("/{email}")
  public Pedagogo mostrarPorEmail(@PathVariable String email) {
    return pedagogoService.findByEmail(email);
  }
  
  @GetMapping("/{email}/{senha}")
  public String validarLogin(@PathVariable String email, @PathVariable String senha) {
    return pedagogoService.findByLogin(email, senha);
  }

  @PutMapping
  public String atualizarPedagogo(@RequestBody Pedagogo pedagogo) {
    pedagogoRepository.save(pedagogo);
    return "Os dados da pedagogo foram atualizados!";
  }
  
  @DeleteMapping("/{id}")
  public String deletarPedagogo(@PathVariable("id") int id) {
    pedagogoRepository.deleteById(id);
    return "Pedagogo descadastrado!";
  }
}