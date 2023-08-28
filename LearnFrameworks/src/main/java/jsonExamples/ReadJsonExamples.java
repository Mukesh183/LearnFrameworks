package jsonExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonExamples {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("MukeshDetails.json");
		Object objectJson =  jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) objectJson;
		String name =  (String) jsonObject.get("Name");
		Long age = (Long) jsonObject.get("Age");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		JSONArray array =(JSONArray) jsonObject.get("Skills");
		Iterator iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println("Skills : "+ iterator.next());
			
		}

	}

}
