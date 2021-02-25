
package Libro.cap02.interfaces;

public class Alumno implements Comparable<Alumno>
{
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    public Alumno(String n, int e, double np)
    {
        this.nombre = n;
        this.edad = e;
        this.notaPromedio = np;
    }
    public int compareTo(Alumno otroAlumno)
    {
        return this.edad - otroAlumno.edad;
    }
    public String toString()
    {
        return nombre + ", " + edad + ", " + notaPromedio;
    }
    public String getNombre(){return this.nombre;}
    public void setNombre(String n){this.nombre = n;}
    public int getEdad(){return this.edad;}
    public void setEdad(int e){this.edad = e;}
    public double getNP(){return this.notaPromedio;}
    public void setNP(double np){this.notaPromedio = np;}
}
