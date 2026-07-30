# Design Patterns

## Strategy Design Pattern:

Defines a family of algorithms, puts them into separate classes which can be dynamically swapped at runtime. For example, in the example below, we created interfaces for all types of robots and defined overridden methods in the classes implementing them. Then at runtime, according to requirements, directly the required method is called through polymorphism.

![image.png](image.png)

## Factory Design Pattern:

It encapsulates object instantiation logic inside a dedicated class. Here, we do not need to instantiate a object using the new keyword, instead we just pass the parameters to the factory which then returns the correct object type.

![image.png](image%201.png)

### Factory method:

Here, the factory is also abstract, there may be different types of factories that create different objects. It allows multiple factory subclasses that can instantiate objects.

![image.png](image%202.png)

### Abstract factory method:

It allows for creation of multiple products through a factory and its subclasses.