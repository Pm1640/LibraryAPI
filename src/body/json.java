package body;

import io.restassured.path.json.JsonPath;

public class json {

	public static  JsonPath getapi(String response)
	{
		JsonPath js1 = new JsonPath(response);
		return js1;
	};
}
