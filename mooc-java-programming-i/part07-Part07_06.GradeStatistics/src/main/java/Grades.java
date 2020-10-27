/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */

import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;
    
    public Grades() {
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        } else {
            System.out.println("Incompatible grade. Must be between 0 and 100.");
        }
    }
    
    public double gradeAvg() {
        int total = 0;
        
        for (int grade: this.grades) {
            total += grade;
        }
        
        double avg = total / this.grades.size();
        
        return avg;
    }
    
    public double passingAvg() {
        int total = 0;
        int numPass = 0;
        
        for (int grade: this.grades) {
            if (grade >= 50) {
                total += grade;
                numPass += 1;
            }
        }
        
        double avg = total / numPass;
        
        return avg;
    }
    
    public void printGrades() {
        for (int grade: this.grades) {
            System.out.println(grade);
        }
    }
}
