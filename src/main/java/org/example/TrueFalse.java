package org.example;
import java.util.HashMap;
public class TrueFalse extends Question{
    private String questionType;

    public TrueFalse(String initialStatement,  HashMap<String, String> answers,String correctAnswer, String questionType){
        super(initialStatement, answers, correctAnswer);
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return this.questionType + ": " + super.toString();
    }
}
