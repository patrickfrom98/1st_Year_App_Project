package uk.ac.hud.u1756102.parkrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class WebsiteActivity extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        webview = (WebView) findViewById(R.id.web_container);
        webview.loadUrl("http://www.parkrun.org.uk/huddersfield/");
    }
}
