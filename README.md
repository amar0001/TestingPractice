# TestingPractice

A practice repository demonstrating testing strategies in Android development including unit testing, dependency mocking, and UI testing with Kotlin.

##  Table of Contents
- [About](#about)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Setup](#setup)
- [Testing Approach](#testing-approach)
  - [Unit Testing (JUnit)](#unit-testing-junit)
  - [Mocking (Mockito)](#mocking-mockito)
  - [UI Testing (Espresso)](#ui-testing-espresso)
- [How to Run Tests](#how-to-run-tests)
- [Contributing](#contributing)
- [License](#license)

---

## About
This repository is a sandbox for experimenting with and mastering different testing techniques in Android development:

- **Unit tests** using JUnit  
- **Mocking dependencies** using Mockito  
- **UI testing** (instrumented) to validate user interactions — for example using Espresso  

Use this as a reference or learning tool to solidify your Android testing skills.

---

## Tech Stack
- **Language**: Kotlin  
- **Testing frameworks**: JUnit, Mockito, Espresso  
- **Build system**: Gradle (Kotlin DSL)

---

## Project Structure
```TestingPractice/
├── app/
│ └── src/
│ ├── main/ # App source code (if any)
│ ├── test/ # Unit tests (JUnit + Mockito)
│ └── androidTest/ # Instrumented UI tests (Espresso)
├── build.gradle.kts # Gradle build file
├── settings.gradle.kts # Multi-module settings
├── gradle.properties
├── .gitignore
├── README.md
└── LICENSE # Apache-2.0
```


---

## Getting Started

### Prerequisites
- Android Studio (Arctic Fox or newer recommended)  
- JDK 11+  
- Android device or emulator for UI tests

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/amar0001/TestingPractice.git
   cd TestingPractice
2.Open the project in Android Studio
3.Let Gradle sync the project
4.Run tests using the IDE or Gradle command line
Testing Approach
Unit Testing (JUnit)

Write tests to verify business logic in isolation

Use JUnit assertions like assertEquals, assertTrue, assertThrows, etc.

Mocking (Mockito)

Simulate dependencies and control behavior — e.g., mocking data sources or service responses

Use MockitoAnnotations.openMocks(this) and @Mock, @InjectMocks annotations

UI Testing (Espresso)

Automate user interactions to validate UI workflows

Examples: click buttons, check view visibility/text, navigate between screens

How to Run Tests

Run all unit tests:
./gradlew testDebugUnitTest
Run all instrumented UI tests (on connected device/emulator):
./gradlew connectedDebugAndroidTest
Or run tests directly from Android Studio’s Run gutter icons in the test / androidTest directories.

Contributing

Pull requests are welcome! Please ensure:
Test coverage is meaningful and demonstrates new learning techniques
Code is well-organized, readable, and build error-free before submitting

License

This project is licensed under the Apache 2.0 License.


