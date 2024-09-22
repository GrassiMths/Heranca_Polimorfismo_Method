import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<LibraryItem> libraryItems = new ArrayList<>();

        Book book1 = new Book("1984","George Orwell", 1949, "Dystopian");
        Magazine magazine1 = new Magazine("National Geographic", "Various", 2022, 8);
        DigitalMedia digitalMedia1 = new DigitalMedia("Inception", "Christopher Nolan", 2010, "MP4");

        libraryItems.add(book1);
        libraryItems.add(magazine1);
        libraryItems.add(digitalMedia1);

        for (LibraryItem item : libraryItems){
            item.displayInfo();
            item.borrow();
            if (item instanceof Book){
                ((Book) item).readSample();
            } else if (item instanceof Magazine) {
                ((Magazine) item).flipPages(); 
            } else if (item instanceof DigitalMedia) {
                ((DigitalMedia) item).play();
            }
            item.returnItem();
            System.out.println();
        }
        
    }
}
