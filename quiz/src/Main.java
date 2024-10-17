
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question("What is the smallest prime number?",
                new String[]{"0", "1", "2", "3"}, 2));
        quiz.addQuestion(new Question("Who wrote the play 'Romeo and Juliet'?",
                new String[]{"Charles Dickens", "Mark Twain", "William Shakespeare", "J.K. Rowling"}, 2));
        quiz.addQuestion(new Question("What is the chemical symbol for gold?",
                new String[]{"Au", "Ag", "Pb", "Fe"}, 0));
        quiz.addQuestion(new Question("Which planet is known for its rings?",
                new String[]{"Earth", "Mars", "Saturn", "Jupiter"}, 2));
        quiz.addQuestion(new Question("What is the largest mammal in the world?",
                new String[]{"African Elephant", "Blue Whale", "Giraffe", "Great White Shark"}, 1));
        quiz.addQuestion(new Question("Who painted the Mona Lisa?",
                new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"}, 2));
        quiz.addQuestion(new Question("What is the boiling point of water at sea level in Celsius?",
                new String[]{"0°C", "50°C", "100°C", "150°C"}, 2));
        quiz.addQuestion(new Question("Which gas do plants absorb from the atmosphere?",
                new String[]{"Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"}, 2));
        quiz.addQuestion(new Question("What is the capital city of Australia?",
                new String[]{"Sydney", "Canberra", "Melbourne", "Brisbane"}, 1));
        quiz.addQuestion(new Question("What is the largest organ in the human body?",
                new String[]{"Heart", "Brain", "Skin", "Liver"}, 2));

        quiz.startQuiz();
    }
}
