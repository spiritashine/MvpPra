package com.hujie.mvppra;

import java.util.ArrayList;

/**
 * Created by hujie on 2017/1/16.
 */

public class ClassifyPresenterImpl implements ClassifyConfig.IClassifyPresenter {

    private ClassifyConfig.IClassifyView view;
    private ClassifyConfig.IClassifyModel model;

    private int page=1;

    public ClassifyPresenterImpl(ClassifyConfig.IClassifyView view) {
        this.view = view;
        model=new ClassifyModelImpl();
    }

    @Override
    public void pullData() {
        view.showLoading();
        model.loadData("url", page, 20, new INetResponse() {
            @Override
            public void onResponse(Object data) {
                ArrayList<ClassifyBean> result= (ArrayList<ClassifyBean>) data;
                view.fillData(result);
                view.hideLoading();
            }

            @Override
            public void onError(String msg) {

            }
        });
    }

    @Override
    public void dragData() {
        view.showLoading();
        model.loadData("url", ++page, 20, new INetResponse() {
            @Override
            public void onResponse(Object data) {
                ArrayList<ClassifyBean> result= (ArrayList<ClassifyBean>) data;
                view.fillData(result);
                view.hideLoading();
            }

            @Override
            public void onError(String msg) {

            }
        });
    }
}
