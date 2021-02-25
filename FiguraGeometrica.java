package Libro.cap02.figuras;

public abstract class FiguraGeometrica 
{
    private String nombre;
    public abstract double area();
    public static double areaPromedio(FiguraGeometrica arr[])
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i].area();
        }
        return sum/arr.length;
    }
    public FiguraGeometrica(String n)
    {
        nombre = n;
    }
  
    public String toString()
    {
        return nombre + " area = " + area();
    }
    public String getNombre() { return this.nombre; }
    public void setNombre(String n){ this.nombre = n; }
}
