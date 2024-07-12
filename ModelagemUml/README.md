# Projeto de modelagem UML - DIO Bootcamp Santander

Projeto dedicado a trabalhar com modelagem de classes usando a ferramenta Mermaid.
Seguindo o diagrama foi feita uma implementação simplista, usando conceitos de interface,
herança e poliformismo.

## Diagrama de Classes

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class IPhone {
    }

    IPhone ..|> ReprodutorMusical
    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet