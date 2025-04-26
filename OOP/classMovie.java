class Movie {
    String title;
    String genre;
    double rating;

    void playIt() {
        System.out.println("Playing the Movie" + title + " which has  a rating of " + rating);
    }
}
public class classMovie {
    public static void main(String[] args) {
        // when creating an object in java we have to Declare the varibale's type which is the class name
        // and also initialiazaiton as shown below
        Movie one = new Movie();
        one.title = "Gone with the wind";
        one.genre = "Horror";
        one.rating = 7.5;
        one.playIt();
        }
    }
