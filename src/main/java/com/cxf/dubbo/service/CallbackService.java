package com.cxf.dubbo.service;

import com.cxf.dubbo.callBack.CallBackListener;

public interface CallbackService {
    void addListener(String key, CallBackListener listener);
}
