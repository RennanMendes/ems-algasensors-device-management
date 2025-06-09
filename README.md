<div align="center">    
    <h1>Algasensors Device Management</h1>
</div>

Este é um projeto didático da **AlgaWorks**, desenvolvido no nível 1 do curso "Especialista Microsserviços".  
Tendo como foco principal apresentar os conceitos de **microsserviços** e **mensageria** utilizando o **RabbitMQ**.

🔗 Link do
curso: [Especialista Microsserviços - AlgaWorks](https://lp.algaworks.com/curso-especialista-microsservicos-java-spring-cadastro)  
_Todos os direitos do conteúdo do curso pertencem à AlgaWorks. Este repositório é utilizado apenas para fins
educacionais._

## Visão Geral

Algasensors é uma aplicação projetada para realizar o gerenciamento e monitoramento inteligente de sensores de
temperatura por meio de uma arquitetura moderna baseada em microsserviços.

[Diagrama do projeto](https://whimsical.com/ems-01-07-15-projeto-algasensors-refinando-modelagem-PL457CGTiNJAY3FGqg5oJE)  
[Design Doc: Adoção da Arquitetura de Microsserviços no AlgaSensors](https://www.notion.so/algaworks1/Design-Doc-Ado-o-da-Arquitetura-de-Microsservi-os-no-AlgaSensors-1a5731beea3580489501f870ac7f3c3e?pvs=4)

### 🔧 Principais Componentes

A solução é composta por três microsserviços independentes, cada um responsável por uma capacidade de negócio
específica:

* **Device Management Service**: Gerencia o cadastro, ativação e configuração remota dos sensores.
* **Temperature Processing Service**: Recebe os dados de temperatura em tempo real e os pública para outros serviços.
* **Temperature Monitoring Service**: Analisa, armazena e gera alertas com base nas leituras de temperatura, além de
  permitir consultas ao histórico.

#### 📌 Endpoints Device Management Service
Responsável pelo **cadastro, ativação/desativação e configuração de sensores**.

- `GET /api/sensors` - Lista sensores
- `GET /api/sensors/{sensorId}` - Busca sensor por ID
- `GET /api/sensors/{sensorId}/detail` - Busca sensor por ID com detalhes de monitoramento
- `POST /api/sensors` - Cadastra sensor
- `PUT /api/sensors/{sensorId}` - Atualiza sensor
- `PUT /api/sensors/{sensorId}/enable` - Ativa sensor
- `DELETE /api/sensors/{sensorId}/enable` - Desativa sensor
- `DELETE /api/sensors/{sensorId}` - Remove sensor

#### 📦 Entidade

```json
{
  "id": "TSID",
  "name": "string",
  "location": "string",
  "ip": "string",
  "protocol": "string",
  "model": "string",
  "enabled": true
}
```

## Instalação Local

Para começar, você só precisa ir até o repositório principal:

[algasensors-meta](https://github.com/rennanmendes/ems-algasensors-meta)

Lá você vai encontrar todas as instruções pra baixar e rodar o projeto no seu computador.