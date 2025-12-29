package br.com.iphone.model;

import br.com.iphone.interfaces.Navegador;
import br.com.iphone.interfaces.Reprodutor;
import br.com.iphone.interfaces.Telefone;

public class Iphone implements Telefone, Reprodutor, Navegador {

    // Funções do Telefone
    public void ligar (String numero){
        System.out.println("Ligando...");
    }
    public void atender (){
        System.out.println("Atendendo...");
    }
    public void iniciarCorreioVoz (){
        System.out.println("Inciando mensagem gravada...");
    }

    // Funções do Reprodutor Musical
    public void tocarMusica (){
        System.out.println("Tocando uma música");
    }
    public void pausa (){
        System.out.println("Pausando");
    }
    public void selecionarMusica (String musica){
        System.out.println("Tocando uma música");
    }

    // Funções do Navegador
    public void acessarWeb (String url){
        System.out.println("Acessando a Web");
    }
    public void adicionarPagina (){
        System.out.println("Adicionando uma página");
    }
    public void atualizarPagina (){
        System.out.println("Atualizando a página");
    }
}
