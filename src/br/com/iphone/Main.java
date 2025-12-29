package br.com.iphone;

import br.com.iphone.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();

        iPhone.selecionarMusica("Imagine Dragons - Thunder");
        iPhone.tocarMusica();

        iPhone.acessarWeb("Youtube.com");
        iPhone.atualizarPagina();

        iPhone.ligar("4002-8922");
        iPhone.atender();
    }
}
