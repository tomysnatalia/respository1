import java.util.*;
import java.lang.*;
import java.io.*;

class Student {
    private String firstName;
    private String lastName;
    private String pesel;


    public Student (String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public String toString() {
        return firstName + " " + lastName + " pesel: "+ pesel;
    }

    public boolean equals(Student e){
        return (this.firstName == e.firstName) && (this.lastName == e.lastName) && (this.pesel == e.pesel);
    }
    public int hashCode(){
        return Integer.parseInt(pesel.substring(0, 5));
    }
}


class StudentsResults {
    private Double englishAssesment;
    private Double mathematicAssesment;
    private Double sportAssesment;


    public StudentsResults (Double englishAssesment, Double mathematicAssesment , Double sportAssesment) {
        this.englishAssesment =  englishAssesment;
        this.mathematicAssesment = mathematicAssesment;
        this.sportAssesment = sportAssesment;
    }

    public String toString() {
        return "English: " + englishAssesment + " , " + " Mathematic: "+ mathematicAssesment + " , " + "Sport: " + sportAssesment;
    }
}

class StudentsList {

    public static void main (String[] args) {

        Student person1 = new Student("Magdalena", "Adamska", "89031411533");
        Student person2 = new Student("Karolina", "Doktorczyk", "89040511544");
        Student person3 = new Student("Damian", "Dulemba", "89061123566");


        StudentsResults params1 = new StudentsResults(5.0,3.0,5.0);
        StudentsResults params2 = new StudentsResults(3.5,3.0,4.5);
        StudentsResults params3 = new StudentsResults(5.0,5.0,5.0);


        HashMap<Student, StudentsResults> yearResults = new HashMap<Student, StudentsResults>();

        yearResults.put(person1, params1);
        yearResults.put(person2, params2);
        yearResults.put(person3, params3);

        for(Map.Entry<Student,StudentsResults > entry : yearResults.entrySet()) {
            System.out.println(entry.getKey() + " - " + "Student year-round results:" + " " + " " + entry.getValue());
        }
    }
}