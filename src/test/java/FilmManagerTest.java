import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void test() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film 10");
        String[] expected = {"Film 10",};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
