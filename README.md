Event Management API
This is a Spring Boot application for managing event tickets. It allows users to create, read, update, and delete event tickets, as well as filter tickets and calculate total amounts grouped by seller.

Table of Contents
Features
Technologies Used
Installation
Usage
API Endpoints
Postman Screenshots
Contributing
License
Features
Create new event tickets.
Retrieve total amounts of tickets grouped by seller.
Filter tickets by seller name (case-insensitive).
Pagination for retrieving tickets.
Technologies Used
Java 17
Spring Boot 2.x
Spring Data JPA
MySQL
Postman (for API testing)
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/JellaSindhu/event-management.git
cd event-management
Set up MySQL:

Create a database named event_db.
Update your application.properties with the correct MySQL credentials:
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/event_db
spring.datasource.username=root
spring.datasource.password=your_password
Run the application:

Use your IDE (like IntelliJ IDEA or Eclipse) or run the following command in the terminal:
bash
Copy code
./mvnw spring-boot:run
Usage
Once the application is running, you can use Postman or any other API client to interact with the endpoints.

API Endpoints
1. Create Event Ticket
Endpoint: POST /api/event-tickets
Request Body:
json
Copy code
{
  "userId": "123",
  "sellerId": "456",
  "amount": 100
}
2. Get Total Amount by Seller
Endpoint: GET /api/event-tickets/total/{sellerId}
Example: GET /api/event-tickets/total/456
3. Filter by Seller Name
Endpoint: GET /api/event-tickets/filter?sellerName={sellerName}
Example: GET /api/event-tickets/filter?sellerName=John
4. Get All Tickets with Pagination
Endpoint: GET /api/event-tickets/pagination?offset={offset}&limit={limit}
Example: GET /api/event-tickets/pagination?offset=0&limit=10
Postman Screenshots
Below are the Postman screenshots for each API endpoint.
1. Create Event Ticket
   

3. Get Total Amount by Seller
   

5. Filter by Seller Name
   

7. Get All Tickets with Pagination

Contributing
Contributions are welcome! Please feel free to submit a pull request or raise an issue.

