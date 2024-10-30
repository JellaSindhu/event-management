---

# Event Management API

Welcome to the **Event Management API**! This is a Spring Boot application designed to facilitate the management of event tickets. Users can create, read event tickets while also being able to filter tickets and calculate total amounts grouped by sellers.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Postman Screenshots](#postman-screenshots)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Create New Event Tickets**: Add new event tickets to the system.
  
- **Retrieve Total Amounts**: Calculate the total amount of tickets sold grouped by seller.

- **Filter Tickets**: Search for tickets by seller name in a case-insensitive manner.

- **Pagination Support**: Retrieve tickets with pagination to manage large datasets effectively.

## Technologies Used

- **Java 17**: The programming language used to build the application.
  
- **Spring Boot 2.x**: A framework that simplifies the setup and development of new Spring applications.

- **Spring Data JPA**: A part of the Spring framework that makes it easy to work with databases using JPA.

- **MySQL**: The relational database management system used for data storage.

- **Postman**: A tool for testing API endpoints and managing requests.

## Installation

### 1. Clone the Repository

Open your terminal or command prompt and execute the following command:

```bash
git clone https://github.com/JellaSindhu/event-management.git
cd event-management
```

### 2. Set Up MySQL Database

- **Create a Database**: Open your MySQL client and create a new database named `event_db`.

- **Update Application Properties**: Navigate to `src/main/resources/application.properties` and ensure the following properties are set with your MySQL credentials:

  ```properties
  spring.application.name=event-management
  spring.datasource.url=jdbc:mysql://localhost:3306/event_db
  spring.datasource.username=root
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
  ```

### 3. Run the Application

You can run the application using your favorite IDE (like IntelliJ IDEA or Eclipse) or via the terminal:

```bash
./mvnw spring-boot:run
```

## Usage

Once the application is running, you can use Postman or any other API client to interact with the available endpoints.

## API Endpoints

### 1. Create Event Ticket

- **Endpoint**: `POST /api/event-tickets`
  
- **Request Body**:

  ```json
  {
    "userId": "123",
    "sellerId": "456",
    "amount": 100
  }
  ```

- **Description**: This endpoint allows you to create a new event ticket by providing the user ID, seller ID, and amount.

### 2. Get Total Amount by Seller

- **Endpoint**: `GET /api/event-tickets/total/{sellerId}`

- **Example**: 

  ```
  GET /api/event-tickets/total/456
  ```

- **Description**: Retrieves the total amount of tickets sold by the specified seller ID.

### 3. Filter by Seller Name

- **Endpoint**: `GET /api/event-tickets/filter?sellerName={sellerName}`

- **Example**: 

  ```
  GET /api/event-tickets/filter?sellerName=John
  ```

- **Description**: Filters tickets based on the seller's name in a case-insensitive manner.

### 4. Get All Tickets with Pagination

- **Endpoint**: `GET /api/event-tickets/pagination?offset={offset}&limit={limit}`

- **Example**: 

  ```
  GET /api/event-tickets/pagination?offset=0&limit=10
  ```

- **Description**: Retrieves a paginated list of all event tickets.

## Postman Screenshots

Below are the Postman screenshots demonstrating each API endpoint.

### 1. Create Event Ticket

![Screenshot (433)](https://github.com/user-attachments/assets/6fdc7bda-030d-40ff-bdc5-13cf00b84946)


### 2. Get Total Amount by Seller

![Screenshot (434)](https://github.com/user-attachments/assets/291f21c7-8092-4000-a506-fa1164d31007)


### 3. Filter by Seller Name

![Screenshot (435)](https://github.com/user-attachments/assets/7318b1e6-ca8e-45e9-aba8-6ae37abe66b6)


### 4. Get All Tickets with Pagination

![Screenshot (436)](https://github.com/user-attachments/assets/43d6ba19-508a-4d56-8ec1-b72e9ef5fb09)


## Contributing

Contributions are welcome! If you have suggestions or improvements, please feel free to submit a pull request or raise an issue.

