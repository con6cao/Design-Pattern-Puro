package org.example;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("Endereço 1° do Lazy: "+lazy);
        System.out.println("Endereço 2° do Lazy: "+lazy);
        SingletonEagler eagler = SingletonEagler.getInstance();
        System.out.println("Endereço 1° do Eagler: "+ eagler);
        System.out.println("Endereço 2° do Eagler: "+ eagler);

    }
}