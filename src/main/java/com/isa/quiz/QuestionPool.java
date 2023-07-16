package com.isa.quiz;

import java.util.Random;

public class QuestionPool {
    public static void selectQuestion(int questionNumber, int id) {
        switch (questionNumber) {
            case 1 -> Question.question1(id);
            case 2 -> Question.question2(id);
            case 3 -> Question.question3(id);
            case 4 -> Question.question4(id);
            case 5 -> Question.question5(id);
        }
    }

    public static void printQuestion() {
        int[] tabNumberQuestion = questionNumberGenerate();
        selectQuestion(tabNumberQuestion[0], 1);
        selectQuestion(tabNumberQuestion[1], 2);
        selectQuestion(tabNumberQuestion[2], 3);
    }

    public static int[] questionNumberGenerate() {
        Random random = new Random();
        int[] questionNumb = new int[3];
        questionNumb[0] = random.nextInt(5) + 1;

        for (int i = 1; i < questionNumb.length; i++) {
            questionNumb[i] = random.nextInt(5) + 1;
            if (questionNumb[i - 1] == questionNumb[i] || questionNumb[0] == questionNumb[i]) {
                i--;
            }
        }
        return questionNumb;
    }
}
