package ejemplostrings;

import java.util.Scanner;
public class EjemploStrings {

    public static void main(String[] args) {
        String s1, s2, s3;
        
        s1="Java";
        s2="Java";
        s3=s1;
        
        if (s1.equals(s2))
            System.out.println("s1 y s2 son iguales");
        else
            System.out.println("s1 y s2 son diferentes");
        
        if (s1.equals(s3))
            System.out.println("s1 y s3 son iguales");
        else
            System.out.println("s1 y s3 son diferentes");
        
        Scanner entrada = new Scanner (System.in);

        System.out.print("Entrada de Texto=");
        String texto=entrada.next();
        
        System.out.print("Entrada de Texto2=");
        String texto2=entrada.nextLine();
        
        System.out.println("Texto="+texto);
        System.out.println("texto2="+texto2);
    }
    
}
