package pe.edu.senati;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas:");
	    int f = sc.nextInt();
		System.out.print("Columnas:");
	    int c = sc.nextInt();
	    int[][] numero = new int[f][c];
	    
	    int i;
	   
	    System.out.println("Introducir los " + f*c + " numeros.");
	    
	    
		
		for (f=0; f<numero.length; f++) 
		{
			for (c = 0; c < (numero[0].length); c++) 
			{
			    System.out.print("numero(" + (f+1) + "," + (c+1) + ") = ");
			    numero[f][c] = sc.nextInt();
			}
		}
		
		
		for(f=0;f<numero.length;f++) 
		{
			System.out.println(Arrays.toString(numero[f]));
		}
		
		System.out.println("------------------");
				
		for(f=0;f<numero.length;f++) 
		{
			Arrays.sort(numero[f]);
			System.out.println(Arrays.toString(numero[f]));
			
		}
		
	}

}
