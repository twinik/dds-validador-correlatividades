package domain;
import org.junit.Test;

public class AlumnoTest {
    @Test
    public void puedeCursarTest() {
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia am1 = new Materia("Analisis Matematico 1");
        Materia aga = new Materia("Algebra y Geometria Analitica");
        Materia pdp = new Materia("Paradigmas de Programacion", algoritmos);
        Materia dds = new Materia("Disenio de Sistemas", pdp, algoritmos);
        Materia am2 = new Materia("Analisis Matematico 2", am1, aga);

        Alumno alumno = new Alumno("Tobi", "5555");
        alumno.agregarMateriasAprobadas(algoritmos, am1, aga);

        assert(alumno.puedeCursar(am2));
        assert(!alumno.puedeCursar(dds));
    }
}