package jsonExamples;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject object = new JSONObject();
		object.put("Name", "Mukesh");
		object.put("Age",23);
		object.put("Qualification","UG");
		
		JSONArray array= new JSONArray();
		array.add("Java");
		array.add("Seleninum");
		array.add("testNG");
		
		object.put("Skills", array);
		
		FileWriter fileWriter = new FileWriter("MukeshDetails.json");
		fileWriter.write(object.toJSONString());
		fileWriter.close();

	}

}
