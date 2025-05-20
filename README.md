# 💱 Desafio Conversor de Moedas em Java

Este é um projeto Java desenvolvido como parte do **Challenge da ONE + Alura**, que tem como objetivo criar um **conversor de moedas** utilizando uma API de taxas de câmbio em tempo real.

## 🛠️ Tecnologias e Recursos Utilizados

- **Java**
- **HttpClient**, **HttpRequest** e **HttpResponse**
- **Biblioteca Gson**
- **Scanner**
- **ExchangeRate API** (https://www.exchangerate-api.com/)

## 🔄 Funcionalidades

- Conversão entre moedas:
  - Real ↔ Dólar
  - Real ↔ Peso argentino
  - Real ↔ Euro
- Interface textual com menu interativo
- Requisições HTTP usando `HttpClient`
- Processamento da resposta JSON com Gson
- Exibição formatada e centralizada dos resultados no console
- Limpeza da tela para melhor usabilidade

## 📦 Estrutura do Projeto
```bash
main/
├── com/
│ └── Main.java
│ ├── Menu/
│ │ └── MenuIOp.java
│ │ └── MenuOutrasOpcoes.java
│ │ └── MenuUtilitarios.java
│ └── conversordemoedas/
│ ├── api/
│ │ └── LimpaTela.java
│ │ └── MoedaFormatada.java
│ │ └── ServicoConversaodeMoedas.java
```

## 🔑 Configuração da API

1. Acesse [ExchangeRate API](https://www.exchangerate-api.com/) e crie uma conta gratuita.
2. Copie sua chave de API.
3. Substitua no seu código onde for necessário para autenticar a requisição.


## 🧠 Aprendizados
- Durante o desenvolvimento aprendi a consumir APIs com java usando HttpClient e HttpRequest.
- Interpretei dados JSON com Gson.
- Organizei melhor meu código usando métodos e classes separadas.
- Criei uma interface de texto funcional e intuitiva para o usuário.

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/pamis-costa/DesafioConversorDeMoedas.git
   
Projeto feito com <i>💖java💖</i> por Pâmela Costa.
