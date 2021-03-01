###### CS-324-2: Introduction to the Design of Algorithms <br> Spring 2021 <br> Northeastern Illinois University <br> Homework #3 <br> Due Date: 02/03/21 <br> Divide and Conquer, Part II

**Getting Started**

**1.** Accept the assignment invitation on D2L.<br>
**2.** Clone the assignment to your computer.<br>
**3.** Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is
set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**4.** Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build
Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from:
is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.<br>
**5.** Project SDK and Gradle JVM should be set to the same Java version.<br>
**6.** Create the `main/java` directory in the `src` directory. This is where you will be creating your Java classes
for your assignment. Right click src and go to New > Directory and select main/java.<br>

**Submitting your assignment**

**1.** Once you have completed all the problems, commit your final code to GitHub. <br>
- Please also commit code after each step of each problem and remember to run the unit tests (where applicable) and
  code analyzers before you commit.

**2.** Direct Message Sebin Puthenthara Suresh on Slack and let him know that your code is ready to be graded -
he will coordinate with me.<br>

**Coding Rules**

**1.** Unless specified in the instructions, you may not use any String variables or any String methods.<br>
**2.** Unless specified in the instructions, you may not use any built-in Array methods.<br>
**3.** Unless specified in the instructions, you may not import anything from the Java API.<br>
**4.** Note that while having all the unit tests and pmd/checkstyle tests is the first step for your code to be
considered correct, this does not necessarily mean the algorithm is correct.<br>
**5.** Reminder: All code must be your own work.

**Running Tests and Code Analyzers**

**1.** To run the tests when indicated, click the green arrow to the left of each header to run the tests individually or
click the green arrow to the left of the class header to run all the tests. If they do not pass, your code is incorrect,
and you should continue to work on the problem.<br>
**2.** If the unit tests pass, you can run the code analyzers. On the right side, click Gradle, expand Tasks > other.
Double click the checkstyleMain task to run it. If any rules were violated, you will be shown your errors. You can click
the link provided then
choose your browser of choice at the top-right corner to view the error description or in the bottom left panel, click
the middle red exclamation point to view the error. Fix the issue and rerun the checkstyleMain, repeat if necessary.<br>
**3.** Once the checkstyleMain task has passed, double-click on the pmdMain task in the same panel. If a rule
violation was found, click the provided link, then choose your preferred browser in the top right to view the error
description. Fix the issue and rerun the pmdMain task, repeat if necessary.<br>
**4.** When the unit tests and code analyzers have passed, open GitHub Desktop. You will be able to see the files that
have been changed in the left panel. Enter a summary in the bottom left then click "Commit to main". Then click Push
Origin in the right panel at the top. <br>
**5.** If you go to your GitHub account and go to the Actions tab for this assignment repository, you can see the
Workflow running.

## **Problem 1**

**1.** In the main/java directory, create a class named `ModifiedQuickSort`.
- Create a static method named `quickSort` that takes a String array as a parameter.
- Implement the Quick Sort algorithm presented in the lecture to sort the list of Strings alphabetically from a-z,
  independent of case. However, instead of always using the low index for the pivot when partitioning, randomly
  choose an index between low-high (<em>inclusive</em>) to use as the pivot and swap it with the low value
  before partitioning.
- Hint: You may find the String `compareToIgnoreCase` method helpful. You are also allowed to use the `Random` class
  for generating random numbers. No other Java API classes are permitted.
- In a comment at the top of your file, explain the benefit of using a randomly chosen pivot that is swapped.
  with the low value.
- Uncomment the tests in the `ModifiedQuickSortTest` class in the `test/java` directory to test this method.
  Run the tests.
- Run the Code Analyzers.
- **Note**: To help you debug and understand your code, you can create a MyStringDemo class with the main method,
  but it is not required as part of your grade.
- Push your code to GitHub.
- FYI: While passing the tests is the necessary first step to correct code, it is not necessarily sufficient
  for correctness.

## **Problem 2**

**1.** In the main/java directory, create a file named `BigIntegerResearch.txt`.
- This requires some research!
  **2** Search for the Java API source code for the BigInteger class (hint: there's actually a way you can get to it
  from IntelliJ!).
  **3** Find the BigInteger `multiply` method - specifically, the multiply method that takes a BigInteger as a
  parameter. This method calls an overloaded version of `multiply`. What is the overloaded version signature? Put
  this answer in your text file (make sure to number this!).
  **4** What are the two thresholds used in this overloaded version? Put this answer in the text file.
  **5** Notice that when the xlen and ylen are less than one of the thresholds, the multiplyKaratsuba method is used.
  Go to the implementation of this method. Copy the comment above the implementation and the implementation of
  this method into the text file. Does this look familiar??!!
  **6** Based on reading the overloaded `multiply` method , answer the following True/False question in the text file.<br>
  True or False?
  For multiplying two large integers, the Karatsuba algorithm should always be used. Justify your answer
  based on this research and if False, explain what should be used instead.
- Push your code to GitHub.