package org.example.facede;

public class SubSistem2CEP {

    private static SubSistem2CEP instancia = new SubSistem2CEP();

    private SubSistem2CEP() {
        super();
    }

    public static SubSistem2CEP getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cidade) {
        return ("Araraquara");
    }

    public String recuperarEstado(String estado) {
        return ("SP");
    }

}
