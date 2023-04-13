package body;

public class Payload {

		public static String addBook(String aisle, String isbn)
		{
					String payload = 
					"{\r\n"
					+ "\r\n"
					+ "\"name\":\"Learn Appium Automation with Python\",\r\n"
					+ "\"isbn\":\""+isbn+"\",\r\n"
					+ "\"aisle\":\""+aisle+"\",\r\n"
					+ "\"author\":\"John foe1\"\r\n"
					+ "}";
					return payload;
			
		}

}
