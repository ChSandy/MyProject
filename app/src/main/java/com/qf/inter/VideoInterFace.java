package com.qf.inter;

import com.qf.bean.VideoBean;
import com.qf.bean.VieoActivityBean;
import com.qf.utils.ApiManger;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/12/14.
 */

public interface VideoInterFace {

    /*@FormUrlEncoded
    @POST(ApiManger.VIDEO)
    Call<VideoBean> getVideoBean(@Field("page") String page);*/

    @POST(ApiManger.VIDEO)
    Call<VideoBean> getVideoBean(@Query("page") int page);

    @POST(ApiManger.ITEMVIDEO)
    Call<VieoActivityBean> getVieoActivityBean(@Query("aid") String aid);
}
