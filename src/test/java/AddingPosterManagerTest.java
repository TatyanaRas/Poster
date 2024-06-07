import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddingPosterManagerTest {
    @BeforeEach


    @Test
    public void Poster() {

        AddingPosterManager manager = new AddingPosterManager();//пустая афиша

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void addingPoster1() {//один постер добавился попорядку

        AddingPosterManager manager = new AddingPosterManager();

        manager.AddingPosterManager("Бладшот");


        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);//?


    }

    @Test
    public void addingPoster2() {//добавилось 5 постеров попорядку

        AddingPosterManager manager = new AddingPosterManager();

        manager.AddingPosterManager("Бладшот");
        manager.AddingPosterManager("Вперёд");
        manager.AddingPosterManager("Отель");
        manager.AddingPosterManager("Джентельмены");
        manager.AddingPosterManager("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель", "Джентельмены", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void addingPoster3() {//вывод в обратном порядке по умолчанию (5)

        AddingPosterManager manager = new AddingPosterManager();

        manager.AddingPosterManager("Бладшот");
        manager.AddingPosterManager("Вперёд");
        manager.AddingPosterManager("Отель");
        manager.AddingPosterManager("Джентельмены");
        manager.AddingPosterManager("Номер один");

        String[] expected = {"Номер один", "Джентельмены", "Отель", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }


    @Test
    public void addingPoster4() {//вывод постеров в обратном порядке несколько

        AddingPosterManager manager = new AddingPosterManager();

        manager.AddingPosterManager("Бладшот");
        manager.AddingPosterManager("Вперёд");
        manager.AddingPosterManager("Отель");
        manager.AddingPosterManager("Джентельмены");


        String[] expected = {"Джентельмены", "Отель", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void addingPoster5() {//вывод постеров в обратном порядке несколько

        AddingPosterManager manager = new AddingPosterManager();

        manager.AddingPosterManager("Бладшот");
        manager.AddingPosterManager("Вперёд");
        manager.AddingPosterManager("Отель");
        manager.AddingPosterManager("Джентельмены");
        manager.AddingPosterManager("Человек невидимка");
        manager.AddingPosterManager("Тролли");


        String[] expected = {"Тролли", "Человек невидимка", "Джентельмены", "Отель", "Вперёд"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

}
