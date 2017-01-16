package com.hujie.mvppra;

/**
 * Created by hujie on 2017/1/16.
 */

public interface INetResponse {

    void onResponse(Object data);

    void onError(String msg);

}
