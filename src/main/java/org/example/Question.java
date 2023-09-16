package org.example;
import java.util.HashMap;

public abstract class Question {

    private String initialStatement;
    private HashMap<String, String> answers;
    private String correctAnswer;


        public Question(String initialStatement, HashMap<String, String> answers, String correctAnswer) {
            this.initialStatement = initialStatement;
            this.answers = answers;
            this.correctAnswer = correctAnswer;
        }
        public String getCorrectAnswer() {
        return correctAnswer;
    }

        public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
        public String getInitialStatement() {
            return initialStatement;
        }

        public void setInitialStatement(String initialStatement) {
            this.initialStatement = initialStatement;
        }

        public HashMap<String, String> getAnswers() {
            return answers;
        }

        public void setAnswers(HashMap<String, String> answers) {
            this.answers = answers;
        }

        @Override
        public String toString() {

            return this.initialStatement + "\n" + this.answers;
        }
    }
