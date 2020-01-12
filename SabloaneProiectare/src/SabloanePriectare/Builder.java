package SabloanePriectare;

import java.util.*;

public interface Builder {
	
	Elements getResult () ;
	void build ();
	
	Elements buildSection(HashMap<String, Object> map);
	Elements buildParagraph(HashMap<String, Object> map);
	Elements buildImage(HashMap<String, Object> map);
	Elements buildImageProxy(HashMap<String, Object> map);
	Elements buildTabel(HashMap<String, Object> map);
	
	
}
