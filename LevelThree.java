/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2026-1-13
 */

import java.util.Arrays;
import java.util.List;

public class LevelThree {
    public static List<QuizGame> getQuestions() {
        return Arrays.asList(
            new Question("Who is the greatest Premier League footballer of",
                "all time?",
            new String[]{"A. Thierry Henry 🇫🇷",
                "B. Mohamed Salah 🇪🇬👑",
                "C. Sergio Kun Agüero 🇦🇷",
                "D. Wayne Rooney 🏴󠁧󠁢󠁥󠁮󠁧󠁿"}, 2),
            new Question("Which African footballer has the most Premier league",
                "goals in history?",
            new String[]{"A. Mohamed Salah 🇪🇬👑",
                "B. Sadio Mané 🇸🇳",
                "C. Samuel Eto’o 🇨🇲",
                "D. Didier Drogba 🇨🇮"}, 1),
            new Question("What Club Did Mohamed Salah score his Puskas award",
                "winning goal against?",
            new String[]{"A. Manchester United 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "B. Wolverhampton Wanderers 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "C. Chelsea F.C. 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "D. Everton F.C. 🏴󠁧󠁢󠁥󠁮󠁧󠁿"}, 4),
            new Question("At what club did Mohamed Salah start his career at?",
                new String[]{"A. FC Basel 🇨🇭",
                "B. Al Mokawloon FC 🇪🇬",
                "C. Al Ahly FC 🇪🇬",
                "D. ACF Fiorentina 🇮🇹"}, 2),
            new Question("Who is the oldest footballer to win the World Cup at",
                "the age of 40 in 1982?",
                new String[]{"A. Dino Zoff 🇮🇹",
                "B. Paulo Rossi 🇮🇹",
                "C. Franco Baresi 🇮🇹",
                "D. Daniele Massaro 🇮🇹"}, 1)
        );
    }
}
