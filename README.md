# 🧪 Kotlin Playground

<div align="center">
  <img src="https://img.shields.io/badge/Kotlin-Playground-%237F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin Playground">
</div>

Um repositório sandbox para experimentação e aprendizado de Kotlin, onde pratico conceitos da linguagem através de pequenos exercícios e descobertas.

**Principais Características**:
- 🎯 Exemplos básicos para fundamentos da linguagem
- 🧠 Espaço para testes e experimentos
- 📚 Links para documentação oficial e recursos úteis

## 📑 Índice de Estudos
1. [Fundamentos da Sintaxe](#-fundamentos-da-sintaxe)
2. [Manipulação de Dados](#-manipulação-de-dados)
3. [Controle de Fluxo](#-controle-de-fluxo)
4. [Coleções e Arrays](#-coleções-e-arrays)
5. [Funções Avançadas](#-funções-avançadas)
6. [Tratamento de Entrada](#-tratamento-de-entrada)
7. [Orientações e Recursos](#-orientações-e-recursos)

## 🧱 Fundamentos da Sintaxe
- **Hello World**: Primeiro programa (`println`)
- **Variáveis**:
    - `val` (imutável) vs `var` (mutável)
    - Inferência de tipos
- **Tipos Primitivos**:
    - Inteiros: `Int`, `Long`
    - Ponto flutuante: `Float` (32-bit), `Double` (64-bit)
    - Booleano: `Boolean`
    - Caractere: `Char`
    - String: `String`

## 🔢 Manipulação de Dados
- **Operadores**:
    - Aritméticos: `+`, `-`, `*`, `/`, `%`, `++`, `+=`
    - Comparação: `==`, `!=`, `<`, `>`, `<=`, `>=`
    - Lógicos: `&&`, `||`, `!`
- **Interpolação de Strings**: Template expressions (`${expression}`)
- **Conversão de Tipos**:
    - `toInt()`, `toFloat()`, `toString()`
    - Safe casting (`toIntOrNull`)

## 🎚 Controle de Fluxo
- **Condicionais**:
    - `if`/`else` tradicional
    - `when` expression (switch-case aprimorado)
- **Escopo com Segurança**: Null safety operator (`?.`)
- **Elvis Operator**: `?:` (valor padrão para null)
- **Validação de Faixas**: `in` operator e ranges (`0..10`)

## 🧺 Coleções e Arrays
- **Array Fixo**: `intArrayOf()`, `arrayOf()`
- **Listas Mutáveis**: `mutableListOf()`
- **Iterações**:
    - `for` simples
    - `for` com índices
    - `until` e `step`
- **Operações Funcionais**: `filter`, `map`, `forEach`

## 🧰 Funções Avançadas
- **Funções de Extensão**: `fun String.myFilter()`
- **Expressões Lambda**: `{ it % 2 == 0 }`
- **Funções de Escopo**: `buildString`

## ⌨ Tratamento de Entrada
- **Leitura Básica**: `readln()`
- **Conversão Segura**: `toIntOrNull()` com fallback (`?:`)
- **Validação em Cascata**: Encadeamento seguro de operadores (`?.`)
- **Tratamento de Erros**: `try`/`catch` básico

## 🧭 Orientações e Recursos
### 📚 Documentação Oficial
- [Kotlin Language Documentation](https://kotlinlang.org/docs/home.html)
- [IntelliJ IDEA Kotlin Guide](https://www.jetbrains.com/help/idea/getting-started-with-kotlin.html)
- [Curso Base (YouTube)](https://www.youtube.com/watch?v=dzUc9vrsldM)

### 💡 Dicas Importantes
1. Prefira `val` a `var` sempre que possível
2. Evite o operador `!!` (non-null assertion)
3. Utilize `when` no lugar de cadeias longas de `if`/`else`
4. Experimente funções de extensão para melhor legibilidade