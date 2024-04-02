package domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public void inscribirAlgoritmos(){
        Alumno nico = new Alumno("nicolas", "202.202.2");

        Materia algoritmos = new Materia("algoritmos y estructuras de datos");

        Inscripcion inscripcion = new Inscripcion(nico);
        inscripcion.agregarMaterias(algoritmos);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscribirParadigmas(){
        Alumno nico = new Alumno("nicolas", "202.202.2");

        Materia algoritmos = new Materia("algoritmos y estructuras de datos");
        Materia paradigmas = new Materia("paradigmas de programacion");

        nico.agregarMaterias(algoritmos);
        paradigmas.agregarCorrelativas(algoritmos);

        Inscripcion inscripcion = new Inscripcion(nico);
        inscripcion.agregarMaterias(paradigmas);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscribirSegundoAnio(){
        Alumno nico = new Alumno("nicolas", "202.202.2");

        Materia quimica = new Materia("quimica");
        Materia discreta = new Materia("matematica discreta");
        Materia algoritmos = new Materia("algoritmos y estructuras de datos");
        Materia arquitectura = new Materia("arquitectura de computadoras");
        Materia sYo = new Materia("sistemas y organizaciones");
        Materia algebra = new Materia("algebra y geometria analitica");
        Materia am1 = new Materia("analisis matematico 1");
        Materia sociedad = new Materia("ingenieria y sociedad");


        nico.agregarMaterias(quimica, discreta, algebra, algoritmos, arquitectura, sYo, sociedad, am1);

        Materia sistemas = new Materia("analisis de sistemas");
        Materia sintaxis = new Materia("sintaxis y semantica de los lenguajes");
        Materia paradigmas = new Materia("paradigmas de programacion");
        Materia probabilidad = new Materia("probabilidad y estadistica");
        Materia representacion = new Materia("sistemas de representacion");
        Materia ingles = new Materia("ingles tecnico 1");
        Materia fisica = new Materia("fisica 1");
        Materia am2 = new Materia("analisis matematico 2");

        sistemas.agregarCorrelativas(algoritmos, sYo);
        sistemas.agregarCorrelativas(algoritmos);
        paradigmas.agregarCorrelativas(algoritmos,discreta);
        probabilidad.agregarCorrelativas(algebra, am1);
        am2.agregarCorrelativas(am1);

        Inscripcion inscripcion = new Inscripcion(nico);
        inscripcion.agregarMaterias(sistemas, sintaxis, paradigmas, probabilidad, representacion, ingles, fisica, am2);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void noDeberiaInscribirSegundoAnio(){
        Alumno nico = new Alumno("nicolas", "202.202.2");

        Materia quimica = new Materia("quimica");
        Materia discreta = new Materia("matematica discreta");
        Materia algoritmos = new Materia("algoritmos y estructuras de datos");
        Materia arquitectura = new Materia("arquitectura de computadoras");
        Materia sYo = new Materia("sistemas y organizaciones");
        Materia algebra = new Materia("algebra y geometria analitica");
        Materia am1 = new Materia("analisis matematico 1");
        Materia sociedad = new Materia("ingenieria y sociedad");


        nico.agregarMaterias(quimica, discreta, algoritmos, arquitectura, sYo, sociedad, am1);

        Materia sistemas = new Materia("analisis de sistemas");
        Materia sintaxis = new Materia("sintaxis y semantica de los lenguajes");
        Materia paradigmas = new Materia("paradigmas de programacion");
        Materia probabilidad = new Materia("probabilidad y estadistica");
        Materia representacion = new Materia("sistemas de representacion");
        Materia ingles = new Materia("ingles tecnico 1");
        Materia fisica = new Materia("fisica 1");
        Materia am2 = new Materia("analisis matematico 2");

        sistemas.agregarCorrelativas(algoritmos, sYo);
        sistemas.agregarCorrelativas(algoritmos);
        paradigmas.agregarCorrelativas(algoritmos,discreta);
        probabilidad.agregarCorrelativas(algebra, am1);
        am2.agregarCorrelativas(am1);

        Inscripcion inscripcion = new Inscripcion(nico);
        inscripcion.agregarMaterias(sistemas, sintaxis, paradigmas, probabilidad, representacion, ingles, fisica, am2);

        Assert.assertFalse(inscripcion.aprobada());
    }

}
