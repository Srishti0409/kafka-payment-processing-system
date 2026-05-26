# Kafka Payment Processing System

A backend payment processing pipeline built using Spring Boot and Apache Kafka demonstrating event-driven architecture and asynchronous communication.

---

## Architecture

```text
API Request
    ↓
Spring Boot REST API
    ↓
Kafka Producer
    ↓
Kafka Topic (payments)
    ↓
Kafka Consumer
    ↓
Payment Processing
```

---

## Technologies Used

- Java
- Spring Boot
- Apache Kafka
- REST API
- H2 Database
- Maven

---

## Features

- Event-driven payment processing
- Kafka Producer and Consumer implementation
- Asynchronous communication workflow
- REST API integration
- Decoupled backend architecture

---

## How It Works

1. A payment request is sent to the REST API.
2. The API publishes the payment event to a Kafka topic.
3. A Kafka consumer listens to the topic.
4. The consumer processes the payment asynchronously.

---

## API Endpoint

### Create Payment

```http
POST /payments
```

### Example Request

```bash
curl -X POST http://localhost:8080/payments \
-d "userId=101 amount=500"
```

### Example Response

```text
Payment received: userId=101 amount=500
```

---

## Setup Instructions

### Clone the Repository

```bash
git clone https://github.com/Srishti0409/kafka-payment-processing-system.git
```

### Start Kafka

```bash
bin/kafka-server-start.sh config/server.properties
```

### Run the Application

Run:

```text
PaymentSystemApplication.java
```

OR

```bash
mvn spring-boot:run
```

---

## Project Purpose

This project demonstrates how distributed backend systems process payment events asynchronously using Apache Kafka and Spring Boot.

---

## Future Improvements

- Docker integration
- Payment status tracking
- Authentication & authorization
- MySQL/PostgreSQL integration

---

## Author

**Srishti Gupta**  
