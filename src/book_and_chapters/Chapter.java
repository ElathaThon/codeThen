package book_and_chapters;

/**
 * 3- Cread las clases Book y Chapter. Book tendrá author (o si queréis complicarlo, authors), title y chapters (una List de chapters).
 * Chapter tendrá title y page. Book tendrá un método que devolverá el número total de páginas del libro,
 * y en su método toString retornará los datos del libro junto a los títulos de capítulos junto con su número de páginas,
 *
 * por ejemplo así:
 * Head First Java
 * by Kathy Sierra
 * 1 - Breaking the Surface: page 1
 * 2 - A Trip to Objectville: page 27
 * 3 - Know Your Variables: page 49
 * etc.
 *
 * -chapter
 * -element
 * -elementList
 *
 * */

public class Chapter {

    private String title;
    private int pages;


    public Chapter(String title, int pages){

        this.title = title;
        this.pages = pages;

    }

    public int getPages() {
        return pages;
    }


    @Override
    public String toString() {
        return this.title;
    }
}
