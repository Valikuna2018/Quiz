import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private List<Question> questions = new ArrayList<>();
    private int userScore;

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void deleteQuestionByIndex(int index) {
        questions.remove(index);
    }

    public void startQuiz() {

        Scanner scanner = new Scanner(System.in);

        for (Question question : this.questions) {

            System.out.println(question.getText());

            for (int i = 0; i < question.getOptionsSize(); i++) {
                System.out.print(i + 1 + "." + question.getOptions()[i] + " ");
            }
            System.out.println();

            int currentAnswer;
            while(true) {

                System.out.println("enter your answer :");

                try {
                    currentAnswer = scanner.nextInt();

                    if (currentAnswer <= 0 || currentAnswer > question.getOptionsSize()) {
                        throw new InputMismatchException();
                    }
                    break;
                }
                catch (InputMismatchException e) {
                    System.out.println("your answer is not valid try again, enter answer from 1 to " + question.getOptionsSize() + ":");
                    scanner.next();
                }
            }

            if (question.isCorrectAnswer(currentAnswer))
                this.userScore++;
        }

        System.out.println("Your score is " + this.userScore + "/" + this.questions.size());
    }
}
