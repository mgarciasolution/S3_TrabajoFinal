package pe.edu.senati;

import java.util.*;

public class Ejercicio09 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad:");
		
	    int n = sc.nextInt();
	    
	    int[] numero = new int[n];
	    
	    int i;
	   
	    System.out.println("Introducir los " + n + " numeros.");
		
		for (i = 0; i <= (numero.length-1); i++) 
		{
		    System.out.print("numero(" + (i+1) + ") = ");
		    numero[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(numero));

		Arrays.sort(numero);
		
		System.out.println(Arrays.toString(numero));
		
	}

}
