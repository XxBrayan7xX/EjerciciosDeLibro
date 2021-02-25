package Libro.cap02.colecciones;
/*import java.util.Vector;*/
import java.util.Collection;
public class TestVector 
{
    public static void main(String[] args)
    {
        /*Vector<String> v = new Vector<String>();
        v.add("Pablo");
        v.add("Juan");
        v.add("Carlos");
        String aux;
        for(int i = 0; i<v.size(); i++)
        {
            aux = v.get(i);
            System.out.println(aux);
        }*/
        Collection<String> coll = UNombres.obtenerLista();
        for(String nom: coll)
        {
            System.out.println(nom);
        } 
    }
}
