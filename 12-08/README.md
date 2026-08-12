# Spring Boot HTTP Mapping Assignment

This project implements the Level 1–10 Spring Boot mapping exercises from the task brief. Every endpoint returns a simple plain-text confirmation message.

## Run

Install Maven, then run:

```powershell
mvn spring-boot:run
```

The application starts at `http://localhost:8080`. For example:

```powershell
Invoke-WebRequest http://localhost:8080/hello | Select-Object -Expand Content
Invoke-WebRequest -Method Post http://localhost:8080/students | Select-Object -Expand Content
```

Controllers are grouped by purpose in `src/main/java/com/mitmysore/mapping`.
