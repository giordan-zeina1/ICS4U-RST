/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2026-1-13
 */

import java.util.Arrays;
import java.util.List;

public class LevelOne {
    public static List<Question> getQuestions() {
        return Arrays.asList(
            new Question("What Club Does Neymar Jr 🇧🇷 Play for?",
                new String[]{"1. Al Hilal 🇸🇦",
                "2. Santos F.C. 🇧🇷",
                "3. PSG 🇫🇷",
                "4. Inter Miami 🇺🇸"}, 2),
            new Question("In what year did Italy 🇮🇹 last win the Fifa World"
                + " Cup 🏆?",
                new String[]{"1. 2006",
                "2. 2002",
                "3. 1998",
                "4. 1990"}, 1),
            new Question("Which Footballer famously scored the “Hand Of God”?",
                new String[]{"1. Juan Román Riquelme 🇦🇷",
                "2. Bobby Charlton 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "3. Diego Maradona 🇦🇷",
                "4. Pelé 🇧🇷"}, 3),
            new Question("Which club miraculously came back from a 3-0 deficit"
                + " in the 2005 Champions League Final known as the"
                + " Miracle of Istanbul?",
                new String[]{"1. Manchester United 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "2. Liverpool 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "3. AC Milan 🇮🇹",
                "4. Real Madrid 🇪🇸"}, 2),
            new Question("Which Footballer scored the World Cup winning goal"
                + " in 2014, against Argentina in the 113th minute?",
                new String[]{"1. Thomas Müller 🇩🇪",
                "2. Toni Kroos 🇩🇪",
                "3. Miroslav Klose 🇩🇪",
                "4. Mario Götze 🇩🇪"}, 4)
        );
    }
}
