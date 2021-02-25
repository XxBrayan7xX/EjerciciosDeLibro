
package Libro.cap02.misclases;
import Libro.cap02.fechas.Fecha;
public class FechaDetallada extends Fecha
{
    private static String meses[] = {
                                     "Enero"
                                     ,"Febrero"
                                     ,"Marzo"
                                     ,"Abril"
                                     ,"Mayo"
                                     ,"Junio"
                                     ,"Julio"
                                     ,"Agosto"
                                     ,"Septrimbre"
                                     ,"Octubre"
                                     ,"Noviembre"
                                     ,"Diciembre"
                                                   };
    
    public FechaDetallada(int d, int m, int a)
    {
        super(d, m, a);
    }
    
    public FechaDetallada()
    {
        this(0, 0, 0);
    }
    public FechaDetallada(String s)
    {
        super(s);
    }
    
    public String toString()
    {
        return getDia() + " de " + meses[getMes() - 1] + " de " + getAño();
    }
}
