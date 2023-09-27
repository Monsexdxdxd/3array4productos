package fmsr.formulario3;
import java.util.Scanner;
public class Formulario3 {
    public static void main(String[] args) 
    {
       Scanner leer=new Scanner(System.in);
       int[]arreglo1=new int[4];
       double[]arreglo2=newDouble[4];
       String[]arreglo3=newString[4];
       for(int cont=0; cont<=3; cont++)
       {
           System.out.print("Ingrese nombre del producto: ");
           arreglo[cont]=leer.nextSring();
       }
       for(int cont=0; cont<=3; cont++)
       {
           System.out.print("Ingrese precio de producto: ");
           arreglo2[cont]=leer.nextDouble();
       }
       for(int cont=0; cont<=3; cont++)
       {
           System.out.print("Ingrese cantidad de producto: ");
           arreglo1[cont]=leer.nextInt();
       }
    }
}
