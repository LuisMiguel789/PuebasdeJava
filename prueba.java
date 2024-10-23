import java.util.*;

public class prueba
{
    public static void main (String[]args)
    {
        Scanner in = new Scanner (System.in);
        
        int M [][] = new int [30][30];
        int fila, columna, f, c;
        int d=2;
        System.out.println ("----------------------MATRIZ VERTICAL---------------------");
        System.out.print ("Ingrese tamaño de filas de la Matriz : ");
        fila = in.nextInt();
        System.out.print ("Ingrese tamaño de columnas de la Matriz : ");
        columna = in.nextInt();
                    
        for (c=0; c<columna ; c++)
        {
           for (f = 0; f <fila ; f++)
           {
              if (c%d>0)
              {
                  for (f = fila-1; f>=0 ; f--)
                  {
                      //M [f][c] = new Random().nextInt(15);
                      System.out.println ("Ingresar datos a la Matriz en posicion [" + f +"] ["+c+"] : ");
                      M [f][c] = in.nextInt();
                  }
              }
              //M [f][c] = new Random().nextInt(15);
              System.out.println ("Ingresar datos a la Matriz en posicion [" + f +"] ["+c+"] : ");
              M [f][c] = in.nextInt();
           }
           
        }
        
        System.out.println ("MATRIZ ORDENADA");
        
        for (f = 0; f <fila ; f++)
        {
           for (c= 0; c<columna ; c++)
           {
               System.out.print (M [f][c] + " ");
           }
           System.out.println ();
        }
    }
}
