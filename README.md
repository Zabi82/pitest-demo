# Demo project for PIT Mutation Testing with a simple example

## GoodFooService

###class which has full test coverage including boundary conditions and proper assertions, so should pass the PIT mutation test

## BadFooService 

###class which has deliberately misses a boundary condition and assertion to another service method call but still covers 100% of the lines, so should fail the PIT mutation test

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