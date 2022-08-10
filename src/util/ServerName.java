package util;


public class ServerName {
    String name1;
    String name2;
    String[] adjectives = {"fervent", "green", "zealous", "spicy", "fried", "baked", "fresh", "noisy", "aloof", "callous", "original"};
    String[] nouns = {"dog", "cat", "blouse", "garment", "clue", "marmoset", "simian", "kayak", "apple", "jackfruit", "atoll", "manor"};
public ServerName() {
    name1 = adjectives[(int) (Math.random() * adjectives.length)];
    name2 = nouns[(int) (Math.random() * nouns.length)];
}

    @Override
    public String toString() {
        return "Your server name is:\n" + name1 + "-" + name2;
    }

    public static void main(String[] args) {

    }
}
