package rough;

import utilities.JsonReader;

import java.io.IOException;

public class TestJson {

    public static void main(String[] args) throws IOException {

        JsonReader json = new JsonReader(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\locators\\OR.json");
        System.out.println(json.getLocator("locators.homepage.username.css"));
        System.out.println(json.getLocator("locators.homepage.username.xpath"));
    }
}
