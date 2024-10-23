import java.util.*;

public class parcial_1
{
    public static void main (String[]args)
    {
        Scanner entrada = new Scanner (System.in);
        
        int Num;
        int i;
        int n,m = 1,tree = 0;
        int A [] = new int [50];
        int B [] = new int [50];
        int n1, N,s=0,u=0;
        int p [] [] = new int [50] [50];
        int fila,columna,f,c;
        int h=0,k=0,l=0;
        int summ = 0;
        
        System.out.println ("1. Operación");
        System.out.println ("2. Vector");
        System.out.println ("3. Matriz");
        
        System.out.print ("Ingrese una Opción : ");
        Num = entrada.nextInt();
        
        switch (Num) 
        {
            case 1: System.out.print ("Ingrese un número : ");
                    n = entrada.nextInt();
                    for (int t = 1; t <= n;  t++)
                    {
                        m = m * t;
                    }
                    
                    tree = 3 * n;
                    System.out.println ("el factorial es : " + m);
                    System.out.println ("el elevado al cuadrado es : " + tree);
                    break;
            case 2: System.out.print ("Ingrese el tamaño del vector : ");
                    n1 = entrada.nextInt();
                    for (i=0; i<n1 ; i++) 
                    {
                        A [i] = new Random().nextInt(10);
                        System.out.println ("ingresar datos en Vector A en posicion [" + i +"] : " + A[i]);
                        //A [i] = entrada.nextInt();
                        if (A[i]%2==0)
                            s = A[i] + s;
                    }
                    for (i = 0; i <n1 ; i++)
                    {
                        B [i] = new Random().nextInt(10);
                        System.out.println ("ingresar datos enVector B en posicion [" + i +"] : " + B [i]);
                        //B [i] = entrada.nextInt();
                        if (B[i]%2==0)
                            u = B[i] + u;
                    }
                    System.out.println ("--------------LA SUMA DE LOS DATOS GUARDADOS SON--------------");
                    for (i=0 ; i<1 ; i++)
                    {
                        int suma = s + u;
                        System.out.println ("La SUMA de los elementos es :" + suma );
                    }
                    break;
            case 3: System.out.print ("Ingrese tamaño de filas de la Matriz : ");
                    fila = entrada.nextInt();
                    System.out.print ("Ingrese tamaño de columnas de la Matriz : ");
                    columna = entrada.nextInt();
                    
                    for (f = 0; f <fila ; f++)
                    {
                        for (c= 0; c<columna ; c++)
                        {
                            System.out.print ("Ingresar datos a la Matriz en posicion [" + f +"] ["+c+"] : ");
                            p [f][c] = entrada.nextInt();
                        }
                    }
                    
                    System.out.println ("MATRIZ ORDENADA");
        
                    for (f = 0; f <fila ; f++)
                    {
                        for (c= 0; c<columna ; c++)
                        {
                            System.out.print (p [f][c] + " ");
                        }
                        System.out.println ();
                    }
                    
                    for (f = 0; f <fila ; f++)
                    {
                        for (c= 0; c<columna ; c++)
                        {
                            int x = 0;
                            if ((f == x) && (c == x))
                            h = p [f] [c] + h;
                            x++;
                        }
                    }
                    for (f = 0; f <fila ; f++)
                    {
                        for (c= 0; c<columna ; c++)
                        {
                            summ= h + summ;
                        }
                    }
                    
                    System.out.print ("La suma de sus elementos es : " + summ);
                    break;
            default : System.out.println ("Error de CAPA 8");
                                 
        }
        
    }
}