public class Book extends LibraryItem{

private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }
    public void readSample(){
        System.out.println("Reading sample from the book: " + title);
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing the book: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the book: " + title);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}

