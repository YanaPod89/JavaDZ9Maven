import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.setNextStation();

        int expected = 6;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationZero() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.setNextStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationNine() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.currentStation = 6;
        radio.setPrevStation();

        int expected = 5;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNewStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNewStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }
}

