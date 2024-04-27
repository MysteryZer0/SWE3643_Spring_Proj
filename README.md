SWE 3643 Software Testing QA project: Web calculator
===


Table of contents
---
* Team member
* Structure
* Environment
* Executing the Web Application
* Video

Team member
---

Junhyeok Lee

Structure
---
![Blank diagram](https://github.com/MysteryZer0/SWE3643_Spring_Proj/assets/159580266/99e54369-262f-4116-9ee0-d8fb7e5755b4)
**Overview:**

The project is organized into several packages and classes to manage its functionality effectively. These include:

1. **WebcalculatorApplication:**
   * **Functionality:** Initializes and runs the Spring Boot application.
   * **Key Interaction:** Coordinates the execution of the web server application
2. **WebCalculatorController:**
   * **Functionality:** Manages HTTP requests for the calculator functionality.
   * **Key Interaction:** Interacts with Models and Views to handle data and user interface elements. Utilizes the Calculator Engine for performing calculations.
3. **Calculator.html:**
   * **Functionality:** Provides the user interface for the calculator.
   * **Key Interaction:** Sends data to the controller for processing. Displays the result returned by the controller.
4. **JavaScript Functions:**
   * **Functionality:** Handles user interactions and updates the HTML page.
   * **Key Interaction:** Executes operations based on user input. Updates the displayed result dynamically.
5. **Browser:**
   * **Functionality:** Renders the HTML page and interacts with it.
   * **Key Interaction:** Displays the calculator interface to the user. Sends requests to the controller for calculation. Receives and displays the result.

Environment
---

To run the program, you must set up the following application:

1. Install the latest version of Java at: https://www.oracle.com/java/technologies/downloads/#java22
2. Install the latest version of IntelliJ at: https://www.jetbrains.com/idea/download/?section=windows
3. Download the file from the repository: https://github.com/MysteryZer0/SWE3643_Spring_Proj


Executing the Web Application
---

**Unit Testing**

For the user without the IDE

1. Open the terminal application
2. type in "cd" followed by the directory
   
   ex) For my case it is "C:\Users\jhlee\Desktop\webcalculator\webcalculator\src\test\java\com\Junhyeok\webcalculator"
4. Type in "javac WebcalculatorApplicationTests.java" to compile
5. Type in "javac WebcalculatorApplicationTests.java" to run<br>`



**WebcalculatorApplication.java**

<img width="1189" alt="test file" src="https://github.com/MysteryZer0/SWE3643_Spring_Proj/assets/159580266/29976585-544a-482f-ad15-7920659ad8fb"><br>`



**Executing End-To-End Testing**
For the user without the IDE

1. Open the terminal application
2. type in "cd" followed by the directory
   
   ex) For my case it is "C:\Users\jhlee\Desktop\webcalculator\webcalculator\src\main\java\com\Junhyeok\webcalculator"
4. Type in "javac WebcalculatorApplication.java" to compile
5. Type in "java WebcalculatorApplication.java" to run


**Unit Test**

***note** For some reason when I right-click and look for coverage statistics, I do not have the option to do so<br>`




Video 
---
Video Link: https://www.youtube.com/watch?v=vI7i_JkmlqM

