package accoutManager;

import java.io.IOException;
import java.net.URLEncoder;

import org.junit.Test;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class freshToken {
	//测试通过
	@Test
	public void test() throws IOException{
		
		OkHttpClient client = new OkHttpClient();

		String refresh_token = "baH2TUyOoyQoHDVzvcPkhzvIfLUjWTvjT0NUWeTtLFKMEF-WAa";
		
		String refresh_tokenEncoded = URLEncoder.encode(refresh_token);
		
		String url = "https://acc.qbox.me/oauth2/token";
		
		RequestBody formBody = new FormEncodingBuilder()
			    .add("grant_type", "refresh_token")
			    .add("refresh_token",refresh_tokenEncoded)
			    .build();
		
		Request request = new Request.Builder()	
				.url(url)
				.post(formBody)				
				.addHeader("Content-Type", "application/x-www-form-urlencoded")
				.build();				
		
		Response re = client.newCall(request).execute();		
		System.out.println(re.isSuccessful());			
		if(re.isSuccessful() == true){
			System.out.println(re.code());			
			System.out.println(re.body().string());			
		}else{
			System.out.println(re.code());
		}			
	}

}
