package com.hujie.mvppra;

import android.os.Handler;

import java.util.ArrayList;

/**
 * Created by hujie on 2017/1/16.
 */

public class ClassifyModelImpl implements ClassifyConfig.IClassifyModel {

    @Override
    public void loadData(String url, int page, int size, final INetResponse callBack) {
        final ArrayList<ClassifyBean> data=new ArrayList<>();
        for (int i=0;i<46;i++){
            data.add(new ClassifyBean());
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callBack.onResponse(data);
            }
        },3000);


    }
}
