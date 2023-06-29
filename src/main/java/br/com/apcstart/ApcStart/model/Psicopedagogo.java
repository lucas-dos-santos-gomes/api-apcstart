package br.com.apcstart.ApcStart.model;

import java.sql.Date;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedagogo")
public class Psicopedagogo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Nonnull
  private String nome;
  private String email;
  private String senha;
  private Date dataNascimento;
  private String diploma;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return this.senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Date getDataNascimento() {
    return this.dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getDiploma() {
    return this.diploma;
  }

  public void setDiploma(String diploma) {
    this.diploma = diploma;
  }
}
