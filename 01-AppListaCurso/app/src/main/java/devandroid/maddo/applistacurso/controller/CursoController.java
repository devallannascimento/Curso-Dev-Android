package devandroid.maddo.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.maddo.applistacurso.model.Curso;

public class CursoController {
    private List listCursos;

    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java")); // Java
        listCursos.add(new Curso("Python")); // Python
        listCursos.add(new Curso("PHP"));
        listCursos.add(new Curso("JavaScript"));
        listCursos.add(new Curso("Kotlin"));
        listCursos.add(new Curso("React Native"));

        return listCursos;
    }

    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCursos().size(); i++) {

            Curso objeto = (Curso) getListaDeCursos().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());

        }

        return dados;

    }


}
