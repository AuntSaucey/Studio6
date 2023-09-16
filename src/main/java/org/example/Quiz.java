package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {

    private String studentName;
    private ArrayList<Question> questions;
    private double numCorrectAns;
    private double totalNumQuestions;


    public Quiz(String studentName, ArrayList<Question> questions ){

        //TODO: make that the passes an arrayList with question
        this.studentName = studentName;
        this.questions = questions;
        if(questions.size() > 0){
            this.totalNumQuestions = questions.size();
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public double getNumCorrectAns() {
        return numCorrectAns;
    }

    public void setNumCorrectAns(double numCorrectAns) {
        this.numCorrectAns = numCorrectAns;
    }

    public double getTotalNumQuestions() {
        return totalNumQuestions;
    }

    public void setTotalNumQuestions(double totalNumQuestions) {
        this.totalNumQuestions = totalNumQuestions;
    }

//    TODO: Create a special toString()

    public double gradeQuiz(){
        Scanner getAnsFromUser = new Scanner(System.in);
        ArrayList<String> userAns = new ArrayList<>();
        for(int i =0; i < questions.size();i++){
            System.out.println(questions.get(i).toString());
            userAns.add(getAnsFromUser.next());
        }

        for (int i =0; i < questions.size();i++){
            if(userAns.get(i).equals(questions.get(i).getCorrectAnswer())){
                this.numCorrectAns ++;
            }
            // write an if statement to determine if the answer given by the user is the same as
//        the correct answer and if so increase numofCorrect answers by one
        }


//        divides the number of correct answers by total number of questions
        double quizGrade = numCorrectAns / questions.size();
        return quizGrade;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "studentName='" + studentName + '\'' +
                ", numCorrectAns=" + numCorrectAns +
                '}';
    }
}