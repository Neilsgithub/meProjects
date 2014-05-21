package com.example.aademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class HorizontalProgressBarActivity extends BaseActivity implements OnClickListener {
	private ProgressBar progressBar;
	Button btn_add, btn_sub;
	int mProgress = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.horizontalprogress_main);
		init();
	}

	private void init() {
		progressBar = (ProgressBar) findViewById(R.id.progressBar);
		btn_add = (Button) findViewById(R.id.btn_add);
		btn_sub = (Button) findViewById(R.id.btn_sub);
		btn_add.setOnClickListener(this);
		btn_sub.setOnClickListener(this);
		progressBar.setProgress(mProgress);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.btn_add) {
			calculateProgress(5);
		} else if (id == R.id.btn_sub) {
			calculateProgress(-5);
		}
	}

	private void calculateProgress(int num) {
		mProgress += num;
		if (mProgress >= 100)
			mProgress = 100;
		else if (mProgress <= 0)
			mProgress = 0;
		
		progressBar.setProgress(mProgress);
	}
}
