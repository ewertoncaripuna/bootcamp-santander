# Projeto de modelagem UML - DIO Bootcamp Santander

Projeto dedicado a trabalhar com modelagem de classes usando a ferramenta Mermaid.
Seguindo o diagrama foi feita uma implementação simplista, usando conceitos de interface,
herança e poliformismo.

## Diagrama de Classes

```mermaid
classDiagram
    class ReprodutorMusical {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +
