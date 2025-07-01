# Bike-Rental-Web
A Spring Boot backend for a Bike Rental system, providing RESTful APIs for managing users, bike inventory, bookings, and more. Built using Java and Maven.
# 🚲 Bike Rental Backend

This is a backend service for a Bike Rental application, built with **Spring Boot** and **Maven**. It provides REST APIs to manage bikes, users, bookings, and rental operations.

## ⚙️ Tech Stack

- Java
- Spring Boot (v2.6.6)
- Spring Web
- Spring Data JPA
- H2 / MySQL (configurable)
- Maven

## 📁 Project Structure

- `com.bikerental.controller` – Handles REST API endpoints
- `com.bikerental.model` – Entity definitions
- `com.bikerental.repository` – Data access layer using Spring Data JPA
- `com.bikerental.service` – Business logic and service layer

## 🧪 Features

- Add, update, and delete bikes
- Register and manage users
- Book and cancel bike rentals
- View available bikes
- Search and filter rentals

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/bike-rental-backend.git
   cd bike-rental-backend
