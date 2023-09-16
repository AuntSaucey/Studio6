package org.example;
import java.util.HashMap;
public class MultipleChoice extends Question{
    private String questionType;

    public MultipleChoice(String initialStatement, HashMap<String, String> answers, String correctAnswer, String questionType) {
        super(initialStatement, answers, correctAnswer);
        this.questionType = questionType;

    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return this.questionType + ": " + super.toString();
    }
}
