package org.example.strategy;

public class Robo {
    private Comportaments comportaments;

    public void setComportaments(Comportaments comportaments) {
        this.comportaments = comportaments;
    }

    public void mover() {
        comportaments.mover();
    }
}
