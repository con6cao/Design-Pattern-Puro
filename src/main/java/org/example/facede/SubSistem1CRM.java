package org.example.facede;

public class SubSistem1CRM {


    private SubSistem1CRM() {
        super();
    }

    public static void guardarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente Salvo");
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(nome);

    }

}
