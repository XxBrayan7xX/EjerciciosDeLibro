package libroCap01;
import java.util.Scanner;
public class EsMayorQue21 
{
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese su edad");
     int edad = scanner.nextInt();
     if(edad>21)
             System.out.println("Es mayor de edad");
     else
     System.out.println("Es menor de edad");
    }
}
