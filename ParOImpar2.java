package libroCap01;
import java.util.Scanner;

public class ParOImpar2 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int v = scanner.nextInt();
        int resto = v % 2;
        String mssg = (resto == 0)? " es par" : " es impar";
        System.out.println(v + mssg);
    }
}
