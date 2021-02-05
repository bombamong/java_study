public class Hello {

​	public static void main(String[] args){

​	}

}



# Primitive Types

1. boolean

   True or False

2. byte : 8bits
   Not very useful nowdays... use only when you are sure you will use small numbers.

   Min: -128
   Max: 127

3. char 16bits

   Allowed to store Unicode. 

4. short : 16bits
   Short Min Value = -32768
   Short Max Value = 32767

5. int: 32bits
   MAX = 2 ^ 31 - 1

   MIN = - 2 ^ 31

6. long: 64bits
   Long Min Value = -9223372036854775808
   Long Max Value = 9223372036854775807

   need to add a "L" to literal value 

   ex: long a = 2_147_483_647_234L;

7. float - single precision number -> 32bis

   Float minimum = 1.4E-45
   Float maximum = 3.4028235E38

   ```
   float myFloatValue = 5.25f;
   ```

8. double - double precision number -> 64bits

   literal numbers with decimals are automatically assumed to be doubles

   Double minimum = 4.9E-324
   Double maximum = 1.7976931348623157E308

   ```
   double myDoubleValue = 5.25d;
   ```

9. 

9. String - not really a primitive type but usually treated as one. 

   Is actually a Class, but it is just made easier to use. 

   A String can contain technically limited by memory or the MAX_VALUE of an int which is 2.14 Billion.

   Strings are immutable. 

   String appending like below is inefficient. Should use StringBuffer

   ```java
   String a = "abc";
   a += "def";
   System.out.println(a);
   // "abcdef"
   ```

   

# Casting in Java

Treat or conver a number from one type to another.

```
byte myNewByteVale = (byte) (myMinByteValue / 2);
```



** What are Java packages

# Operators, Operands, and Expressions in more detail

Operators  + - / * % 

&& and 

|| or



# Java Keywords

google them :) 



# DiffMerge Tool

compare two files to find errors

# Method Overloading

Same methods acting differently based on different parameters

```java
public static void bark (String bark1, String bar2){
	System.out.println(bark1 + " " +bark2);
}

public static void bark (String bark1){
  for(int x = 0; x < 10; x++){
    System.out.println(bark1);
  }
}
```

* improves code readability and re-usability



# Switch

```java
int switchValue = 4;
switch(switchValue){
  case 1:
    System.out.println("Value was 1");
    break;
  case 2:
    System.out.println("Value was 2");
    break;
  case 3: case 4: case 5:
    System.out.println("Value was 3, 4 or 5");
    break;
  default:
    System.out.println("Was not 1 or 2");
    break;
}
```



## String.format()

String.format("%.2f", someMethodThatReturnsADouble(arg));

formats string to 2 decimals.



# User Input

```java
java.util.Scanner; 

Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
scanner.nextLine(); //To handle \n
String b = scanner.nextLine();
scanner.close(); //Relieve memory. 
```



# OOP in Java

Objects : 



# Constructor

```java
public class Account {
  private long number; 
  public Account(long number){
    this.number = number; 
    System.out.println("Constructor with number called.")
  }
  public Account(){
    this(13123);
 		System.out.println("Empty constructor called.")
  } 
}
```



# Inheritance

```java
public class Dog extends Animal {
    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }
}
```

super keyword --> call the constructor from the class that this class is being extended from. 

In below example walk will execute Animal.move() whereas run will run the overriden method in Dog.

```
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("DOG CHEWS FOOD");
    }

    @Override
    public void eat(){
        chew();
        super.eat();
    }
		
    public void walk(){
        System.out.println("DOG WALKS");
        super.move(5);
    }

    public void run(){
        System.out.println("DOG RUNS!");
        move(10);
    }

    @Override
    public void move(int speed){
        System.out.println("DOG MOVES");
        moveLegs(speed);
        super.move(speed);
    }
}
```



# Vocabulary (Keywords)

Class : blueprint of a house

Instance : A house that is actually built

Reference : Address of the house

Super: used to call the parent class members(variables and methods);

This: used to call current class members(variables and methods);

Super() : calls the parent constructor;

This() :  to call a constructor from another overloaded constructor, CAN ONLY BE CALLED in a constructor and MUST BE THE FIRST STATEMENT

A constructor CANNOT have both super() and this()

CONSTRUCTOR CHAINING: making one constructor do all the work by calling this()

METHOD OVERLOADING: 2 or more separate methods in a class with the same name but different parameters.

Helps to reduce effort to make and memorize different method names for the same action. Overloading does not have anything to do with **polymorphism**. Java devs often refer to overloading as **Compile Time Polymorphism**, which means that the compiler decides which method is going to be called based on the method name , return type and argument list.

We can **overload static** and **instance** methods.

methods can be overloaded within the same class or on a subclass; 

OVERLOADING RULES

- Methods must have same name
- Methods must have diff params

If methods follow the rules above then they may or may not

- Have a different return type
- Have different access modifiers
- Throw different checked or unchecked exceptions



METHOD OVERRIDING

Defining a method in a child class with same signature(same name, same argument(s))

Methods that are defined in the parent class and inherited to the child class are called derived methods.

Method overriding is also know as **Runtime Polymorphism** and **Dynamic Method Dispatch**, because the method that is going to be called is decided at runtime by the JVM. 

Static methods cannot be overriden, only Instance methods can.

@Override is recommended to be written on the top. For compile time error if rules are not followed properly. 



OVERRIDING RULES

* Must have same name and same arguments
* Return type can be a subclass of the return type in the parent class
* It cant have a loswer access modifier
  * EX) If parent method is protected then using private in the child is not allowed but using public in child is allowed.

NOTES ABOUT OVERRIDING

* Only inherited methods can be overriden
* Constructors and private methods cannot be overridden.
* Methods that are final cannot be overriden
* subclass can use super.methodName() to call the superclass verion of an overriden method.



# Static vs Instance methods

### Static

Static methods cant access instance methods and instance variables

Dont have access to this keyword

whenever you see a method that does not use instance variables that method should be declared as static method

 Ex) Not accessing instance variables or methods. 

```java
class Calculator {
	public static void addNumbers(int a, int b) {
		return a + b; 
	}
}
```

static methods can be used with the syntax Class.staticMethod(). unlike instance methods Car car = new Car(); car.instanceMethod();





### Static Variables

AKA **static member variables**

STATIC binds to class

EX)

```java
class Dog {
  private static String name;
  public Dog(String name) {
    Dog.name = name;
  }
  public void printName() {
    System.out.println("name= " + name);
  }
}

public class Main {
  public static void main(String[] args) {
    Dog rex = new Dog("rex");
    Dog fluffy = new Dog("fluffy");
    rex.printName(); // prints fluffy
    flffy.printName(); // prints fluffy
  }
}
```



### Instance Variables

changes depending on instance

```java
class Dog {
  private String name;
  public Dog(String name) {
    Dog.name = name;
  }
  public void printName() {
    System.out.println("name= " + name);
  }
}

public class Main {
  public static void main(String[] args) {
    Dog rex = new Dog("rex");
    Dog fluffy = new Dog("fluffy");
    rex.printName(); // prints fluffy
    flffy.printName(); // prints fluffy
  }
}
```



## Composition

When the whole is made out of different parts. 

Example: PC example

Rule of thumb is to consider composition before inheritance. 



## Encapsulation

Preventing access of private members from outside

## Polymorphism

 objects can take diverse forms even if they come from the same object.



# Arrays

```java
int[] myIntVariable; = int[10];
```

Arrays.toString(array) -> joins elements to string



# List and Array List

```
ArrayList<String> newArray = new ArrayList<String>();
newArray.addAll(groceryList.getGroceryList());

ArrayList<String> = new ArrayList<String>(groceryList.getGroceryList());

String[] myArray = new String[groceryList.getGroceryList().size()];
myArray = groceryList.getGroceryList().toArray(myArray);

arrayList.size()
arrayList.set(index, item);
arrayList.remove(index)
arrayList.add(item)
arrayList.indexOf(item)

```

# Autoboxing and Unboxing

Primitive types cannot be used with Array List

Ex)

```java
ArrayList<int> intArrayList = new ArrayList<int>(); // throws error; 
```

So need to use boxing

```java
Integer integer = new Integer(54);
Double doubleValue = new Double(12.25);
ArrayList<Integer> intArrayList = new ArrayList<Integer>();
for(int i = 0; i <= 10; i++) {
  intArrayList.add(Integer.valueOf(i)); // Autoboxing.
}
for(int i = 0; i <= 10; i++) {
  intArrayList.add(i + " --> " + intArrayList.get(i).intValue()); // Unboxing.
}

Integer myIntValue = 56; //Integer.valueOf(56);
int myInt = myIntValue.intValue(); // myIntValue.intValue();

ArrayList<Double> myDoubleValues = new ArrayList<Double>();
for(double dbl=0.0; dbl <= 10.0; dbl += 0.5) {
  myDoubleValues.add(Double.valueOf(dbl));
}
for(int i = 0; i < myDoubleValues.size(); i++) {
  double value = myDoubleValues.get(i).doubleValue();
  System.out.println(i + " --> " + value);
}
```



# Linked List

use Iterator or ListIterator to loop through a linked list.

```java
    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                System.out.println(newCity + " is already included.");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
```



# Interface

Specifies methods that the classes that implement the interface MUST implement.

(It is like a shell);

Prevents classes from changing method signatues at will.

```java
public SomePopularClass {
	public void printSomething(String something) {
		System.out.println("something");
	}
}

// suddenly changes to 

public SomePopularClass {
	public void printSomething(boolean yes) {
			if(yes) System.out.println("something");
	}
}

//This might break code that depend on SomePopularClass. 
//Hence the need for interfaces.
```

How to implement

Interface: 

```java
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
```

Class that implements Interface:

```java
public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone.");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
```

## Implement from Interface or Extend from a Class ?

TIP: Consider the relationship of the final object being created

Ex)

1. A dog is an animal thus extends from Animal
   1. A dog is a walking animal thus implements walk()
2. A bird is an animal thus extends from Animal.
   1. A bird is a flying animal thus implements from fly()

 

# Inner Classes

There are 4 types of nested classes that can be used.

1. static nested class
2. nonstatic nested class --> also called an Inner class
3. Local class --> a special type of an inner class thats defined inside of a scope
4. Anonymous class --> a special type of an inner class that has no name and is defined and instantiated at the same time.



1. static nested class

   1. Associate a class with an outer class

2. non-static nested class

   EX)

   ```java
   public class GearBox {
       private ArrayList<Gear> gears;
       private int maxGears;
       private int gearNumber = 0;
   
       public Gearbox(int maxGears) {
           this.maxGears = maxGears;
           this.gears = new ArrayList<Gear>();
           Gear neutral = new Gear(0, 0.0);
           this.gears.add(neutral);
       }
       
       public class Gear {
           private int gearNumber;
           private double ratio;
   
           public Gear(int gearNumber, double ratio) {
             //To Acess Gearbox gearNumber use
             //GearBox.this.gearNumber;
               this.gearNumber = gearNumber;
               this.ratio = ratio;
           }
           
           public double driveSpeed(int revs) {
               return revs * (this.ratio);
           }
       }
     // OR could be
        /** private class Gear {
           private int gearNumber;
           private double ratio;
   
           public Gear(int gearNumber, double ratio) {
               this.gearNumber = gearNumber;
               this.ratio = ratio;
           }
   
           public double driveSpeed(int revs) {
               return revs * (this.ratio);
           }
   
           public double getRatio() {
               return ratio;
           }
       } **/
   }
   
   // How to create Gear instances;
   public class Main {
       public static void main(String[] args) {
   	    Gearbox mcLaren = new GearBox(6);
           GearBox.Gear first = mcLaren.new Gear(1, 12.3);
         //needs to use OuterObject.new to create an instance of inner class
         //GearBox.Gear secons = mcLaren.new Gear(2, 22.22);
         //GearBox.Gear randomThird = new GearBox().new Gear(3, 33.33);
           System.out.println(first.driveSpeed(1000));
       }
   }
   ```

   

3. local class

   One of two cpecial cases of inner classes.

   Local classes are declared inside a block such as method or an if statement and their scope is restricted.

   ```java
   public class Button {
       private String title;
       private OnClickListener onClickListener;
   
       public Button(String title) {
           this.title = title;
       }
       public String getTitle() {
           return title;
       }
   
       public void setOnClickListener(OnClickListener onClickListener) {
           this.onClickListener = onClickListener;
       }
   
       public void onClick() {
           this.onClickListener.onClick(this.title);
       }
       public interface OnClickListener {
           public void onClick(String title);
       }
   }
   public class Main {
   
       private static Scanner scanner = new Scanner(System.in);
       private static Button btnPrint = new Button("Print");
   
   	public static void main(String[] args) {
       // LOCAL CLASSSSSSS
           class ClickListener implements Button.OnClickListener {
               public ClickListener() {
                   System.out.println("I've been attached");
               }
   
               @Override
               public void onClick(String title) {
                   System.out.println(title + " was clicked");
               }
           }
           btnPrint.setOnClickListener(new ClickListener());
           listen();
       }
   
       private static void listen() {
           boolean quit = false;
           while(!quit) {
               int choice = scanner.nextInt();
               scanner.nextLine();
               switch(choice) {
                   case 0:
                       quit = true;
                       break;
                   case 1:
                       btnPrint.onClick();
                       break;
               }
           }
       }
   
   
   }
   ```

   

4. anonymous class

   - is also a local class but has no name

   - they have to be declared and instantiated at the same time

   ```java
           btnPrint.setOnClickListener(new Button.OnClickListener() {
               @Override
               public void onClick(String title) {
                   System.out.println(title + " was clicked");
               }
           });
   ```

   

# Abstract Class

Interfaces are abstract, meaning that you have to make a class that implements the interface to instantiate it.

## Abstraction

Define the required functionality for something without actually implementing the data house.

what NEEDS TO BE DONE not HOW IT IS DONE.

```java
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void eat();
    public abstract void breathe();
    
    public String getName() {
        return name;
    }
}
```



# Interface vs Abstract Classes

Consider relationships: is our, versus has our or can.



Consider if an aciton should is specific to that class and sub classes 

Example)

	1. Birds can fly and bats can fly
 	2. Bats are not Birds
 	3. Hence create an interface that both Birds and Bats can implement



However if there are actions that are common to all sub classes, it is better to create an abstract class

Example)

1. All animals can eat and breathe 
2. Could be implemented from an Interface, but all Animals share these two actions so it is better to inherit and from an abstract Animal Class.



Interfaces:

- all methods are automatically public
- Can only have static variables with static scope
- cannot have constructors
- All methods are abstract [no implementation]



Abstract classes:

* Can have non-static variables
* Can decide visibility of variables and methods [private protected etc]
* Can have methods that have been implemented

# BST(Binary Search Tree)

traverse with recursively. 

Think about the call stack -> 

For BST for billions of data only 63 calls need to be made, but for a linked list it would need to call for every data. 





# Generics

> Generics: 
>
> A *generic type* is a generic class or interface that is parameterized over types.



```java
public class Team<T extends Player> {}
// Player is upperbound
```

can have multiple bounds

```java
public class Team<T extends Player & Coach & Something> {}
// Can have only 1 class and the rest have to be interfaces; 
```

```JAVA
package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }

    //    public int compareTo(Team<T> team) {
//        if(this.ranking() > team.ranking()) {
//            return -1;
//        } else if(this.ranking() < team.ranking()) {
//            return 1;
//        }
//        return 0;
//    }
}


**---------USING LEAGUE --------**
 public static void main(String[] args) {
        League<Team<FootBallPlayer>> league = new League<>("League");
        Team<FootBallPlayer> team1 = new Team<>("FBteam1");
        Team<FootBallPlayer> team2 = new Team<>("FBteam2");
        Team<FootBallPlayer> team3 = new Team<>("FBteam3");
        Team<FootBallPlayer> team4 = new Team<>("FBteam4");

        Team<BaseballPlayer> teamR = new Team<>("BBteam1");

        league.add(team1);
        league.add(team2);
        league.add(team3);
        league.add(team4);
        
//      Cant add baseball team using generics;
//      league.add(teamR);

        team1.matchResult(team2, 2, 4);
        team1.matchResult(team3, 1, 5);
        team1.matchResult(team4, 7, 1);
        team1.matchResult(team2, 1, 0);
        team1.matchResult(team3, 1, 0);
        team1.matchResult(team4, 1, 6);

        team2.matchResult(team1, 1, 4);
        team2.matchResult(team3, 4, 1);
        team2.matchResult(team4, 3, 2);
        team2.matchResult(team1, 0, 0);
        team2.matchResult(team3, 1, 0);
        team2.matchResult(team4, 1, 0);

        team3.matchResult(team2, 1, 0);
        team3.matchResult(team4, 1, 3);
        team3.matchResult(team1, 1, 0);
        team3.matchResult(team2, 1, 5);
        team3.matchResult(team4, 1, 1);
        team3.matchResult(team1, 1, 0);

        team4.matchResult(team1, 1, 0);
        team4.matchResult(team2, 1, 1);
        team4.matchResult(team3, 1, 0);
        team4.matchResult(team1, 0, 1);
        team4.matchResult(team2, 1, 0);
        team4.matchResult(team3, 1, 1);

        league.printTeams();
    }
```

## RAW types

What is raw type

```java
An object of a generic class or interface if its type arguments are not passed during its creation.
  
상자<장난감> 장난감 상자 = new 상자<>();
vs.
상자 랜덤박스 = new 상자();

랜덤박스 안에다가 아무거나 다 넣을 수 있기때문에 빡침...;
```



# Naming Conventions

Things to name

- Packages
- Classes
- Interfaces
- Methods
- Constants
- Variables
- Type Parameters

## Packages

- Always lower case.
- Package name should be unique
- Use your internet domain, reversed, as a prefix for the package name.
- Oracle specifies conventions for package names

### Invalid domain name components

- Replace invalid characters(i.e. -) in domain name with an underscore
- Domain name components starting with a number should instead start with an underscore _
- Doman nmae components that are java keywords should have that coponent start with an underscore.
- examples
  - Switch.supplier.com -> com.supplier._switch
  - 1world.com -> com._1world
  - Experts-exchange.com -> com.experts_exchange



### example package names

java.lang

java.io

org.xml.sax.helpers

com.timbuchalka.autoboxing



## Class names

- CamelCase

- Class names should be nouns
- should start with a capital letter
- each word should start with a capital



## Interface names

* Similar to class
* Think about what the interface will become after being implemented
  * List
  * Serializable
  * Comparable



## Methods

* mixedCase
* often verbs
* reflect function performed or result returned
  * size()
  * getN;ame()
  * getPlayer()

## Constants

Examples: 

* All UPPER CASE
* separte with underscore
* Use final keyword

* Static final int MAX_INT
* SEVERITY_ERROR
* PI



## Variable Names

* mixedCase
* meaningful and indicative
* start with a lower case letter
* do not user underscores
  * i
  * league
  * sydneySwans
  * boxLength



## Type Parameters

* Single character, Capital letters
* Guidelines on oracle
  * E - Element
  * K - Key
  * T - Type
  * V - Value
  * S, U, V, etc. - 2nd 3rd 4th types

 

## WHAT ARE PACKAGES

Some reasons to use packages are: 

* Programmers can easily determine that the classes are related
* It is easy to know where to find the classes and interfaces that can provie the functions provided by the package.
* Because the package creates a new namespace, class and interface name conflicts are avoided.
* Classes within the package can have unrestricted access to one another while still restricting access for classes outside the package.

```java
public class Main {
  public static void main(String[] args) {
    javafx.scene.Node node = null;
    org.w3c.dom.Node anotherNode = null;
  }
}
```



```java
import java.awt.*
// * means to import all the class interfaces and static objects from the java.awt class
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// java.awt is diffrent form java.awt.event
```



package challenge

```java
package com.series;

public class Main {

    public static void main(String[] args) {
	    for(int i = 0; i <= 10; i++) {
            System.out.println("nSum: " + Series.nSum(i));
        }

	    for(int i = 0; i <= 10; i++) {
            System.out.println("factorial: " + Series.factorial(i));
        }

	    for(int i = 0; i <= 10; i++) {
            System.out.println("fibonnaci: " + Series.fibonacci(i));
        }

    }
}

```



# Scope

* Visibility of a class or its members
* narrow --> wide check

```java
public class X {
    public static void x(int x) {
        System.out.println("1 x " + x + " = " + (1 * x));
        System.out.println("2 x " + x + " = " + (2 * x));
        System.out.println("3 x " + x + " = " + (3 * x));
        System.out.println("4 x " + x + " = " + (4 * x));
        System.out.println("5 x " + x + " = " + (5 * x));
        System.out.println("6 x " + x + " = " + (6 * x));
        System.out.println("7 x " + x + " = " + (7 * x));
        System.out.println("8 x " + x + " = " + (8 * x));
        System.out.println("9 x " + x + " = " + (9 * x));
        System.out.println("10 x " + x + " = " + (10 * x));
        System.out.println("11 x " + x + " = " + (11 * x));
        System.out.println("12 x " + x + " = " + (12 * x));
    }
}

public class Main {

    private static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Times table for: ");
        X.x(x.nextInt());
    }
}

```

# Access Modifiers

### Top Level

- only classes, interfaces and enums can exist at the top level.

- Public: the object is visible to all classes everywhere, whether they are in the sam package or have imported the package containing the public class.

- Package-private: the object is only available within its own package.

  - This is the default behaviour if no acess modifier is included

    ```
    // this is package-private
    class myClass {
    
    }
    ```

### Member level

- public : available to all
- Package-private : same as top level
- Private : object is only visible within the class it is declared
- Proteted: the object is visible anywhere in its own package AND subclasses in any other package.



### Static

Class methods && class variables



### Final

VARIABLE FINAL: similar to a constant, can be changed once before the contructor finishes to run (can assign value during construction). 

VARIABLE STATIC FINAL: to use as constants 

CLASS FINAL: cannot create subclasses anymore.

METHOD FINAL: prevent override.



# Static Initializers

Is like a constructor for static members.

To assign a **static final variable **value 

Static initializer blocks run before the constructor does. (Shown below).

```java
package com.example;

public class SIBTest {
    public static final String owner;
    static {
        owner = "David";
        System.out.println("SIBTEST static initialization block called.");
    }
    public SIBTest() {
        System.out.println("SIB constructor called");
    }
    static {
        System.out.println("2nd initialization block called");
    }
    public void someMethod() {
        System.out.println("someMethod called");
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Main method called.");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}

--- output --- 
  
/** 
Main method called.
SIBTEST static initialization block called.
2nd initialization block called 
SIB constructor called
someMethod called
Owner is David 
**/
```



# Collections Interface

At the top level of Collections framerwork is Collections class.

Includes lists such as: 

- Sets

- Maps

  - Collections.unmodifiableMap(list);

  ```java
  return Collections.unmodifiableMap(list);
  ```

  * Map.Entry<String, StockItem> item

  ```java
  for(Map.Entry<String, StockItem> item : list.entrySet()) {
              StockItem stockItem = item.getValue();
              double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
              s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
              s = s + itemValue + "\n";
              totalCost += itemValue;
          }
  ```

  * list.getOrDefault(keyName, itemIfNotFound);

  ```java
  Item foundOrNull = list.getOrDefault(itemName, null)
  ```

- Trees

- Queues

- ArrayList
  - 내부적으로 데이터를 배열로 자바가 알아서 관리해줌.
  - 추가/ 삭제 할때 모든 배열을 복사 해야되기때문에 성능 처하
  - Indexing 되어 있어서 찾을때 빠름

- List (Interface)

- LinkedList
  - 추가/삭제 할때 노드 하나 연결고리만 해결해주면 됨. 
  - 앞/뒤 노드만 알기때문에 찾기 위해서 전체 순회 필요함 (비효율). 



```java
private Collection<Seat> seats = new LinkedHashSet<>(); //Valid is type of Collection
private Collection<Seat> seats = new ArrayList<>(); //Valid is a type of Collection
private Collection<Seat> seats = new LinkedList<>(); //Valid is a type of Collection
private Collection<Seat> seats = new TreeSet<>(); //Invalid because a TreeSet is a special type of Set11
```



Below seatCopy and theatre.seats are different ArrayList, however they share the same Seats, in other words they are difference Lists with the same references.

```java
public class Main {
  public static void main(String[] args) {
    Theatre theatre = new Theatre("Olympian", 8);
    List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
    printList(seatCopy);
    
    seatCopy.get(1).reserve();
    if(theatre.reserveSeat("A02")) {
      System.out.println("Please pay for A02");
    } else {
      System.out.println("Seat already reserved");
    }
    Collections.reverse(seatCopy);
    System.out.println("Printing seatCopy");
    printList(seatCopy);
    System.out.println("Printing theatre.seat");
    printList(theatre.seats);
    System.out.println(seatCopy.get(seatCopy.size() - 1) == 
                       theatre.seats.get(0)); // returns true
    
  }
}
```

Collections method for LISTS

```java
Collections.shuffle(LIST) // shuffles list
Collections.min(LIST) // returns min el
Collections.max(LIST) // returns max el
Collections.swap(LIST, el1, el2); //swap elements
Collections.sort(LIST) // sort list with mergesort
Collections.copy(DESTINATION, SOURCE);
	//EX)
	List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
	/* Below will throw an error.
	* Reson being:
	* newList has capacity equal to seat.size() but does not actually have Seats inside
	* Collections.copy() requires inner objects to exist to be able to copy.
	* In other words, newList would need to already have Seat objects initialized inside
	* in order to be able to copy theatre.seats properly. 
	*/
	Collections.copy(newList, theathre.seats);

```

Using comparators for Collections.sort(LIST, COMPARATOR)

** NOTE **

When using Comparator it is important to break down the compare method so that ordering is consistent with equals, meaning that a method shall only return 0 if the objects being compared are in fact actually equals. 

e.g.) seat with number A01 is ACTUALLY EQUAL to A01

​		seat with price of $13 is NOT NECESSARILY EQUAL to another seat with a price of $13

​		A01 with price 13

​		B01 with price 13 

​		However on the example below compare method return 0 despite these two being different seats.

```java
public class Theater {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();
    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                  // should compare further, seat.compareTo(seat2) would be good.
                }
            }
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Theater theatre = new Theater("Olympian", 8, 12);
        List<Theater.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
      /* PASS the object implementing the Comparator interface as an argument
      * to the sort method. This will make sort method to execute on the 
      * logic provided by the compare method of the Comparator object
      */
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);
    }

}
```



# Map Interface

Map<String, String> map = new HashMap<>();

map.put("Key", "Value");

map.get("Key"); // Output -> "Value";

map.containsKey("Key"); // return bool

map.containsValue("Value") // returns bool

languages.putIfAbsent(); // put if key does not exist, to help with concurrency issues (multithread); does not help with null values.

Loop through map :

```java
for(String key : map.keySet()) {
    System.out.println(key + " : " + map.get(key));
}
```

map.remove('Key"); 		// returns prev value

map.remove("Key", "Value"); 		//returns bool, true if removed

map.replace("Key", "Value") 		// returns prev value

map.replace("Key", "Old Value", "New Value") 		// returns bool, true if replaced.



**SOME NOTES**

- Prohibited for a map to have a key of itself 
- Recommended to not use mutable keys ex) ArrayList as key, as it may not act as expected.

# Comments

### Documentation && Implementation comments

```java
/**
* Documentation comment is very important for teamwork,
* and accurate description of what the code tries to achieve.
* @param for parameters
* @return for return value
*/

public Main {
  public static void main(String[] args) {
    
  }
  
  public static int addNums(int x, int y) {
 /*
  * Can also write implementation comments like.
  * Usually follows indentation of the code to be commented on. 
  * Recommended to have if code is not very intuitive. 
  *	addNums adds two integers and returns the sum.	
  */
    return (x + y); 
  }
}
```

### Single-line comments

```java
public static void printSomething() {
  /* this is a single-line comment */
  System.out.println("something");				
}
```

### Trailing-comments

```java
public static void printSomething(int x) {
	if(x == 0) {
    System.out.println("Nothing");		/* This is a trailing comment */
  } else {
    System.out.println("Something");	/* This is another trailing comment */
  }		
}
```

### End-Of-Line Comments

```java
public static void printSomething(int x) {
  // This is a end-Of-Line Comment
  // 	if(x == 1) {
  //  	System.out.println("Something");
  //	} else {
  //  	System.out.println("Nothing");
  //	}
  
  
	if(x == 0) {
    System.out.println("Nothing");		// Can comment here 0 is nothing
  } else {
    System.out.println("Something");	// Else is something
  }
}
```



# IMMUTABLE CLASSES

Example of adventure game 

* Not providing setters when they are not absolutely necessary
* Returning copies of fields instead of the fields themselves for getters
* Making fields finals to prevent changes. 

```java
package com.series;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;
  
    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>(exits);
        this.exits.put("Q", 0);
    }
  
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
```



# SETS AND HASH SETS

* addAll() to add to set.

* ## Set Interface Bulk Operations

  Bulk operations are particularly well suited to `Set`s; when applied, they perform standard set-algebraic operations. Suppose `s1` and `s2` are sets. Here's what bulk operations do:

  - `s1.containsAll(s2)` — returns `true` if `s2` is a **subset** of `s1`. (`s2` is a subset of `s1` if set `s1` contains all of the elements in `s2`.)

  - `s1.addAll(s2)` — transforms `s1` into the **union** of `s1` and `s2`. (The union of two sets is the set containing all of the elements contained in either set.)

    ```java
            System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
            Set<Integer> union = new HashSet<>(squares);
            union.addAll(cubes);
            System.out.println("Union contains " + union.size() + " elements.");
    ```

    

  - `s1.retainAll(s2)` — transforms `s1` into the intersection of `s1` and `s2`. (The intersection of two sets is the set containing only the elements common to both sets.)

    ```java
    Set<Integer> intersection = new HashSet<>(squares);
            intersection.retainAll(cubes);
            System.out.println("Intersection contains " + intersection.size() + " elements.");
            for(int i : intersection) {
                System.out.println(i + " is the square of " + (int) Math.sqrt(i) + " and the cube of " + (int) Math.cbrt(i));
            }
    ```

    

  - `s1.removeAll(s2)` — transforms `s1` into the (asymmetric) set difference of `s1` and `s2`. (For example, the set difference of `s1` minus `s2` is the set containing all of the elements found in `s1` but not in `s2`.)

  ```java
          Set<String> nature = new HashSet<>();
          Set<String> divine = new HashSet<>();
          String[] natureWords = {"all", "nature", "is", " but ", "art", "unknown", "to", "thee"};
          nature.addAll(Arrays.asList(natureWords));
          String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
          divine.addAll(Arrays.asList(divineWords));
  
          System.out.println("nature - divine: ");
          Set<String> diff1 = new HashSet<>(nature);
          diff1.removeAll(divine);
          printSet(diff1);
  
          System.out.println("divine - nature: ");
          Set<String> diff2 = new HashSet<>(divine);
          diff2.removeAll(nature);
          printSet(diff2);
  ```

  

* Less often than lists and maps

* No ordery

* Cannot contain duplicates

* Oracle recommends override of equals and hashcode method.

* If two objects are equals THEY MUST HAVE SAME HASH CODE

```java
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        String objName  = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }
}
```

* subclassing needs caution

EXAMPLE

```java
public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");
        System.out.println(rover2.equals(rover)); // returns true;
        System.out.println(rover.equals(rover2)); // returns false;
    }
}

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o instanceof Dog) {
            String oName = ((Dog) o).getName();
            return this.name.equals(oName);
        }
        return false;
    }
}

public class Labrador extends Dog{
    public Labrador(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o instanceof Labrador) {
            String oName = ((Labrador) o).getName();
            return this.getName().equals(oName);
        }
        return false;
    }
}

```



# ENUMS

use as types

```java
public class Bodies {
  private BodyTypes bodyType;
  
  public enum BodyTypes {
    PLANET,
    MOON,
    STAR
  }
  
  public Bodies(BodyTypes bodyType) {
    this.bodyType = bodyType;
  }  
  
}



```

# Exceptions

### What is an exception

- An event that occurs during the execution of a program that disrupts the execution of the rest of the program.

### Types

- Exception
  - extends throwable

- Runtime Exception

