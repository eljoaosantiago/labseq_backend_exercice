# 📚 Labseq Exercice 

This exercice was made using Spring Boot as a Java framework.
It was implemented a web GUI using React.js to invoke the service.

# 📝 How to Start the Application

## Java Application (Backend)

To build and run the Java code, follow these steps:

```shell
# Open a terminal (Command Prompt or PowerShell for Windows, Terminal for macOS or Linux)

# Clone the repository
git clone https://github.com/Abblix/Oidc.Server.git

# Navigate to the project directory and clean install with maven
mvn clean install

# Run the program
mvn spring-boot:run
```

## React.js Application (Frontend)

To build and run the Java code, follow these steps:

```shell
# Navigate to the project directory and clean install with maven
cd frontend

# Install dependencies
npm install

# Start the program
npm start
```

### What to do next?

Now that both backend and frontend are running you can run the localhost url in port 3000 to access the React Application.

```shell
http://localhost:3000/
```

Then you are ready to test the application!

Optionally you can test the REST service using the backend url directly:

```shell
http://localhost:8080/labseq/{n}
```

Note: Insert a positive number in parameter {n}.

## 📚 API Documentation (Swagger)

The REST API documentation framework used was Open API Swagger as suggested.

### How to access

To access the API documetation you can go to:

```shell
http://localhost:8080/swagger-ui.html
```