package pe.edu.upc.appEjercicio1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s=new Scanner(System.in);
    	int numero;
    	String[] arrNombre=new String[3];
    	
    	//Clases envolventes=> casting
    	Double valores = new Double(13);
    	
    	for (int i = 0; i < arrNombre.length; i++) {
    	    System.out.println( "Nombre"+(i+1) );
    	    arrNombre[i]=s.nextLine();
    	
		}
      //  System.out.println( "Hello World!" );
    }
}
