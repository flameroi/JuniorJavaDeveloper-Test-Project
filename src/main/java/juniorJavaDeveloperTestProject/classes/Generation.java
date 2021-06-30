package juniorJavaDeveloperTestProject.classes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Generation {
    @JacksonXmlProperty(isAttribute = true)
    String id;
    @JacksonXmlText
    private String value;
}
