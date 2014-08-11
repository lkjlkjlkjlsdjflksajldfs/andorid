package com.example.test;

import android.view.View;
import cn.sharesdk.framework.authorize.AuthorizeAdapter;

public class MySinaTest extends AuthorizeAdapter{
	
	public void onCreate() {
		//去掉ShareSDKLogo
        hideShareSDKLogo();
        //去掉启动动画
        disablePopUpAnimation();
        //去掉标题栏
        getTitleLayout().setVisibility(View.GONE);
    }
}
