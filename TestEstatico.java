package Libro.cap02.estaticas;

public final class TestEstatico 
{
    private int a = 0;
    public void unMetodo()
    {
        System.out.println("Este es unMetodo()");
    }
    public static void main(String[] args)
    {
        TestEstatico t = new TestEstatico();
        System.out.println("a vale " + t.a);
    }
}
