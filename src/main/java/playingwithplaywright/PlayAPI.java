package playingwithplaywright;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;

public class PlayAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright;
		APIRequestContext apiRequestContext;
		playwright = Playwright.create();

		// headers
		//Map<String, String> headers = new HashMap<>();
		//headers.put("Content-Type", "application/json");

		// Payload
		Map<String, String> requestPayload = new HashMap<>();
		requestPayload.put("firstName", "Amit");
		requestPayload.put("lastName", "Kumar");
		requestPayload.put("email", "play1@play.com");
		requestPayload.put("companyName", "Labyrinth");
		requestPayload.put("position", "CEO");
		requestPayload.put("city", "Bangalore");
		requestPayload.put("countryId", "eqhvdhjj");

		apiRequestContext = playwright.request().newContext(new APIRequest.NewContextOptions());
				//.setBaseURL("https://dev-api-born.alkeon.app/api/v2"));
				//.setExtraHTTPHeaders(headers));
		String response = apiRequestContext.post("https://dev-api-born.alkeon.app/api/v2/auth/signup", RequestOptions.create().setData(requestPayload))
				.text();
		int responseCode = apiRequestContext.post("https://dev-api-born.alkeon.app/api/v2/auth/signup", RequestOptions.create().setData(requestPayload)).status();

		System.out.println("responseCode=" + responseCode);

		System.out.println("response=" + response);
		
		JsonObject json=new Gson().fromJson(response, JsonObject.class);
		System.out.println(json.get("success"));
		System.out.println(json.get("reason"));
		System.out.println(json.get("details"));
		
		
		
		apiRequestContext.dispose();
		playwright.close();
	}

}
