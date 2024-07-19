package br.com.dominio;

public class Curso extends Conteudo {
     private int cargaHoraria;

     public Curso(String titulo, String descricao, int cargaHoraria) {
          super(titulo, descricao);
          this.cargaHoraria = cargaHoraria;
     }

     @Override
     public double calcularXp() {
          return XP_PADRAO + 10;
     }

     @Override
     public String toString() {
          return "Curso{" +
                    "titulo='" + this.titulo + "\'" +
                    ", descricao='" + this.descricao + "\'" +
                    ", cargaHoraria='" + this.cargaHoraria + "\'" +
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

     public int getCargaHoraria() {
          return cargaHoraria;
     }

     public void setCargaHoraria(int cargaHoraria) {
          this.cargaHoraria = cargaHoraria;
     }
}
