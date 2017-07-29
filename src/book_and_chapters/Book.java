package book_and_chapters;

import java.util.List;

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
 * */

public class Book {

    private String author;
    private String title;
    private int pages;
    private List<Chapter> chapters;

    public Book(String title, String author){

        this.title = title;
        this.author = author;

    }

    /**
     * Devuelve el numero total de paginas que tiene el libro.
     * */
    public int pages(){
        // Contar en numero de paginas total, a partir de la suma de pagines de cada uno de los capitulos.

        return 0;
    }

    public void addChapter(Chapter chapter){


        System.out.println("abans del add....");
        this.chapters.add(chapter);
        System.out.println("despres del add....");

        this.pages += chapter.getPages();

        System.out.println("Se ha añadido el capitulo: " + chapter.toString());
    }

    @Override
    public String toString() {

        String text = this.title + "\nby " + this.author + "\n";


        if (chapters == null) {

            text += "No hay capitulos\n";

        } else {

            int pageNum = 1;

            for (int i = 0; i < chapters.size(); i++) {

                text += (i+1) + " - " + chapters.get(i).toString() + "page " + pageNum + "\n";
                pageNum += chapters.get(i).getPages();
            }

        }

        text += "------------";

        return text;
    }
}




































