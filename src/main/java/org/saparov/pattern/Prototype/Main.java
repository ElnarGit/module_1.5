package org.saparov.pattern.Prototype;

public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student("Elnar",1);
        
        Student cloneStudent1 = (Student) originalStudent.clone();
        Student cloneStudent2 = (Student) originalStudent.clone();
        
        cloneStudent1.setName("Bob");
        cloneStudent1.setCourse(3);
    
        System.out.println("Original Student " + originalStudent);
        System.out.println("Clone Student1 " + cloneStudent1);
        System.out.println("Clone Student2 " + cloneStudent2);
    }
}
