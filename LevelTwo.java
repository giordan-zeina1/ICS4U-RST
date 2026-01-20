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
            new String[]{"1. A1 Pro League 🇧🇪",
                "2. Eredivisie 🇳🇱",
                "3. Chinese Super League 🇨🇳",
                "4. A-League 🇦🇺"}, 1),
            new Question("Which African footballer has the most Premier league"
                + " goals in history?",
            new String[]{"1. Mohamed Salah 🇪🇬👑",
                "2. Sadio Mané 🇸🇳",
                "3. Samuel Eto’o 🇨🇲",
                "4. Didier Drogba 🇨🇮"}, 1),
            new Question("Which footballer famously won the Ballon D’or 3"
                + " times and retired at age 28?",
            new String[]{"1. Ronaldo Nazario 🇧🇷",
                "2. Marco Van Basten 🇳🇱",
                "3. Eric Cantona 🇫🇷",
                "4. Michel Platini 🇫🇷"}, 2),
            new Question("Who scored the first goal in the 2019 Champions"
            + " League final to put Liverpool 1-0 up over Tottenham?",
                new String[]{"1. Divock Origi 🇧🇪",
                "2. Sadio Mané 🇸🇳",
                "3. Georginio Wijnaldum 🇳🇱",
                "4. Mohamed Salah 🇪🇬👑"}, 4),
            new Question("Who is the only player in history to win the"
                + " Super Ballon D’or, awarded in 1989?",
                new String[]{"1. Michel Platini 🇫🇷",
                "2. Johan Cruyff 🇳🇱",
                "3. Alfredo Di Stéfano 🇺🇾",
                "4. Diego Maradona 🇦🇷"}, 3)
        );
    }
}
