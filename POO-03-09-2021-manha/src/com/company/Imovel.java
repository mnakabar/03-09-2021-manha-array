package com.company;

public class Imovel {
    String tipo;
    double tamanho;
    String bairro;
    String cep;

    public Imovel(String tipo, double tamanho, String endereco, String cep) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.bairro = endereco;
        this.cep = cep;
    }
}
