# Java

- Java is an _Object Oriented Programming Language_, that is used to create sotware that runs on multiple platforms. It's _high level_, _strongly typed_, and _platform independent._

---

### Vocabulary Terms

- **Object Oriented Programming**
  - Object oriented programming is a programming paradigm that focuses on the "objects" and relationships between them rather than step by step process the program has to take in order to execute successfully. This came about because it's difficult to maintain and develop programs that follow a linear when most processes in real life doesn't work like that.
  - [Wikipedia article on object oriented programming](https://en.wikipedia.org/wiki/Object-oriented_programming)
- **High Level Programming Language**
  - A high level programming language abstracts a lot of the computer details from the user. It has features that makes programming more human friendly by having syntax that is closer to human language than machine code. Furthermore, it has features that take care of handling computer resources for you such as memory management.
  - [Wikipedia article on high level programming languages](https://en.wikipedia.org/wiki/High-level_programming_language)
- **Strongly Typed Programming Language**
  - A strongly typed language enforces the programmer to explicitly bind variables to data types. It also enforces checking on the variable type in both compile time and run time.
  - [Article on Typing](https://medium.com/android-news/magic-lies-here-statically-typed-vs-dynamically-typed-languages-d151c7f95e2b)
- **Platform Indepedent**
  - The way you design your program is not dependent on the system you'll be running it on.

---

## WORA

WORA which stands for "write once, run anywhere", is the main reason Java was so popular even Microsoft tried to buy it. This is all due to how Java as a language was designed. There are three components that make development and running java possible: JDK, JRE, and the JVM.

### JDK

Stands for the **Java Development Kit** this contains all the necessary tools and libraries your machine would need to start writing (i.e. _developing_) code in Java. The JDK includes the JRE and the JVM. One major component of the JDK that isn't included in the JRE is the java compiler.

The _java compiler_ is responsible for converting your .java file into bytecode with the extension .class. _Bytecode_ is machine code instructions you send to your JVM to be able to actually execute your code. When working with java outside an IDE like Spring Tool Suite, you actually compile your java code with the cmd `javac <file-name>.java` in a terminal. This command calls on the java compiler.

[Intro to the JDK](https://www.infoworld.com/article/3296360/what-is-the-jdk-introduction-to-the-java-development-kit.html)

### JRE

Stands for the **Java Runtime Environment** this contains all the necessary tools your machine would need to run java bytecode. Most non developers just need a JRE to runtime java apps in their machines.The JRE includes the JVM, Java class libraries, and the class loader.

The JRE smoothes over the diversity of OSs, so that Java programs can run on virtually any OS without modification. It provides services such as automatic memory management and exception handling!

[Intro to the JRE](https://www.infoworld.com/article/3304858/what-is-the-jre-introduction-to-the-java-runtime-environment.html)

### JVM

Stands for the **Java Virtual Machine** which allows java programs to run on any device or OS (WORA). It also manages program resources during execution.

[Intro to the JVM](https://www.infoworld.com/article/3272244/what-is-the-jvm-introducing-the-java-virtual-machine.html)

---

### Vocab terms

- **Compiler**
  - A computer program that translates computer code written in one programming language into another. The term is primarily used for programs that translate high level programming language to a lower level language to create an executable program.
  - [Wiki entry on compilers](https://en.wikipedia.org/wiki/Compiler)
- **Bytecode**
  - Compact numeric codes, constants, and references that is designed for efficient execution by a software interpreter. In the context of java, java bytecode is a set of instructions that would be taken in by the JVM to interpret to OS specific instructions for the CPU to execute. Closer to machine code that human syntax, it's designed for ease of interpretation to make your code more portable.
  - [Wiki entry on bytecode](https://en.wikipedia.org/wiki/Bytecode)
- **Machine Code**
  - Any low level programming language consisting of instructions which are used to control a computer's CPU (the part of your machine that executes code and makes magic happen).
  - Strictly numerical and is designed to run as fast as possible. "Close to the metal" syntax.
  - [Wiki entry on machine code](https://en.wikipedia.org/wiki/Machine_code)
- **Runtime Environment**
  - A piece of software that is designed to run other software.
- **Terminal**
  - AKA command lines or consoles, allow you to accomplish and automate tasks on the computer without use of GUI. Allows you to interact with your system via text commands to get your computer to do simple things like navigate your file system or more interesting things like compile your java code or commit to your repository.
- **Operating System**
  - System software that manages computer hardware, software resources, and provides common services for computer programs.
  - [Wiki entry on OS](https://en.wikipedia.org/wiki/Operating_system)
- **IDE**
  - Stands for Integrated Developing Environment. This is software that contains tools that helps developers focus on code development. Some common features available are: intellisense, debugger and a source code editor that highlights keywords for you. Spring tool suite is a great example for this.
  - [Some article on IDEs](https://www.redhat.com/en/topics/middleware/what-is-ide)

---

## Memory Management

One conundrum developers used to lose a lot of hair on was memory allocation for all the variables they would create. What if with all the variables we're creating we lose memory space????? With modern computer architecture that is now a thing of the past. Furthemore, high level languages such as Java and C# have automatic memory management.

The runtime environment provides services for memory management more commonly known as garbage collection. There exists this entity called the garbage collector, that periodically checks memory to see if there are any objects that are no longer being used (for example, they are out of scope or no longer being referenced and is therefore unreachable). The garbage collector disposes of these objects to free up memory. It automatically deallocates memory for useless objects.

You can't really tell the garbage collector when to run but you can suggest a collection using the method, _System.gc()_.

Another notable method involved with garbage collection is an object's _finalize()_ method. This is the method your garbage collector calls before destroying the object. The garbage collector calls on this method for any clean up activity such as closing resources associated with that object such as a database connection. This method is called for basically resource deallocation.

For more information, read up on GC in this wonderful [article](https://www.geeksforgeeks.org/garbage-collection-java/).

---

### Vocab Terms

- **Memory allocation**
  - When you take some computer memory space to store your data
- **Memory deallocation**
  - When you release the computer memory space so the computer can reuse it to store some other data
- **Garbage Collector**
  - A method called by the JVM to run automatic memory management.
  - [Article on GC](https://hiberstack.com/garbage-collection-and-finalize-method/)
- **Stack & Heap**
  - _Stack_ is the space in memory for storing method calls and local variables.
  - _Heap_ is the space in memory used for storing objects used in the program.
  - [More on stack vs heap](https://www.tutorialspoint.com/difference-between-stack-and-heap-memory-in-java)

---
