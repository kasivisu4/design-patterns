# Decorator Pattern

The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. It is used to extend the functionalities of classes in a flexible and reusable way.

## Table of Contents

- [Motivation](#motivation)
- [Components](#components)
- [Implementation](#implementation)
- [Benefits](#benefits)
- [When to Use](#when-to-use)
- [Related Patterns](#related-patterns)

## Motivation
The primary motivation for the Decorator Pattern is to provide a flexible alternative to subclassing for extending functionality. In situations where multiple variations of a class can lead to an explosion of subclasses, the Decorator Pattern allows behavior to be added in a more manageable way.

## Components
The key components of the Decorator Pattern are:

1. **Component**: An interface or abstract class that defines the operations that can be performed.
2. **Concrete Component**: A class that implements the `Component` interface, representing the base object.
3. **Decorator**: An abstract class that implements the `Component` interface and contains a reference to a `Component` object. This class defines the default behavior and can add new functionalities.
4. **Concrete Decorators**: Classes that extend the `Decorator` class and add new behavior.

## Implementation
The `DecoratorClass` is an implementation of the Decorator Pattern that adds additional functionality to base components without modifying their structure. In this case, it is used to enhance the pricing of pizza by dynamically adding ingredients.

	Class Overview :
	- **Name**: `DecoratorClass`
	- **Purpose**: To enhance the functionality of pizza pricing by allowing the addition of various ingredients.
	
	Key Methods:
	
	- `getDescription()`: Returns a string description of the pizza, including all added ingredients.
	- `cost()`: Calculates the total cost of the pizza, including the base price and the cost of added ingredients.
	
	Integration:
	
	The `DecoratorClass` works in conjunction with a base pizza component (e.g., `BasicPizza`). By wrapping the base 	pizza with decorators for each ingredient, users can create a customized pizza with the desired toppings.

## Benefits
Flexibility: You can add new functionality to objects without changing their structure.
Single Responsibility Principle: You can separate behavior from the core functionality.
Reusability: Decorators can be reused across different components.

## When to Use
When you want to add responsibilities to individual objects dynamically and transparently.
When extension by subclassing leads to an exponential rise in subclasses.

## Related Patterns
Strategy Pattern: For choosing algorithms at runtime.
Adapter Pattern: For converting one interface into another.

## Conclusion
The Decorator Pattern is a powerful tool in object-oriented design that promotes flexibility and reusability. By allowing behavior to be added dynamically, it helps manage complexity in systems where functionality may need to be extended.