package com.qf.utils;

/**
 * Created by Administrator on 2016/12/12.
 */

public class ApiManger {
    /**
    * 头部
    */
    public static final String BASE="http://if.wap.xinjunshi.com/";

    /**
     * 推荐
     * &page=1
     */
    public static final String TUIJIAN = "api2.3/app.php?mod=newslist&act=index&newid=237414";

    /**
     * 排行
     * &page=1
     * http://if.wap.xinjunshi.com/
     */
    public static final String PAIHANG = "api2.3/app.php?mod=rank_list&newid=237410";

    /**
     * 图片
     * http://if.wap.xinjunshi.com/
     * &page=1
     */
    public static final String PICTURE = "api2.3/app.php?mod=newslist&act=tuwen&newid=237418";

    /**
     * 环球
     * http://if.wap.xinjunshi.com/
     * &page=1
     */
    public static final String HUANGQIU = "api2.3/app.php?mod=newslist&act=2&newid=237425";

    /**
     * 历史
     * http://if.wap.xinjunshi.com/
     * &page=1
     */
    public static final String LISHI = "api2.3/app.php?mod=newslist&act=6&newid=237421";

    /**
     * 视频页
     * http://if.wap.xinjunshi.com/
     * &page=1
     */
    public static final String VIDEO = "api2.3/app.php?mod=newslist&act=video&newid=237371";
    /**
     * 商城
     */
    public static final String SHOPPING = "http://m.shop.xinjunshi.com/";
    /**
     *  视频点击
     *   http://if.wap.xinjunshi.com/
     *  &aid=237927
      */
    public static final String ITEMVIDEO ="api2.3/app.php?mod=show&type=18";
    /**
     *  推荐点击
     *   http://if.wap.xinjunshi.com/
     * &aid=237879
     */
    public static final String ITEMTUIJIAN ="api2.3/app.php?mod=show&type=1";

    /**
     *  推荐点击
     *   http://if.wap.xinjunshi.com/
     * &aid=237320
     */
    public static final String PICTURN ="api2.3/app.php?mod=show&type=2";


}
