# Challenge - Factory Method

## About 

**The challenge consists of creating a framework to generate logs in several possible outputs, such as console or a file.**

> Its purpose is to practice and make the Factory Method stick in the students' head.

## Task and Instructions

### Tasks

- Create all **_classes and interfaces_** that will be used to create an object type **Logger** and pass it to an example class;

- Also create a **_class diagram_** to show how the framework works.

### Instructions 

> Describing a little of what the framework should have to make life easier for those who use it.

- In a class that needs to **_generate logs_**, receive an object type **Logger** with the method bellow:

```java
public void log(String message)
```

- As an example, a class called "**_Calculadora Impostos_**", which in the "**_calculate( )_**" **_method_**, will *print the calculated value*:

```java
public class CalculadoraDeImpostos {

  private Logger logger;

  public CalculadoraDeImpostos(Logger logger) {
    this.logger = logger;
  }

  public void calcular(double valor) {
    // Here would be a logic to calculate taxes on the value provided

    // At the end, the programmer would like to record the calculated value
    logger.log("Imposto calculado para o valor R$" + valor);
  }

}
```

- ***Requirements***:

    - Before each log message, the *current day and time* **must be printed**;

    - The framework must be **extensible to various types of output** (*console, txt file, xml, etc.*);