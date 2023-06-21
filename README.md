# CS601 Practice problems

I encourage students enrolled in cs601 to complete these simple practice problems before the beginning of the semester. 
In this set of practice problems, you will practice using the following:

- Java Basics: Classes&Objects, Methods, Conditionals, Iteration, Strings, Arrays, ArrayLists 
- Tools: IntelliJ, Github

:warning: **It is expected that you solve these problems *without* looking up solutions or partial solutions on the Internet.**

## Getting Started
- Install Java 17 JDK (https://www.oracle.com/java/technologies/downloads/#java17)
- Install IntelliJ IDE (https://www.jetbrains.com/idea/download/). Scroll down and download the Community edition.
- Create an account on Github. Please use your USF email for the Github account, and use a Github name that is similar to your USF account name / your actual name.
- Login to github.com, click in the top right corner and select Settings in the menu. Scroll down to Developer Settings, then select Personal Tokens, Tokens (classic), and Generate a New Token (classic). Select all scopes for simplicity.
- Copy the token that was generated. In IntelliJ, go to Preferences/Version Control/Github, and paste the token you just generated.
- Click on the following link to create your private repository for this exercise: 
The repository will be seeded with the starter code. 
- Go to the repository using the browser and click on the green button that says "Code"; you will see the URL of the repository -copy it, since you will need it for the next step.
- To clone a copy of the repository to your local machine, in IntelliJ select File->New->Project from Version Control, copy the URL of the repository from Github, and follow the instructions. Once IntelliJ successfully clones the repository to your local machine and opens the project, click on `Project` in the vertical bar on the left hand side, and then on the arrow next to the name of the project to see the starter code for the practice exercise. 
- Work on the problems by editing code in IntelliJ. Run the tests provided by the instructor (under /test).
- Commit and Push your code frequently as you work on the problems, and verify that your final solution is what you see on Github.  To commit and push your code, right click on the name of the project and select Git -> Commit Directory, select the files, add a comment, and finally, in the bottom right corner select Commit and Push.

## Problems
The starter code for the practice exercises is in the following two folders: 
- src/main/java/practiceArrraysStrings 
- src/main/java/practiceOOP

### practiceArraysStrings
This folder contains classes `ArrayHelper` and `StringHelper` where you need to fill in code in several simple array and string manupulation methods.
The comment above each method explains what the method is supposed to do.
You can test these classes by running JUnit tests provided in classes `ArrayHelperTest` and `StringHelperTest` located in the following folder: `src/test/java/practiceArrraysStrings` 

### practiceOOP
This folder contains classes `Student`, `University` and `Driver`. Fill in code in methods of classes `Student` and `University`.  The comment above each method explains what the method is supposed to do.
This folder also contains a csv file that contains information about several students. You can use it to test your code.
The instructor provided basic JUnit tests in `StudentTest` and `UniversityTest` classes in `src/test/java/practiceOOP` to test classes `Student` and `University`. Driver expects a command line argument: the path to the file with student info. You can specify it in Run->Edit Configurations ->Program arguments.

