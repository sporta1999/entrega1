package com.entrega1;

public class entrega {
    public static void main(String[] args) {
        int a = 10, b= 2, c=5;
        int suma = a + b + c;
        float multiplicacion = a * b*c;
        System.out.println("la suma es: "+ suma);
        System.out.println("la multiplicaion es: "+multiplicacion);
        if (suma > multiplicacion){
            System.out.println("la suma es mayor que la multiplicaion");
        }else {
            System.out.println("la multiplicaion es mayor que la suma");
        }
    }
}
