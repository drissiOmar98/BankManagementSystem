# MicroBankingServices 🏦

MicroBankingServices is a cutting-edge project  designed to transform banking operations through a microservices architecture. The project encompasses the following microservices:

## 1. Customer Service 🤝
   - Manages all aspects related to the bank's clients.
   - Enables the creation, retrieval, and modification of customer information.

## 2. Account Service 💼
   - Manages bank accounts with comprehensive details, including the account identifier, creation date, type (CURRENT_ACCOUNT or SAVING_ACCOUNT), and status (CREATED, ACTIVATED, SUSPENDED, BLOCKED).
   - Supports advanced operations such as:
      - 💵 Debiting an account with a specified amount
      - 💳 Crediting an account with a specified amount
      - ↔️ Transferring an amount from one account to another
   - Maintains a detailed transaction history for each account operation. Each transaction record includes a unique number, date, amount, description, and type (DEBIT or CREDIT).

## 3. Discovery Service (Eureka Server) 🌐
   - Implements a Discovery Service using Eureka Server.
   - Facilitates dynamic service registration and discovery within the microservices ecosystem.

## 4. Gateway Service (Spring Cloud Gateway) 🌉
   - Establishes a Gateway Service using Spring Cloud Gateway.
   - Manages the routing of requests to the respective microservices based on their specific paths.

## 5. Configuration Service ⚙️
   - Develops a centralized Configuration Service.
   - Enables dynamic configuration management for all microservices, ensuring flexibility and scalability.

MicroBankingServices leverages the power of microservices to create a distributed, scalable, and efficient banking system. With Eureka Server for service discovery, Spring Cloud Gateway for efficient routing, and a centralized Configuration Service, the project aims to provide a seamless and dynamic banking experience.

 
