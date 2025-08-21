# 💰 Sistema de Controle Financeiro Pessoal

Um sistema intuitivo para gerenciamento de finanças pessoais desenvolvido em Java, focado em simplicidade e eficiência para controle de receitas e despesas.

![Java](https://img.shields.io/badge/Java-17+-orange)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)
![Licença](https://img.shields.io/badge/License-MIT-green)

## 📋 Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Como Executar](#como-executar)
- [Exemplos de Uso](#exemplos-de-uso)
- [Contribuição](#contribuição)

## 🎯 Sobre o Projeto

O **Sistema de Controle Financeiro** é uma aplicação Java que permite aos usuários gerenciar suas finanças pessoais de forma organizada e eficiente. O sistema oferece controle completo sobre receitas e despesas, categorizando transações e fornecendo relatórios detalhados.

### Principais Objetivos:
- ✅ **Simplicidade**: Interface intuitiva para usuários de todos os níveis
- ✅ **Segurança**: Validações robustas para prevenir inconsistências
- ✅ **Organização**: Categorização inteligente de transações
- ✅ **Controle**: Acompanhamento detalhado de entradas e saídas
- ✅ **Relatórios**: Visão clara da situação financeira

## 🚀 Funcionalidades

### 👤 Gestão de Usuários
- Cadastro de usuários com dados pessoais

### 🏦 Gerenciamento de Contas
- Criação de contas bancárias (Nubank, Itaú, Banco do Brasil, etc.)
- Controle de saldo
- Validação de saldo antes de transações de débito

### 💳 Sistema de Transações Inteligente
- **Transações de Débito**: Compras, contas, lazer, transporte
- Validação de saldo insuficiente

### 🏷️ Categorização 
- Categorias personalizáveis (Alimentação, Lazer, Transporte, etc.)

## 🛠️ Tecnologias Utilizadas

- **Java 17+** - Linguagem principal
- **Programação Orientada a Objetos** - Paradigma de desenvolvimento


## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   ├── model/
│   │   │   ├── Usuario.java           # Classe de usuário
│   │   │   ├── Conta.java             # Classe de conta bancária
│   │   │   ├── Transacao.java         # Classe de transações
│   │   │   ├── Categoria.java         # Classe de categorias
│   │   │   └── Id.java                # Gerador de IDs únicos
│   │   ├── service/
│   │   └── Main.java                  # Classe principal
│   └── resources/
└── README.md
```

## 🔧 Como Executar

### Pré-requisitos
- Java JDK 17 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VSCode)

### Passos para Execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/sistema-financeiro.git
   cd sistema-financeiro
   ```

2. **Compile o projeto**
   ```bash
   javac -d bin src/**/*.java
   ```

3. **Execute a aplicação**
   ```bash
   java -cp bin Main
   ```

### Usando IDE (Recomendado)
1. Importe o projeto na sua IDE
2. Configure o JDK 17+
3. Execute a classe `Main.java`

## 💡 Exemplos de Uso


### Criando Transações de Débito (Despesas)

```java
// Compras do supermercado
Transacao compras = new Transacao(150.00, contaNubank, 
                                         "Compras mensais", 
                                         categoryAlimentacao);

// Pagamento de conta
Transacao contaLuz = new Transacao(120.00, contaItau, 
                                          "Conta de luz", 
                                          categoryContas);
```

## 📈 Exemplo de Saída do Sistema

```
=== SALDOS INICIAIS ===
Nubank: R$1000,00
Itaú: R$500,00

=== EXECUTANDO TRANSAÇÕES ===
💸 DÉBITO executado: - R$150,00 | Débito | Alimentação | Nubank | Compras mensais
💸 DÉBITO executado: - R$80,00 | Débito | Lazer | Nubank | Jantar no restaurante

```

## 🎨 Principais Classes e Métodos

### Transacao.java
```java
// Métodos úteis
transacao.executarTransacao()    // Executa a transação

```

### Conta.java
```java
conta.getSaldo()                 // Consulta saldo atual
conta.debitarTransacao(valor)    // Remove dinheiro
```

## 🤝 Contribuição

Contribuições são sempre bem-vindas! Sinta-se livre para:

1. **Fork** o projeto
2. Crie uma **branch** para sua feature (`git checkout -b feature/MinhaFeature`)
3. **Commit** suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. **Push** para a branch (`git push origin feature/MinhaFeature`)
5. Abra um **Pull Request**

### Ideias para Contribuição
- 🔄 Implementar transações recorrentes
- 📊 Adicionar gráficos e dashboards
- 💾 Integração com banco de dados
- 📱 Interface gráfica (JavaFX/Swing)
- 📤 Export/Import de dados (CSV, JSON)
- 🎯 Metas e orçamentos
- 🔐 Sistema de autenticação


## 📝 Roadmap

- [ ] **v1.1** - Sistema de metas e orçamentos
- [ ] **v1.2** - Interface gráfica
- [ ] **v1.3** - Integração com banco de dados
- [ ] **v1.4** - API REST
- [ ] **v2.0** - Aplicação web completa

## 👨‍💻 Autor

**Mariana Eslan**
- GitHub: [@seu-usuario](https://github.com/marianaeslan)
- LinkedIn: [Seu Perfil](https://linkedin.com/in/marianaeslan)
- Email: mariana.eslan@gmail.com
