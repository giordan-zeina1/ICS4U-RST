/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2026-1-13
 */

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String prompt;
    private String[] options;
    private int correctOption;

    public Question(final String newPrompt, final String[] newOptions, final int newCorrectOption) {
        this.prompt = newPrompt;
        this.options = newOptions;
        this.correctOption = newCorrectOption;
    }

    public String getPrompt() {
        return prompt;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}
