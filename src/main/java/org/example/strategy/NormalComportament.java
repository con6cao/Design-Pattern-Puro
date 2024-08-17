package org.example.strategy;

public class NormalComportament implements Comportaments {
    @Override
    public void mover() {
        System.out.println("Andar normalmente!!!");
    }
}
