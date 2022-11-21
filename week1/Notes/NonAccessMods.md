# Non Access Modifiers

[Reference](https://www.geeksforgeeks.org/access-and-non-access-modifiers-in-java/)

In java, there are 7 non access modifiers, but we'll be discussing the 3 commonly used ones.

## Final

[Reference](https://www.geeksforgeeks.org/final-keyword-in-java/)

Applies to: classes, methods, fields.

Final classes are classes that you cannot further extend. Prevent inheritance. Do note, that due to this limitation, interfaces and abstract classes cannot be final.
Final methods are methods you cannot override.
Final fields are constants.

Given how final affects classes, methods, and fields, we can generalize that the final modifier is similar to a flag that represents something is unchangeable.

## Static

[Reference](https://www.geeksforgeeks.org/static-keyword-java/)
Applies to: code blocks, variables, methods, classes

When applied to a class member, that member is shared throughout all instances of a class. With static methods/fields, you don't need to instantiate a class to access these type members. Static classes are classes where all its members are static. Static blocks are logic that gets run when the class is loaded up in memory.

## Abstract

Applies to: classes, methods

Abstract class is a class that cannot be instantiated. Although they can have concrete methods with logic. The can also have constructors. Abstract classes are useful in implementing characteristics as well as behavior to be inherited.

Abstract methods do not have method bodies and are meant to be implemented by subclasses that inherit from it. Note that for interfaces all methods are implicitly public and abstract.
