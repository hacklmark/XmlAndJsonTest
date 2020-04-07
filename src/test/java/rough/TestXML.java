package rough;

import utilities.XMLReader;

public class TestXML {
    public static void main(String[] args) {
        XMLReader xml = new XMLReader(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\locators\\OR.xml");
        System.out.println(xml.getLocator("homepage.header.username.css"));
        System.out.println(xml.getLocator("username.css"));
        System.out.println(xml.getLocator("username.xpath"));

        //driver.findElement(By.xpath(xml.getLocator("homepage.header.username.css"))).sendkeys();
    }
}
