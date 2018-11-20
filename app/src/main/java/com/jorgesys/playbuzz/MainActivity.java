package com.jorgesys.playbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.playbuzz.android.sdk.PlaybuzzWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String companyDomain = "http://www.example.com";
        String urlPlaybuzz = "amandasimmons10/do-you-know-how-to-say-i-love-you-in-ten-different-languages-love-cute-test-languages-countries";

        PlaybuzzWebView pbWebView = findViewById(R.id.pbwebview);
        pbWebView.loadItem(companyDomain,
                urlPlaybuzz,
                true);

    }
}
