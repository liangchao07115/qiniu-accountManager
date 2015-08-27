package accoutManager;

import java.io.IOException;

import org.junit.Test;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class Enable_child {
	//测试OK
	@Test
	public void enable( ) throws IOException{		
		OkHttpClient client = new OkHttpClient();		
		String url = "https://acc.qbox.me/user/enable_child";
		String access_token = "uaFRcD1RtcOLNe-uQivs2MPlYUrwEHbwAoVMN-o8Iigzt9Egm0GY1NteDSkQ_jDUfs9wx6FkSCm15IjMzOewbWUz6lkOMHP-ZzpwUi9hdvi6pBK_k_qAhYvDz9GXAH04rzImg_k_XLNa1JRCk3cawNdLPbnyzaXtzlhMJQ7YE1y6a2PlQAusA17mX0QcXmpfwlKDjeOvQT_FfVOCBwHfoQ==";
		RequestBody formBody = new FormEncodingBuilder()
			    .add("uid", "**")
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
