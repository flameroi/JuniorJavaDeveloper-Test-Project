package juniorJavaDeveloperTestProject;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Starter {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        parser.showUniqueValuesInUrl("https://auto-export.s3.yandex.net/auto/price-list/catalog/cars.xml");
    }
}
