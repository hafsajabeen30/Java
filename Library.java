public class Library {
    String name;
    public Library(String name){
        this.name = name;
    }
    public void printLibName(){
        System.out.println("The library name is: " + this.name);
    }

    public static class Book{
        String title;
        String author;
        public Book (String title, String author){
            this.title = title;
            this.author = author;
        }
        public void printBookDetails(){
            System.out.println("The details of the book are:\nTitle: " + this.title + ", Author: " + this.author);
        }
    }

    public static void main(String[] args){
        Library myLibrary = new Library("Main Library");
        Library.Book book1 = new Library.Book("To Kill a Mockingbird", "Harper Lee");
        Library.Book book3 = new Library.Book("The Great Gatsby", "F. Scott Fitzgerald");
        myLibrary.printLibName();
        book1.printBookDetails();
        book3.printBookDetails();

    }
}
