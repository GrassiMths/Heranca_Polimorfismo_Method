public class Magazine extends LibraryItem{

    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public void flipPages(){
        System.out.println("Flipping pages of the magazine: " + title);
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing the magazine: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the magazine: " + title);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}
