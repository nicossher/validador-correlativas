package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean cumpleCorrelativas(Materia materia) {
        List<Materia> correlativas = materia.getCorrelativas();

        if (correlativas == null) {
            return true;
        }

        for (Materia unaMateria : correlativas) {
            if (this.materiasAprobadas == null || !this.materiasAprobadas.contains(unaMateria)) {
                return false;
            }
        }

        return true;
    }
}

