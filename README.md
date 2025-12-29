# DesafioUML_Estudo
Este repositório contém a solução de um desafio proposto pela plataforma DIO, inspirado na apresentação de Steve Jobs durante o lançamento do iPhone em 2007. O objetivo do projeto é aplicar e consolidar conceitos fundamentais da Programação Orientada a Objetos (POO), como abstração, encapsulamento, uso de interfaces e polimorfismo, por meio da modelagem e implementação das funcionalidades do dispositivo iPhone.

# Diagrama
    iPhone implements ReprodutorMusical
    iPhone implements AparelhoTelefonico
    iPhone implements NavegadorInternet
    classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    
