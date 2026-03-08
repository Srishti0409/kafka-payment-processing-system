# Kafka Payment Processing System

A backend payment processing pipeline built using Spring Boot and Apache Kafka demonstrating event-driven architecture.

## Architecture

API → Kafka Producer → Kafka Topic → Kafka Consumer

## Technologies Used

- Java
- Spring Boot
- Apache Kafka
- REST API
- H2 Database

## How It Works

1. A payment request is sent to the REST API
2. The API publishes the payment event to a Kafka topic
3. A Kafka consumer listens to the topic
4. The consumer processes the payment event

## Architecture

User/API
   ↓
Spring Boot Controller
   ↓
Kafka Producer
   ↓
Kafka Topic (payments)
   ↓
Kafka Consumer
   ↓
Payment Processing

## Example Request

curl -X POST http://localhost:8080/payments -d "userId=101 amount=500"

## Output

Payment received: userId=101 amount=500

## Project Purpose

This project demonstrates asynchronous event processing used in distributed backend systems such as financial transaction platforms.
