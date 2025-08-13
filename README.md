# souzaBarberCut
# 🧔 Barbearia POO – Mini-sistema em Java

[![Java](https://img.shields.io/badge/Java-17+-blue)](https://www.oracle.com/java/)
[![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-orange)]()
[![License](https://img.shields.io/badge/License-MIT-green)]()

---

## 📌 Descrição

Mini-sistema de cadastro para barbearia desenvolvido em **Java**, aplicando **POO** e boas práticas de código.  
Estruturado para futura evolução com **JPA/Hibernate, serviços, testes unitários e APIs REST**.

Funcionalidades iniciais:

- Cadastro de clientes e funcionários
- Gerenciamento de endereço, telefones e redes sociais
- Listagem e remoção de registros em memória

---

## 🗂 Estrutura de Pacotes

| Pacote | Conteúdo |
|--------|----------|
| `br.com.barbearia.modelo` | Entidades de domínio: `Pessoa`, `Cliente`, `Funcionario`, `Endereco`, `Telefone`, `RedeSocial` |
| `br.com.barbearia.servico` | Lógica de negócio: `PessoaService` |
| `br.com.barbearia.util` | Helpers e menu do console: `MenuPrincipal` |

---

## 🛠 Tecnologias e Conceitos

- **Linguagem:** Java 17+  
- **IDE:** Eclipse  
- **Controle de versão:** Git + GitHub  
- **Conceitos aplicados:** Encapsulamento, herança, composição, ArrayList, construtores, métodos  
- Preparado para **JPA/Hibernate, testes unitários e integração futura**

---

## 🚀 Como Executar

1. Clone o repositório:  
```bash
git clone https://github.com/SEU_USUARIO/barbearia-poo.git

2. Abra o projeto na IDE Eclipse.

3. Execute a classe br.com.barbearia.util.MenuPrincipal para iniciar o menu de cadastro.