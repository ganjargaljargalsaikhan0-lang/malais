package week05.session26.backend;

/**
 * ДААЛГАВАР:
 * Movie class үүсгэж, киног мэдээлэл хадгалах програм бич.
 *
 * ШААРДЛАГА:
 * 1. Movie class-д дараах fields нэмэх:
 *    - title (String) - Нэр
 *    - director (String) - Найруулагч
 *    - duration (int) - Үргэлжлэх хугацаа (минут)
 *    - rating (double) - Үнэлгээ (0-10)
 *
 * 2. display() method нэмэх - мэдээлэл хэвлэх
 *
 * 3. 2 Movie object үүсгэж мэдээллийг хэвлэх
 *
 * ЖИШЭЭ ГАРАЛТ:
 * === Кино 1 ===
 * Нэр: The Matrix
 * Найруулагч: Wachowski
 * Үргэлжлэх хугацаа: 136 минут
 * Үнэлгээ: 8.7
 */

class Movie {
    // Fields энд бичнэ үү
    String title;
    String director;
    int duration;
    double rating;

    // display() method энд бичнэ үү
    void displayInfo(){
        System.out.println("ner; " + title);
        System.out.println("nairuulagc: " + director);
        System.out.println("urgejleh hugtsaa: " + duration);
        System.out.println("unelgee: " + rating);
    }

}

public class Ganjargal {
    public static void main(String[] args) {
        // 2 Movie object үүсгэж, мэдээлэл хэвлэх
        Movie matrix = new Movie();  
        matrix.title="the matrix";
        matrix.director = "Wachowski";
        matrix.duration = 136;
        matrix.rating = 8.7;

        matrix.displayInfo();


        Movie kino = new Movie();
        kino.title = "kino ner";
        kino.duration = 90;
        kino.rating = 8.7;

        kino.displayInfo();
    }
}