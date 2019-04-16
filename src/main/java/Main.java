import edu.missouriwestern.spalmeter.csc254.publications.Book;
import edu.missouriwestern.spalmeter.csc254.publications.Person;
import edu.missouriwestern.spalmeter.csc254.publications.Publication;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Publication sheet = new Publication("Inheritance", LocalDate.now());
        Publication packages = new Publication("Packages", 2019,4,12);
        LocalDate present = LocalDate.now();
        LocalDate missedClass = LocalDate.of(2019,4,10);

        Person p = new Person("John", "Q.", "Public");
        System.out.println(p);
        System.out.println(p.bibliographic());

        Book book;
        Person author = new Person("Spencer", "A.", "Palmeter");
        book = new Book("Charlotte's Webb", LocalDate.now(), author, 134);

        System.out.println(present);
        System.out.println(missedClass);
        System.out.println("done");
    }
}
