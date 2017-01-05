package com.qf.inter;

import com.qf.bean.NewBean;
import com.qf.bean.XiangQingBean;
import com.qf.utils.ApiManger;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/12/12.
 */

public interface TuiJianInterFace {

   /* @FormUrlEncoded
    @POST(ApiManger.TUIJIAN)
    Call<NewBean> getItemBean(@Field("page") String page);*/

    @POST(ApiManger.TUIJIAN)
    Call<NewBean> getItemBean(@Query("page") int page);

    @POST(ApiManger.ITEMTUIJIAN)
    Call<XiangQingBean> getXiangQingBean(@Query("aid") String aid);
}
