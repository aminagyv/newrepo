public class Book {
    String title;
    String author;

    long isbn;

    public  Book(String title,String author, long isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    public void printBookDetails(){
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("isbn: "+isbn);
    }
//    String deyisikliketdim;
}
