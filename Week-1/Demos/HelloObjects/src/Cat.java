// Classes
// In java, you declare a class using the class keyword
// Naming convention, use PascalCase for classes
public class Cat {
    // POJO - plain old java object, design pattern for classes meant to hold data
    // Class Members:
    // Fields - characteristics
    // Methods - behavior
    // Constructors

    // Both fields and methods use camelCase for naming convention
    // Fields
    // private fields are only accessible to the file they are declared in
    private String name;
    private int age;
    private String color;

    // Constructors
    // If i don't declare a constructor will my code not compile? -no, it will still
    // compile
    // Java compiler will add a default constructor in your code
    // no args constructor - you're not taking in any arguments
    public Cat() {
        // you can use a noargs constructor to set default values
        // this.name = "stray";
        // this.age = 0;
        // this.color = "not defined";
        // chaining constructors using this keyword to refer to another constructor
        // of the same class
        this("stray", 0, "uncertain");
    }

    // parameterized constructor - constructor that takes in arguments
    public Cat(String name, int age, String color) {
        super(); // calls constructor of parent, technically implicitly called
        // this keyword - this refers to the instance field/variable
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Methods
    public void meow() {
        System.out.println("meow");
    }

    public void sitOnKeyBoard(String keyBoardSmash) {
        System.out.println(keyBoardSmash);
    }

    // getters and setters
    // Getter - retrieve information being requested
    // Setter - the modify the value of the field of the object
    // If I have a field with only a getter - you won't be able to modify the field
    // (field is now readonly)
    // If I have a field with only a setter - write only, you won't be able to
    // retrieve the value only set it

    public String getName() {
        return name;
    }

    // setters are perfect for adding validation logic to the data that
    // can be saved in an object
    public void setName(String name){
        if (name.equals("Rover"))
            throw new WrongNameException("bad name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            throw new RuntimeException("Age must be positive");
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString is a method inherited from the Object class that you can override
    // it represents the string value of a particular object
    @Override
    public String toString() {
        return "name: " + this.name + "\tage: " + this.age + "\tfur: " + this.color;
    }

    // hashcode returns the hashed value of the object
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    // this method defines the equality of our objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

    // hashcode

}
