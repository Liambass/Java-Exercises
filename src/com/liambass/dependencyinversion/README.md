Let's say that you're working on a big project. The project has both backend and frontend developers within it.

Consider the following program, which simulates a development team and the project they are working on:

- BackendDeveloper.java
- FrontendDeveloper.java
- Project.java

```
public class BackendDeveloper {
    public void writeJava() {
        System.out.println("C# is just Microsoft Java anyway.");
    }
}
```
```
public class FrontendDeveloper {
    public void writeJavaScript(){
        System.out.println("JavaScript is used everywhere anyway.");
    }
}
```
```
public class Project {
    private BackendDeveloper back = new BackendDeveloper();
    private FrontendDeveloper front = new FrontendDeveloper();

    public void implement() {
        back.writeJava();
        front.writeJavaScript();
    }
}
```
This current setup violates the Dependency Inversion Principles because the high-level Project.java module depends on both the BackendDeveloper.java and FrontendDeveloper.java modules.

Refactor the program using the following four modules to ensure that it adheres to the Dependency Inversion Principle to complete this exercise:

* BackendDeveloper.java
* FrontendDeveloper.java
* Project.java
* Developer.java (interface)
