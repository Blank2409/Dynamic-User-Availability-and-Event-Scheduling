# Dynamic-User-Availability-and-Event-Scheduling

## Project Overview

The Dynamic-User-Availability-and-Event-Scheduling system is a web application designed to help users set their availability and schedule events dynamically. The application is built using React for the frontend and Spring Boot for the backend, with MongoDB as the database.

## Features

- **User Dashboard**: Allows users to create accounts, set their availability, and manage their schedules.
- **Admin Dashboard**: Enables administrators to view user availability and schedule sessions.
- **Responsive Design**: Ensures that the application is usable on various devices and screen sizes.
- **Dark Mode**: Provides a modern and visually appealing dark theme for better user experience.

## Technologies Used

- **Frontend**: React, styled-components
- **Backend**: Spring Boot
- **Database**: MongoDB

## Installation

### Backend

1. Navigate to the `backend` directory.
2. Ensure you have Java 11 or higher installed.
3. Install dependencies and run the Spring Boot application using Maven:
    ```bash
    mvn install
    mvn spring-boot:run
    ```

### Frontend

1. Navigate to the `frontend` directory.
2. Ensure you have Node.js and npm installed.
3. Install dependencies and start the React application:
    ```bash
    npm install
    npm start
    ```

## Screenshots

### User Dashboard


![user](https://github.com/user-attachments/assets/9e12a689-9e8c-426b-8a2d-ea7a7b4b1bb8)


### Admin Dashboard


![admin](https://github.com/user-attachments/assets/445e1f34-674c-488f-8000-d6d2b251268d)

## MongoDB Usage

The application uses MongoDB as the database to store user information and session data. Ensure you have MongoDB running and properly configured to connect with the backend.

## Usage

- **Navigate to the User Dashboard**: Access `/user` to create an account, set availability, and manage your schedule.
- **Navigate to the Admin Dashboard**: Access `/admin` to view user availability and schedule sessions.


## Acknowledgements

- Inspired by modern web design and dark mode aesthetics.
- Utilizes MongoDB for efficient and scalable data storage.

