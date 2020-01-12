package SabloanePriectare;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

public class JSONBuilder implements Builder{
	
	public Elements document ;
	public final String bookJSONPath = "M:\\EclipseWorkspace\\SabloaneProiectare\\book.json";

	@Override
	public Elements getResult() {
		return document ;
	}

	@Override
	public void build() {
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
	public Elements buildSection(HashMap<String, Object> map) {
		Section section = new Section((String)map.get("title"));
        Collection<HashMap<String, Object>> children = (Collection)map.get("children");
        children.forEach((childMap) -> {

            Elements e = this.processMap(childMap);
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
	public Elements buildParagraph(HashMap<String, Object> map) {

		return new Paragrafe((String)map.get("text"));
		
	}

	@Override
	public Elements buildImage(HashMap<String, Object> map) {

		return new Imagine((String)map.get("url"));
		
	}

	@Override
	public Elements buildImageProxy(HashMap<String, Object> map) {

		return new ImageProxy((String)map.get("url"));
		
	}

	@Override
	public Elements buildTabel(HashMap<String, Object> map) {

		return new Tabel((String)map.get("text"));
		
	}
	
	 private Elements processMap(HashMap<String, Object> map) {
	        String classElement = (String)map.get("class");

	        if("Section".equals(classElement))
	            return this.buildSection(map);
	        else if("Paragraph".equals(classElement))
	            return this.buildParagraph(map);
	        else if("Image".equals(classElement))
	            return this.buildImage(map);
	        else if("ImageProxy".equals(classElement))
	            return this.buildImage(map);
	        return null;
	
	 }
}
