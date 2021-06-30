package juniorJavaDeveloperTestProject.classes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Mark {
    @JacksonXmlProperty(isAttribute = true)
    private String name;
    @JacksonXmlProperty(isAttribute = true)
    private String id;

    private String code;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Folder> folder;

    public Mark(){}

    public Mark(String name, String id, String code, List<Folder> folder) {
        this.name = name;
        this.id = id;
        this.code = code;
        this.folder = folder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFolder(List<Folder> folder) {
        this.folder = folder;
    }

    public List<Folder> getFolders() {
        return folder;
    }
}
