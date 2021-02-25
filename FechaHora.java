package Libro.cap02.misclases;

public class FechaHora extends FechaDetallada
{
    private int hora;
    private int minuto;
    private int segundo;
    public FechaHora(String sFecha, int hra, int min, int seg)
    {
        super(sFecha);
        this.hora = hra;
        this.minuto = min;
        this.segundo = seg;
    }
    public String toString()
    {
        return super.ToString() + "("+hora+":"+minuto+":"+segundo+")";
    }
}
