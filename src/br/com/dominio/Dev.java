package br.com.dominio;

import java.util.Optional;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
     private String nome;
     private Set<Conteudo> conteudosInscritos;
     private Set<Conteudo> conteudosConcluidos;

     public Dev(String nome) {
          this.nome = nome;
          conteudosInscritos = new LinkedHashSet<Conteudo>();
          conteudosConcluidos = new LinkedHashSet<Conteudo>();
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj)
               return true;
          if (!(obj instanceof Dev dev))
               return false;
          return Objects.equals(this.nome, dev.getNome())
                    && Objects.equals(this.conteudosInscritos, dev.getConteudosInscritos())
                    && Objects.equals(this.conteudosConcluidos, dev.getConteudosConcluidos());
     }

     @Override
     public int hashCode() {
          return Objects.hash(this.nome, this.conteudosInscritos, this.conteudosConcluidos);
     }

     public void inscreverBootcamp(Bootcamp bootcamp) {
          this.conteudosInscritos.addAll(bootcamp.getConteudos());
          bootcamp.getDevsInscritos().add(this);
     }

     public void progredir() {
          Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
          if (conteudo.isPresent()) {
               this.conteudosConcluidos.add(conteudo.get());
               this.conteudosInscritos.remove(conteudo.get());
          } else {
               System.err.println("Você não está matriculado em nenhum conteúdo!");
          }
     }

     public double calcularTotalXp() {
          return this.conteudosConcluidos.stream()
                    .mapToDouble(conteudo -> conteudo.calcularXp())
                    .sum();
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public Set<Conteudo> getConteudosInscritos() {
          return conteudosInscritos;
     }

     public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
          this.conteudosInscritos = conteudosInscritos;
     }

     public Set<Conteudo> getConteudosConcluidos() {
          return conteudosConcluidos;
     }

     public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
          this.conteudosConcluidos = conteudosConcluidos;
     }
}
