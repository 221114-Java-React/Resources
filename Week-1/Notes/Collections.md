# Collections

The collection framework provides an architecture to store and manipulate objects.

You have this family of classes and interfaces that give you options as a developer to organize groups of data in different ways.

## Iterable Interface

[Reference](https://www.geeksforgeeks.org/iterable-interface-in-java/)

The iterable interface allows its children to be a target of the enhanced for loop. If you implement the iterable interface, you can use the foreach loop to go through the elements in your collection.

## List

Store your elements in an ordered way. You can access the elements via indexes. They change size dynamically. A popular implementation of List is the ArrayList class.

## Set

Similar to mathematic sets, can only store unique values. They don't store your items in the way you added them originally.

## Queue

Queue works in a FIFO(first in first out) way. Esp useful in breadth first exploration of trees.

# Generics

You can have a collection of items of the same type by passing in the data type of your items when declaring a collection. So for example for a list of integers, you declare the list as List<Integer>, while for a list of strings you declare the list as List<String>. You pass the data type like a parameter. Looking into documentation, you see that lists are referred to as List<E>. What is exactly is E, that's a generic type. It allows you to define classes, like your collections, to have a set behavior regardless of the type of data it is storing.

**Note** Generics are an example of parameteric polymorphism.

**Note** Generics are placeholders for reference types or non primitives. You have to use wrapper classes to store primitive values in classes that use generics.
