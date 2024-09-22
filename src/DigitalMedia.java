public class DigitalMedia extends LibraryItem{

    private String fileFormat;

    public DigitalMedia(String title, String author, int publicationYear, String fileFormat) {
        super(title, author, publicationYear);
        this.fileFormat = fileFormat;
    }

    public void play(){
        System.out.println("Playing the digital media: " + title);
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing the digital media: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the digital media: " + title);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Format: " + fileFormat);
    }
}
