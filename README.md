# Year-11-CS-Unit-6-Classes-Tutorial-Cube

Your job is to create one class called Cube.
You should pass all of the tests in the CubeTester class (provided).

Create a class called Cube. Cube has one single private integer variable called side, which represents the length of a side of the cube, a getter method called getSide(), a setter method called setSide(int side), a method that returns the surface area of the cube called calculateSurfaceArea(), a method that returns the volume of the cube called calculateVolume(), and a toString method that returns a String in the format, for example:

Cube{side=4} .

The Cube class has two constructors. One takes no arguments (has no parameters) and sets side to 1. The other will take a single integer argument that is used to initialize the side property. Side should never be less than 1. If a user attempts to create a Cube with a side length less than 1, an IllegalArgumentException will be thrown. The message “A cube’s side length cannot be less than 1!” will be displayed in the console when the exception occurs. If a user attempts to change the side length of an already existing Cube to a value less than 1, again, an IllegalArgumentException will be thrown, and the message “A cube’s side length cannot be less than 1!” will be displayed in the console when the exception occurs.

Note: Becoming familiar with how to throw exceptions will be useful in the completion of this lab. There are many different types of exceptions. You may recall seeing a throws IOException or throws FileNotFoundException when you were working with files. In this lab, for example, if the parameter passed to the Cube constructor was -1 (the user attempts to create a Cube of side length -1) we can catch this exception and return an informative message to the user.

if (length < 1) throw new IllegalArgumentException(“A cube’s side length must be equal to or greater than 1!”);

If someone were to take this completed Cube class and incorporate it into their own program, they could, for example, allow the user a way of creating a Cube and if an IllegalArgumentException were to be thrown, they could determine how they wish their program to handle it. 
