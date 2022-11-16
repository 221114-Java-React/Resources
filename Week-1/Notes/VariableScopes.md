# Variable Scopes

This defines when/where your variable is born and dies. Could also be the context where your variable exists.

4 scopes:

1. Block scope:

   - variable exists within a code block
   - ex: your counter variables in for loops
     - ```java
        for (int i = 0; i < 3; i++)
       {
        //some code here
       }
       ```
       - the variable i only exists in the context of the for loop block

2. Method scope:

   - variable exists within that method and can be utilized by code blocks in the method
   - ex: parameters you pass into methods
   - ```java
       public static void main(String[] args)
       {
           int x = 5;
           // some code here
       }
     ```
     - the variable args and x, has method scope

3. Instance scope aka object scope:

   - variable exists within an instance of that class, accessible to all class members
   - ex: any fields you declare as characteristics of a class
   - ```java
       Public Class Restaurant{
           String name;
       }
     ```
   - the field name, has instance scope

4. Static scope
   - variables that exists in a static scope
   - ex: variables in static block
