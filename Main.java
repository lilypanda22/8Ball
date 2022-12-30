import java.util.Scanner;

// This is 8Ball on Java, my very first individual project. It seems very simple,
// but I definitely had to think a lot on how to tie math.random into 20 different answer choices.
// Now I understand more on how to utilize math.random.
public class Main {
    public static void main(String[] args) {
        getQuestion();

        boolean play = true;
        while (play) {
            result();
            getQuestion();
        }
    }

    public static void getQuestion() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your question?");
        keyboard.nextLine();
    }

    public static void result() {
        double number = Math.random() * 20;
        if ((int)number == 0) {
            System.out.println("It is certain.\n");
        }
        else if ((int)number == 1) {
            System.out.println("It is decidedly so.\n");
        }
        else if ((int)number == 2) {
            System.out.println("Without a doubt.\n");
        }
        else if ((int)number == 3) {
            System.out.println("Yes definitely.\n");
        }
        else if ((int)number == 4) {
            System.out.println("You may rely on it.\n");
        }
        else if ((int)number == 5) {
            System.out.println("As I see it, yes.\n");
        }
        else if ((int)number == 6) {
            System.out.println("Most likely.\n");
        }
        else if ((int)number == 7) {
            System.out.println("Outlook good.\n");
        }
        else if ((int)number == 8) {
            System.out.println("Yes.\n");
        }
        else if ((int)number == 9) {
            System.out.println("Signs point to yes.\n");
        }
        else if ((int)number == 10) {
            System.out.println("Reply hazy, try again.\n");
        }
        else if ((int)number == 11) {
            System.out.println("Ask again later.\n");
        }
        else if ((int)number == 12) {
            System.out.println("Better not tell you now.\n");
        }
        else if ((int)number == 13) {
            System.out.println("Cannot predict now.\n");
        }
        else if ((int)number == 14) {
            System.out.println("Concentrate and ask again.\n");
        }
        else if ((int)number == 15) {
            System.out.println("Don't count on it.\n");
        }
        else if ((int)number == 16) {
            System.out.println("My reply is no.\n");
        }
        else if ((int)number == 17) {
            System.out.println("My sources say no.\n");
        }
        else if ((int)number == 18) {
            System.out.println("Outlook not so good.\n");
        }
        else if ((int)number == 19) {
            System.out.println("Very doubtful.\n");
        }
        else System.out.println((int)number + "\n");
    }
}