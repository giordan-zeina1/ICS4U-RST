/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2026-1-13
 */

import java.util.Arrays;
import java.util.List;

public class LevelThree {
    public static List<Question> getQuestions() {
        return Arrays.asList(
            new Question("Who is the greatest Premier League footballer of"
                + " all time?",
            new String[]{"1. Thierry Henry 🇫🇷",
                "2. Mohamed Salah 🇪🇬👑",
                "3. Sergio Kun Agüero 🇦🇷",
                "4. Wayne Rooney 🏴󠁧󠁢󠁥󠁮󠁧󠁿"}, 2),
            new Question("Which African footballer has the most Premier league"
                + " goals in history?",
            new String[]{"1. Mohamed Salah 🇪🇬👑",
                "2. Sadio Mané 🇸🇳",
                "3. Samuel Eto’o 🇨🇲",
                "4. Didier Drogba 🇨🇮"}, 1),
            new Question("What Club Did Mohamed Salah score his Puskas award"
                + " winning goal against?",
            new String[]{"1. Manchester United 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "2. Wolverhampton Wanderers 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "3. Chelsea F.C. 🏴󠁧󠁢󠁥󠁮󠁧󠁿",
                "4. Everton F.C. 🏴󠁧󠁢󠁥󠁮󠁧󠁿"}, 4),
            new Question("At what club did Mohamed Salah start his career at?",
                new String[]{"1. FC Basel 🇨🇭",
                "2. Al Mokawloon FC 🇪🇬",
                "3. Al Ahly FC 🇪🇬",
                "4. ACF Fiorentina 🇮🇹"}, 2),
            new Question("Who is the oldest footballer to win the World Cup at"
                + " the age of 40 in 1982?",
                new String[]{"1. Dino Zoff 🇮🇹",
                "2. Paulo Rossi 🇮🇹",
                "3. Franco Baresi 🇮🇹",
                "4. Daniele Massaro 🇮🇹"}, 1)
        );
    }
}
