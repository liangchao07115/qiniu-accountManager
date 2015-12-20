package accoutManager;

import java.io.IOException;
import java.net.URLEncoder;

import org.junit.Test;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class Disable_child {
	
	//测试OK
	@Test
	public void disable( ) throws IOException{		
		OkHttpClient client = new OkHttpClient();		
		String url = "https://acc.qbox.me/user/disable_child";
		String access_token = "**";
		RequestBody formBody = new FormEncodingBuilder()
			    .add("uid", "su@nepliang.com")
			    .add("reason","this is mistake")
			    .build();
		
		Request request = new Request.Builder()	
				.url(url)		
				.post(formBody)
				.addHeader("Content-Type", "application/x-www-form-urlencoded")
				.addHeader("Authorization", "Bearer "+ access_token)
				.build();				
		
		Response re = client.newCall(request).execute();	
		
		if(re.isSuccessful() == true){
			System.out.println(re.body().string());	
		}else{
			System.out.println(re.body().string());
		}	
	} 

}
