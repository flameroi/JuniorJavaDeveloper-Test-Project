package juniorJavaDeveloperTestProject;

import java.io.IOException;

public class Starter {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        parser.showUniqueValuesInUrl("https://auto-export.s3.yandex.net/auto/price-list/catalog/cars.xml");
    }
}
