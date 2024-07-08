import com.anderson.desafio.bootcamp.Bootcamp;
import com.anderson.desafio.bootcamp.Curso;
import com.anderson.desafio.bootcamp.Dev;
import com.anderson.desafio.bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("curso Básico de java");
        cursoJavaBasico.setDescricao("Aprendendo conceitos básicos sobre Java");
        cursoJavaBasico.setCargaHoraria(8);

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("Curso introdutório de JavaScript");
        cursoJavaScript.setDescricao("Aprendendo conceitos sobre JavaScript");
        cursoJavaScript.setCargaHoraria(4);

        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Curso Avançado de Java");
        cursoJavaAvancado.setDescricao("Aprendendo conceitos avançados sobre java.");
        cursoJavaAvancado.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo Orientação a Objetos com Java");
        mentoria.setDescricao("Imersão sobre Orientação a Objeto com Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Formação Java Developer");
        bootcamp.getConteudos().add(cursoJavaBasico);
        bootcamp.getConteudos().add(cursoJavaScript);
        bootcamp.getConteudos().add(cursoJavaAvancado);
        bootcamp.getConteudos().add(mentoria);


        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson Grampinha");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " +devAnderson.getNome() + ": " + devAnderson.getConteudosInscritos());
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " +devAnderson.getNome() + ": " + devAnderson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " +devAnderson.getNome() + ": " + devAnderson.getConteudosConcluidos());
        System.out.println("XP:" + devAnderson.calcularTotalXp());

        System.out.println("-------");

        Dev devNicholas = new Dev();
        devNicholas.setNome("Nicholas Grampinha");
        devNicholas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " +devNicholas.getNome() + ": " + devNicholas.getConteudosInscritos());
        devNicholas.progredir();
        devNicholas.progredir();
        devNicholas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " +devNicholas.getNome() + ": " + devNicholas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " +devNicholas.getNome() + ": " + devNicholas.getConteudosConcluidos());
        System.out.println("XP:" + devNicholas.calcularTotalXp());
    }

}
