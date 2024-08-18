package org.example.facede;

public class Facade {

    public void migrarCliente(String cep, String nome) {
        String cidade = SubSistem2CEP.getInstance().recuperarCidade(cep);
        String estado = SubSistem2CEP.getInstance().recuperarEstado(cep);
        SubSistem1CRM.guardarCliente(nome, cep, cidade, estado);
    }

}
