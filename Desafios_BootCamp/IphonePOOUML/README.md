# ProjetoIphonePOO

Este projeto foi desenvolvido como exercício prático de Programação Orientada a Objetos (POO) e modelagem UML, simulando as principais funcionalidades apresentadas no lançamento do primeiro iPhone.

## 📌 Objetivo
Aplicar conceitos de:
- **Análise de requisitos**
- **Modelagem UML**
- **Interfaces**
- **Composição**
- **Encapsulamento**

## 📱 Funcionalidades do iPhone
O iPhone, neste projeto, simula três funções principais:

1. **Reprodutor Musical**
   - Tocar música
   - Pausar música
   - Selecionar música

2. **Aparelho Telefônico**
   - Ligar para um número
   - Atender chamada
   - Desligar chamada
   - Iniciar correio de voz

3. **Navegador na Internet**
   - Exibir página
   - Adicionar nova aba
   - Atualizar página

## 🛠 Estrutura do Projeto
- **Interface `Celular`**: define o contrato para todas as funcionalidades.
- **Classes de Função**:
  - `ReprodutorMusical`
  - `ChamadaCelular`
  - `NavegadorInternet`
- **Classe Principal**:
  - `Iphone`: implementa `Celular` e utiliza as classes de função via **composição**.
- **Classe de Teste**:
  - `Main`: executa e demonstra todas as funcionalidades.


🧑‍💻 Tecnologias Utilizadas
Java 17+

UML (Unified Modeling Language)

📜 Licença
Este projeto foi desenvolvido para fins acadêmicos e de estudo.