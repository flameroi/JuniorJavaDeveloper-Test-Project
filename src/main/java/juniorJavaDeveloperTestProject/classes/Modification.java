package juniorJavaDeveloperTestProject.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Modification {
    @JacksonXmlProperty(isAttribute = true)
    private String name;
    @JacksonXmlProperty(isAttribute = true)
    private String id;

    @JsonProperty("mark_id")
    private String markId;
    @JsonProperty("folder_id")
    private String folderId;
    @JsonProperty("modification_id")
    private String modificationId;
    @JsonProperty("configuration_id")
    private String configurationId;
    @JsonProperty("tech_param_id")
    private String tech_paramId;
    @JsonProperty("body_type")
    private String bodyType;
    @JsonIgnore
    private Сomplectations complectations;
    private String years;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMarkId(String markId) {
        this.markId = markId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public void setModificationId(String modificationId) {
        this.modificationId = modificationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public void setTech_paramId(String tech_paramId) {
        this.tech_paramId = tech_paramId;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public void setComplectations(Сomplectations complectations) {
        this.complectations = complectations;
    }
}
