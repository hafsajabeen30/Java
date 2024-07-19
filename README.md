# Welcome to the Learning Outcomes Evaluation

Dear students,

Welcome to this Learning Outcomes Evaluation session. Over the next two hours, we will be assessing your understanding and mastery of the learning outcomes for this semester. This evaluation is an important opportunity for you to showcase your knowledge and skills.

Please take this evaluation seriously and demonstrate your best work from the last two weeks by using your personal git account as proof. Remember to answer each question thoroughly and provide clear explanations where necessary.

Best regards,
Ghada Hassan and Kay Berkling

## Ethics Section regarding generative and other forms of AI

The student acknowledges and agrees that the use of AI is strictly prohibited during this evaluation. By submitting this report, the student affirms that they have completed the assessment independently and without the assistance of any AI technologies. This agreement serves to ensure the integrity and authenticity of the student's work, as well as their understanding of the learning outcomes.


## Checklist before handing in your work

- [ ] Review the assignment requirements to ensure you have completed all the necessary tasks.
- [ ] Pay careful attention to the requested links that must come from your project.
- [ ] Double-check your links and make sure that links lead to where you intended. Each answer should have links to work done by you in your own git repository
- [ ] Make sure you have at least 10 references to your project code (This is important evidence to prove that your project is substantial enough to support the learning outcome of object oriented design and coding within a larger piece of code.)
- [ ] Include comments to explain your referenced code and why it supports the learning outcome
- [ ] Proofread any accompanying documentation or comments for grammar and clarity.
- [ ] Commit and push this markup file to your personal git repository and hand in the link and a hard-copy via email at the end of the exam.

Remember, this checklist is not exhaustive, but it should help you ensure that your work is complete, well-structured, and meets the required standards.

Good luck with your evaluation!


## Learning Outcomes

| Exam Question | Total Achievable Points | Points Reached During Grading |
|---------------|------------------------|-------------------------------|
| Algorithms    |           4            |                               |
| Data types    |           4            |                               |
| Complex Data Structures |  4            |                               |
| Concepts of OOP |          6            |                               |
| OO Design     |           6            |                               |
| Class concepts |            8           |                               |
| Testing       |           6            |                               |
| Operator/Method Overloading | 6 |                               |
| Templates/Generics |       6            |                               |
| Class libraries |          6            |                               |
| Multi-threading |          6            |                               |
| Lambda expressions |       6            |                               |
| Serialization |            6           |                               |
| Database connectivity |   6            |                               |
| Total        |           80          |                               |



## Evaluation Questions

Please answer the following questions to the best of your ability to show your understanding of the learning outcomes. Please provide examples from your project code to support your answers. Only links to your own git will count. When you explain what you did make sure to explain why you did it this way with clear reasoning relating to your own work and not generic statements that anyone could make. 

## Evaluation Material


### Algorithms

Algorithms are manyfold and Java can be used to program these. Examples are sorting or search strategies but also mathematical calculations. Please refer to **two** areas in either your regular coding practice or within your project, where you have coded an algorithm. Do not make reference to code written for other classes, like theoretical informatics.


Answer: I have worked with selection sort and binary search. In selection sort the inner loop goes through the linkedlist to find the minimum value stored and replaces it with the value our outer loop we use as pointer has. This way it sorts the linkedlist here in asecding order. This is a useful algorithem to sort an array or a list.
Link: https://github.com/hafsajabeen30/Java/blob/main/Sorts/Selection.java

I have also done binary search which has a binarySearch function that takes a sorted array and a number you want to find, then uses the low=0 and high= length of array-1 and runs until min is equal to maximum. It also has a middle position which is low+high/2. this finds out the middle position. We then check if the number we want to find is greater or lower than middle, depending on that we discard half of the list or array and search in the other half. This makes the complexity of our function lower and makes it more time efficient. 
https://github.com/hafsajabeen30/Java/blob/main/BinarySearch.java

I have also done LIFO and FIFO which applies the metrhods last in first out (stack) and first in first out (queue) 
https://github.com/hafsajabeen30/Java/tree/main/StackAndQeueu


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |


### Data types

Please explain the concept of data types and provide examples of different data types in Java.
Typical data types in java are int, double, float, char, boolean, long, short, byte, String, and arrays. Please provide one example for each of the **three** following data types in your code. One of these links must be to your project.
* Array
* Strings
* boolean
Regarding the link to your project, explain the context in which you have used this data type being specific to your project. 

Answer: In my code I have used the following three datatypes in Users. 
Int:I use it as the id of the user
String:I am using these to save the user name
Link:  https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/User.java

Boolean: In MyJDBC file in the register method i return a value in boolean which checks if there is a user with the same name in the system and if there is it returns a false, otherwise it returns true. 
Link: https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/MyJDBC.java



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           1            |                               |
|           1           |                               |
|           2 (project link)          |                               |



### Complex Data Structures

Examples of complex data structures in Java are ArrayList, HashMap, HashSet, LinkedList, and TreeMap. Please provide an example of how you have used **two** of these complex data structures in your code and explain why you have chosen these data structures. Examples do not have to come from the project.

ArrayList
 
I am using Arraylists in BankingAppGui in the function addPastTransactionComponents. As there can be multiple numbers of transactions, we use array lists for dynamic array sizes because array lists do not have to be specified with a fixed length. Also, it’s easier to do a get-from Database in an array list. The function fetches all the transactions of a user and stores them in the Array List here.
Project: https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BankingAppGui.java

LinkedList: Here I have used linkedlist to push pop and delete elements, I am using a linkedlist here as they are dynamic and not length bound and it is easy to do insertion and deletion functions in linked lists.
https://github.com/hafsajabeen30/Java/blob/main/LinkedLists/SingleLL.java\


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |



### Concepts of OOP
Concepts of OOP are the basic building blocks of object-oriented programming, such as classes, objects, methods, and attributes. 
Explain HOW and WHY your **project** demonstrates the use of OOP by using all of the following concepts:
* Classes/Objects
* Methods
* Attributes 
Link to the code in your project that demonstrates what you have explained above.

Answer: I am using an object oriented design in my project. I have two different classes named user and transaction. User has attributes like id, username, password and current balance. Transaction has attributes like userid, transaction type, transaction amount and transaction date. These are two different classes that interact with each other in multiple instances in our application for example in myjdbc we have a method getPastTransaction where we can get the past transactions of a user by using the users id attribute. Using the specific attributes of these two classes allows for efficient data retrieval and manipulation. 
Link:
https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/User.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/Transaction.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/MyJDBC.java


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|          2              |                               |
|          2              |                               |
|          2              |                               |



### OO Design
Please showcase **two** areas **where** you have used object orientation in your project. (How and why you use it will be the next question below.)
Examples in Java of good oo design are composition, encapsulation, inheritance, polymorphism, and abstraction. 

Answer: Inheritence: In Package guis I have a BaseFrame class that is the parent class. Several other classes inherit from this parent class e.g RegisterGui, Logingui, BankingAppgui and BankingAppDialogegui and hence inherit the attributes of the class as well as the methods. 

Link:
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BaseFrame.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BankingAppGui.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/LoginGui.java

I am using encapsulation in my user class and transaction class . For example I use the keyword final for userid, transaction type etc and the keyword private in user for user attributes like user name, password and current balance . 

Link:
https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/User.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/Transaction.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|              3         |                               |
|              3         |                               |



### Advanced Class Concepts
Advanced class concepts include constructors, abstract classes, interfaces, access modifiers, static methods, and variables. Please provide an example of how you have used **two** of these class concepts in your **project** code and explain why you have chosen these class concepts and how they work within your code.

Answer: In Package guis I have a BaseFrame class that is the parent class with an abstract method called addGuiComponents() Several other classes inherit from this parent class e.g RegisterGui, Logingui, BankingAppgui and BankingAppDialogegui inherit from this class and hence inherit the attributes of the class as well as the methods. Since the method is abstract, each children class has it’s own implementation of the function. As it is evident from the code, this practice is useful for code reusability in my project . As the parent class also  provides properties, such as setting the frame title, size, layout, so if I change it here, it will automatically be shown for all the children classes. This helps in uniformity of the display across different children classes and make the code easy to maintain.  

Link:
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BaseFrame.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BankingAppGui.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/LoginGui.java

1- I have encapsulated different attributes of my user and transaction classes. The use of final key word for userid and transactiontype makes sure that these attribute values cannot be altered throughout the program and the private keyword ensures that the values of these variables are not accessible outside the class. We have getUsername and getPassword methods to make the values of these attributes available in other classes. This makes sure that sensitive and important data like user name, user id are hidden from unconcerned people and things like userid and transaction types cannot be altered as to not disturb our whole system.

Link:
https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/User.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/Transaction.java



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|            4           |                               |
|            4           |                               |

### Testing
Java code is tested by using JUnit. Please explain how you have used JUnit in your project and provide a link to the code where you have used JUnit. Links do not have to refer to your project and can refer to your practice code. If you tested without JUnit, please explain how you tested your code.
Be detailed about what you are testing and how you argue for your test cases. 
Test cases usually cover the following areas:
* boundary cases
* normal cases
* error cases / catching exceptions 


Answer: I did not use JUnit to test my code. I however used manual testing as well as try and catch at multiple places in my project. For manual testing while registring the application needs a certain length of password, I tried to sign up with password that did not match the requirements and also with passwords that did not match and got errors, in the same way I tested my app as I went for all the functions i implemented with deveral inputs.  Also while coding I set different guis like RegistrationGui.setVisible(true) when I wanted to check it and commented out the others as I wanted to test them one by one if they were working fine. I also used try and catch in multiple functions in my program, a good example can be login validation in MYJDBC where I have a try and catch which checks if the user name and password matches any user stored in the databse and gives an error of Login failed if it does not using an SQLException e.

https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/MyJDBC.java



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Operator/Method Overloading
An example of operator overloading is the "+" operator that can be used to add two numbers or concatenate two strings. An example of method overloading is having two methods with the same name but different parameters. Please provide an example of how you have used operator or method overloading in your code and explain why you have chosen this method of coding.
The link does not have to be to your project and can be to your practice code.

Answer:
Method Overloading: I have a BaseFrame class that other gui classes inherit from. I have created two different constructors for  Baseframe . I have a constructor that only initializes the title and another one that initializes user and title. I use the first in logingui and registrationgui and the later in Bankingappgui. This allows for specificity and flexibility in my code as I do not need the user in registrationgui at the point of creation but I do not user and its attributes in BankingAppgui so I can display all the relevant information. 

Link:
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BaseFrame.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BankingAppGui.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/LoginGui.java

Operator Overloading: I am using + in two different scenerios in my code. In the resetFieldsAndUpdateCurrentBalance in BankingAppDialog I am using a plus operator in the to concatenate two string "Balance: $" + user.getCurrentBalance() and in the same file in the function addPastTransactionComponents i am using i++ in the for loop to do addition as i++ = i+1; for each iteration. 

Links:

https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BankingAppDialog.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



### Generics
Generics in java are used to create classes, interfaces, and methods that operate on objects of specified types. Please provide an example of how you have used generics in your code and explain why you have chosen to use generics. The link does not have to be to your project and can be to your practice code.

Generics is a special feature of Java that acts as a placeholder that can hold any kind of datatype. In this program I am creating a class  printer with two generic variables as  T thingToPrint and V otherThing. At the end I can decide which data type I want these variables to be, I choose to create instances with double and string. One thing to notice it, primitive data types are not allowed in generics so we use wrappers like Double, Integer etc to make it work. It helps me avoid compile type errors, makes code more reusable and flexible to use as I do not have worry about remembering what type of variables I initially created. 

Link:
https://github.com/hafsajabeen30/Java/blob/main/Printer.java


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Class Libraries
Examples of class libraries in java are the Java Standard Library, JavaFX, Apache Commons, JUnit, Log4j, Jackson, Guava, Joda-Time, Hibernate, Spring, Maven, and many more. Please provide an example of how you have used a class library in your **project** code and explain why you have chosen to use this class library. 

I am using javax.swing package which part of java standard library. In my code it is being used to create window based application to create a graphical user interface for my application. The different guis like login, register and banking app in my gui package help me display different instances to users and help them interact with the application by clicking buttons or by typing in things. My application uses several classes of swing packages like JButton to create buttons , JtextField to take input , and JLabel to label different fields. Another of Java standard library is Java.util that I am also using as compenent of as java.util.ArrayList in BankingappDialog that allows me to use resizable arrays to handle users and transactions and make tasks like addition, removal and retrieving information easy. 

Link:

https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BankingAppGui.java
https://github.com/hafsajabeen30/bankapp/blob/main/src/guis/BankingAppDialog.java



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6           |                               |

### Multi-threading
multi-threading is the ability of a CPU to execute multiple processes or threads concurrently. Please explain the concept of multi-threading and provide an example of how you have used multi-threading in your code. The link does not have to be to your project and can be to your practice code.

Answer: Multithreading is used for multitasking in java. The threads we use have shared memory area which help saves memory. I have two implementations for multithreading, in the first one I have the multithreading class that extends the thread class. I created 5 different threads using a loop and you and see them running at the same time. Instead of extending thread class I can choose to implement runnable which means I will beable extend the MultithreadThing class with any other class because Java allows inheritance from one class only but I can implement multiple interfaces. The only difference is I have to create a thread instance in the multithreading class.

Link:
https://github.com/hafsajabeen30/Java/tree/main/Multithreading


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Lambda Expressions
An example of a lambda expression is the following code: 
```java
List<String> list = new ArrayList<>();
list.forEach((String s) -> System.out.println(s));
```
Please explain the concept of lambda expressions and provide an example of how you have used lambda expressions in your code. The link does not have to be to your project and can be to your practice code.

With lambdas, I can pass in the implementation of functions from any functional interface like I can pass other any parameter which means I can also save this function implementation in variables and simply pass the function implementation as a parameter in another function. In my code I pass the implementation of the print function in the cat class in printThing using lambda. I get rid of access level, name and return type because the compiler can figure out the return type.  Lambdas can only be saved in a variable if the variable type is a functional interface meaning an interface with just one abstract method as we have in Printable. So basically lamba expressions are somewhat similar to methods except they dont need a name or access levels and can be implemented within another method.

Link:
https://github.com/hafsajabeen30/Java/tree/main/Lambdas 


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|           6            |                               |


### Serialization

Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. Please explain why you would use serialization and provide an example of how you have used serialization in your code. The link does not have to be to your project and can be to your practice code.

Answer: I have two classes: Car implements Serializable and Engine does not initially. Car has a reference field of type Engine. I implement writeObject() to serialize an Engine object by manually serializing all of its fields separately. I also serialize the serializable String field here. I implement readObject() to deserialize a Car object by reading the double and int fields that are a part of Engine and creating a new Engine object with the provided constructor. Serialization helps us convert objects into a byte stream, allowing them to be easily saved to a file or transmitted over a network. In this program, the Engine and Car classes implement the Serializable interface to help us through this process.

Link:
https://github.com/hafsajabeen30/Java/blob/main/Serialization.java


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6          |                               |


### Database Connectivity
Web applications use databases to store data. Please explain how you have connected to a database in your project and provide an example of how you have used database connectivity in your code. The link does not have to be to your project and can be to your practice code. Do not use code from other classes, like database programming, Web Engineering, or theoretical informatics.
This topic appeared in your learning agreement as the last point in the table under advanced topics.

Answer: I am using a sequential database called mysql. I set the access to the database in MyJDBC file by giving it the url, root and password for my databse. . My project database has two tables. The transaction table has id as primary key, transaction amount, transaction date, transaction type and uses user_id as foreign key to help us get transaction history of a every user. Where as user table contains is, username, password and current balance. I have a one to many relationship as a user can have multiple transactions but a transaction can belong to only one user. For more context, I am using different queries to get data from database and to authenticate the user. One such example is getPastTransactio function in MyJDBC file where i am using the user id to get access to their saved transactions in data base and populate an arraylist with the histoty of transactions that contains tansaction type, transaction amount and transaction date.   
Link:
https://github.com/hafsajabeen30/bankapp/blob/main/src/db_objs/MyJDBC.java


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |

