package com.example.user.webtoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv= findViewById(R.id.webview);

        WebSettings obj=wv.getSettings();
/* This line will enable the java Script on your web View*/
        obj.setJavaScriptEnabled(true);


        wv.loadUrl("https://www.learncodeonline.in");
/*It will prevent the url to open in webBrowser*/
        wv.setWebViewClient(new WebViewClient());
      //  obj.getSavePassword();


        }

    @Override
    public void onBackPressed() {
        if (wv.canGoBack()){
            wv.goBack();
        }
        else {
            super.onBackPressed();
        }



    }
}
