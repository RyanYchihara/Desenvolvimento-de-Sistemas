




package projeto;

import java.util.Scanner;


public class exercicios {
    public static void main (String[] args){
    
        int tab;
        int num;
        Scanner tabuada;
        tab = 1;
        tabuada = new Scanner(System.in);
        
        
             
        System.out.println("Digite um numero inteiro: ");
        num = tabuada.nextInt();
        while(tab<11){
            System.out.println(tab + " X " + num + " = " + tab*num);
            tab++;      
        
        }
       
    }
    
}
