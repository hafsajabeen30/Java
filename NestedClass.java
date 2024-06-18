public class NestedClass {
    public String name;
    private static String LibraryType = "Public library";
    public NestedClass(String name){
        this.name = name;
    }
    public void printLibName(){
        System.out.println("The library name is: " + this.name);
    }

    public class Book{
        String title;
        String author;
        public Book (String title, String author){
            this.title = title;
            this.author = author;
        }
        public void printBookDetails(){
            System.out.println(LibraryType);
            System.out.println(name);
            System.out.println("The details of the book are:\nTitle: " + this.title + ", Author: " + this.author);
        }
    }

    public static void main(String[] args){
        NestedClass myLibrary = new NestedClass("Main Library");
        NestedClass.Book book1 = myLibrary.new Book("To Kill a Mockingbird", "Harper Lee");
        NestedClass.Book book3 = myLibrary. new Book("The Great Gatsby", "F. Scott Fitzgerald");
        myLibrary.printLibName();
        book1.printBookDetails();
        book3.printBookDetails();

    }
}
