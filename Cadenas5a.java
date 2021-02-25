
package libroCap01;

public class Cadenas5a
{
  public static void main(String[] args)
  {
      long hi = System.currentTimeMillis();
      StringBuffer sb = new StringBuffer();
      int n = 100000;
      char c;
      for(int i = 0; i < n; i++)
      {
          c = (char)('A' + i% ('Z' - 'A'));
          sb.append(c);
      }
       long hf = System.currentTimeMillis();
       System.out.println(sb.toString());
       System.out.println(hf-hi + " milisegundos"); 
  }
}
