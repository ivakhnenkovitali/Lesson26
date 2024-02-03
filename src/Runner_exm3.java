import by.itclass.Book;
import by.itclass.BookFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner_exm3 {
    public static void main(String[] args) {
        final String FILE_NAME = "src/itclass_exm3.txt";

        List<Book> bookList = readFile(FILE_NAME);

        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    private static List<Book> readFile(String filename) {
        List<Book> bookList = null;

        try (Scanner sc = new Scanner(new FileReader(filename))) {
            bookList = new ArrayList<>();
            while (sc.hasNextLine()) {
                String bookStr = sc.nextLine();
                //Book{title=Book1;author=Author1;pages=18}
                Book book = BookFactory.getInstance(bookStr);
                bookList.add(book);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bookList;
    }


}
