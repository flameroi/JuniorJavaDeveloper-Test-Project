package juniorJavaDeveloperTestProject.classes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class Catalog {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("mark")
    List<Mark> marks;

    public List<Mark> getMarks() {
        return marks;
    }
}
