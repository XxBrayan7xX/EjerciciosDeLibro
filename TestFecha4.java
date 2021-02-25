package Libro.cap02.fechas;
import java.util.Scanner;
public class TestFecha4 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Fecha (dd/mm/aaaa): ");
        String sFecha = scanner.next();
        Fecha f = new Fecha(sFecha);
        System.out.println("La fecha ingresada es: " + f);
        System.out.println("Ingrese una cantidad de dias a sumar"
                + "(pueden ser negativos): ");
        int diasSum = scanner.nextInt();
        f.addDias(diasSum);
        System.out.println("Sumando " + diasSum + " dias, queda: " + f);
    }
}
