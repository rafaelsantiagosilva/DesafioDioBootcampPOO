import java.time.LocalDate;
import java.util.Set;
import java.util.LinkedHashSet;

import br.com.dominio.*;

public class Main {
     public static void main(String[] args) {
          Curso cursoJava = new Curso("POO com Java",
                    "Aprendendo Programação Orientada a Objetos com a porfessora Camila Cavalcante.", 4);
          Curso cursoTs = new Curso("TypeScript", "Aprendendo TypeScript com o berodev", 69);

          Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Ensinando Java!", LocalDate.now());
          Mentoria mentoriaTs = new Mentoria("Mentoria de TypeScript", "Ensinando TypeScript", LocalDate.now());

          Set<Conteudo> conteudosDoBootcamp = new LinkedHashSet<Conteudo>();

          conteudosDoBootcamp.add(cursoJava);
          conteudosDoBootcamp.add(mentoriaJava);
          conteudosDoBootcamp.add(cursoTs);
          conteudosDoBootcamp.add(mentoriaTs);

          Bootcamp bootcamp = new Bootcamp("Bootcamp POO", "Aprendendo programação orientada a objetos",
                    conteudosDoBootcamp);
          
          Dev rafa = new Dev("Rafael");
          Dev joao = new Dev("Joaõ");

          rafa.inscreverBootcamp(bootcamp);
          joao.inscreverBootcamp(bootcamp);

          rafa.progredir();
          rafa.progredir();

          System.out.println("Conteúdos em que o dev " + rafa.getNome() + " está inscrito: ");
          System.out.println(rafa.getConteudosInscritos());
          System.out.println("XP: " + rafa.calcularTotalXp());
          System.out.println("Conteúdos que o dev " + rafa.getNome() + " concluiu: " + rafa.getConteudosConcluidos() + "\n");

          joao.progredir();

          System.out.println("Conteúdos em que o dev " + joao.getNome() + " está inscrito: ");
          System.out.println(joao.getConteudosInscritos());
          System.out.println("XP: " + joao.calcularTotalXp());
          System.out.println("Conteúdos que o dev " + joao.getNome() + " concluiu: " + joao.getConteudosConcluidos() + "\n");
     }
}
