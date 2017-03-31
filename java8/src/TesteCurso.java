import entity.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TesteCurso {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .forEach(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

    }

}
