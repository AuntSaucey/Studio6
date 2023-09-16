package org.example;
import java.util.ArrayList;
import java.util.HashMap;

public class QuizRunner {

    public static void main(String[] arg){
        String question1 = "What color is the grass?";
        String question2 = "Which color is the grass?";
        String question3 = "The grass is green.";
        HashMap<String, String> answers = new HashMap<>();
        HashMap<String, String> answers2 = new HashMap<>();
        answers2.put("A", "True");
        answers2.put("B", "False");
        answers.put("A", "Green");
        answers.put("B", "Red");
        answers.put("C", "Yellow");
        String correctAnswer = "A";
        String correctAnswer2 = "A";
        String correctAnswer3= "A";
        MultipleChoice m1 = new MultipleChoice(question1, answers, correctAnswer, "Multiple Choice");
        ArrayList<Question> test = new ArrayList<>();
        test.add(m1);
        Checkbox c1 = new Checkbox(question2, answers, correctAnswer2, "Checkbox");
        test.add(c1);
        TrueFalse tf1 = new TrueFalse(question3, answers2, correctAnswer3, "True or False");
        test.add(tf1);



        Quiz myQuiz = new Quiz("CR", test);

        System.out.println(myQuiz.gradeQuiz());
        System.out.println(myQuiz);
    }
}
