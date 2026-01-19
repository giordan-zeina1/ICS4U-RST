/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2026-1-13
 */

import java.util.Arrays;
import java.util.List;

public class LevelOne {
    public static List<QuizGame> getQuestions() {
        return Arrays.asList(
            new Question("What Club Does Neymar Jr 🇧🇷 Play for?",
                new String[]{"A. Al Hilal 🇸🇦",
                "B. Santos F.C. 🇧🇷",
                "C. PSG 🇫🇷",
                "D. Inter Miami 🇺🇸"}, 2),
            new Question("In what year did Italy 🇮🇹 last win the Fifa World",
                "Cup 🏆?",
                new String[]{"A. 2006",
                "B. 2002",
                "C. 1998",
                "D. 1990"}, 1),
            new Question("Which Footballer famously scored the “Hand Of God”?",
                new String[]{"A. Juan Román Riquelme 🇦🇷",
                "B. Bobby Charlton 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "C. Diego Maradona 🇦🇷",
                "D. Pelé 🇧🇷"}, 3),
            new Question("Which club miraculously came back from a 3-0 deficit",
                "in the 2005 Champions League Final known as the",
                "Miracle of Istanbul?",
                new String[]{"A. Manchester United 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "B. Liverpool 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "C. AC Milan 🇮🇹",
                "D. Real Madrid 🇪🇸"}, 2),
            new Question("Which Footballer scored the World Cup winning goal",
                "in 2014, against Argentina in the 113th minute?",
                new String[]{"A. Thomas Müller 🇩🇪",
                "B. Toni Kroos 🇩🇪",
                "C. Miroslav Klose 🇩🇪",
                "D. Mario Götze 🇩🇪"}, 4)
        );
    }
}
