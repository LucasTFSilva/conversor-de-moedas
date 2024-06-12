package com.br.projetoconversor.principal;

import com.br.projetoconversor.conversordemoedas.ConexaoApi;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConexaoApi conexaoApi = new ConexaoApi();
        conexaoApi.abrindorequisicao();
    }
}