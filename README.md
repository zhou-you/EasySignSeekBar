## EasySignSeekBar
本库主要提供一个漂亮而强大的自定义SeekBar，进度变化由提示牌 (sign)展示,具有强大的属性设置，支持设置section(节点)、mark(标记)、track(轨迹)、thumb（拖动块）、progress(进度)、sign（提示框）等功能

## 主要功能

- 强大的track（轨迹）和second track （选中轨迹）的最小值、最大值、轨迹粗细，颜色等设置；
- 灵活的数字显示，支持设置进度展示、节点文本展示采用整数还是浮点数；
- 支持设置进度单位，例如 10s,15km/h、平方，对数等；
- 支持手柄拖动块thumb半径、颜色、阴影、透明度等；
- 支持节点个数、文字大小、颜色设置；
- 支持指示牌宽高、颜色、圆角半径、三角arrow指示、border边框、跟随thumb移动等；
- 支持设置拖动进度监听回掉；
- 支持格式化进度数字，完全自定义进度样式
- ......

## 关于我
[![github](https://img.shields.io/badge/GitHub-zhou--you-green.svg)](https://github.com/zhou-you)   [![csdn](https://img.shields.io/badge/CSDN-zhouy478319399-green.svg)](http://blog.csdn.net/zhouy478319399)
## 联系方式
本群旨在为使用我github项目的人提供方便，如果遇到问题欢迎在群里提问。
#### 欢迎加入QQ交流群（Q1群已满，请加入Q2群）

[![](https://img.shields.io/badge/%E7%82%B9%E6%88%91%E4%B8%80%E9%94%AE%E5%8A%A0%E5%85%A5Q1%E7%BE%A4-581235049%28%E5%B7%B2%E6%BB%A1%29-blue.svg)](http://shang.qq.com/wpa/qunwpa?idkey=1e1f4bcfd8775a55e6cf6411f6ff0e7058ff469ef87c4d1e67890c27f0c5a390)

[![](https://img.shields.io/badge/%E7%82%B9%E6%88%91%E4%B8%80%E9%94%AE%E5%8A%A0%E5%85%A5Q2%E7%BE%A4-832887601-blue.svg)](http://shang.qq.com/wpa/qunwpa?idkey=f3c997d1c3cc6a8c9fa46d3fde0d663f50e4e6d0e6441b8cc276bef39befd24c)

![](http://img.blog.csdn.net/20170601165330238)![](https://img-blog.csdnimg.cn/20190627164802234.jpg)
## 演示（请star支持）
![](https://github.com/zhou-you/EasySignSeekBar/blob/master/screenshot/1.gif?raw=true)  ![](https://github.com/zhou-you/EasySignSeekBar/blob/master/screenshot/2.gif?raw=true)

![](https://github.com/zhou-you/EasySignSeekBar/blob/master/screenshot/3.gif?raw=true)  ![](https://github.com/zhou-you/EasySignSeekBar/blob/master/screenshot/4.gif?raw=true)

## 版本说明
[![release](https://img.shields.io/badge/release-v1.0.6-orange.svg)](https://github.com/zhou-you/EasySignSeekBar/blob/master/update.md)

## Demo下载

[![downloads](https://img.shields.io/badge/downloads-460k-blue.svg)](https://github.com/zhou-you/EasySignSeekBar/blob/master/apk/signseekbar_demo.apk?raw=true)

## 用法介绍
### build.gradle设置

```
dependencies {
 compile 'com.zhouyou:signseekbar:1.0.6'
}

```
想查看所有版本，请点击下面地址。

[![jcenter](https://img.shields.io/badge/Jcenter-Latest%20Release-orange.svg)](https://jcenter.bintray.com/com/zhouyou/signseekbar/)
### xml
```
<com.zhouyou.view.seekbar.SignSeekBar
        android:id="@+id/seek_bar"
        android:layout_width="match_parent"
        android:layout_height="16dp"
        app:ssb_section_text_position="bottom_sides"
        app:ssb_show_progress_in_float="false"
        app:ssb_show_section_mark="false"
        app:ssb_show_section_text="true"
        app:ssb_show_sign="true"
        app:ssb_show_thumb_text="false"
        app:ssb_sign_arrow_height="5dp"
        app:ssb_sign_arrow_width="10dp"
        app:ssb_sign_border_color="@color/color_red"
        app:ssb_sign_border_size="1dp"
        app:ssb_sign_color="@color/color_gray"
        app:ssb_sign_show_border="true"/>
```
### java
```
signSeekBar.getConfigBuilder()
                .min(0)
                .max(4)
                .progress(2)
                .sectionCount(4)
                .trackColor(ContextCompat.getColor(getContext(), R.color.color_gray))
                .secondTrackColor(ContextCompat.getColor(getContext(), R.color.color_blue))
                .thumbColor(ContextCompat.getColor(getContext(), R.color.color_blue))
                .sectionTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary))
                .sectionTextSize(16)
                .thumbTextColor(ContextCompat.getColor(getContext(), R.color.color_red))
                .thumbTextSize(18)
                .signColor(ContextCompat.getColor(getContext(), R.color.color_green))
                .signTextSize(18)
                .autoAdjustSectionMark()
                .sectionTextPosition(SignSeekBar.TextPosition.BELOW_SECTION_MARK)
                .build();

```
### 回调
```
signSeekBar.setOnProgressChangedListener(new SignSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(SignSeekBar signSeekBar, int progress, float progressFloat,boolean fromUser) {
            //fromUser 表示是否是用户触发 是否是用户touch事件产生
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
```
### Attributes
```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <declare-styleable name="SignSeekBar">
        <attr name="ssb_min" format="float|reference"/> <!--min < max, default: 0.0f-->
        <attr name="ssb_max" format="float|reference"/> <!--min < max, default: 100.0f-->
        <attr name="ssb_progress" format="float|reference"/> <!--real time progress value, default: min-->
        <attr name="ssb_is_float_type" format="boolean"/> <!--support for float type-->
        <attr name="ssb_track_size" format="dimension|reference"/> <!--height of right-track(on the right of thumb), default: 2dp-->
        <!--height of left-track(on the left of thumb), default: 2dp higher than right-track's height-->
        <attr name="ssb_second_track_size" format="dimension|reference"/>
        <attr name="ssb_thumb_radius" format="dimension|reference"/> <!--radius of thumb, default: 2dp higher than left-track's height-->
        <!--radius of thumb when be dragging, default: 2 times of left-track's height-->
        <attr name="ssb_thumb_radius_on_dragging" format="dimension|reference"/>
        <attr name="ssb_track_color" format="color|reference"/> <!--color of right-track, default: R.color.colorPrimary-->
        <attr name="ssb_second_track_color" format="color|reference"/> <!--color of left-track, default: R.color.colorAccent-->
        <attr name="ssb_thumb_color" format="color|reference"/> <!--color of thumb, default: same as left-track's color-->
        <attr name="ssb_section_count" format="integer|reference"/> <!--shares of whole progress(max - min), default: 10-->
        <attr name="ssb_show_section_mark" format="boolean"/> <!--show demarcation points or not, default: false-->
        <attr name="ssb_auto_adjust_section_mark" format="boolean"/> <!--auto scroll to the nearest section_mark or not, default: false-->
        <attr name="ssb_show_section_text" format="boolean"/> <!--show section-text or not, default: false-->
        <attr name="ssb_section_text_size" format="dimension|reference"/> <!--text size of section-text, default: 14sp-->
        <attr name="ssb_section_text_color" format="color|reference"/> <!--text color of section-text, default: same as right-track's color-->
        <!--text position of section-text relative to track, sides, bottom_sides, below_section_mark, default: sides-->
        <attr name="ssb_section_text_position">
            <enum name="sides" value="0"/>
            <enum name="bottom_sides" value="1"/>
            <enum name="below_section_mark" value="2"/>
        </attr>
        <attr name="ssb_section_text_interval" format="integer"/> <!--the interval of two section-text, default: 1-->
        <attr name="ssb_show_thumb_text" format="boolean"/> <!--show real time progress-text under thumb or not, default: false-->
        <attr name="ssb_thumb_text_size" format="dimension|reference"/> <!--text size of progress-text, default: 14sp-->
        <attr name="ssb_thumb_text_color" format="color|reference"/> <!--text color of progress-text, default: same as left-track's color-->
        <attr name="ssb_show_progress_in_float" format="boolean"/> <!--show Sign-progress in float or not, default: false-->
        <attr name="ssb_touch_to_seek" format="boolean"/> <!--touch anywhere on track to quickly seek, default: false-->
        <attr name="ssb_seek_by_section" format="boolean"/> <!--seek by section, the progress may not be linear, default: false-->
        <attr name="ssb_sign_color" format="color|reference"/> <!--color of sign, default: same as left-track's color-->
        <attr name="ssb_sign_border_color" format="color|reference"/> <!--color of sign, border-->
        <attr name="ssb_sign_show_border" format="boolean"/> <!--color of sign, default: same as left-track's color-->
        <attr name="ssb_sign_text_size" format="dimension|reference"/> <!--text size of sign-progress, default: 14sp-->
        <attr name="ssb_sign_border_size" format="dimension|reference"/> <!--border size, default: 1dp-->
        <attr name="ssb_sign_text_color" format="color|reference"/> <!--text color of sign-progress, default: #ffffffff-->
        <attr name="ssb_anim_duration" format="integer"/> <!--duration of animation, default: 200ms-->
        <attr name="ssb_show_sign" format="boolean"/> <!--hide sign, default: false-->
        <attr name="ssb_text_space" format="dimension|reference"/><!--default:2dp-->
        <attr name="ssb_sides_labels" format="reference"/><!--default:null-->
        <attr name="ssb_thumb_bg_alpha" format="float|reference"/> <!--0.0f-1.0f, default: 0.2f-->
        <attr name="ssb_thumb_ratio" format="float|reference"/> <!--0.0f-1.0f, default: 0.7f-->
        <attr name="ssb_show_thumb_shadow" format="boolean"/> <!--0.0f-1.0f, default: false-->
        <attr name="ssb_sign_arrow_autofloat" format="boolean"/> <!--sign arrow auto float, default: true-->
        <attr name="ssb_sign_height" format="dimension|reference"/> <!--sign height,default:22dp-->
        <attr name="ssb_sign_width" format="dimension|reference"/> <!--sign_width ,default:72dp-->
        <attr name="ssb_sign_arrow_height" format="dimension|reference"/> <!--sign arrow height ,default:3dp-->
        <attr name="ssb_sign_arrow_width" format="dimension|reference"/> <!--sign arrow width, default:5dp-->
        <attr name="ssb_sign_round" format="dimension|reference"/> <!--sign round, default:3dp-->
    </declare-styleable>
</resources>
```
## 原理介绍
想了解具体实现细节,请移步CSDN博客：
[http://blog.csdn.net/zhouy478319399/article/details/78298104](http://blog.csdn.net/zhouy478319399/article/details/78298104)

## 感谢
在此感谢[BubbleSeekBar](https://github.com/woxingxiao/BubbleSeekBar)作者提供的开源库，对于本库的完成提供了很大的帮助。


