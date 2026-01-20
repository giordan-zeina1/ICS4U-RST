/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2026-1-13
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizGame {
    public static void main(final String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("--- Test Your Ball Knowledge ---");
        System.out.println("Select Level: 1 (Easy), 2 (Medium), 3 (Hard)");
        
        int difficultyLevel = inputScanner.nextInt();

        // Holds the current level
        final LevelOne one = new LevelOne();
        final LevelTwo two = new LevelTwo();
        final LevelThree three = new LevelThree();

        List<Question> currentQuestions;

        // Chooses which questions to show
        if (difficultyLevel == 1) {
            currentQuestions = LevelOne.getQuestions();
        } else if (difficultyLevel == 2) {
            currentQuestions = LevelTwo.getQuestions();
        } else {
            currentQuestions = LevelThree.getQuestions();
        }

        int currentScore = 0;

        // Goes through the questions
        for (int questionNumber = 0; questionNumber < currentQuestions.size();
                questionNumber++) {
            
            Question currentQuestion = currentQuestions.get(questionNumber);
            
            // Displays questions
            System.out.println("\nQuestion " + (questionNumber + 1) + ": "
                + currentQuestion.getPrompt());
            
            // Display options
            for (String option : currentQuestion.getOptions()) {
                System.out.println(option);
            }

            System.out.print("Enter choice (1-4): ");
            int userAnswer = inputScanner.nextInt();

            // Checks answers
            if (currentQuestion.getCorrectOption() == userAnswer) {
                System.out.println("Correct! ✅");
                currentScore++;
            } else {
                System.out.println("Wrong! ❌");
            }
        }

        System.out.println("\n--- Your Results ---");
        System.out.println("Final Score: " + currentScore + " out of " + currentQuestions.size());
        
        inputScanner.close();
    }
}
