package Libro.cap02.interfaces.criterios;
import Libro.cap02.interfaces.Alumno;
public class CriterioAlumNotaProm extends Criterio<Alumno>
{
    public int comparar(Alumno a, Alumno b)
   {
       double diff = a.getNP()-b.getNP(); return diff>0 ? 1: diff <0 ? -1 : 0;
   }
}
