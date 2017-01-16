package com.hujie.mvppra;

import java.util.ArrayList;

/**
 * Created by hujie on 2017/1/16.
 */

public class ClassifyConfig {

    public interface IClassifyView{
        void showLoading();
        void hideLoading();
        void fillData(ArrayList<ClassifyBean> data);
    }

    public interface IClassifyModel{
        void loadData(String url,int page,int size,INetResponse callBack);
    }

    public interface IClassifyPresenter{
        void pullData();
        void dragData();
    }
}
