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

import android.support.annotation.ColorInt;
import android.support.annotation.IntRange;

import java.text.NumberFormat;

/**
 * <p>描述：config SignSeekBar's attributes</p>
 * 作者： zhouyou<br>
 * 日期： 2017/10/10 16:15 <br>
 * 版本： v1.0<br>
 */
public class SignConfigBuilder {
    float min;
    float max;
    float progress;
    boolean floatType;
    int trackSize;
    int secondTrackSize;
    int thumbRadius;
    int thumbRadiusOnDragging;
    int trackColor;
    int secondTrackColor;
    int thumbColor;
    int sectionCount;
    boolean showSectionMark;
    boolean autoAdjustSectionMark;
    boolean showSectionText;
    int sectionTextSize;
    int sectionTextColor;
    @SignSeekBar.TextPosition
    int sectionTextPosition;
    int sectionTextInterval;
    boolean showThumbText;
    int thumbTextSize;
    int thumbTextColor;
    boolean showProgressInFloat;
    long animDuration;
    boolean touchToSeek;
    boolean seekBySection;
    int signColor;
    int signTextSize;
    int signTextColor;
    boolean showSign;
    String[] bottomSidesLabels;
    float thumbBgAlpha; //  alpha of thumb shadow
    float thumbRatio; // ratio of thumb shadow
    boolean showThumbShadow;
    SignSeekBar mSignSeekBar;
    String unit;
    int signArrowHeight;
    int signArrowWidth;
    int signRound;
    int signHeight; //sign Height
    int signWidth; //sign width
    int signBorderSize; // border size
    boolean showSignBorder; // show sign border
    boolean signArrowAutofloat;
    int signBorderColor;// color of border color
    NumberFormat format;
    boolean reverse;

    SignConfigBuilder(SignSeekBar signSeekBar) {
        mSignSeekBar = signSeekBar;
    }

    public void build() {
        mSignSeekBar.config(this);
    }

    public SignConfigBuilder min(float min) {
        this.min = min;
        this.progress = min;
        return this;
    }

    public SignConfigBuilder max(float max) {
        this.max = max;
        return this;
    }

    public SignConfigBuilder progress(float progress) {
        this.progress = progress;
        return this;
    }

    public SignConfigBuilder floatType() {
        this.floatType = true;
        return this;
    }

    public SignConfigBuilder trackSize(int dp) {
        this.trackSize = SignUtils.dp2px(dp);
        return this;
    }

    public SignConfigBuilder secondTrackSize(int dp) {
        this.secondTrackSize = SignUtils.dp2px(dp);
        return this;
    }

    public SignConfigBuilder thumbRadius(int dp) {
        this.thumbRadius = SignUtils.dp2px(dp);
        return this;
    }

    public SignConfigBuilder thumbRadiusOnDragging(int dp) {
        this.thumbRadiusOnDragging = SignUtils.dp2px(dp);
        return this;
    }

    public SignConfigBuilder trackColor(@ColorInt int color) {
        this.trackColor = color;
        this.sectionTextColor = color;
        return this;
    }

    public SignConfigBuilder secondTrackColor(@ColorInt int color) {
        this.secondTrackColor = color;
        this.thumbColor = color;
        this.thumbTextColor = color;
        this.signColor = color;
        return this;
    }

    public SignConfigBuilder thumbColor(@ColorInt int color) {
        this.thumbColor = color;
        return this;
    }

    public SignConfigBuilder sectionCount(@IntRange(from = 1) int count) {
        this.sectionCount = count;
        return this;
    }

    public SignConfigBuilder showSectionMark() {
        this.showSectionMark = true;
        return this;
    }

    public SignConfigBuilder autoAdjustSectionMark() {
        this.autoAdjustSectionMark = true;
        return this;
    }

    public SignConfigBuilder showSectionText() {
        this.showSectionText = true;
        return this;
    }

    public SignConfigBuilder sectionTextSize(int sp) {
        this.sectionTextSize = SignUtils.sp2px(sp);
        return this;
    }

    public SignConfigBuilder sectionTextColor(@ColorInt int color) {
        this.sectionTextColor = color;
        return this;
    }

    public SignConfigBuilder sectionTextPosition(@SignSeekBar.TextPosition int position) {
        this.sectionTextPosition = position;
        return this;
    }

    public SignConfigBuilder sectionTextInterval(@IntRange(from = 1) int interval) {
        this.sectionTextInterval = interval;
        return this;
    }

    public SignConfigBuilder showThumbText() {
        this.showThumbText = true;
        return this;
    }

    public SignConfigBuilder thumbTextSize(int sp) {
        this.thumbTextSize = SignUtils.sp2px(sp);
        return this;
    }

    public SignConfigBuilder thumbTextColor(@ColorInt int color) {
        thumbTextColor = color;
        return this;
    }

    public SignConfigBuilder showProgressInFloat() {
        this.showProgressInFloat = true;
        return this;
    }

    public SignConfigBuilder animDuration(long duration) {
        animDuration = duration;
        return this;
    }

    public SignConfigBuilder touchToSeek() {
        this.touchToSeek = true;
        return this;
    }

    public SignConfigBuilder seekBySection() {
        this.seekBySection = true;
        return this;
    }


    public SignConfigBuilder bottomSidesLabels(String[] bottomSidesLabels) {
        this.bottomSidesLabels = bottomSidesLabels;
        return this;
    }

    public SignConfigBuilder thumbBgAlpha(float thumbBgAlpha) {
        this.thumbBgAlpha = thumbBgAlpha;
        return this;
    }

    public SignConfigBuilder thumbRatio(float thumbRatio) {
        this.thumbRatio = thumbRatio;
        return this;
    }

    public SignConfigBuilder showThumbShadow(boolean showThumbShadow) {
        this.showThumbShadow = showThumbShadow;
        return this;
    }

    public SignConfigBuilder signColor(@ColorInt int color) {
        this.signColor = color;
        return this;
    }

    public SignConfigBuilder signTextSize(int sp) {
        this.signTextSize = SignUtils.sp2px(sp);
        return this;
    }

    public SignConfigBuilder signTextColor(@ColorInt int color) {
        this.signTextColor = color;
        return this;
    }

    public SignConfigBuilder showSign() {
        this.showSign = true;
        return this;
    }

    public SignConfigBuilder signArrowHeight(int signArrowHeight) {
        this.signArrowHeight = signArrowHeight;
        return this;
    }

    public SignConfigBuilder signArrowWidth(int signArrowWidth) {
        this.signArrowWidth = signArrowWidth;
        return this;
    }

    public SignConfigBuilder signRound(int signRound) {
        this.signRound = signRound;
        return this;
    }

    public SignConfigBuilder signHeight(int signHeight) {
        this.signHeight = signHeight;
        return this;
    }

    public SignConfigBuilder signWidth(int signWidth) {
        this.signWidth = signWidth;
        return this;
    }

    public SignConfigBuilder signBorderSize(int signBorderSize) {
        this.signBorderSize = signBorderSize;
        return this;
    }

    public SignConfigBuilder showSignBorder(boolean showSignBorder) {
        this.showSignBorder = showSignBorder;
        return this;
    }

    public SignConfigBuilder signBorderColor(int signBorderColor) {
        this.signBorderColor = signBorderColor;
        return this;
    }

    public SignConfigBuilder signArrowAutofloat(boolean signArrowAutofloat) {
        this.signArrowAutofloat = signArrowAutofloat;
        return this;
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }

    public float getProgress() {
        return progress;
    }

    public boolean isFloatType() {
        return floatType;
    }

    public int getTrackSize() {
        return trackSize;
    }

    public int getSecondTrackSize() {
        return secondTrackSize;
    }

    public int getThumbRadius() {
        return thumbRadius;
    }

    public int getThumbRadiusOnDragging() {
        return thumbRadiusOnDragging;
    }

    public int getTrackColor() {
        return trackColor;
    }

    public int getSecondTrackColor() {
        return secondTrackColor;
    }

    public int getThumbColor() {
        return thumbColor;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public boolean isShowSectionMark() {
        return showSectionMark;
    }

    public boolean isAutoAdjustSectionMark() {
        return autoAdjustSectionMark;
    }

    public boolean isShowSectionText() {
        return showSectionText;
    }

    public int getSectionTextSize() {
        return sectionTextSize;
    }

    public int getSectionTextColor() {
        return sectionTextColor;
    }

    public int getSectionTextPosition() {
        return sectionTextPosition;
    }

    public int getSectionTextInterval() {
        return sectionTextInterval;
    }

    public boolean isShowThumbText() {
        return showThumbText;
    }

    public int getThumbTextSize() {
        return thumbTextSize;
    }

    public int getThumbTextColor() {
        return thumbTextColor;
    }

    public boolean isShowProgressInFloat() {
        return showProgressInFloat;
    }

    public long getAnimDuration() {
        return animDuration;
    }

    public boolean isTouchToSeek() {
        return touchToSeek;
    }

    public boolean isSeekBySection() {
        return seekBySection;
    }

    public String[] getBottomSidesLabels() {
        return bottomSidesLabels;
    }

    public float getThumbBgAlpha() {
        return thumbBgAlpha;
    }

    public float getThumbRatio() {
        return thumbRatio;
    }

    public boolean isShowThumbShadow() {
        return showThumbShadow;
    }

    public SignConfigBuilder setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public int getSignColor() {
        return signColor;
    }

    public int getSignTextSize() {
        return signTextSize;
    }

    public int getSignTextColor() {
        return signTextColor;
    }


    public boolean isshowSign() {
        return showSign;
    }

    public String getUnit() {
        return unit;
    }

    public int getSignArrowHeight() {
        return signArrowHeight;
    }

    public int getSignArrowWidth() {
        return signArrowWidth;
    }

    public int getSignRound() {
        return signRound;
    }

    public int getSignHeight() {
        return signHeight;
    }

    public int getSignWidth() {
        return signWidth;
    }

    public int getSignBorderSize() {
        return signBorderSize;
    }

    public boolean isShowSignBorder() {
        return showSignBorder;
    }

    public int getSignBorderColor() {
        return signBorderColor;
    }

    public boolean isSignArrowAutofloat() {
        return signArrowAutofloat;
    }

    public SignConfigBuilder format(NumberFormat format) {
        this.format = format;
        return this;
    }

    public NumberFormat getFormat() {
        return format;
    }

    public boolean isReverse() {
        return reverse;
    }

    public SignConfigBuilder reverse() {
        this.reverse = true;
        return this;
    }
}
