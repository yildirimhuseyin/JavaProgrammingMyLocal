package day36_Inharitance.incpasulation;

import java.util.function.DoubleUnaryOperator;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public static boolean isStudent = true;
    public static boolean isHuman = true;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        this.name = name;
        setAge(age);
        setGender(gender);
        setGrade(grade);
        this.schoolName = schoolName;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age<5 || age>90){

            return;
        } // return statement can be use in any methods and it is used to exit the method
        this.age = age;
    }

    public char getGender(){
        return gender;
    }

    public char getGrade(){
        return grade;
    }

    public void setGender(char gender){
        if (!(gender == 'M' || gender == 'F'))
            return;
        this.gender = gender;
    }

    public void setGrade(char grade){
        if (!(grade=='A'|| grade == 'B' || grade == 'C' || grade == 'D'|| grade == 'F' ))
            return; // if the grade is ınvalid exit the method
        this.grade = grade;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying");
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

/*
warmup tasks:
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()

 */