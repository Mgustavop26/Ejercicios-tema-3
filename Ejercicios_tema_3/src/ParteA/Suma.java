package ParteA;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        int A;
        int B;
        int C;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero:  ");
        A= leer.nextInt();
        System.out.println("ingrese un numero:  ");
        B= leer.nextInt();
        System.out.println("ingrese un numero:  ");
        C= leer.nextInt();
        System.out.println ("Resultado de la suma es=  "+Suma(A,B,C));
    }
    static int Suma(int num1, int num2, int num3){
        int  resultado=num1+num2+num3;
        System.out.println("El resultado de la suma es: "+resultado);
        return resultado;
    }


}
