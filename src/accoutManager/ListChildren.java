package accoutManager;

import java.io.IOException;
import org.junit.Test;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class ListChildren {
	
	//测试通过
	OkHttpClient client = new OkHttpClient();
	public String access_token2 = "uaFRcD1RtcOLNe-uQivs2DTkEIUOhHZli6Jsrt3HnuQuXfd31CHavVeyCVrMmb1KUuFC7GP5RxsohMNox76r3SDBZAAezoWwVG_jnOxz87Pgi85BMwApu5CvCowFRIWhzcecgoFUXUF6txihyLYsZ4_3fx73KNMsT02LxmQw5-iXvgLExs5Jy0aPlpEJ3cDSZQoyK3zqVCAYIe43vEO0Hg==";
	
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
