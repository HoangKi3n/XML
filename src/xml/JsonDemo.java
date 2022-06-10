package XML;

import org.json.simple.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		
		jo.put("name", "hoangki3n");
		jo.put("password", "123");
		System.out.println(jo);
		
	}
}