

class BookClass {
    String title;
    String author;

    public static void main(String[] args) {
        BookClass[] myBooks = new BookClass[3];
        int x = 0;

        myBooks[0]= new BookClass();
        myBooks[1] = new BookClass();
        myBooks[2] = new BookClass();

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The java CookBook";
        myBooks[0].author = "bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Dom";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}