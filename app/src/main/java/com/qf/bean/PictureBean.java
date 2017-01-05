package com.qf.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */

public class PictureBean {


    /**
     * mod : newslist
     * status : 0
     * message : ok
     * data : {"title":{"typename":"军事","link":"http://m.xinjunshi.com/","description":"环球新军事网手机站（m.xinjunshi.com）提供最新军事新闻、中国军事新闻、国际军事新闻、军事图片等军事资料，以中国军事军情为主，每日更新，打造中国优秀前卫军事网站。"},"item":[{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213150Q2.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213150Q2-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213150Q3.jpg"],"news_show_type":30,"title":"中国烟草历史：刚传入时曾被认为可还魂","aid":"237681","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481612994","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"3","pl":"0"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213145322.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213145323.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213145324.jpg"],"news_show_type":30,"title":"别样年华：相恋十年的同性艾滋感染者","aid":"237675","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481612176","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"3","pl":"0"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213142343.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213142343-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213142344.jpg"],"news_show_type":30,"title":"台湾又出新段子！大陆人吃不起猪肉","aid":"237663","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481610356","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"6","pl":"2"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213130010.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213130010-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213130010-51.jpg"],"news_show_type":30,"title":"外国美女嫁给中国农民工之后的生活","aid":"237633","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481605359","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"14","pl":"2"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213122S8.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213122S8-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213122S8-51.jpg"],"news_show_type":30,"title":"酷爱搏击的美女总裁 让人很是羡慕","aid":"237632","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481603419","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"11","pl":"2"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/35-161213110H8.jpg","http://img12.xinjunshi.com/allimg/161213/35-161213110H9.jpg","http://img12.xinjunshi.com/allimg/161213/35-161213110I1.jpg"],"news_show_type":30,"title":"同人WORK白貓大胆诱惑","aid":"237625","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481598481","category":"图片","red_tag":"图片","author":"鸿小猴_LH","digg":"37","pl":"8"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/35-161213091141.jpg","http://img12.xinjunshi.com/allimg/161213/35-161213091141-50.jpg","http://img12.xinjunshi.com/allimg/161213/35-161213091142.jpg"],"news_show_type":30,"title":"看美军核潜艇如何安装巡航导弹","aid":"237578","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481591765","category":"图片","red_tag":"图片","author":"鸿小猴_LH","digg":"5","pl":"0"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/35-1612130Z521.jpg","http://img12.xinjunshi.com/allimg/161213/35-1612130Z521-50.jpg","http://img12.xinjunshi.com/allimg/161213/35-1612130Z522.jpg"],"news_show_type":30,"title":"驻叙俄特种部队动用遥控机器人参战","aid":"237575","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481591415","category":"图片","red_tag":"图片","author":"鸿小猴_LH","digg":"6","pl":"1"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/35-1612130U946.jpg","http://img12.xinjunshi.com/allimg/161213/35-1612130U946-50.jpg","http://img12.xinjunshi.com/allimg/161213/35-1612130U946-51.jpg"],"news_show_type":30,"title":"致敬！刘华清海军上将诞辰百年","aid":"237573","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481591002","category":"图片","red_tag":"图片","author":"鸿小猴_LH","digg":"8","pl":"0"},{"image_arr":["http://img12.xinjunshi.com/allimg/161212/14312-161212151035.jpg","http://img12.xinjunshi.com/allimg/161212/14312-161212151036.jpg","http://img12.xinjunshi.com/allimg/161212/14312-161212151036-50.jpg"],"news_show_type":30,"title":"世界十大战役：中国两大战役上榜","aid":"237537","channel":"2","pubDate":"2016-12-12","pubTimestamp":"1481526769","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"43","pl":"4"}],"is_recom":0,"maxpage":10}
     */

    private String mod;
    private int status;
    private String message;
    private DataBean data;

    public static List<PictureBean> arrayPictureBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<PictureBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<PictureBean> arrayPictureBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<PictureBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * title : {"typename":"军事","link":"http://m.xinjunshi.com/","description":"环球新军事网手机站（m.xinjunshi.com）提供最新军事新闻、中国军事新闻、国际军事新闻、军事图片等军事资料，以中国军事军情为主，每日更新，打造中国优秀前卫军事网站。"}
         * item : [{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213150Q2.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213150Q2-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213150Q3.jpg"],"news_show_type":30,"title":"中国烟草历史：刚传入时曾被认为可还魂","aid":"237681","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481612994","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"3","pl":"0"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213145322.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213145323.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213145324.jpg"],"news_show_type":30,"title":"别样年华：相恋十年的同性艾滋感染者","aid":"237675","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481612176","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"3","pl":"0"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213142343.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213142343-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213142344.jpg"],"news_show_type":30,"title":"台湾又出新段子！大陆人吃不起猪肉","aid":"237663","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481610356","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"6","pl":"2"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213130010.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213130010-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213130010-51.jpg"],"news_show_type":30,"title":"外国美女嫁给中国农民工之后的生活","aid":"237633","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481605359","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"14","pl":"2"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/14312-161213122S8.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213122S8-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213122S8-51.jpg"],"news_show_type":30,"title":"酷爱搏击的美女总裁 让人很是羡慕","aid":"237632","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481603419","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"11","pl":"2"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/35-161213110H8.jpg","http://img12.xinjunshi.com/allimg/161213/35-161213110H9.jpg","http://img12.xinjunshi.com/allimg/161213/35-161213110I1.jpg"],"news_show_type":30,"title":"同人WORK白貓大胆诱惑","aid":"237625","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481598481","category":"图片","red_tag":"图片","author":"鸿小猴_LH","digg":"37","pl":"8"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/35-161213091141.jpg","http://img12.xinjunshi.com/allimg/161213/35-161213091141-50.jpg","http://img12.xinjunshi.com/allimg/161213/35-161213091142.jpg"],"news_show_type":30,"title":"看美军核潜艇如何安装巡航导弹","aid":"237578","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481591765","category":"图片","red_tag":"图片","author":"鸿小猴_LH","digg":"5","pl":"0"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/35-1612130Z521.jpg","http://img12.xinjunshi.com/allimg/161213/35-1612130Z521-50.jpg","http://img12.xinjunshi.com/allimg/161213/35-1612130Z522.jpg"],"news_show_type":30,"title":"驻叙俄特种部队动用遥控机器人参战","aid":"237575","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481591415","category":"图片","red_tag":"图片","author":"鸿小猴_LH","digg":"6","pl":"1"},{"image_arr":["http://img12.xinjunshi.com/allimg/161213/35-1612130U946.jpg","http://img12.xinjunshi.com/allimg/161213/35-1612130U946-50.jpg","http://img12.xinjunshi.com/allimg/161213/35-1612130U946-51.jpg"],"news_show_type":30,"title":"致敬！刘华清海军上将诞辰百年","aid":"237573","channel":"2","pubDate":"2016-12-13","pubTimestamp":"1481591002","category":"图片","red_tag":"图片","author":"鸿小猴_LH","digg":"8","pl":"0"},{"image_arr":["http://img12.xinjunshi.com/allimg/161212/14312-161212151035.jpg","http://img12.xinjunshi.com/allimg/161212/14312-161212151036.jpg","http://img12.xinjunshi.com/allimg/161212/14312-161212151036-50.jpg"],"news_show_type":30,"title":"世界十大战役：中国两大战役上榜","aid":"237537","channel":"2","pubDate":"2016-12-12","pubTimestamp":"1481526769","category":"图片","red_tag":"图片","author":"xjs_SWX","digg":"43","pl":"4"}]
         * is_recom : 0
         * maxpage : 10
         */

        private TitleBean title;
        private int is_recom;
        private int maxpage;
        private List<ItemBean> item;

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public TitleBean getTitle() {
            return title;
        }

        public void setTitle(TitleBean title) {
            this.title = title;
        }

        public int getIs_recom() {
            return is_recom;
        }

        public void setIs_recom(int is_recom) {
            this.is_recom = is_recom;
        }

        public int getMaxpage() {
            return maxpage;
        }

        public void setMaxpage(int maxpage) {
            this.maxpage = maxpage;
        }

        public List<ItemBean> getItem() {
            return item;
        }

        public void setItem(List<ItemBean> item) {
            this.item = item;
        }

        public static class TitleBean {
            /**
             * typename : 军事
             * link : http://m.xinjunshi.com/
             * description : 环球新军事网手机站（m.xinjunshi.com）提供最新军事新闻、中国军事新闻、国际军事新闻、军事图片等军事资料，以中国军事军情为主，每日更新，打造中国优秀前卫军事网站。
             */

            private String typename;
            private String link;
            private String description;

            public static List<TitleBean> arrayTitleBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<TitleBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<TitleBean> arrayTitleBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<TitleBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getTypename() {
                return typename;
            }

            public void setTypename(String typename) {
                this.typename = typename;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }

        public static class ItemBean {
            /**
             * image_arr : ["http://img12.xinjunshi.com/allimg/161213/14312-161213150Q2.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213150Q2-50.jpg","http://img12.xinjunshi.com/allimg/161213/14312-161213150Q3.jpg"]
             * news_show_type : 30
             * title : 中国烟草历史：刚传入时曾被认为可还魂
             * aid : 237681
             * channel : 2
             * pubDate : 2016-12-13
             * pubTimestamp : 1481612994
             * category : 图片
             * red_tag : 图片
             * author : xjs_SWX
             * digg : 3
             * pl : 0
             */

            private int news_show_type;
            private String title;
            private String aid;
            private String channel;
            private String pubDate;
            private String pubTimestamp;
            private String category;
            private String red_tag;
            private String author;
            private String digg;
            private String pl;
            private List<String> image_arr;

            public static List<ItemBean> arrayItemBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ItemBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ItemBean> arrayItemBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ItemBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getNews_show_type() {
                return news_show_type;
            }

            public void setNews_show_type(int news_show_type) {
                this.news_show_type = news_show_type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getAid() {
                return aid;
            }

            public void setAid(String aid) {
                this.aid = aid;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public String getPubTimestamp() {
                return pubTimestamp;
            }

            public void setPubTimestamp(String pubTimestamp) {
                this.pubTimestamp = pubTimestamp;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getRed_tag() {
                return red_tag;
            }

            public void setRed_tag(String red_tag) {
                this.red_tag = red_tag;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getDigg() {
                return digg;
            }

            public void setDigg(String digg) {
                this.digg = digg;
            }

            public String getPl() {
                return pl;
            }

            public void setPl(String pl) {
                this.pl = pl;
            }

            public List<String> getImage_arr() {
                return image_arr;
            }

            public void setImage_arr(List<String> image_arr) {
                this.image_arr = image_arr;
            }
        }
    }
}
