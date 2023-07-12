# Demo project for PIT Mutation Testing with a simple example

## Prerequisites to run this project

- Java 11
- Maven version 3.6 or above

## GoodFooService

class which has 100% test coverage including boundary conditions and proper assertions (GoodFooServiceTest), so will reflect a 100% PIT mutation test success

## BadFooService 

class which has 100% test coverage but deliberately misses a boundary condition and assertion to another service method call, so will reflect few PIT mutation test failures

## How to Run

The pit mutation coverage goal is configured to execute as part of the test goal
```

mvn test

```

The mutation coverage goal can be also be explicitly invoked using below goal

```
mvn test pitest:mutationCoverage

```
## Report

Report will be generated in target directory under pit-reports. Open the index.html and drill down to see the test coverage and mutation coverage as shown below

![PIT Report Screenshot](/pit_report_screenshot.png?raw=true "PIT Report Screenshot")