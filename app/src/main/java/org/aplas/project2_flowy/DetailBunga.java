package org.aplas.project2_flowy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class DetailBunga {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.detail_bunga);

            // cari id di layout
            webViewSaya = (WebView) findViewById(R.id.webViewSaya);

            // setting
            webViewSaya.setWebViewClient(new WebViewClient());
            webViewSaya.setWebChromeClient(new WebChromeClient());
            webViewSaya.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webViewSaya.getSettings().setJavaScriptEnabled(true);
            webViewSaya.getSettings().setPluginState(WebSettings.PluginState.ON);
            webViewSaya.getSettings().setDefaultFontSize(18);

        }

        private void muatVideo(String kode_youtube) {
            String kodeHTML = "<head></head><body>" +
            "<iframe width=\"464\" height=\"261\" src=\"https://www.youtube.com/embed/ " +
                    kode_youtube
                "\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe> +
                "</body>"
            webViewSaya.loadData(kodeHTML,"text/html; charset=utf-8",null);
        }

        public void mawar(View view) {
            muatVideo("kXXUlNMJA0M ");
        }
        public void matahari(View view) {
            muatVideo("i9eDVXZ7Y5s ");
        }
        public void tulip(View view) {
            muatVideo("9YYAEFx454o ");
        }
        public void anggrek(View view) {
        muatVideo("ArHcWRlg");
        }
        public void kembangsepatu(View view){
            muatVideo("BfKILsv1qkg ");
        }
        public void melati(View view){
        muatVideo("DxfG1Dykwtg ");
        }
        public void teratai(View view){
        muatVideo("Es3rIuPjOv8");
        }
        public void sedapmalam(View view){
        muatVideo("aQbWbX6JQGQ");
        }
        public void kamboja(View view){
        muatVideo("D2XuODpXOuU");
        }
        public void rosella(View view){
        muatVideo("kFlgj7NTad8 ");
        }
    }
}
