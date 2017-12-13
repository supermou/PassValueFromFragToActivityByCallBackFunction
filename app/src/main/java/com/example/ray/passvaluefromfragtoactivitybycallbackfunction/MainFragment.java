package com.example.ray.passvaluefromfragtoactivitybycallbackfunction;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Ray on 2017/12/13.
 */

public class MainFragment extends Fragment {

    Button sendArgToActivity;
    SendArgInterface sendArgInterface;

    //給activity用於設定interface的實體
    public void setSendArgInterface(SendArgInterface sendArgInterface) {
        this.sendArgInterface = sendArgInterface;
    }

    //建立fragment的view
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag_main, container, false);
        sendArgToActivity = v.findViewById(R.id.btn_sendArgToActivity);

        sendArgToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendArgInterface.getString("參數以經從Fragment傳致Activity");      //按下按鈕時, call callback function將參數傳遞到activity
            }
        });

        return v;
    }
}
