package Libro.cap02.colecciones;

public class MiColeccion<T>
{
    private Object datos[] = null;
    private int len = 0;
    public MiColeccion(int cantidadInicial)
    {
        datos = new Object[cantidadInicial];
    }
    public T obtener(int i)
    {
        return (T)datos[i];
    }
    public int cantidad()
    {
        return len;
    }
    public void insertar(T elm, int i)
    {
        if(len == datos.length)
        {
            Object aux[] = datos;
            datos = new Object[datos.length * 2];
            for(int j=0; j<len; j++)
            {
                datos[j]=aux[j];
            }
            aux=null;
        }
        for(int j = len-1; j>=i; j--)
        {
            datos[j+1] = datos[j];
        }
        datos[i] = elm;
        len++;
    }
    public int buscar(T elm)
    {
        int i = 0;
        for( ;i<len && !datos[i].equals(elm); i++);
            return i < len? i : -1;
    }
    public void agregar(T elm)
    {
        insertar(elm,len);
    }
    public T eliminar(int i)
    {
        Object aux = datos[i];
        for(int j = i; j<len-1; j++)
        {
            datos[j] = datos[j+1];
        }
        len--;
        return (T)aux;
    }
}
