package libroCap01;
import java.util.Scanner;
 class DemoMatriz 
{
 public static void main(String[] args)
 {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese un numero de filas");
     int n = scanner.nextInt();
     System.out.println("Ingrese la cantidad de columnas");
     int m = scanner.nextInt();
     int mat[][] = new int[n][m];
     int nro;
     for(int i = 0; i <= n; i++)
     {
         for(int j = 0; j <= m; j++)
         {
             nro = (int)(Math.random()*1000);
             mat[i][j] = nro;
         }
     }
     
     for(int i = 0; i <= n; i++)
     {
         for(int j = 0; i <=j; j++)
         {
             System.out.print(mat[i][j]+"\t");
         }
     }
 }
}
