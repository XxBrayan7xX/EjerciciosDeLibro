package libroCap01;
import java.util.Scanner;
class ParOImpar 
{
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese un valor");
     int v = scanner.nextInt();
     int resto = v % 2;
     if(resto == 0)
     {
         System.out.println(v + " es par");
     }
     else
     {
         System.out.println(v + " es impar");
     }
    }
}
