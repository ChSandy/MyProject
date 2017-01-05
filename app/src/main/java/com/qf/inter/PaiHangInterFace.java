package com.qf.inter;

import com.qf.bean.HuangQiuBean;
import com.qf.bean.LishiBean;
import com.qf.bean.PaiHangBean;
import com.qf.bean.PictureBean;
import com.qf.utils.ApiManger;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/12/12.
 */

public interface PaiHangInterFace {

   /* @FormUrlEncoded
    @POST(ApiManger.PAIHANG)
    Call<PaiHangBean> getPaiHangBean(@Field("page") String page);*/
    @POST(ApiManger.PAIHANG)
    Call<PaiHangBean> getPaiHangBean(@Query("page") int page);

/*    @FormUrlEncoded
    @POST(ApiManger.PICTURE)
    Call<PictureBean> getPictureBean(@Field("page") String page);*/



    /*@FormUrlEncoded
    @POST(ApiManger.HUANGQIU)
    Call<HuangQiuBean> getHuangqiuBean(@Field("page") String page);*/

    @POST(ApiManger.HUANGQIU)
    Call<HuangQiuBean> getHuangqiuBean(@Query("page") int page);
    /*@FormUrlEncoded
    @POST(ApiManger.LISHI)
    Call<LishiBean> getLishiBean(@Field("page") int page);*/

    @POST(ApiManger.LISHI)
    Call<LishiBean> getLishiBean(@Query("page") int page);
}
