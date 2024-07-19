package br.com.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
     private LocalDate data;

     public Mentoria(String titulo, String descricao, LocalDate data) {
          super(titulo, descricao);
          this.data = data;
     }

     @Override
     public double calcularXp() {
          return XP_PADRAO + 20;
     }

     @Override
     public String toString() {
          return "Mentoria{" +
                    "titulo='" + this.titulo + "\'" +
                    ", descricao='" + this.descricao + "\'" +
                    ", data='" + this.data + "\'" +
                    "}";
     }

     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

     public LocalDate getData() {
          return data;
     }

     public void setData(LocalDate data) {
          this.data = data;
     }
}
