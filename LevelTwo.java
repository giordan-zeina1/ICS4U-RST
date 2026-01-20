/*
 *
 * @author  Giordan Zeina
 * @version 1.0
 * @since   2026-1-13
 */

import java.util.Arrays;
import java.util.List;

public class LevelTwo {
    public static List<Question> getQuestions() {
        return Arrays.asList(
            new Question("What League is R.S.C. Anderlecht in?",
            new String[]{"A. A1 Pro League 🇧🇪",
                "B. Eredivisie 🇳🇱",
                "C. Chinese Super League 🇨🇳",
                "D. A-League 🇦🇺"}, 1),
            new Question("Which African footballer has the most Premier league"
                + " goals in history?",
            new String[]{"A. Mohamed Salah 🇪🇬👑",
                "B. Sadio Mané 🇸🇳",
                "C. Samuel Eto’o 🇨🇲",
                "D. Didier Drogba 🇨🇮"}, 1),
            new Question("Which footballer famously won the Ballon D’or 3"
                + " times and retired at age 28?",
            new String[]{"A. Ronaldo Nazario 🇧🇷",
                "B. Marco Van Basten 🇳🇱",
                "C. Eric Cantona 🇫🇷",
                "D. Michel Platini 🇫🇷"}, 2),
            new Question("Who scored the first goal in the 2019 Champions"
            + " League final to put Liverpool 1-0 up over Tottenham?",
                new String[]{"A. Divock Origi 🇧🇪",
                "B. Sadio Mané 🇸🇳",
                "C. Georginio Wijnaldum 🇳🇱",
                "D. Mohamed Salah 🇪🇬👑"}, 4),
            new Question("Who is the only player in history to win the"
                + " Super Ballon D’or, awarded in 1989?",
                new String[]{"A. Michel Platini 🇫🇷",
                "B. Johan Cruyff 🇳🇱",
                "C. Alfredo Di Stéfano 🇺🇾",
                "D. Diego Maradona 🇦🇷"}, 3)
        );
    }
}
