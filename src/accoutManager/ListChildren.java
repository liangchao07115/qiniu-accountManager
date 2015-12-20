package accoutManager;

import java.io.IOException;
import org.junit.Test;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class ListChildren {
	
	//测试通过
	OkHttpClient client = new OkHttpClient();
	
	public String access_token2 = "**";
	@Test
	public void list() throws IOException {
				
		String url = "https://acc.qbox.me//user/children?offset=0&limit=10";
		
	    Request request = new Request.Builder()
	    		.url(url)
	    		.addHeader("Content-Type","application/x-www-form-urlencoded")
	    		.addHeader("Authorization", "Bearer "+ access_token2)
	    		.build();	    
	    Response response = client.newCall(request).execute();
	    
	    if (response.isSuccessful()) {     
	    	System.out.println(response.toString());
	    	System.out.println(response.code());
	    	System.out.println(response.body().string());	    	
	    } else {
	    	System.out.println(response.code());
	    }
	}
	
}
