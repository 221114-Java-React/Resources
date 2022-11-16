# Packages

## Modularization

It's complicated and messy to put all the logic in your program in just the main method. It's less complicated but still not a good idea to have one class do everything in your application even if the processes are broken down to multiple methods.

### Single Responsibility Principle

A class should have one sole focus/purpose. Don't try to make a class that does "everything".

### Separation of Concerns

Organizing your code based on fcnality. For example, your project could have multiple packages: Ui, Models, DataAccess, Exceptions, etc.

## Packages

Packages are a logical grouping of classes, interfaces, etc. Members of a package would ideally share a similar functionality/purpose.

As used as an example earlier you can have a separate package to store your Pojos, another package to contain data access logic in DAOs, etc.

Packages are all lower case, utilize a reverse company domain name of the company.

The package of a class is defined at the top of the .java file.

You can utilize other classes that belong in different packages via the import keyword. You declare all classes you want imported above the class declaration but below the package declaration.
