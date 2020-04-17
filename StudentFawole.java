/*
 Static Vs. Instance

For this exercise, you will create a Student class to hold student data. 
In previous exercises, we had a requirement that you name your class Main. In this exercise, you must name your class Student.

Your Student class should include the following information: first name, last name, grade level, GPA, and a student id. 
Grade level is an integer value ranging from 0 to 12, with 0 representing kindergarten. GPA is a decimal value ranging from 0 to 4.5. 
Student id is an integer value. The first student id is 1, the second student id is 2, the next is 3, and so on. 
When a new Student is created, your code should automatically initialize student id to the next integer value. 
For example, if the last created Student's student id is 17, the next student id generated should be 18.

Your student class should include the following methods:

Student() - Constructs a new student with first name and last name set to "None", grade level set to 0 and GPA set to 0.0. 
  The student id should automatically be set to the next integer.
  Student(String firstName, String lastName, int gradeLevel, double gpa) -  Constructs a new student with variables initialized to the values specified. 
  The grade level should only be allowed to range between 0 and 12 inclusive, 0 represents kindergarten. Otherwise, set the grade level to 0.
  The GPA should only be allowed to range from 0.0 to 4.5, inclusive. Otherwise, set the GPA to 0.0. 
  The student id should automatically be set to the next integer.

String toString() -  Returns the student information as a String in the following format (notice line breaks after the first name and GPA):

Ike, Scott
GPA: 4.0
Grade Level: 12 id # 4

Sample Run

None, None
GPA: 0.0
Grade Level: 0 id # 1
None, None
GPA: 0.0
Grade Level: 0 id # 2
None, None
GPA: 0.0
Grade Level: 0 id # 3
*/



//Your Class starts here
public class StudentFawole{
   //making the variables
   String firstName;
   String lastName;
   int gradeLevel;
   double gpa;
   static int id = 0;
   
   public StudentFawole() {
      firstName = "None";
      lastName = "None";
      gradeLevel = 0;
      gpa = 0.0;
      id++;
   }
   //making sure the varibales are in the correct parameters
   public StudentFawole(String name1, String name2, int gradeLvl, double grade) {
     
      firstName = name1;
      
      
      lastName = name2;
      
      //gpa between 0 and 4.5
      if(grade < 4.5 || grade > 0.0){
         gpa = grade;
      }
      else
      {
         gpa = 0.0;
      }
      
    //gradelevel between 0 and 12
      if(gradeLevel < 12 || gradeLevel > 0){
         gradeLevel = gradeLvl;
      }
      else
      {
         gradeLevel = 0;
      }
      
      
      toString();
   }
//printing the variables in the desired format
   public String toString(){
   
      return lastName + ", " + firstName + "\n GPA: " + gpa + "\n Grade Level: " + gradeLevel + "  id # " + id;
   }

}
