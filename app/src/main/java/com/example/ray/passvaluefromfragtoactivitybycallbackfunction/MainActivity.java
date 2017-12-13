package com.example.ray.passvaluefromfragtoactivitybycallbackfunction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/*
此範例展示如何利用callback function將參數從fragment傳遞至activity
 */
public class MainActivity extends AppCompatActivity implements SendArgInterface{

    TextView showArgFromFragment;       //用來show來自fragment的參數

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showArgFromFragment = findViewById(R.id.txtView_showArg);

        MainFragment mainFragment = new MainFragment();
        mainFragment.setSendArgInterface(this);             //將實作interface後的instance, 也就是此class設定給fragment
        getFragmentManager().beginTransaction().add(R.id.fmLayout_Frag, mainFragment). commit();        //顯示fragment
    }

    //當按下fragment中的按鈕時, 會處發此fallback function, 將傳遞過來的參數, 設定在activity的text view
    @Override
    public void getString(String str) {
        showArgFromFragment.setText(str);
    }
}
