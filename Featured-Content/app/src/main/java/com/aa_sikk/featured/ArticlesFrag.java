package com.aa_sikk.featured;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ArticlesFrag extends Fragment {

    public ArticlesFrag(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.articles_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        WebView ArticleWeb = (WebView) view.findViewById(R.id.article);
        //TODO: Add your Blog Url!
        ArticleWeb.loadUrl("https://github.com/aa-sikkkk/");


        // this will enable the javascript.
        ArticleWeb.getSettings().setJavaScriptEnabled(true);


    }

}
