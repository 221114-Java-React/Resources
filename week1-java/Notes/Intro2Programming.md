# Programming Basics

Programming is a lot like recipe making. In fact, there exists a programming language called chef that creates programs through recipes! It's mainly all about telling your computer what to do and when to do it. Programming requires you to think in a very step by step manner. It also makes you consider certain things we might take forgranted as humans because we know how to infer from context. But computers can't! Keeping in mind that you're telling an excited rock what to do helps in keeping your patience when your code doesn't work.

## Variables

Variables are references to the data you have in memory. Computer memory is not very human readable, and remembering exact memory addresses should not be your responsibility as a developer. So variables are there to remember where the memory spaces are, all you have to remember is the variable name.

With strongly typed lanuages like Java and C#, you have to remember to bind your variable to a data type. Strongly typed languages check the data type of the variable during compile time and run time.

**Declaring Variables in Java**:

```java
Datatype variableName = new DataTypeConstructor();
//For example
Object newObject = new Object();
```

There are certain data types called primitives that don't need the new key word when you instantiate it.

```java
//For example
 int number = 5;
 boolean isPrimitive = true;
```

---

### Vocab Words

- **Computer Memory** - Space in your machine that stores the data you work with.
  - [More on computer memory](https://www.geeksforgeeks.org/computer-memory/)

---

Programming with Java, you work with 2 kinds of memory spaces, **stack and heap**. _Heap_ is where more complex data types such as objects are stored, while the _stack_ contains methods calls and primitive variables.

## Control Flow

We can't just keep declaring variables and call that a program. For one thing, that would be very boring, for another, it would also be kinda useless. Thus, we have control flow statements. We use these statements to add decisioning logic in our code.

### If Statement

The if statement is the most intuitive to understand. Much like how you would present options to someone, you structure an if statement the same way. An if statement checks if a boolean expression is true then executes the underlying code block.

For example:

```java

    if(x == 0)
    {
        //do something
    }

```

---

### Vocab terms

- **Boolean Expression**
  - A boolean expression is a statement that can be either true or false. For example, x == 0.
- **Logical Operators**
  - Used to combine two or more conditions/constraints or to complement the evaluation of the original condition under particular consideration.
  - [Article on Logical Operators](https://www.geeksforgeeks.org/java-logical-operators-with-examples/)

---

An if statement can stand alone and in fact you can have a couple of consecutive if statements. This type of programming design is discussed further in this [article](https://medium.com/swlh/return-early-pattern-3d18a41bba8).

However, considering we are discussing basics, there exists a common companion to the if statement, the else. The else statement is the answer to the famous question "or else what???". Well, if the condition in the if statement is false, then you execute the code block in the else statement.

```java
if(x == 0)
{
    // Execute something
} else {
    //If x is not equal to zero, do something else
}
```

**Q**: What if you have more than one condition to check????

**A**: You can make use of the if else if statement block. You order the conditions to check for the most pertinent ones first.

```java
if(x == 0) {
    //Execute something
} else if(x == 1) {
    // Execute something else
} else {
    // Execute some other thing
}
```

Note that you can have more than one else if block

### Switch Statement

A lot of newly minted programmers are a little intimidated by the switch statement. Mostly because no one can really remember the correct syntax for this block. However, switch statements perform better than if else if block especially for when you're really only interested in the value of a single variable, like say, the user's input.

A switch statement is made up 2 things, the variable whose value you're interested in, and the code blocks you wanna execute depending on its value separated by cases.

```java
switch (variableOfInterest) {
case potentialValue0:
    //Execute code;
    break;
    //So it doesn't fall through
case potentialValue1:
    //Execut more code;
    break;
default:
    //if the value of the variable doesn't match any of the cases, run this
    break;
}
```

## Iteration

Sometimes you wanna execute something over and over again. Take for example eating, you gotta chew your food couple times before you can swallow, otherwise you'll end up choking and that's not really a fun time. Same with code. Sometimes you wanna ask an end user again for their input because the first input was invalid.

### While

While loops check an initial boolean condition before executing the code block. It keeps executing the code block until the boolean condition renders false.

```java
while(someCondition) {
    //execute this code
}
```

### Do while

Executes the code block at least once, before checking the boolean condition to re-execute the code block.

```java
do {

} while (someCondition);
```

### For

Has three parts: initialization, condition, and update. The initialization sets the delimiter of your loop. Condition is the statement that determines whether the loop terminates or continues, usually involves the delimiter. Update is the statement that determines how the delimiter changes in value after each iteration.

```java
for(int i = 0; i < 10; i++) {
    // i is your delimiter
    // i < 10 is your condition
    // i++ is the update statement
    // The loop starts and i is equal to 0, it checks if i is less than 10, if this is true, the code is executed and the value of i is incremented at the end of the loop
}
```

The for loop above can be reconstructed using a while loop like the one below

```java
int i = 0;
while (i < 10) {
    //Execute some code
    i++;
}
```

### Foreach

Also known as the "enhanced for loop" this is used especially for iterating through a collection like an array of objects. Syntax still uses the for keyword however, instead of a three part condition, the condition consists of a temporary variable to hold each element of the collection and a reference to the collection being iterated over.

```java
for(someDataType temp: tempCollection)
{
    //execute code
}
```

For more information, refer to this [article](https://www.geeksforgeeks.org/for-each-loop-in-java/)
