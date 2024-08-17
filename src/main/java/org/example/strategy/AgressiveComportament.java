package org.example.strategy;

public class AgressiveComportament implements Comportaments {
    @Override
    public void mover() {
        System.out.println("Andar Agressivamente!!!");
    }
}
