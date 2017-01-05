package com.qf.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 */

public class VideoBean {


    /**
     * mod : newslist
     * status : 0
     * message : ok
     * data : {"title":{"typename":"军事","link":"http://m.xinjunshi.com/","description":"环球新军事网手机站（m.xinjunshi.com）提供最新军事新闻、中国军事新闻、国际军事新闻、军事图片等军事资料，以中国军事军情为主，每日更新，打造中国优秀前卫军事网站。"},"item":[{"image":"http://img12.xinjunshi.com/allimg/161215/21-1612150Z5070-L.jpg","news_show_type":20,"title":"日本到底要干啥？频繁用危险动作骚扰中国军机","aid":"237875","channel":"18","pubDate":"2016-12-15","pubTimestamp":"1481763761","category":"视频","red_tag":"最新","author":"阿修罗KP","digg":"7","pl":"4"},{"image":"http://img12.xinjunshi.com/allimg/161215/21-1612150Z2150-L.jpg","news_show_type":20,"title":"日本也要部署\u201c萨德\u201d？专家：中国有应对手段","aid":"237873","channel":"18","pubDate":"2016-12-15","pubTimestamp":"1481763616","category":"视频","red_tag":"最新","author":"阿修罗KP","digg":"3","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161214/21-161214131H60-L.jpg","news_show_type":20,"title":"日本干扰中国军机还倒打一耙 向中方提抗议","aid":"237803","channel":"18","pubDate":"2016-12-14","pubTimestamp":"1481692533","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"38","pl":"11"},{"image":"http://img12.xinjunshi.com/allimg/161214/21-1612141314220-L.jpg","news_show_type":20,"title":"安倍赠狗外交失败 日本网友:真是个小丑","aid":"237801","channel":"18","pubDate":"2016-12-14","pubTimestamp":"1481692323","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"2","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161214/21-1612140914190-L.jpg","news_show_type":20,"title":"中国海军095核潜艇或开工 已解决核反应堆难题","aid":"237736","channel":"18","pubDate":"2016-12-14","pubTimestamp":"1481677950","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"38","pl":"1"},{"image":"http://img12.xinjunshi.com/allimg/161214/21-1612140912140-L.jpg","news_show_type":20,"title":"歼20已经刷上空军编号？那么什么时候具备战力","aid":"237735","channel":"18","pubDate":"2016-12-14","pubTimestamp":"1481677761","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"8","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-161213132Q30-L.jpg","news_show_type":20,"title":"特朗普:我不懂为啥要被\u201c一个中国\u201d原则限制","aid":"237653","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481606805","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"20","pl":"15"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612131326310-L.jpg","news_show_type":20,"title":"日媒称中国削减稀土出口供给 日本遭严重冲击","aid":"237652","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481606637","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"43","pl":"11"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-161213091I20-L.jpg","news_show_type":20,"title":"歼20机载大屏幕触摸显示器被公开 竟然可以声控","aid":"237579","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481591746","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"48","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130915360-L.jpg","news_show_type":20,"title":"美媒:中国准备试射反卫星武器 将成北京杀手锏","aid":"237577","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481591635","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"25","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121356100-L.jpg","news_show_type":20,"title":"日本战机近距离干扰 我战机采取机动占有利阵位","aid":"237523","channel":"18","pubDate":"2016-12-12","pubTimestamp":"1481522087","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"72","pl":"12"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121354290-L.jpg","news_show_type":20,"title":"驶向垃圾场！英国海军告别最后一艘无敌级航母","aid":"237522","channel":"18","pubDate":"2016-12-12","pubTimestamp":"1481521992","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"4","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121352500-L.jpg","news_show_type":20,"title":"少将称中国能同时造2艘航母 弹射技术已无瓶颈","aid":"237521","channel":"18","pubDate":"2016-12-12","pubTimestamp":"1481521850","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"16","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612120913530-L.jpg","news_show_type":20,"title":"中国应加快列装东风41扩充核武 绝不向美国纳贡","aid":"237453","channel":"18","pubDate":"2016-12-12","pubTimestamp":"1481504935","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"27","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161211/35-161211091R20-L.jpg","news_show_type":20,"title":"最强因果律武器比核武还要硬","aid":"237371","channel":"18","pubDate":"2016-12-11","pubTimestamp":"1481418866","category":"视频","red_tag":"热门","author":"鸿小猴_LH","digg":"14","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161210/35-1612100S1140-L.jpg","news_show_type":20,"title":"美国空军一号为何要花40亿？","aid":"237273","channel":"18","pubDate":"2016-12-10","pubTimestamp":"1481329677","category":"视频","red_tag":"热门","author":"鸿小猴_LH","digg":"37","pl":"3"},{"image":"http://img12.xinjunshi.com/allimg/161209/21-1612091339590-L.jpg","news_show_type":20,"title":"美将领:中国是美完美敌人 要用最好的武器对付","aid":"237217","channel":"18","pubDate":"2016-12-09","pubTimestamp":"1481261926","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"43","pl":"15"},{"image":"http://img12.xinjunshi.com/allimg/161209/21-161209133R50-L.jpg","news_show_type":20,"title":"台媒:歼-20服役数量不止一架 大陆故意泄图","aid":"237216","channel":"18","pubDate":"2016-12-09","pubTimestamp":"1481261814","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"27","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161209/21-16120ZTJ50-L.jpg","news_show_type":20,"title":"特朗普前顾问称不在乎羞辱中国人 去他们的","aid":"237137","channel":"18","pubDate":"2016-12-09","pubTimestamp":"1481244370","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"22","pl":"7"},{"image":"http://img12.xinjunshi.com/allimg/161209/21-16120ZT5470-L.jpg","news_show_type":20,"title":"特朗普就南海表态：建军事设施经过美同意吗？","aid":"237135","channel":"18","pubDate":"2016-12-09","pubTimestamp":"1481244223","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"7","pl":"11"}],"is_recom":0,"maxpage":10}
     */

    private String mod;
    private int status;
    private String message;
    private DataBean data;

    public static List<VideoBean> arrayVideoBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<VideoBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<VideoBean> arrayVideoBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<VideoBean>>() {
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
         * item : [{"image":"http://img12.xinjunshi.com/allimg/161215/21-1612150Z5070-L.jpg","news_show_type":20,"title":"日本到底要干啥？频繁用危险动作骚扰中国军机","aid":"237875","channel":"18","pubDate":"2016-12-15","pubTimestamp":"1481763761","category":"视频","red_tag":"最新","author":"阿修罗KP","digg":"7","pl":"4"},{"image":"http://img12.xinjunshi.com/allimg/161215/21-1612150Z2150-L.jpg","news_show_type":20,"title":"日本也要部署\u201c萨德\u201d？专家：中国有应对手段","aid":"237873","channel":"18","pubDate":"2016-12-15","pubTimestamp":"1481763616","category":"视频","red_tag":"最新","author":"阿修罗KP","digg":"3","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161214/21-161214131H60-L.jpg","news_show_type":20,"title":"日本干扰中国军机还倒打一耙 向中方提抗议","aid":"237803","channel":"18","pubDate":"2016-12-14","pubTimestamp":"1481692533","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"38","pl":"11"},{"image":"http://img12.xinjunshi.com/allimg/161214/21-1612141314220-L.jpg","news_show_type":20,"title":"安倍赠狗外交失败 日本网友:真是个小丑","aid":"237801","channel":"18","pubDate":"2016-12-14","pubTimestamp":"1481692323","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"2","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161214/21-1612140914190-L.jpg","news_show_type":20,"title":"中国海军095核潜艇或开工 已解决核反应堆难题","aid":"237736","channel":"18","pubDate":"2016-12-14","pubTimestamp":"1481677950","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"38","pl":"1"},{"image":"http://img12.xinjunshi.com/allimg/161214/21-1612140912140-L.jpg","news_show_type":20,"title":"歼20已经刷上空军编号？那么什么时候具备战力","aid":"237735","channel":"18","pubDate":"2016-12-14","pubTimestamp":"1481677761","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"8","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-161213132Q30-L.jpg","news_show_type":20,"title":"特朗普:我不懂为啥要被\u201c一个中国\u201d原则限制","aid":"237653","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481606805","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"20","pl":"15"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612131326310-L.jpg","news_show_type":20,"title":"日媒称中国削减稀土出口供给 日本遭严重冲击","aid":"237652","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481606637","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"43","pl":"11"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-161213091I20-L.jpg","news_show_type":20,"title":"歼20机载大屏幕触摸显示器被公开 竟然可以声控","aid":"237579","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481591746","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"48","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130915360-L.jpg","news_show_type":20,"title":"美媒:中国准备试射反卫星武器 将成北京杀手锏","aid":"237577","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481591635","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"25","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121356100-L.jpg","news_show_type":20,"title":"日本战机近距离干扰 我战机采取机动占有利阵位","aid":"237523","channel":"18","pubDate":"2016-12-12","pubTimestamp":"1481522087","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"72","pl":"12"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121354290-L.jpg","news_show_type":20,"title":"驶向垃圾场！英国海军告别最后一艘无敌级航母","aid":"237522","channel":"18","pubDate":"2016-12-12","pubTimestamp":"1481521992","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"4","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121352500-L.jpg","news_show_type":20,"title":"少将称中国能同时造2艘航母 弹射技术已无瓶颈","aid":"237521","channel":"18","pubDate":"2016-12-12","pubTimestamp":"1481521850","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"16","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612120913530-L.jpg","news_show_type":20,"title":"中国应加快列装东风41扩充核武 绝不向美国纳贡","aid":"237453","channel":"18","pubDate":"2016-12-12","pubTimestamp":"1481504935","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"27","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161211/35-161211091R20-L.jpg","news_show_type":20,"title":"最强因果律武器比核武还要硬","aid":"237371","channel":"18","pubDate":"2016-12-11","pubTimestamp":"1481418866","category":"视频","red_tag":"热门","author":"鸿小猴_LH","digg":"14","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161210/35-1612100S1140-L.jpg","news_show_type":20,"title":"美国空军一号为何要花40亿？","aid":"237273","channel":"18","pubDate":"2016-12-10","pubTimestamp":"1481329677","category":"视频","red_tag":"热门","author":"鸿小猴_LH","digg":"37","pl":"3"},{"image":"http://img12.xinjunshi.com/allimg/161209/21-1612091339590-L.jpg","news_show_type":20,"title":"美将领:中国是美完美敌人 要用最好的武器对付","aid":"237217","channel":"18","pubDate":"2016-12-09","pubTimestamp":"1481261926","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"43","pl":"15"},{"image":"http://img12.xinjunshi.com/allimg/161209/21-161209133R50-L.jpg","news_show_type":20,"title":"台媒:歼-20服役数量不止一架 大陆故意泄图","aid":"237216","channel":"18","pubDate":"2016-12-09","pubTimestamp":"1481261814","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"27","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161209/21-16120ZTJ50-L.jpg","news_show_type":20,"title":"特朗普前顾问称不在乎羞辱中国人 去他们的","aid":"237137","channel":"18","pubDate":"2016-12-09","pubTimestamp":"1481244370","category":"视频","red_tag":"热门","author":"阿修罗KP","digg":"22","pl":"7"},{"image":"http://img12.xinjunshi.com/allimg/161209/21-16120ZT5470-L.jpg","news_show_type":20,"title":"特朗普就南海表态：建军事设施经过美同意吗？","aid":"237135","channel":"18","pubDate":"2016-12-09","pubTimestamp":"1481244223","category":"视频","red_tag":"视频","author":"阿修罗KP","digg":"7","pl":"11"}]
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
             * image : http://img12.xinjunshi.com/allimg/161215/21-1612150Z5070-L.jpg
             * news_show_type : 20
             * title : 日本到底要干啥？频繁用危险动作骚扰中国军机
             * aid : 237875
             * channel : 18
             * pubDate : 2016-12-15
             * pubTimestamp : 1481763761
             * category : 视频
             * red_tag : 最新
             * author : 阿修罗KP
             * digg : 7
             * pl : 4
             */

            private String image;
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

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
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
        }
    }
}
