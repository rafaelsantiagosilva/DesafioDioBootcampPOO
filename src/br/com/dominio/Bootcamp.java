package br.com.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
     private String nome;
     private String descricao;
     private final LocalDate DATA_INICIAL = LocalDate.now();
     private final LocalDate DATA_FINAL = DATA_INICIAL.plusDays(45);
     private Set<Dev> devsInscritos = new HashSet<>();
     private Set<Conteudo> conteudos = new LinkedHashSet<>();

     public Bootcamp(String nome, String descricao, Set<Conteudo> conteudos) {
          this.nome = nome;
          this.descricao = descricao;
          this.conteudos.addAll(conteudos);
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj)
               return true;
          if (!(obj instanceof Bootcamp bootcamp))
               return false;
          return Objects.equals(this, bootcamp);
     }

     @Override
     public int hashCode() {
          return Objects.hash(this.nome, this.descricao, this.DATA_INICIAL, this.DATA_FINAL, this.devsInscritos,
                    this.conteudos);
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

     public Set<Conteudo> getConteudos() {
          return conteudos;
     }

     public void setConteudos(Set<Conteudo> conteudos) {
          this.conteudos = conteudos;
     }

     public Set<Dev> getDevsInscritos() {
          return devsInscritos;
     }

     public void setDevsInscritos(Set<Dev> devsInscritos) {
          this.devsInscritos = devsInscritos;
     }

     public LocalDate getDATA_INICIAL() {
          return DATA_INICIAL;
     }

     public LocalDate getDATA_FINAL() {
          return DATA_FINAL;
     }

}
