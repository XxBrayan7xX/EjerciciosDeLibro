package Libro.cap02.colecciones;

public class TestCola 
{
    public static void main(String[] args)
    {
        MiCola<Integer> c = new MiCola<Integer>();
        c.encolar(1);
        c.encolar(2);
        c.encolar(3);
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        c.encolar(4);
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
    }
}
