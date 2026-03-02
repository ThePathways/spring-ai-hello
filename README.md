# spring-ai-hello
  
A Spring Boot application with AI integration using Spring AI framework.

## Features

- REST API endpoint to ask AI questions
- Integration with Groq's OpenAI-compatible API
- Supports full sentence questions without URL encoding

## Prerequisites

- Java 21+
- Maven

## Setup

1. **Configure API Key:**
   
   Set the environment variable:
   ```bash
   export Key=your_groq_api_key
   ```
   
   Or add it to `application.properties`:
   ```properties
   spring.ai.openai.api-key=your_groq_api_key
   ```

2. **Build the project:**
   ```bash
   ./mvnw clean install
   ```

3. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```

## API Usage

**Endpoint:** `POST /Ask`

**Request:**
```bash
curl -X POST "http://localhost:8080/Ask" \
     -H "Content-Type: application/json" \
     -d '{"question": "Hello, how are you?"}'
```

**Response:**
```
Hello! I'm doing well, thank you for asking. How can I help you today?
```

## Project Structure

```
src/main/java/com/example/helloAI/
├── HelloAiApplication.java      # Main application entry point
├── controller/
│   └── AskController.java       # REST controller for Ask endpoint
├── service/
│   └── AskAIService.java        # AI service implementation
├── model/
│   └── QuestionRequest.java    # Request model
└── client/
    └── ChatClientProvider.java  # Chat client configuration
```

## Configuration

The application uses the following properties in `application.properties`:

```properties
spring.application.name=helloAI
spring.ai.openai.api-key=${Key}
spring.ai.openai.base-url=https://api.groq.com/openai
spring.ai.openai.chat.options.model=llama-3.3-70b-versatile
```

## Technology Stack

- Spring Boot 4.0.3
- Spring AI 2.0.0-M2
- Groq API (OpenAI-compatible)
- Java 21

