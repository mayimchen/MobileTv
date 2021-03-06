package com.wlx.mtvlibrary.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wlx.mtvlibrary.base.engine.BaseAF;

import butterknife.ButterKnife;

/**
 * 作者：LucianWang
 * 日期：2016/12/12 14:42
 * 邮箱：wlx3079@163.com
 * 说明：Activity的基类
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseAF{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**设置布局*/
        if (getLayoutId() != -1)
            setContentView(getLayoutId());
        /**ButterKnife*/
        ButterKnife.inject(this);
        /**初始化视图（abstract）*/
        init();
        /**初始化监听*/
        initLinstener();
    }


    @Override
    protected void onDestroy() {super.onDestroy();}

    protected void initLinstener() {}

}
