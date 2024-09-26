package anonime;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("title", "author", "isbn");
        System.out.println("b1 = " + b1);

        Book b2 = new Book("title2", "author2", "isbn2") {
            @Override
            public String toString() {
                sayHello();
                return "Book{" +
                        "title='" + this.getTitle() + '\'' +
                        ", isbn='" + this.getIsbn() + '\'' +
                        '}';
            }

            public void sayHello() {
                System.out.println("Hello");
            }

        };
        System.out.println("b1 = " + b2);

        Book b3 = new NoAuthorBook("title3", "author3", "isbn3");
        System.out.println("b3 = " + b3);
    }


    public static class NoAuthorBook extends Book {
        public NoAuthorBook(String title, String author, String isbn) {
            super(title, author, isbn);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + this.getTitle() + '\'' +
                    ", isbn='" + this.getIsbn() + '\'' +
                    '}';
        }
    }
}
