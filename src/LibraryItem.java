public abstract class LibraryItem implements Borrowable{
protected String title;
protected String author;
protected int publicationYear;

public LibraryItem (String title, String author, int publicationYear){
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
}
public void displayInfo(){
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Publication Year: " + publicationYear);
    }

    @Override
    public void borrow() {

    }

    @Override
    public void returnItem() {

    }
}
