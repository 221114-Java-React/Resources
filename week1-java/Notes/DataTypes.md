# Data Types in Java

## 2 general data types in Java:

1. Primitive

   - value is stored along side the reference in the stack
   - byte, short, int, long, float, double, boolean, char
   - Common QC Questions:
   - Bit sizes of the primitives:
   - 8 bits, 16 bits, 32 bits, 64 bits, 32 bits, 32 bits, 1 bit, 16 bits
   - Difference between int vs double?
   - double is a decimal, int is a whole number

2. Reference Types
   - "value" of reference types are a place in memory (heap) where the actual data is stored

## Strings and the String API

Strings are an array of characters. Strings are technically reference types since they're stored in the heap. They are objects in Java. Despite being an object, you don't need to use the new keyword to create a string. You can create strings using strring literals, eg String name = "Shrek"; They are stored in a special place in memory called the string pool. You can technically have 2 different variables referencing the same string in the string pool. For example, you have String fruit = "apple", String fruit2 = "apple"; both fruit2 and fruit reference a string in the string pool with value "apple". The concept that strings are stored in a string pool and could have multiple references to it, is why strings are immutable. Back to the apple example, if we change fruit = "watermelon", then a new string "watermelon" is created in the string pool. Another example: String fname="Bob", String lname="Ross", String name = fname + lname. How many strings are created in the string pool? 3 strings: "Bob", "Ross", "BobRoss".

### Strings and Coding Challenges

Most coding challenges involving strings are concerned with parsing and manipulating them. You usually convert Strings into character arrays via the toCharArray() method. For example you have a palindrome problem: you have a string check if it is a palindrome. Convert the string to a char array and go over it character by character, compare the first letter to the last letter and so on and so forth. You can also push all the characters of the string in a stack and pop the stack and assign it to another string and compare if they're the same. You can also convert the string to a char array, call Array.reverse, and compare the resulting value to the original string.

You can also use, Stringbuilder and stringbuffer to have mutable strings. Useful for coding challenges with space limitations. These are classes that allow you to manipulate string value without creating new strings in the string pool. You still have to convert them to strings after.

Another invaluable skill/concept to have when doing string coding challenges are your regular expressions. They are mostly used for pattern matching and checking if a string follows a certain format. Learn more [Regex](https://www.w3schools.com/java/java_regex.asp)

Some string methods that are quite useful:

- equals(), equalsIgnoreCase()
- toUpper(), toLower()
- replaceFirst(), replaceAll()
- trim()
- split()

For a full list, [string methods](https://www.w3schools.com/java/java_ref_string.asp)

### Wrapper classes

Wrapper classes allow primitive types to be packaged as an object. With wrapper classes you have access to object methods like .equals(), .toString(), etc. Allows you to pass primitives values (packaged as objects) as parameters, this is expecially useful when working with collections API since generics only accept reference types.
