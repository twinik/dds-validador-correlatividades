package domain;

import org.junit.Test;

public class InscripcionTest {
    @Test
    public void inscripcionAprobadaTest() {
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia am1 = new Materia("Analisis Matematico 1");
        Materia aga = new Materia("Algebra y Geometria Analitica");
        Materia pdp = new Materia("Paradigmas de Programacion", algoritmos);
        Materia dds = new Materia("Disenio de Sistemas", pdp, algoritmos);
        Materia am2 = new Materia("Analisis Matematico 2", am1, aga);

        Alumno alumno = new Alumno("Tobi", "5555");
        alumno.agregarMateriasAprobadas(algoritmos, am1, aga);

        Alumno alumno2 = new Alumno("Tobi 2", "5555");
        alumno2.agregarMateriasAprobadas(algoritmos);

        Inscripcion inscripcion = new Inscripcion(alumno, am2, dds);
        Inscripcion inscripcion2 = new Inscripcion(alumno2, pdp);

        assert(!inscripcion.aprobada());
        assert(inscripcion2.aprobada());
    }
}
