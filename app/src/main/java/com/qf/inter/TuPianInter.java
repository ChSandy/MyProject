package com.qf.inter;

import com.qf.bean.Pic_XiangQingBean;
import com.qf.bean.PictureBean;
import com.qf.utils.ApiManger;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/12/17.
 */

public interface TuPianInter {

    @POST(ApiManger.PICTURE)
    Call<PictureBean> getPictureBean(@Query("page") int page);

    @POST(ApiManger.PICTURN)
    Call<Pic_XiangQingBean> getPic_XiangQingBean(@Query("aid") String aid);


}
