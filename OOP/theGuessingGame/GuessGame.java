public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRght = false;
        boolean p2isRght = false;
        boolean p3isRght = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            p1isRght = guessp1 == targetNumber;
            p2isRght = guessp2 == targetNumber;
            p3isRght = guessp3 == targetNumber;


        if ( p1isRght || p2isRght || p3isRght) {
            System.out.println("We have a winner Ladies and Gentlemen");

            System.out.println("Player one got it right? hmmm... " + p1isRght );
            System.out.println("Player two got it right? hmmm... " + p2isRght);
            System.out.println("Player three got it right? hmmm.. " + p3isRght);

            System.out.println("We have a winner");
            break;

        } else {
            System.out.println("Players will have to try again,");
        }
    }
    }
}