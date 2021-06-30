package juniorJavaDeveloperTestProject.classes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Folder {
    @JacksonXmlProperty(isAttribute = true)
    String name;
    @JacksonXmlProperty(isAttribute = true)
    String id;

    Model model;
    Generation generation;
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("modification")
    List<Modification> modifications;

    public Folder(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public void setModifications(List<Modification> modifications) {
        this.modifications = modifications;
    }

    public Folder(String name, String id, Model model, Generation generation, List<Modification> modifications) {
        this.name = name;
        this.id = id;
        this.model = model;
        this.generation = generation;
        this.modifications = modifications;
    }

    public List<Modification> getModifications() {
        return modifications;
    }
}
