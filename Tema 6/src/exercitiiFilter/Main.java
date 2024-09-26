package exercitiiFilter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);
        Predicate<Integer> evenPredicate = i -> {
            System.out.println("Salut i = " + i);
            return i % 2 == 0;
        };

        Stream<Integer> integerStream = integerList.stream()
                .filter(evenPredicate)
                .filter(i -> {
                    System.out.println("Salut from > 2 i = " + i);
                    return i > 2;
                });

        List<Integer> list = integerStream.toList();
        System.out.println(list);

        Book book = new Book("Author1", "Title1", 2020);
        Book book1 = new Book("Author2", "Title2", 2022);
        Book book2 = new Book("Author3", "Title3", 2023);
        Book book3 = new Book("Author4", "Title4", 2024);

        List<Book> books = List.of(book, book1, book2, book3);
        List<String> bookTitles = books.stream()
                .filter(b -> b.getYear() > 2022)
                .map(Book::getTitle)
                .toList();

        System.out.println(bookTitles);

    }

    static class Book {
        private String author;
        private String title;
        private int year;

        public Book(String author, String title, int year) {
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }
    }

}
