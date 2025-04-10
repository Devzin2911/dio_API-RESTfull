Estudando junto com a galera da DIO, aprendendo a como criar uma API RESTful com a linguagem Java
Também faremos outras coisas muito legais por aqui. Aguardo o desafio de criar a minha própria API
com base nesses estudos.

Segue o Diagrama de classes que irei me basear para a devida criação da API

Aqui está o diagrama de classes em sintaxe Mermaid baseado no JSON fornecido:

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -List~Feature~ features
        -Card card
        -List~News~ news
    }

    class Account {
        -String number
        -String agency
        -double balance
        -double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String card_number
        -double limit
    }

    class News {
        -String icon
        -String description
    }

    User "1" *--> "1" Account
    User "1" *--> "N" Feature
    User "1" *--> "1" Card
    User "1" *--> "N" News
```


