public class Player {
    int number;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I guessed " + number);
    }

    public int getNumber() {
        return number;
    }

}