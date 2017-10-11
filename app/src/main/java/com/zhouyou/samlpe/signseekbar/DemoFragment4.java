package com.zhouyou.samlpe.signseekbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhouyou.view.seekbar.SignSeekBar;

import java.util.Locale;

public class DemoFragment4 extends Fragment {

    public static DemoFragment4 newInstance() {
        return new DemoFragment4();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo_4, container, false);
        ObservableScrollView mObsScrollView = (ObservableScrollView) view.findViewById(R.id.demo_4_obs_scroll_view);
        final SignSeekBar signSeekBar1 = (SignSeekBar) view.findViewById(R.id.demo_4_seek_bar_1);
        final SignSeekBar signSeekBar2 = (SignSeekBar) view.findViewById(R.id.demo_4_seek_bar_2);
        final SignSeekBar signSeekBar3 = (SignSeekBar) view.findViewById(R.id.demo_4_seek_bar_3);
        final TextView progressText1 = (TextView) view.findViewById(R.id.demo_4_progress_text_1);
        final TextView progressText2 = (TextView) view.findViewById(R.id.demo_4_progress_text_2);
        final TextView progressText3 = (TextView) view.findViewById(R.id.demo_4_progress_text_3);

        mObsScrollView.setOnScrollChangedListener(new ObservableScrollView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldx, int oldy) {
                //signSeekBar1.correctOffsetWhenContainerOnScrolling();
            }
        });
        signSeekBar2.setOnProgressChangedListener(new SignSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(SignSeekBar signSeekBar, int progress, float progressFloat,boolean fromUser) {
                String s = String.format(Locale.CHINA, "onChanged int:%d, float:%.1f", progress, progressFloat);
                progressText1.setText(s);
            }

            @Override
            public void getProgressOnActionUp(SignSeekBar signSeekBar, int progress, float progressFloat) {
                String s = String.format(Locale.CHINA, "onActionUp int:%d, float:%.1f", progress, progressFloat);
                progressText2.setText(s);
            }

            @Override
            public void getProgressOnFinally(SignSeekBar signSeekBar, int progress, float progressFloat,boolean fromUser) {
                String s = String.format(Locale.CHINA, "onFinally int:%d, float:%.1f", progress, progressFloat);
                progressText3.setText(s);
            }
        });

        // trigger by set progress or seek by finger
        signSeekBar3.setProgress(signSeekBar3.getMax());

        return view;
    }

}
