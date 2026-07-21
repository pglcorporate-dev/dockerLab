# DockerLab

## Purpose of this lab

This lab demonstrates how to build, package, and run a simple Java application inside a Docker container. It is designed to help you understand the basic workflow for:

- compiling Java source code
- packaging the application into a JAR file
- building a Docker image from that application
- running the container locally

The project uses a small Java program that prints a message repeatedly and can accept an argument to control how many iterations it runs.

## Project structure

- [Dockerfile](Dockerfile): defines how the Java application is packaged into a Docker image.
- [src/Main.java](src/Main.java): the Java entrypoint for the application.
- [Tools/helpers/compile-package](Tools/helpers/compile-package): helper script to compile the Java code and create a JAR file.
- [Tools/helpers/docker](Tools/helpers/docker): helper script to check Docker, build the image, and run the container.
- [Tools/helpers/cleanupImage](Tools/helpers/cleanupImage): placeholder helper for cleanup tasks.
- [build](build): generated output directory created by the compile script.
- [app.jar](app.jar): generated JAR artifact created by the compile script.

## Prerequisites

Before using the project, make sure you have:

- Docker Desktop or Docker Engine running
- Java installed and compatible with the Docker image configuration
- Bash available (Git Bash, WSL, or a Linux/macOS shell)

## How to use the helper scripts

Run the commands from the project root:

### 1. Compile and package the Java application

```bash
bash Tools/helpers/compile-package
```

This script will:

- create a build directory if needed
- compile the Java source into the build directory
- create a runnable JAR file
- run the application locally

### 2. Build and run the Docker image

```bash
bash Tools/helpers/docker
```

This script will:

- verify that Docker is running
- build the Docker image tagged as hello-java
- show the image
- run the container

### 3. Clean up Docker artifacts (optional)

```bash
bash Tools/helpers/cleanupImage
```

This helper is currently a placeholder and can be expanded later for image or container cleanup tasks.

## File descriptions

### [Dockerfile](Dockerfile)

The Dockerfile defines the container image for the Java application. It:

- uses a Java runtime base image
- copies the application into the image
- starts the application with Java

### [src/Main.java](src/Main.java)

This is the main Java class. It prints a startup message, reads an optional argument for iteration count, and then runs a loop with small delays.

### [Tools/helpers/compile-package](Tools/helpers/compile-package)

This script is used to build the Java artifact locally. It is useful for testing the Java code before containerizing it.

### [Tools/helpers/docker](Tools/helpers/docker)

This script automates the Docker workflow. It is helpful when you want to quickly rebuild and rerun the container without manually typing every Docker command.

### [Tools/helpers/cleanupImage](Tools/helpers/cleanupImage)

A simple helper file intended for cleanup-related commands such as removing old Docker images or containers.

## Notes

- If you see Java version errors while running the container, make sure the Java compiler and runtime versions are aligned.
- The project is intentionally simple so it can be used as a beginner-friendly Docker and Java lab.

## Suggested workflow

1. Run the compile helper.
2. Verify the JAR is created.
3. Run the Docker helper.
4. Observe the container output.

That completes the basic Java-to-Docker build loop.
