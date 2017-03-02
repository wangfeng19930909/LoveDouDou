package com.ecity.wangfeng.lovedoudou.api.news;


import com.ecity.wangfeng.lovedoudou.common.RequestCallBack;

import rx.Subscription;

/**
 * @version 1.0
 */
public interface NewsModuleApi<T> {

    Subscription loadNewsChannel(RequestCallBack<T> callBack);

}
