package com.zhouyou.samlpe.signseekbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhouyou.view.seekbar.SignSeekBar;

import java.util.Locale;

public class DemoFragment5 extends Fragment {

    public static DemoFragment5 newInstance() {
        return new DemoFragment5();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo_5, container, false);
        test2(view);
        test3(view);
        test4(view);
        test5(view);
        test6(view);
        return view;
    }

    private void test2(View view) {
        final TextView progressText = (TextView) view.findViewById(R.id.demo_5_progress_text_2);
        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_5_seek_bar_2);
        signSeekBar.getConfigBuilder()
                .min(0)
                .max(4)
                .progress(3)
                .sectionCount(4)
                //.trackColor(ContextCompat.getColor(getContext(), R.color.color_gray))
                //.secondTrackColor(ContextCompat.getColor(getContext(), R.color.color_blue))
                .thumbColor(ContextCompat.getColor(getContext(), R.color.color_blue))
                .sectionTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary))
                .sectionTextSize(16)
                //.thumbTextColor(ContextCompat.getColor(getContext(), R.color.color_red))
                //.thumbTextSize(18)
                //.signColor(ContextCompat.getColor(getContext(), R.color.color_green))
                //.signTextSize(18)
                .sectionTextPosition(SignSeekBar.TextPosition.BELOW_SECTION_MARK)
                .build();
        //signSeekBar.setEnabled(false);//设置不可以用的时候，可以设置ssb_unusable_color不可用颜色
        signSeekBar.setOnProgressChangedListener(new SignSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(SignSeekBar signSeekBar, int progress, float progressFloat,boolean fromUser) {
                String s = String.format(Locale.CHINA, "onChanged int:%d, float:%.1f", progress, progressFloat);
                progressText.setText(s);
            }

            @Override
            public void getProgressOnActionUp(SignSeekBar signSeekBar, int progress, float progressFloat) {
                String s = String.format(Locale.CHINA, "onActionUp int:%d, float:%.1f", progress, progressFloat);
                progressText.setText(s);
            }

            @Override
            public void getProgressOnFinally(SignSeekBar signSeekBar, int progress, float progressFloat,boolean fromUser) {
                String s = String.format(Locale.CHINA, "onFinally int:%d, float:%.1f", progress, progressFloat);
                progressText.setText(s + getContext().getResources().getStringArray(R.array.labels)[progress]);
            }
        });
    }

    private void test3(View view) {
        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_5_seek_bar_3);
        signSeekBar.getConfigBuilder()
                .min(0)
                .max(4)
                .progress(2)
                .sectionCount(4)
                .thumbColor(ContextCompat.getColor(getContext(), R.color.color_60))
                .sectionTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary))
                .sectionTextSize(16)
                .setUnit("s")
                .sectionTextPosition(SignSeekBar.TextPosition.BELOW_SECTION_MARK)
                .build();
    }

    private void test4(View view) {
        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_5_seek_bar_4);
        signSeekBar.getConfigBuilder()
                .setUnit("m<sup>2</sup>")
                .build();
    }

    private void test5(View view) {
        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_5_seek_bar_5);
        signSeekBar.getConfigBuilder()
                .min(0)
                .max(4)
                .progress(2)
                .sectionCount(4)
                .thumbColor(ContextCompat.getColor(getContext(), R.color.color_60))
                .sectionTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary))
                .sectionTextSize(16)
                .setUnit("m/s<sup>2</sup>")//setUnit("μmol/l");setUnit("μ/l") setUnit("m")
                .build();
    }

    private void test6(View view) {
        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_5_seek_bar_6);
        signSeekBar.getConfigBuilder()
                .min(0)
                .max(4)
                .progress(3)
                .sectionCount(4)
                .thumbColor(ContextCompat.getColor(getContext(), R.color.color_60))
                .sectionTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary))
                .sectionTextSize(16)
                .setUnit("m/s<sup>2</sup>")//setUnit("μmol/l");setUnit("μ/l") setUnit("m")
                .build();
    }

}
