package Libro.cap02.misclases;

import Libro.cap02.misclases.FechaDetallada;

public class TestFechaDetallada
{
    public static void main(String[] args)
    {
        FechaDetallada f = new FechaDetallada();
        f.setDia(25);
        f.setMes(10);
        f.setAño(2009);
        System.out.println(f);
    }
}
