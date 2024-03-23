import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books = null;
    

    public Library(){
        books = new ArrayList<>();
    }

    public boolean addBook(Book newBook){
        Book book = getBook(newBook.getId());

        if (book == null ){
            books.add(newBook);

            return true;
        }

        return false;
    }

    public Book getBook (int andId) {
        for (Book book : books ) {
            if (book.getId() == andId)

            return book;
    }

        return null;
    }

public List<Book> getAllBooks(){
    return books;
    }
}
