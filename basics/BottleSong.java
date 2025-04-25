public class BottleSong {
    public static void main(String[] args) {
        int bottles = 10;
        String word = "bottles";

        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottles";
            }

            System.out.println(bottlesNum + "green" + word + ", hanging on the wall");
        }
    }
}
