package by.itclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookFactory {
    private static final String REGEX = "\\{(\\w+)=(\\w+);(\\w+)=(\\w+);(\\w+)=(\\w+)\\}";

    public static Book getInstance(String bookStr) {
        //Book{title=Book1;author=Author1;pages=18}
        Book book = null;

        Matcher matcher = Pattern.compile(REGEX).matcher(bookStr);
        if (matcher.matches()) {
            book = new Book();
            for (int i = 1; i < 6; i += 2) {
                String fieldName = matcher.group(i);
                String fieldValue = matcher.group(i + 1);
                switch (fieldName) {
                    case "title":
                        book.setTitle(fieldValue);
                        break;
                    case "author":
                        book.setAuthor(fieldValue);
                        break;
                    case "pages":
                        book.setPages(Integer.parseInt(fieldValue));
                        break;
                }
            }
        }
        return book;
    }
}
