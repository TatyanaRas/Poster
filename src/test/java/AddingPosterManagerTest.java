import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddingPosterManagerTest {
@BeforeEach


    @Test
    public void Poster() {

        AddingPosterManager manager = new AddingPosterManager();

            String[] expected = {};
            String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

   @Test
    public void addingPoster() {

       AddingPosterManager manager = new AddingPosterManager();

        manager.AddingPosterManager("Бладшот");



        String[] expected = { "Бладшот" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }
}
