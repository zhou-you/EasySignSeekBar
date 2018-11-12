/*
 * Copyright (C) 2018 zhouyou(478319399@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zhouyou.samlpe.signseekbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhouyou.view.seekbar.SignSeekBar;

public class DemoFragment7 extends Fragment {

    public static DemoFragment7 newInstance() {
        return new DemoFragment7();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_demo_7, container, false);
        test1(view);
        test2(view);
        return view;
    }

    private void test1(View view) {
        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_7_seek_bar_1);
        signSeekBar.getConfigBuilder().signColor(Color.parseColor("#ff0000")).build();
    }
    private void test2(View view) {
        SignSeekBar signSeekBar = (SignSeekBar) view.findViewById(R.id.demo_7_seek_bar_2);
    }
}
