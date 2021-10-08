public class Book {

        private String author;
        private String title;

        //dodawanie konstuktora z dwoma argumentami
    public Book(String author, String title) {
            this.author = author;
            this.title = title;
        }

        //tworzenie metody of, przyjmujacej stringi i zwracajacej Book
        public static Book of(String author, String title){
            //tworzenie obiektu Book wewnatrz metody of
            Book book = new Book(author, title);
            return book;
        }

    public static void main(String[] args) {
   Book dziecieca = Book.of("Jan Brzechwa", "Sto Bajek");
   Book dorosla = Book.of("Jan Brzechwa", "Opowiadania drastyczne");
        System.out.println(dziecieca.author);

    }
    }
