# Job Portal

A full-stack Job Portal application built with React and Spring Boot. The platform supports job seekers, employers, and administrators through role-based features and secure APIs.

## Tech Stack

**Frontend**
- React 19
- Vite
- React Router
- Redux Toolkit
- Tailwind CSS

**Backend**
- Java 21
- Spring Boot 4
- Spring Security and JWT
- Spring Data JPA / Hibernate
- PostgreSQL
- Bean Validation
- Caffeine caching
- OpenAPI / Swagger UI

**Tools:** Maven, Docker Compose, Git, and GitHub.

## Features

- User authentication and authorization
- Job seeker, employer, and administrator functionality
- Job posting and management
- Job application management
- REST APIs
- PostgreSQL database integration
- API documentation with Swagger UI

## Project Structure

```text
job-portal/
├── job-portal-backend/
│   ├── src/
│   ├── compose.yml
│   ├── pom.xml
│   └── secrets.example.properties
├── job-portal-frontend/
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── .env.example
├── .gitignore
└── README.md
```

## Prerequisites

- Java 21
- Node.js and npm
- PostgreSQL
- Maven wrapper (included)
- Docker and Docker Compose (optional)

## Backend Configuration

The backend reads local secrets from:

`~/.config/jobportal/secrets.properties`

Create the file:

```bash
mkdir -p ~/.config/jobportal
nano ~/.config/jobportal/secrets.properties
```

Use `job-portal-backend/secrets.example.properties` as a reference. Configure a strong JWT secret and your existing PostgreSQL password. Never commit real secrets.

The default database connection uses:
- Host: `localhost`
- Port: `5432`
- Database: `jobportal`
- Username: `postgres`

These settings can be overridden with environment variables.

Ensure the database exists and the configured PostgreSQL user has access to it before starting the backend.

## Run the Backend

From the repository root:

```bash
cd job-portal-backend
./mvnw spring-boot:run
```

The backend runs on port `8080` by default. The management server is configured for port `9090`.

## Run the Frontend

Open a second terminal from the repository root:

```bash
cd job-portal-frontend
npm install
cp .env.example .env
npm run dev
```

The default backend API URL is `http://localhost:8080/api`. Override it using `VITE_API_BASE_URL` if needed.

## Build the Project

Backend:

```bash
cd job-portal-backend
./mvnw clean package -DskipTests
```

Frontend:

```bash
cd job-portal-frontend
npm run build
```

## API Documentation

When the backend is running, Swagger UI is available at:

`http://localhost:8080/swagger-ui.html`

Some endpoints may require authentication.

## Database SQL Files

The database schema and sample data files are located in:

`job-portal-backend/src/main/resources/sql/`

Review the SQL files before executing them against an existing database. Back up your data before making schema or initialization changes.

## Notes

- Never commit real passwords, JWT secrets, or local environment files.
- The optional OpenTelemetry configuration targets `localhost:4318`; a compatible telemetry receiver is needed to collect exported metrics.
- Build output, dependency directories, logs, and IDE-specific files are excluded through `.gitignore`.
