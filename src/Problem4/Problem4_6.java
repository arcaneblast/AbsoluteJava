/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.Scanner;

/**
 * This code is the solution of the problem4_6 of the book AbsoluteJava
 *
 * @author it-elias
 *
 * Problem: Write a grading program for a class with the following grading
 * policies: a. There are three quizzes, each graded on the basis of 10 points.
 * b. There is one midterm exam, graded on the basis of 100 points. c. There is
 * one final exam, graded on the basis of 100 points.
 *
 * The final exam counts for 40% of the grade. The midterm counts for 35% of the
 * grade. The three quizzes together count for a total of 25% of the grade. (Do
 * not forget to convert the quiz scores to percentages before they are averaged
 * in.)
 *
 * Any grade of 90 or more is an A, any grade of 80 or more (but less than 90)
 * is a B, any grade above 70 is a C, any grade above 60 is a D, and any grade
 * below 60 is an F. The program should read in the student's scores and output
 * the student's record, Which consists of three quiz scores and two exam
 * scores, as well as the student overall numeric score for the entrie, course
 * and final letter grade.
 *
 * Define and use a class for the student record. The class should have isntance
 * variables for the quizzes, midterm, final and overal numeric score is a
 * number score for the course. And the final letter grade. The overal numeric
 * score is a number of range 0 to 100 which represents the weighted average of
 * the student's work. The class should have methods to compute the overall
 * numeric grade and the final letter grade. These last methods should be void
 * mehtods that set the appropriate instance variables. Your class should hava
 * reasonable set of accessor and mutator methods, an equals method and a
 * tostring method, whether or not your program uses them. YOu may add other
 * methods if you wish.
 *
 * First I am going to add the class StudentRecord
 */
public class Problem4_6
{

    public static void main()
    {
        Scanner input = new Scanner(System.in);

        StudentRecord sr = new StudentRecord();
        System.out.println(sr.getTotal());

        System.out.println(sr.getLetterMark());

        System.out.println(sr);
    }
}
