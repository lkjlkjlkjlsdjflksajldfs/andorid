package com.example.test;

import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.weibo.TencentWeibo;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ShareSDK.initSDK(MainActivity.this);

		findViewById(R.id.button_id).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Platform weibo = ShareSDK.getPlatform(MainActivity.this,
						SinaWeibo.NAME);
				System.out.println("---"+weibo.getDb().getUserId());
				System.out.println("---"+weibo.getId());
				System.out.println("---"+weibo.getName());
				System.out.println("---"+weibo.getSortId());
				System.out.println("---"+weibo.getDb().getUserName());
				System.out.println("---"+weibo.getDb().getToken());
				System.out.println("---"+weibo.getDb().getUserIcon());
				
//				
//				Platform weibo = ShareSDK.getPlatform(MainActivity.this,
//						TencentWeibo.NAME);
//				System.out.println("---"+weibo.getDb().getUserId());
//				System.out.println("---"+weibo.getDb().getUserIcon());
//				weibo.setPlatformActionListener(new PlatformActionListener() {
//
//					@Override
//					public void onError(Platform arg0, int arg1, Throwable arg2) {
//						System.out.println("----onError-");
//					}
//
//					@Override
//					public void onComplete(Platform arg0, int arg1,
//							HashMap<String, Object> arg2) {
//						System.out.println("----onComplete-");
////						System.out.println("---"+weibo.getDb().getUserId());
////						System.out.println("---"+weibo.getDb().getUserIcon());
//						
//					}
//
//					@Override
//					public void onCancel(Platform arg0, int arg1) {
//						System.out.println("----onCancel-");
//					}
//				});
//				weibo.authorize();
			}
		});

	}

}
