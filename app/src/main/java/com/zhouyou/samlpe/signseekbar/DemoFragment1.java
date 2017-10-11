package com.zhouyou.samlpe.signseekbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zhouyou.view.seekbar.SignSeekBar;

import java.util.Random;

public class DemoFragment1 extends Fragment {

    public static DemoFragment1 newInstance() {
        return new DemoFragment1();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo_1, container, false);

        final SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_1_seek_bar);
        signSeekBar.setProgress(20);
        Button button = (Button) view.findViewById(R.id.demo_1_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progress = new Random().nextInt((int) signSeekBar.getMax());
                signSeekBar.setProgress(progress);
                //Snackbar.make(v, "set random progress = " + progress, Snackbar.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
