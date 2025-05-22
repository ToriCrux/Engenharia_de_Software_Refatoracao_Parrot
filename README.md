# 🦜 Parrot Refactoring Kata

Este projeto é baseado no repositório didático [Parrot Refactoring Kata](https://github.com/emilybache/Parrot-Refactoring-Kata), desenvolvido com o objetivo de aplicar boas práticas de engenharia de software em um código legado Java.

## 📌 Objetivo

Refatorar um sistema legado com baixa coesão, duplicação de lógica e estrutura confusa, aplicando princípios de design orientado a objetos, mantendo a funcionalidade original garantida por testes automatizados.

---

## ⚙️ Tecnologias Utilizadas

- Java 21
- Maven
- IntelliJ IDEA
- JUnit 5

---

## 🛠️ Melhorias Realizadas

### ✅ 1. Verificação Inicial e Testes Automatizados

- Clonagem e ajuste do projeto original para execução com Java 21.
- Validação dos testes automatizados existentes (100% passando).
- Ajustes no `pom.xml` para compatibilidade com o ambiente.

### ✅ 2. Reestruturação com Polimorfismo

- Eliminação da lógica condicional centralizada.
- Criação de subclasses:
  - `EuropeanParrot`
  - `AfricanParrot`
  - `NorwegianBlueParrot`
- Cada classe agora implementa seu próprio comportamento de forma coesa.

### ✅ 3. Expressividade com Variáveis Claras

- Substituição de expressões matemáticas complexas por variáveis com nomes descritivos.
- Melhor entendimento da lógica de negócio em métodos como `getSpeed()`.

### ✅ 4. Encapsulamento e Fábrica de Objetos

- Criação da classe `ParrotAttributes` para agrupar atributos relacionados.
- Implementação de uma `ParrotFactory` para centralizar a criação dos objetos.
- Redução da complexidade nas chamadas e melhor separação de responsabilidades.

### ✅ 5. Reorganização Arquitetural

- Separação clara das responsabilidades entre classes.
- Código modular, extensível e mais fácil de manter.
- Preparado para evolução sem impactar funcionalidades existentes.

---

## ✅ Justificativas Técnicas

- **Polimorfismo** - elimina condicionais e aumenta a flexibilidade do sistema.
- **Encapsulamento** - melhora o controle de acesso e reduz o acoplamento.
- **SRP (Princípio da Responsabilidade Única)** - aplicado para manter cada classe com uma função clara.
- **Open/Closed Principle** - o sistema agora permite adicionar novas espécies de papagaio sem alterar o código existente.

---

## 🧪 Testes Automatizados

- Todos os testes originais foram mantidos
- Novos testes foram desenvolidos e adaptados à nova estrutura.

---

## 🚀 Como Executar

1. Clone este repositório
2. Compile com Maven: `mvn clean install`
3. Execute os testes: `mvn test`

---

## 👨‍💻 Autor

Projeto refatorado por **Victória Cruz** como parte de um exercício acadêmico de boas práticas de engenharia de software.
  
