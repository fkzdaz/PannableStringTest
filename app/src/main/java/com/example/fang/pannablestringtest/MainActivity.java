package com.example.fang.pannablestringtest;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_fore;
    private TextView tv_back;
    private TextView tv_relative;
    private TextView tv_strike;
    private TextView tv_underline;
    private TextView tv_sup;
    private TextView tv_sub;
    private TextView tv_style;
    private TextView tv_image;
    private TextView tv_click;
    private TextView tv_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initForegroundColorSpan();
        initBackgroundColorSpan();
        initRelativeSizeSpan();
        initStrikethroughSpan();
        initUnderlineSpan();
        initSuperscriptSpan();
        initSuberscriptSpan();
        initStyleSpan();
        initImageSpan();
        initClickableSpan();
        initURLSpan();
    }

    private void initView() {
        tv_fore = (TextView) findViewById(R.id.tv_fore);
        tv_back= (TextView) findViewById(R.id.tv_back);
        tv_relative= (TextView) findViewById(R.id.tv_relative);
        tv_strike= (TextView) findViewById(R.id.tv_strike);
        tv_underline= (TextView) findViewById(R.id.tv_underline);
        tv_sub= (TextView) findViewById(R.id.tv_sub);
        tv_sup= (TextView) findViewById(R.id.tv_sup);
        tv_style= (TextView) findViewById(R.id.tv_style);
        tv_image= (TextView) findViewById(R.id.tv_image);
        tv_url= (TextView) findViewById(R.id.tv_url);
        tv_click= (TextView) findViewById(R.id.tv_click);
    }



    private void initSuberscriptSpan() {
        SpannableString spannableString=new SpannableString("我是下标");

        //SubscriptSpan，设置下标，功能与设置上标类似
        RelativeSizeSpan relativeSizeSpan=new RelativeSizeSpan(0.6f);
        SubscriptSpan subscriptSpan=new SubscriptSpan();
        spannableString.setSpan(subscriptSpan,2,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(relativeSizeSpan,2,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_sub.setText(spannableString);

    }

    private void initSuperscriptSpan() {
        SpannableString spannableString=new SpannableString("我是上标");


        RelativeSizeSpan relativeSizeSpan=new RelativeSizeSpan(0.6f);
        //SuperscriptSpan，设置上标
        SuperscriptSpan superscriptSpan=new SuperscriptSpan();
        spannableString.setSpan(superscriptSpan,2,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(relativeSizeSpan,2,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_sup.setText(spannableString);
    }

    private void initUnderlineSpan() {
        SpannableString spannableString=new SpannableString("我是下划线");

        //UnderlineSpan，为文本设置下划线
        UnderlineSpan underlineSpan=new UnderlineSpan();
        spannableString.setSpan(underlineSpan,2,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_underline.setText(spannableString);

    }

    private void initForegroundColorSpan() {
        SpannableString spannableString=new SpannableString("我是红色前景");
    //ForegroundColorSpan，为文本设置前景色，效果和TextView的setTextColor()类似
        ForegroundColorSpan foregroundColorSpan=new ForegroundColorSpan(Color.parseColor("red"));
        spannableString.setSpan(foregroundColorSpan,2,spannableString.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        tv_fore.setText(spannableString);
    }

    private void initBackgroundColorSpan() {
        SpannableString spannableString=new SpannableString("我是红色背景");
        BackgroundColorSpan backgroundColorSpan=new BackgroundColorSpan(Color.parseColor("red"));
        spannableString.setSpan(backgroundColorSpan,2,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_back.setText(spannableString);
    }

    private void initRelativeSizeSpan() {
        SpannableString spannableString=new SpannableString("万丈高楼平地起");
        RelativeSizeSpan span01=new RelativeSizeSpan(1.0f);
        RelativeSizeSpan span02=new RelativeSizeSpan(1.2f);
        RelativeSizeSpan span03=new RelativeSizeSpan(1.4f);
        RelativeSizeSpan span04=new RelativeSizeSpan(1.6f);
        RelativeSizeSpan span05=new RelativeSizeSpan(1.4f);
        RelativeSizeSpan span06=new RelativeSizeSpan(1.2f);
        RelativeSizeSpan span07=new RelativeSizeSpan(1.0f);

        //RelativeSizeSpan，设置文字相对大小，在TextView原有的文字大小的基础上，相对设置文字大小
        spannableString.setSpan(span01,0,1,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(span02,1,2,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(span03,2,3,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(span04,3,4,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(span05,4,5,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(span06,5,6,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(span07,6,7,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

        tv_relative.setText(spannableString);
    }

    private void initStrikethroughSpan() {
        SpannableString spannableString=new SpannableString("我被删除了");

        //StrikethroughSpan，为文本设置中划线，也就是常说的删除线
        StrikethroughSpan strikethroughSpan=new StrikethroughSpan();
        spannableString.setSpan(strikethroughSpan,2,spannableString.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_relative.setText(spannableString);
    }


    private void initURLSpan() {

    }

    private void initClickableSpan() {
        SpannableString spannableString = new SpannableString("为文字设置点击事件");
        MyClickableSpan clickableSpan = new MyClickableSpan("http://www.jianshu.com/users/dbae9ac95c78");
        spannableString.setSpan(clickableSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_click.setMovementMethod(LinkMovementMethod.getInstance());
        tv_click.setHighlightColor(Color.parseColor("#36969696"));
        tv_click.setText(spannableString);


    }
    class MyClickableSpan extends ClickableSpan {
        private String content;

        public MyClickableSpan(String content) {
            this.content = content;
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setUnderlineText(false);
        }

        @Override
        public void onClick(View widget) {
            Intent intent = new Intent(MainActivity.this, OtherActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("content", content);
            intent.putExtra("bundle", bundle);
            startActivity(intent);
        }
    }

    private void initImageSpan() {

        SpannableString spannableString=new SpannableString("我是图片(分享)");

        Drawable drawable=getResources().getDrawable(R.mipmap.sha);

        drawable.setBounds(0,0,40,40);

        ImageSpan imageSpan=new ImageSpan(drawable);
        spannableString.setSpan(imageSpan,2,4,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_image.setText(spannableString);

    }

    private void initStyleSpan() {

        SpannableString spannableString=new SpannableString("这是粗体,还有斜体");
        StyleSpan styleSpan=new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan1=new StyleSpan(Typeface.ITALIC);

        spannableString.setSpan(styleSpan,2,4,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan1,7,9,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_style.setText(spannableString);
    }

}
