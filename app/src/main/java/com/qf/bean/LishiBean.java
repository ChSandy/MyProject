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

public class LishiBean {

    /**
     * mod : newslist
     * status : 0
     * message : ok
     * data : {"title":{"typename":"军事","link":"http://m.xinjunshi.com/","description":"环球新军事网手机站（m.xinjunshi.com）提供最新军事新闻、中国军事新闻、国际军事新闻、军事图片等军事资料，以中国军事军情为主，每日更新，打造中国优秀前卫军事网站。"},"item":[{"image":"http://img12.xinjunshi.com/allimg/161213/14312-1612131605590-L.jpg","news_show_type":10,"title":"吴三桂拼命夺回陈圆圆 为何陈圆圆又失宠了","aid":"237691","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481617435","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"23","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/14312-1612131604370-L.jpg","news_show_type":10,"title":"还原历史上真实包拯 黑脸只是传说的产物","aid":"237690","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481617417","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"16","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131100370-L.jpg","news_show_type":10,"title":"盘点：在三国中堪比吕布的几大隐秘高手","aid":"237660","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481609433","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"14","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131103470-L.jpg","news_show_type":31,"title":"古代洞房的花样多多：新郎敢怒却不敢言","aid":"237656","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481607547","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"2","pl":"1","image_arr":["http://img12.xinjunshi.com/allimg/161213/1103543A6-0.jpg","http://img12.xinjunshi.com/allimg/161213/1103542Y6-1.jpg","http://img12.xinjunshi.com/allimg/161213/1103544116-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/35-161213105H70-L.jpg","news_show_type":31,"title":"大汉王朝的荒唐：宫女穿着开裆裤进进出出","aid":"237655","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481675982","category":"历史","red_tag":"最新","author":"阿修罗KP","digg":"12","pl":"0","image_arr":["http://img12.xinjunshi.com/allimg/161213/105H9DI-0.jpg","http://img12.xinjunshi.com/allimg/161213/105H92033-1.jpg","http://img12.xinjunshi.com/allimg/161213/105H91M4-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131056230-L.jpg","news_show_type":10,"title":"明万历帝朱翊钧28年不上朝专家开棺揭真相","aid":"237654","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481607480","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"7","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131054550-L.jpg","news_show_type":10,"title":"揭：司马懿用什么战术活活弄死了诸葛亮？","aid":"237641","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481605760","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"6","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612131033560-L.jpg","news_show_type":10,"title":"永宁公主下嫁两个月便守寡：竟终生不识男女之事","aid":"237598","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481596367","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"17","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/14312-1612121601000-L.jpg","news_show_type":31,"title":"水浒中那些极度雷人的男女奸情事件曝光！","aid":"237543","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591118","category":"历史","red_tag":"热门","author":"阿修罗KP","digg":"110","pl":"10","image_arr":["http://img12.xinjunshi.com/allimg/161212/16015052I-0.jpg","http://img12.xinjunshi.com/allimg/161212/16015035A-1.jpg","http://img12.xinjunshi.com/allimg/161212/1601502b0-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/14312-161212155Q90-L.jpg","news_show_type":31,"title":"史上最有钱的十大名妓：个个都能靠身体吃饭","aid":"237542","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481529775","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"21","pl":"4","image_arr":["http://img12.xinjunshi.com/allimg/161212/155T14309-0.jpg","http://img12.xinjunshi.com/allimg/161212/155T143G-1.jpg","http://img12.xinjunshi.com/allimg/161212/155T16335-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/21-161212105I70-L.jpg","news_show_type":10,"title":"乐不思蜀：皇帝被俘后依然醉心房事一心生孩子","aid":"237494","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481511393","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"22","pl":"3"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121056180-L.jpg","news_show_type":10,"title":"雍正杀功臣：助雍正登基的功臣都怎么死的","aid":"237493","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481511270","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"17","pl":"4"},{"image":"http://img12.xinjunshi.com/allimg/161211/144K1EO-0-lp.jpg","news_show_type":10,"title":"揭秘：四大美女之杨贵妃竟有两次出轨事件","aid":"237421","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481438804","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"11","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161211/1446334558-0-lp.png","news_show_type":31,"title":"揭秘：水浒传中打虎英雄武松的死亡真相！","aid":"237420","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503562","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"111","pl":"9","image_arr":["http://img12.xinjunshi.com/allimg/161211/1446334558-0.png","http://img12.xinjunshi.com/allimg/161211/144633M41-1.png","http://img12.xinjunshi.com/allimg/161211/1446336050-2.png"]},{"image":"http://img12.xinjunshi.com/allimg/161211/144543G49-0-lp.jpg","news_show_type":31,"title":"史上最强黑寡妇：睡过她的男人都没好下场","aid":"237419","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481438710","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"41","pl":"3","image_arr":["http://img12.xinjunshi.com/allimg/161211/144543G49-0.jpg","http://img12.xinjunshi.com/allimg/161211/14454324S-1.jpg","http://img12.xinjunshi.com/allimg/161211/1445432T9-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161211/35-1612110Z3060-L.jpg","news_show_type":10,"title":"大唐决定性的一战：秦王李世民如何灭郑夏","aid":"237367","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481418119","category":"历史","red_tag":"历史","author":"鸿小猴_LH","digg":"12","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161211/35-1612110Z1240-L.jpg","news_show_type":10,"title":"三国时期十大奇怪酷刑：竟被逼与美女同床！","aid":"237365","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481418030","category":"历史","red_tag":"热门","author":"鸿小猴_LH","digg":"17","pl":"4"},{"image":"http://img12.xinjunshi.com/allimg/161211/35-1612110Z0180-L.jpg","news_show_type":10,"title":"揭：王昭君出塞前到底被谁蹂躏了三天三夜？","aid":"237364","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481417917","category":"历史","red_tag":"热门","author":"鸿小猴_LH","digg":"17","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161210/14191W463-0-lp.png","news_show_type":31,"title":"揭秘：古代妓女让男人迷失的房中术","aid":"237328","channel":"1","pubDate":"2016-12-10","pubTimestamp":"1481350681","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"92","pl":"4","image_arr":["http://img12.xinjunshi.com/allimg/161210/14191W463-0.png","http://img12.xinjunshi.com/allimg/161210/14191S4I-1.jpg","http://img12.xinjunshi.com/allimg/161210/14191S540-2.png"]},{"image":"http://img12.xinjunshi.com/allimg/161210/141K4J17-0-lp.jpg","news_show_type":31,"title":"揭开历史之谜：究竟是谁设计了北京的紫禁城","aid":"237327","channel":"1","pubDate":"2016-12-10","pubTimestamp":"1481350637","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"54","pl":"3","image_arr":["http://img12.xinjunshi.com/allimg/161210/141K4J17-0.jpg","http://img12.xinjunshi.com/allimg/161210/141K46420-1.jpg","http://img12.xinjunshi.com/allimg/161210/141K45396-2.jpg"]}],"is_recom":0,"maxpage":10}
     */

    private String mod;
    private int status;
    private String message;
    private DataBean data;

    public static List<LishiBean> arrayLishiBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<LishiBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<LishiBean> arrayLishiBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<LishiBean>>() {
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
         * item : [{"image":"http://img12.xinjunshi.com/allimg/161213/14312-1612131605590-L.jpg","news_show_type":10,"title":"吴三桂拼命夺回陈圆圆 为何陈圆圆又失宠了","aid":"237691","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481617435","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"23","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/14312-1612131604370-L.jpg","news_show_type":10,"title":"还原历史上真实包拯 黑脸只是传说的产物","aid":"237690","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481617417","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"16","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131100370-L.jpg","news_show_type":10,"title":"盘点：在三国中堪比吕布的几大隐秘高手","aid":"237660","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481609433","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"14","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131103470-L.jpg","news_show_type":31,"title":"古代洞房的花样多多：新郎敢怒却不敢言","aid":"237656","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481607547","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"2","pl":"1","image_arr":["http://img12.xinjunshi.com/allimg/161213/1103543A6-0.jpg","http://img12.xinjunshi.com/allimg/161213/1103542Y6-1.jpg","http://img12.xinjunshi.com/allimg/161213/1103544116-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/35-161213105H70-L.jpg","news_show_type":31,"title":"大汉王朝的荒唐：宫女穿着开裆裤进进出出","aid":"237655","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481675982","category":"历史","red_tag":"最新","author":"阿修罗KP","digg":"12","pl":"0","image_arr":["http://img12.xinjunshi.com/allimg/161213/105H9DI-0.jpg","http://img12.xinjunshi.com/allimg/161213/105H92033-1.jpg","http://img12.xinjunshi.com/allimg/161213/105H91M4-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131056230-L.jpg","news_show_type":10,"title":"明万历帝朱翊钧28年不上朝专家开棺揭真相","aid":"237654","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481607480","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"7","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131054550-L.jpg","news_show_type":10,"title":"揭：司马懿用什么战术活活弄死了诸葛亮？","aid":"237641","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481605760","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"6","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612131033560-L.jpg","news_show_type":10,"title":"永宁公主下嫁两个月便守寡：竟终生不识男女之事","aid":"237598","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481596367","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"17","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/14312-1612121601000-L.jpg","news_show_type":31,"title":"水浒中那些极度雷人的男女奸情事件曝光！","aid":"237543","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591118","category":"历史","red_tag":"热门","author":"阿修罗KP","digg":"110","pl":"10","image_arr":["http://img12.xinjunshi.com/allimg/161212/16015052I-0.jpg","http://img12.xinjunshi.com/allimg/161212/16015035A-1.jpg","http://img12.xinjunshi.com/allimg/161212/1601502b0-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/14312-161212155Q90-L.jpg","news_show_type":31,"title":"史上最有钱的十大名妓：个个都能靠身体吃饭","aid":"237542","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481529775","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"21","pl":"4","image_arr":["http://img12.xinjunshi.com/allimg/161212/155T14309-0.jpg","http://img12.xinjunshi.com/allimg/161212/155T143G-1.jpg","http://img12.xinjunshi.com/allimg/161212/155T16335-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/21-161212105I70-L.jpg","news_show_type":10,"title":"乐不思蜀：皇帝被俘后依然醉心房事一心生孩子","aid":"237494","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481511393","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"22","pl":"3"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121056180-L.jpg","news_show_type":10,"title":"雍正杀功臣：助雍正登基的功臣都怎么死的","aid":"237493","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481511270","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"17","pl":"4"},{"image":"http://img12.xinjunshi.com/allimg/161211/144K1EO-0-lp.jpg","news_show_type":10,"title":"揭秘：四大美女之杨贵妃竟有两次出轨事件","aid":"237421","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481438804","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"11","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161211/1446334558-0-lp.png","news_show_type":31,"title":"揭秘：水浒传中打虎英雄武松的死亡真相！","aid":"237420","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503562","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"111","pl":"9","image_arr":["http://img12.xinjunshi.com/allimg/161211/1446334558-0.png","http://img12.xinjunshi.com/allimg/161211/144633M41-1.png","http://img12.xinjunshi.com/allimg/161211/1446336050-2.png"]},{"image":"http://img12.xinjunshi.com/allimg/161211/144543G49-0-lp.jpg","news_show_type":31,"title":"史上最强黑寡妇：睡过她的男人都没好下场","aid":"237419","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481438710","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"41","pl":"3","image_arr":["http://img12.xinjunshi.com/allimg/161211/144543G49-0.jpg","http://img12.xinjunshi.com/allimg/161211/14454324S-1.jpg","http://img12.xinjunshi.com/allimg/161211/1445432T9-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161211/35-1612110Z3060-L.jpg","news_show_type":10,"title":"大唐决定性的一战：秦王李世民如何灭郑夏","aid":"237367","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481418119","category":"历史","red_tag":"历史","author":"鸿小猴_LH","digg":"12","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161211/35-1612110Z1240-L.jpg","news_show_type":10,"title":"三国时期十大奇怪酷刑：竟被逼与美女同床！","aid":"237365","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481418030","category":"历史","red_tag":"热门","author":"鸿小猴_LH","digg":"17","pl":"4"},{"image":"http://img12.xinjunshi.com/allimg/161211/35-1612110Z0180-L.jpg","news_show_type":10,"title":"揭：王昭君出塞前到底被谁蹂躏了三天三夜？","aid":"237364","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481417917","category":"历史","red_tag":"热门","author":"鸿小猴_LH","digg":"17","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161210/14191W463-0-lp.png","news_show_type":31,"title":"揭秘：古代妓女让男人迷失的房中术","aid":"237328","channel":"1","pubDate":"2016-12-10","pubTimestamp":"1481350681","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"92","pl":"4","image_arr":["http://img12.xinjunshi.com/allimg/161210/14191W463-0.png","http://img12.xinjunshi.com/allimg/161210/14191S4I-1.jpg","http://img12.xinjunshi.com/allimg/161210/14191S540-2.png"]},{"image":"http://img12.xinjunshi.com/allimg/161210/141K4J17-0-lp.jpg","news_show_type":31,"title":"揭开历史之谜：究竟是谁设计了北京的紫禁城","aid":"237327","channel":"1","pubDate":"2016-12-10","pubTimestamp":"1481350637","category":"历史","red_tag":"热门","author":"xjs_lm","digg":"54","pl":"3","image_arr":["http://img12.xinjunshi.com/allimg/161210/141K4J17-0.jpg","http://img12.xinjunshi.com/allimg/161210/141K46420-1.jpg","http://img12.xinjunshi.com/allimg/161210/141K45396-2.jpg"]}]
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
             * image : http://img12.xinjunshi.com/allimg/161213/14312-1612131605590-L.jpg
             * news_show_type : 10
             * title : 吴三桂拼命夺回陈圆圆 为何陈圆圆又失宠了
             * aid : 237691
             * channel : 1
             * pubDate : 2016-12-13
             * pubTimestamp : 1481617435
             * category : 历史
             * red_tag : 历史
             * author : 阿修罗KP
             * digg : 23
             * pl : 2
             * image_arr : ["http://img12.xinjunshi.com/allimg/161213/1103543A6-0.jpg","http://img12.xinjunshi.com/allimg/161213/1103542Y6-1.jpg","http://img12.xinjunshi.com/allimg/161213/1103544116-2.jpg"]
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

            public List<String> getImage_arr() {
                return image_arr;
            }

            public void setImage_arr(List<String> image_arr) {
                this.image_arr = image_arr;
            }
        }
    }
}
