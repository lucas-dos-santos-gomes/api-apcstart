package br.com.apcstart.ApcStart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apcstart.ApcStart.model.Pedagogo;
import br.com.apcstart.ApcStart.repository.PedagogoRepository;

@Service
public class PedagogoService {

  @Autowired
  private PedagogoRepository pedagogoRepository;

  public Pedagogo findByEmail(String email) {
    for(Pedagogo pedagogo: pedagogoRepository.findAll()) {
      if(pedagogo.getEmail().equals(email)) {
        return pedagogo;
      }
    }
    return null;
  }

  public String findByLogin(String email, String senha) {
    for(Pedagogo pedagogo: pedagogoRepository.findAll()) {
      if(pedagogo.getEmail().equals(email)) {
        return conferirSenha(pedagogo, senha);
      }
    }
    return "Esse e-mail não foi cadastrado";
  }

  public String conferirSenha(Pedagogo pedagogo, String senha) {
    if(pedagogo.getSenha().equals(senha)) {
      return "Login realizado com sucesso!";
    } else {
      return "Senha incorreta!";
    }
  }
}
