# 🥊 Simulador de Lutas

Projeto em **Java** que simula lutas entre lutadores, desenvolvido para praticar os conceitos de **Programação Orientada a Objetos (POO)**: classes, objetos, encapsulamento, construtores, getters/setters e interação entre classes.

> 📚 Projeto desenvolvido nas **aulas 8a e 8b**.

## 📋 Sobre o projeto

O sistema permite cadastrar lutadores com seus dados e histórico de lutas, classificá-los automaticamente por categoria de peso e marcar lutas entre eles. Quando uma luta é aprovada, o resultado (vitória de um dos lutadores ou empate) é sorteado e os registros de vitórias, derrotas e empates são atualizados.

## 🗂️ Estrutura do projeto

```
aula7a/
├── App.java        # Classe principal: cria os lutadores e marca as lutas
├── Lutador.java    # Representa um lutador (dados, categoria e histórico)
└── Luta.java       # Representa uma luta: valida o confronto e sorteia o resultado
```

## 🧱 Classes

### `Lutador`

Representa cada lutador cadastrado.

**Atributos**

| Atributo        | Tipo     | Descrição                                      |
|-----------------|----------|------------------------------------------------|
| `nome`          | `String` | Nome do lutador                                |
| `nacionalidade` | `String` | País de origem                                 |
| `idade`         | `int`    | Idade                                          |
| `altura`        | `double` | Altura (em metros)                             |
| `peso`          | `double` | Peso (em kg)                                   |
| `categoria`     | `String` | Definida automaticamente a partir do peso      |
| `vitorias`      | `int`    | Total de vitórias                              |
| `derrotas`      | `int`    | Total de derrotas                              |
| `empates`       | `int`    | Total de empates                               |

**Métodos principais**

- `apresentar()` – exibe todas as informações do lutador.
- `status()` – exibe nome, peso e histórico de lutas.
- `ganharLuta()`, `perderLuta()`, `empatarLuta()` – incrementam o respectivo contador.
- `setPeso(double)` – ao definir o peso, a categoria é calculada automaticamente.

**Categorias de peso**

| Categoria | Faixa de peso          |
|-----------|------------------------|
| Leve      | 52,2 kg até 70,3 kg    |
| Médio     | acima de 70,3 até 83,9 kg |
| Pesado    | acima de 83,9 até 120,2 kg |

> Pesos abaixo de 52,2 kg ou acima de 120,2 kg são considerados inválidos.

### `Luta`

Gerencia o confronto entre dois lutadores.

**Atributos:** `desafiado`, `desafiante`, `rounds` e `aprovada`.

**Métodos principais**

- `marcarLuta(Lutador l1, Lutador l2)` – verifica se a luta pode acontecer; se sim, exibe o status dos dois lutadores e chama `lutar()`.
- `lutar(Lutador l1, Lutador l2)` – sorteia o resultado (empate, vitória do lutador 1 ou vitória do lutador 2) e atualiza os registros.
- `verificarLuta(...)` *(privado)* – aprova a luta somente se os lutadores forem diferentes **e** da mesma categoria.
- `randomNumber(min, max)` *(privado)* – gera um número inteiro aleatório dentro do intervalo.

### `App`

Classe com o método `main`. Instancia cinco lutadores e marca duas lutas:

| Lutador      | Nacionalidade  | Categoria |
|--------------|----------------|-----------|
| Pretty Boy   | França         | Leve      |
| Putscript    | Brasil         | Leve      |
| Dead Code    | Austrália      | Médio     |
| Ufocobol     | Brasil         | Pesado    |
| Nerdard      | Estados Unidos | Pesado    |

Lutas marcadas: **Pretty Boy × Putscript** (Leve) e **Ufocobol × Nerdard** (Pesado).

## 💻 Exemplo de saída

O resultado é sorteado, então varia a cada execução.

```
--- LUTA MARCADA ---
_________________
LUTADOR 1
_________________
LUTADOR: Pretty Boy
PESO: 68.9
VITÓRIAS: 11
DERROTAS: 2
EMPATES: 1
_________________
...
-- LUTADOR 1 VENCE! ---
```

Se os lutadores forem de categorias diferentes, a luta é recusada:

```
Não foi possivel marcar essa luta!
```

## 🎯 Conceitos aplicados

- Classes e objetos
- Encapsulamento (atributos privados com getters e setters)
- Método construtor
- Regras de negócio dentro dos setters (cálculo automático da categoria)
- Métodos públicos e privados
- Associação entre classes (`Luta` utiliza `Lutador`)
- Geração de números aleatórios com `Math.random()`

## 🤖 Uso de IA

Foi utilizada inteligência artificial **somente para a criação deste README**, por meio do modelo **Claude Sonnet 5.5**, da Anthropic.

## 👤 Autor

Projeto desenvolvido para fins de estudo, nas aulas 8a e 8b.
