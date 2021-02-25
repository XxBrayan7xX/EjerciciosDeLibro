package Libro.cap02.instancias;
import Libro.cap02.fechas.Fecha;
import Libro.cap02.misclases.FechaDetallada;
public class Persona 
{
    private String nombre;
    private String dni;
    private Fecha fechaNacimiento;
    private int cont = 0;
    
    public Persona(String nombre, String dni, Fecha fecNac)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String toString()
    {
        cont++;
        return nombre + ", DNI: " + dni + ", nacido el: " + fechaNacimiento
                  + " (" + cont + ")";
    }
    public String getNombre() { return this.nombre; }
    public void setNombre(String n){this.nombre = n; }
    
    public String getDni(){ return this.dni; }
    public void setDni(String d){this.dni = d; }
    
    public Fecha getFechaNacimiento(){ return this.fechaNacimiento; }
    public void setFecNac(Fecha f){ this.fechaNacimiento = f; }
}
