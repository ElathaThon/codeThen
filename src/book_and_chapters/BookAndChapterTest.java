package book_and_chapters;

/**
 * Created by elatha on 29/7/17.
 */
public class BookAndChapterTest {

    public static void main(String[] args) {

        Book book1 = new Book("Llibre1", "Autor1");
        Book book2 = new Book("Llibre2", "Autor2");

        Chapter chapter1 = new Chapter("Capitulo 1", 25);
        System.out.println(chapter1.toString());

        Chapter chapter2 = new Chapter("Capitulo 2", 20);
        System.out.println(chapter2.toString());

        Chapter chapter3 = new Chapter("Capitulo 3", 10);
        System.out.println(chapter3.toString());

        Chapter chapter4 = new Chapter("Capitulo 4", 15);
        System.out.println(chapter4.toString());

        Chapter chapter5 = new Chapter("Capitulo 5", 5);
        System.out.println(chapter5.toString());

        book1.addChapter(chapter1);
        book1.addChapter(chapter2);
        book1.addChapter(chapter3);

        book2.addChapter(chapter1);
        book2.addChapter(chapter4);

        System.out.println(book1.toString());

        System.out.println(book2.toString());

    }


}
