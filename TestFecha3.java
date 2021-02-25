
package Libro.cap02.fechas;
import java.util.Scanner;
public class TestFecha3 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Fecha1 (dia, mes y año: ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int año = scanner.nextInt();
        Fecha f1 = new Fecha(dia, mes, año);
        
        System.out.println("Ingrese Fecha2 (dia, mes y año: ");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        año = scanner.nextInt();
        Fecha f2 = new Fecha(dia, mes, año);
        
        System.out.println("Fecha1 = " + f1);
        System.out.println("Fecha2 = "+ f2);
        
        if(f1.equals(f2))
            System.out.println("Son iguales");
        else
            System.out.println("Son distintas");
    }
}
