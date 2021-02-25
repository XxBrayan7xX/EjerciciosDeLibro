
package libroCap01;
import java.util.Scanner;
public class PrimerosNumeros1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while(i <= n)
        {
            System.out.println(i);
            i++;
        }
    }
}
