package files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import body.Payload;
import body.json;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {
	
	@Test(dataProvider="BookData")
	public void addBook(String isbn,String aisle)
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json").
		//body(Payload.addBook("hgbfd","897654")).//Dynamic data
		body(Payload.addBook(isbn,aisle)).//Using data provider
		when().
		post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js = json.getapi(response) ;
		String id = js.get("ID");
		System.out.println(id);
		
		
		
	}
@DataProvider(name="BookData")
public Object[][]getData()
{
	//array is collection of elements
	//Multiarray-collection of arrays
	return new Object[][] {{"qwert","123321"},{"poiuy","09786"}};
}
}
