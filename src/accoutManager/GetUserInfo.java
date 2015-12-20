package accoutManager;

import java.io.IOException;
import java.net.URLDecoder;

import org.junit.Test;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class GetUserInfo {	
	//没有测试通过		
	@Test
	public void getInfo() throws IOException{
		String access_token = "**";
		OkHttpClient client = new OkHttpClient();		
		String url = "https://acc.qbox.me/user/info";
		
		Request request = new Request.Builder()	
				.url(url)			
				.addHeader("Content-Type", "application/x-www-form-urlencoded")
				.addHeader("Authorization", "Bearer "+ access_token)
				.build();				
		
		Response re = client.newCall(request).execute();	
		
		if(re.isSuccessful() == true){			
			System.out.println(re.body().string());	
			System.out.println(re.code());	
		}else{
			System.out.println(re.body().string());
			System.out.println(re.code());
		}	
	} 
	
}
