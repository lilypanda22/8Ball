import java.util.ArrayList;
import java.util.Scanner;

// This is 8Ball on Java, my very first individual project. It seems very simple,
// but I definitely had to think a lot on how to tie math.random into 20 different answer choices.
// Now I understand more on how to utilize math.random.
public class Main {
    public static final ArrayList<String> results = new ArrayList<>();

    public static void main(String[] args) {
        makeArray();
        getQuestion();

        boolean play = true;
        while (play) {
            result();
            getQuestion();
        }
    }

    public static void makeArray() {
        results.add("It is certain.\n");
        results.add("It is decidedly so.\n");
        results.add("Without a doubt.\n");
        results.add("Yes definitely.\n");
        results.add("You may rely on it.\n");
        results.add("As I see it, yes.\n");
        results.add("Most likely.\n");
        results.add("Outlook good.\n");
        results.add("Yes.\n");
        results.add("Signs point to yes.\n");
        results.add("Reply hazy, try again.\n");
        results.add("Ask again later.\n");
        results.add("Better not tell you now.\n");
        results.add("Cannot predict now.\n");
        results.add("Concentrate and ask again.\n");
        results.add("Don't count on it.\n");
        results.add("My reply is no.\n");
        results.add("My sources say no.\n");
        results.add("Outlook not so good.\n");
        results.add("Very doubtful.\n");
    }

    public static void getQuestion() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your question?");
        keyboard.nextLine();
    }

    public static void result() {
        double number = Math.random() * 20;
        System.out.println(results.get((int)number));
    }
}