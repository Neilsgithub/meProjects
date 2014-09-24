package com.example.aademo.widget;import android.content.Context;import android.graphics.Canvas;import android.graphics.drawable.Drawable;import android.util.AttributeSet;import android.view.animation.Animation;import android.view.animation.AnimationUtils;import android.view.animation.LinearInterpolator;import android.widget.ImageView;import com.example.aademo.R;public class SnowProgress extends ImageView {	Animation anim;	Context mContext;	public SnowProgress(Context context) {		super(context);		mContext = context;		init();	}	public SnowProgress(Context context, AttributeSet attrs) {		super(context, attrs);		mContext = context;		init();	}	public SnowProgress(Context context, AttributeSet attrs, int defStyle) {		super(context, attrs, defStyle);		mContext = context;		init();	}	private void init() {		anim = AnimationUtils.loadAnimation(mContext, R.anim.rotateround);		Drawable d = getDrawable();		if (d != null) {			anim.setFillAfter(true);			LinearInterpolator lir = new LinearInterpolator();			anim.setInterpolator(lir);			startAnimation(anim);		}	}}