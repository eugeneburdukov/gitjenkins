import org.testng.Assert;
import org.testng.annotations.Test;

public class WeatherTest {

    @Test
    public void test1() {
        Assert.assertEquals("Cloudy", Weather.getWeather());
    }

    @Test
    public void test2() {
        Assert.assertEquals("Cloudy", Weather.getWeather());
    }

    @Test
    public void test3() {
        Assert.assertEquals("Cloudy", Weather.getWeather());
    }

}
