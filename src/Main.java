import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Library.printWelcomeMessage();
        library.printLibraryRules();

       Scanner scanner=new Scanner(System.in);
        System.out.println("fullName daxil et:");
        String fillName= scanner.next();

        System.out.println("age daxil et:");
        int age= scanner.nextInt();
        scanner.nextLine();

        System.out.println("MemberyId daxil et:");
        String memberyId= scanner.nextLine();

        System.out.println("title daxil et:");
        String title= scanner.nextLine();

        System.out.println("author daxil et:");
        String author= scanner.nextLine();

        System.out.println("isbn daxil et:");
        long isbn= scanner.nextLong();

        Member member=new Member(fillName,age,memberyId);
        member.borrowBook("riyaziyyat");

        Book book=new Book(title,author,isbn);
        book.printBookDetails();



    }

}

