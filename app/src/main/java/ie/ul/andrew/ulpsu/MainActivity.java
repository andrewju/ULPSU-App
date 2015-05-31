package ie.ul.andrew.ulpsu;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	WebView mWebView;  

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mWebView = (WebView) findViewById(R.id.webView1);
		mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.requestFocus();  
		//mWebView.setWebViewClient(new WebViewClient());
		mWebView.loadUrl("http://www.skynet.ie/~developer/ulpsu/");
		
	}
	
    public class MyWebViewClient extends WebViewClient {    
        public boolean shouldOverviewUrlLoading(WebView view, String url) {  
            view.loadUrl(url);  
            return true;  
        }  
 
    }  

}
