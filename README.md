# Quarkus Movie Application

This project is a Quarkus application that provides a RESTful API for managing movies, reviews, and critics. It uses PostgreSQL as the database and is designed to be easily deployable using Docker.

## Features

- Create, read, update, and delete (CRUD) operations for movies, reviews, and critics.
- RESTful API endpoints for interacting with movie data.
- PostgreSQL database for persistent storage.
- Docker support for easy deployment.

## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- Docker

## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone <repository-url>
   cd quarkus-movie
   ```

2. **Configure the database:**

   Update the `src/main/resources/application.properties` file with your PostgreSQL database connection details:

   ```properties
   quarkus.datasource.db-kind=postgresql
   quarkus.datasource.username=<your-username>
   quarkus.datasource.password=<your-password>
   quarkus.datasource.jdbc.url=jdbc:postgresql://localhost:5432/<your-database>
   ```

3. **Build the application:**

   Use Maven to build the application:

   ```bash
   mvn clean package
   ```

4. **Run the application locally:**

   You can run the application in development mode using:

   ```bash
   mvn quarkus:dev
   ```

## Dockerization

To build and run the application in a Docker container, follow these steps:

1. **Build the Docker image:**

   ```bash
   docker build -f Dockerfile -t quarkus-movie .
   ```

2. **Run the Docker container:**

   Make sure your PostgreSQL database is running, then execute:

   ```bash
   docker run -d -e QUARKUS_DATASOURCE_USERNAME=<your-username> \
              -e QUARKUS_DATASOURCE_PASSWORD=<your-password> \
              -e QUARKUS_DATASOURCE_JDBC_URL=jdbc:postgresql://<db-host>:5432/<your-database> \
              -p 8080:8080 \
              quarkus-movie
   ```

## Usage

Once the application is running, you can access the API at `http://localhost:8080`.

### Endpoints

- **Movies**
  - `GET /movies` - Retrieve all movies
  - `POST /movies` - Create a new movie
  - `GET /movies/{id}` - Retrieve a movie by ID
  - `PUT /movies/{id}` - Update a movie by ID
  - `DELETE /movies/{id}` - Delete a movie by ID

- **Reviews**
  - `GET /reviews` - Retrieve all reviews
  - `POST /reviews` - Create a new review
  - `GET /reviews/{id}` - Retrieve a review by ID
  - `PUT /reviews/{id}` - Update a review by ID
  - `DELETE /reviews/{id}` - Delete a review by ID

- **Critics**
  - `GET /critics` - Retrieve all critics
  - `POST /critics` - Create a new critic
  - `GET /critics/{id}` - Retrieve a critic by ID
  - `PUT /critics/{id}` - Update a critic by ID
  - `DELETE /critics/{id}` - Delete a critic by ID

## Testing

To run the tests, use the following command:

```bash
./mvnw test
```



docker exec -it postgres_container psql -U postgres -d testdb

INSERT INTO critic (id, name) VALUES
  (1, 'Ana Martínez'),
  (2, 'Luis Gómez'),
  (3, 'Sofía Ramírez');
 INSERT INTO movie (id, genre, title) VALUES
  (1, 'Drama, Biografía, Suspenso', 'The Imitation Game'),
  (2, 'Fantasía, Aventura', 'Miss Peregrine''s Home for Peculiar Children'),
  (3, 'Fantasía, Aventura', 'Alice in Wonderland');
INSERT INTO review (id, rating, critic_id, movie_id, comment) VALUES
  (1, 9, 1, 1, 'Una historia fascinante sobre Alan Turing y la Segunda Guerra Mundial.'),
  (2, 8, 2, 2, 'Visualmente impresionante y con personajes entrañables.'),
  (3, 7, 3, 3, 'Una versión creativa y colorida del clásico de Lewis Carroll.');

mvn clean package -DskipTests -Dquarkus.package.type=uber-jar
docker-compose build
docker-compose up

## License
This project is licensed under the MIT License. See the LICENSE file for more details.
