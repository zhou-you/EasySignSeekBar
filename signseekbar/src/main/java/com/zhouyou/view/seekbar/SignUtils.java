/*
 * Copyright (C) 2017 zhouyou(478319399@qq.com)
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

package com.zhouyou.view.seekbar;

import android.content.res.Resources;
import android.os.Environment;
import android.util.TypedValue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * <p>描述：工具类 单位转换</p>
 * 作者： zhouyou<br>
 * 日期： 2017/10/10 16:16 <br>
 * 版本： v1.0<br>
 */
public class SignUtils {
    private static final File BUILD_PROP_FILE = new File(Environment.getRootDirectory(), "build.prop");
    private static Properties sBuildProperties;
    private static final Object sBuildPropertiesLock = new Object();

    private static Properties getBuildProperties() {
        synchronized (sBuildPropertiesLock) {
            if (sBuildProperties == null) {
                sBuildProperties = new Properties();
                try {
                    sBuildProperties.load(new FileInputStream(BUILD_PROP_FILE));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sBuildProperties;
    }

    static int dp2px(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                Resources.getSystem().getDisplayMetrics());
    }

    static int sp2px(int sp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp,
                Resources.getSystem().getDisplayMetrics());
    }
}