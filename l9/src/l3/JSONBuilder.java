package l3;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

public class JSONBuilder implements Builder {

    public Element document;

    //Acest path reprezinta locatia lui book.json... In cazul meu este cea de mai jos.
    public final String bookJSONPath = "C:\\Users\\student.LABS-NG-BLANK\\Desktop\\book.json";

    @Override
    public Element GetResult() {
        return document;
    }

    @Override
    public void Build() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            HashMap<String, Object> map = mapper.readValue(new File(bookJSONPath),
                    HashMap.class);
            document = processMap(map);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Element BuildSection(HashMap<String, Object> map) {
        Section section = new Section((String)map.get("title"));
        Collection<HashMap<String, Object>> children = (Collection)map.get("children");
        children.forEach((childMap) -> {

            Element e = this.processMap(childMap);
            if (e != null) {
                try {
                    section.add(e);
                } catch (Exception var5) {
                    var5.printStackTrace();
                }
            }
        });
        return section;
    }

    @Override
    public Element BuildParagraph(HashMap<String, Object> map) {
        return new Paragraph((String)map.get("text"));
    }

    @Override
    public Element BuildImage(HashMap<String, Object> map) {
        return new Image((String)map.get("url"));
    }

    @Override
    public Element BuildImageProxy(HashMap<String, Object> map) {
        return new ImageProxy((String)map.get("url"));
    }

    @Override
    public Element BuildTable(HashMap<String, Object> map) {
        return new Table((String)map.get("text"));
    }

    private Element processMap(HashMap<String, Object> map) {
        String classElement = (String)map.get("class");

        if("Section".equals(classElement))
            return this.BuildSection(map);
        else if("Paragraph".equals(classElement))
            return this.BuildParagraph(map);
        else if("Image".equals(classElement))
            return this.BuildImage(map);
        else if("ImageProxy".equals(classElement))
            return this.BuildImageProxy(map);
        return null;
    }
}