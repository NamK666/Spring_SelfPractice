package MVCPractice1;

import java.util.Scanner;

public class QuizView {
    public void displayQuestion(String question){
        System.out.println("질문: " + question);
    }
    public String getUserAnswer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("답변: ");
        String userAnswer = scanner.nextLine();
        scanner.close();
        return userAnswer;
    }

    public String displayResult(boolean isCorrect){
        if(isCorrect){
            return "정답입니다!";
        } else {
            return "오답입니다.";
        }
    }
}
