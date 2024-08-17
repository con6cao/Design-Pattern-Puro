package org.example;

import org.example.singleton.SingletonEagler;
import org.example.singleton.SingletonLazy;
import org.example.strategy.*;

public class Main {
    public static void main(String[] args) {

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("Endereço 1° do Lazy: " + lazy);
        System.out.println("Endereço 2° do Lazy: " + lazy);
        SingletonEagler eagler = SingletonEagler.getInstance();
        System.out.println("Endereço 1° do Eagler: " + eagler);
        System.out.println("Endereço 2° do Eagler: " + eagler);

        //Strategy
        Comportaments agressive = new AgressiveComportament();
        Comportaments normal = new NormalComportament();
        Comportaments soft = new SoftComportament();

        Robo robo = new Robo();
        robo.setComportaments(normal);
        robo.mover();

        robo.setComportaments(agressive);
        robo.mover();

        robo.setComportaments(soft);
        robo.mover();

    }
}
