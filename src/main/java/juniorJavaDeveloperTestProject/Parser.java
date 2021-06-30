package juniorJavaDeveloperTestProject;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import juniorJavaDeveloperTestProject.classes.Catalog;
import juniorJavaDeveloperTestProject.classes.Folder;
import juniorJavaDeveloperTestProject.classes.Mark;
import juniorJavaDeveloperTestProject.classes.Modification;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.HashSet;
import java.util.List;

public class Parser {
    public void showUniqueValues(File file) throws IOException {
        Catalog catalog = deserializationFromXML(file);
        System.out.println(calcUniqueValuesForAttributeName(catalog));
    }

    private Catalog deserializationFromXML(File xml) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml, Catalog.class);
    }

    private int calcUniqueValuesForAttributeName(Catalog catalog){
        List<Mark> marks = catalog.getMarks();
        HashSet<String> uniqueAttribute = new HashSet<String>();

        for (Mark mark: marks) {
            List<Folder> folders = mark.getFolders();
            for (Folder folder: folders) {
                List<Modification> modifications = folder.getModifications();
                for (Modification modification: modifications) {
                        uniqueAttribute.add(modification.getName()); //16348
                }
            }
        }

        return uniqueAttribute.size();
    }

    public void showUniqueValuesInUrl(String urlFile) throws IOException {
        String fileName = "projectXMLFile.xml";
        URL url = null;
        url = new URL("https://auto-export.s3.yandex.net/auto/price-list/catalog/cars.xml");
        ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        FileChannel fileChannel = fileOutputStream.getChannel();
        fileOutputStream.getChannel()
                .transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        showUniqueValues(new File(fileName));
    }
}
