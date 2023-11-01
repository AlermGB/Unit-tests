package ht4.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        String id = "1";
        Book book = new Book(id, "Book1", "Author1");
        when(bookRepository.findById(id)).thenReturn(book);
        Book result = bookService.findBookById(id);
        assertEquals(book, result);
        verify(bookRepository, times(1)).findById(id);
    }

    @Test
    public void testFindAllBook() {
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> books = Arrays.asList(book1, book2);
        when(bookRepository.findAll()).thenReturn(books);
        List<Book> result = bookService.findAllBooks();
        assertEquals(books, result);
        verify(bookRepository, times(1)).findAll();
    }
}