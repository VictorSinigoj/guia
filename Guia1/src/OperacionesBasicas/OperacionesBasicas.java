
package OperacionesBasicas;

import java.util.Scanner;

/**
 * @author Victor Sinigoj
 */
public class OperacionesBasicas {

    private int a = 10;
    private int b = 5;
    private int r = 0;
    private Object reader;

    public OperacionesBasicas() {
    }

    public OperacionesBasicas(int a, int b) {
        this.a = a;
        this.b = b;

/*        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        a = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        b = reader.nextInt();
 */
        }

    public int Sumar() {

        if ((a == 0) || (b == 0)) {
            r = 0;
            System.out.println("Para la suma 1 valor esta en 0 ");

        } else {
            r = a + b;
            System.out.println("La suma es " + a + " + " + b + " = " + r);
        }
        return this.r;
    }

    public int Restar() {

        if (b > a) {
            r = 0;
            System.out.println("Valor de B mayor a A = retorna 0 ");

        } else {
            r = a - b;
            System.out.println("La Resta es " + a + " - " + b + " = " + r);
        }
        return this.r;
    }

    public int Multiplicar() {

        if (b == 0) {
            r = 1;
            System.out.println("Valor de B es 0 , retorna 1 ");

        } else {
            r = a * b;
            System.out.println("La Multiplicacion es " + a + " * " + b + " = " + r);
        }
        return this.r;
        
    }

    public int Dividir() {
        if (b == 0) {
            r = 0;
            System.out.println("Valor de B es 0 , retorna 0 ");

        } else {
            r = a / b;
            System.out.println("La Division es " + a + " / " + b + " = " + r);
        }
        return this.r;

    }
}
