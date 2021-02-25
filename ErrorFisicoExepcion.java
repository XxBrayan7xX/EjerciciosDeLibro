package Libro.cap02.exepciones;

public class ErrorFisicoExepcion extends Exception
{
    public ErrorFisicoExepcion(Exception ex)
    {
        super("Ocurrio un error fisico", ex);
    }
}
