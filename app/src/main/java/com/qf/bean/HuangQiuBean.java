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

public class HuangQiuBean {

    /**
     * mod : newslist
     * status : 0
     * message : ok
     * data : {"title":{"typename":"军事","link":"http://m.xinjunshi.com/","description":"环球新军事网手机站（m.xinjunshi.com）提供最新军事新闻、中国军事新闻、国际军事新闻、军事图片等军事资料，以中国军事军情为主，每日更新，打造中国优秀前卫军事网站。"},"item":[{"image":"http://img12.xinjunshi.com/allimg/161213/1HKI222-0-lp.jpg","news_show_type":10,"title":"中国顶级美女都出自哪里？最多的竟是这里","aid":"237729","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481676043","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"2","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/1HF261P-0-lp.jpg","news_show_type":10,"title":"生意好坏全看脸！全球出镜率最高的十大酒店","aid":"237727","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481676010","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"0","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131440330-L.jpg","news_show_type":10,"title":"河南男子吃黄焖鸡米饭吃出带毛肉 还有一对牙","aid":"237685","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481675970","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"60","pl":"7"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-161213143T20-L.jpg","news_show_type":31,"title":"美强迫症患者花百万整容：每天洗手75次","aid":"237679","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481612739","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"1","pl":"1","image_arr":["http://img12.xinjunshi.com/allimg/161213/143T43546-0.jpg","http://img12.xinjunshi.com/allimg/161213/143T43M1-1.jpg","http://img12.xinjunshi.com/allimg/161213/143T42414-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131436150-L.jpg","news_show_type":31,"title":"男孩天生面部带一面具:医生看后震惊","aid":"237678","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481612723","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"18","pl":"1","image_arr":["http://img12.xinjunshi.com/allimg/161213/1436445M3-0.jpg","http://img12.xinjunshi.com/allimg/161213/14364435D-1.jpg","http://img12.xinjunshi.com/allimg/161213/1436445428-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131043270-L.jpg","news_show_type":10,"title":"明星出道前居然经历了这些不为人知的屈辱","aid":"237637","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481675995","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"24","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131041490-L.jpg","news_show_type":10,"title":"犯罪现场清洁师:那些地方总是超出一般人的想象","aid":"237636","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481605556","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"5","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612131046140-L.jpg","news_show_type":10,"title":"违法行人变成大头表情包 这画风\u2026\u2026笑喷了！","aid":"237604","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481597008","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"18","pl":"1"},{"image":"http://img12.xinjunshi.com/allimg/161212/1FK15939-0-lp.jpg","news_show_type":31,"title":"银川非法屠狗场　金毛藏獒遭剥皮拆骨 场面骇人","aid":"237594","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481595383","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"18","pl":"6","image_arr":["http://img12.xinjunshi.com/allimg/161212/1FK15939-0.jpg","http://img12.xinjunshi.com/allimg/161212/1FK16093-1.jpg","http://img12.xinjunshi.com/allimg/161212/1FK12I7-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/17-1612121F3100-L.jpg","news_show_type":31,"title":"男子受伤成植物人 未婚妻：等你为我披婚纱","aid":"237593","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481595355","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"18","pl":"2","image_arr":["http://img12.xinjunshi.com/allimg/161212/1F3145911-0.jpg","http://img12.xinjunshi.com/allimg/161212/1F3141H9-1.jpg","http://img12.xinjunshi.com/allimg/161212/1F3142225-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/1F2194W6-0-lp.jpg","news_show_type":10,"title":"中国十种比熊猫还珍贵的动物：竟然还有它","aid":"237574","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591048","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"20","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/1F02062L-0-lp.jpg","news_show_type":10,"title":"十大伤肾行为曝光！没想到排第一的竟是这个","aid":"237572","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481590829","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"54","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121421250-L.jpg","news_show_type":10,"title":"亲生父母\u201c出租\u201d幼童5万元一年 专供外出盗窃","aid":"237529","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481523464","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"16","pl":"3"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121409340-L.jpg","news_show_type":31,"title":"中国船员讲述被囚经历：索马里就是人间地狱","aid":"237525","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481522654","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"19","pl":"4","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212140G2.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212140G5.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212140G5-50.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/132P0H05-0-lp.png","news_show_type":31,"title":"河南保安小伙娶漂亮美国女大学生 还生下混血儿","aid":"237520","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591104","category":"环球","red_tag":"热门","author":"阿修罗KP","digg":"205","pl":"9","image_arr":["http://img12.xinjunshi.com/allimg/161212/132P0H05-0.png","http://img12.xinjunshi.com/allimg/161212/132P05343-1.png","http://img12.xinjunshi.com/allimg/161212/132P0E38-2.png"]},{"image":"http://img12.xinjunshi.com/161212/15958-161212111AbV.jpg","news_show_type":10,"title":"极致魅惑！夜生活最疯狂的十大城市","aid":"237519","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481521799","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"7","pl":"2"},{"image":"http://img12.xinjunshi.com/161212/15958-161212113154c1.jpg","news_show_type":10,"title":"意大利人打仗不行 为何黑社会却那么牛","aid":"237512","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481519904","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"9","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161211/14531B639-0-lp.jpg","news_show_type":10,"title":"渔民在码头捡深海剧毒怪鱼 身形四四方方似箱子","aid":"237425","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503532","category":"环球","red_tag":"热门","author":"xjs_lm","digg":"78","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161211/14520L629-0-lp.jpg","news_show_type":31,"title":"诺贝尔奖颁奖仪式举行 文学奖得主缺席","aid":"237424","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481439022","category":"环球","red_tag":"环球","author":"xjs_lm","digg":"5","pl":"1","image_arr":["http://img12.xinjunshi.com/allimg/161211/14520L629-0.jpg","http://img12.xinjunshi.com/allimg/161211/14520G648-1.jpg","http://img12.xinjunshi.com/allimg/161211/14520J347-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161211/1450145043-0-lp.jpg","news_show_type":31,"title":"夜店美女亲述从业经历 简直不堪入目","aid":"237423","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503544","category":"环球","red_tag":"热门","author":"xjs_lm","digg":"263","pl":"14","image_arr":["http://img12.xinjunshi.com/allimg/161211/1450145043-0.jpg","http://img12.xinjunshi.com/allimg/161211/1450142I2-1.jpg","http://img12.xinjunshi.com/allimg/161211/1450145R2-2.jpg"]}],"is_recom":0,"maxpage":10}
     */

    private String mod;
    private int status;
    private String message;
    private DataBean data;

    public static List<HuangQiuBean> arrayHuangQiuBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HuangQiuBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HuangQiuBean> arrayHuangQiuBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HuangQiuBean>>() {
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
         * item : [{"image":"http://img12.xinjunshi.com/allimg/161213/1HKI222-0-lp.jpg","news_show_type":10,"title":"中国顶级美女都出自哪里？最多的竟是这里","aid":"237729","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481676043","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"2","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/1HF261P-0-lp.jpg","news_show_type":10,"title":"生意好坏全看脸！全球出镜率最高的十大酒店","aid":"237727","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481676010","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"0","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131440330-L.jpg","news_show_type":10,"title":"河南男子吃黄焖鸡米饭吃出带毛肉 还有一对牙","aid":"237685","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481675970","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"60","pl":"7"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-161213143T20-L.jpg","news_show_type":31,"title":"美强迫症患者花百万整容：每天洗手75次","aid":"237679","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481612739","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"1","pl":"1","image_arr":["http://img12.xinjunshi.com/allimg/161213/143T43546-0.jpg","http://img12.xinjunshi.com/allimg/161213/143T43M1-1.jpg","http://img12.xinjunshi.com/allimg/161213/143T42414-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131436150-L.jpg","news_show_type":31,"title":"男孩天生面部带一面具:医生看后震惊","aid":"237678","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481612723","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"18","pl":"1","image_arr":["http://img12.xinjunshi.com/allimg/161213/1436445M3-0.jpg","http://img12.xinjunshi.com/allimg/161213/14364435D-1.jpg","http://img12.xinjunshi.com/allimg/161213/1436445428-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131043270-L.jpg","news_show_type":10,"title":"明星出道前居然经历了这些不为人知的屈辱","aid":"237637","channel":"1","pubDate":"2016-12-14","pubTimestamp":"1481675995","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"24","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/35-1612131041490-L.jpg","news_show_type":10,"title":"犯罪现场清洁师:那些地方总是超出一般人的想象","aid":"237636","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481605556","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"5","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612131046140-L.jpg","news_show_type":10,"title":"违法行人变成大头表情包 这画风\u2026\u2026笑喷了！","aid":"237604","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481597008","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"18","pl":"1"},{"image":"http://img12.xinjunshi.com/allimg/161212/1FK15939-0-lp.jpg","news_show_type":31,"title":"银川非法屠狗场　金毛藏獒遭剥皮拆骨 场面骇人","aid":"237594","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481595383","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"18","pl":"6","image_arr":["http://img12.xinjunshi.com/allimg/161212/1FK15939-0.jpg","http://img12.xinjunshi.com/allimg/161212/1FK16093-1.jpg","http://img12.xinjunshi.com/allimg/161212/1FK12I7-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/17-1612121F3100-L.jpg","news_show_type":31,"title":"男子受伤成植物人 未婚妻：等你为我披婚纱","aid":"237593","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481595355","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"18","pl":"2","image_arr":["http://img12.xinjunshi.com/allimg/161212/1F3145911-0.jpg","http://img12.xinjunshi.com/allimg/161212/1F3141H9-1.jpg","http://img12.xinjunshi.com/allimg/161212/1F3142225-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/1F2194W6-0-lp.jpg","news_show_type":10,"title":"中国十种比熊猫还珍贵的动物：竟然还有它","aid":"237574","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591048","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"20","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/1F02062L-0-lp.jpg","news_show_type":10,"title":"十大伤肾行为曝光！没想到排第一的竟是这个","aid":"237572","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481590829","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"54","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121421250-L.jpg","news_show_type":10,"title":"亲生父母\u201c出租\u201d幼童5万元一年 专供外出盗窃","aid":"237529","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481523464","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"16","pl":"3"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121409340-L.jpg","news_show_type":31,"title":"中国船员讲述被囚经历：索马里就是人间地狱","aid":"237525","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481522654","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"19","pl":"4","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212140G2.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212140G5.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212140G5-50.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/132P0H05-0-lp.png","news_show_type":31,"title":"河南保安小伙娶漂亮美国女大学生 还生下混血儿","aid":"237520","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591104","category":"环球","red_tag":"热门","author":"阿修罗KP","digg":"205","pl":"9","image_arr":["http://img12.xinjunshi.com/allimg/161212/132P0H05-0.png","http://img12.xinjunshi.com/allimg/161212/132P05343-1.png","http://img12.xinjunshi.com/allimg/161212/132P0E38-2.png"]},{"image":"http://img12.xinjunshi.com/161212/15958-161212111AbV.jpg","news_show_type":10,"title":"极致魅惑！夜生活最疯狂的十大城市","aid":"237519","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481521799","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"7","pl":"2"},{"image":"http://img12.xinjunshi.com/161212/15958-161212113154c1.jpg","news_show_type":10,"title":"意大利人打仗不行 为何黑社会却那么牛","aid":"237512","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481519904","category":"环球","red_tag":"环球","author":"阿修罗KP","digg":"9","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161211/14531B639-0-lp.jpg","news_show_type":10,"title":"渔民在码头捡深海剧毒怪鱼 身形四四方方似箱子","aid":"237425","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503532","category":"环球","red_tag":"热门","author":"xjs_lm","digg":"78","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161211/14520L629-0-lp.jpg","news_show_type":31,"title":"诺贝尔奖颁奖仪式举行 文学奖得主缺席","aid":"237424","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481439022","category":"环球","red_tag":"环球","author":"xjs_lm","digg":"5","pl":"1","image_arr":["http://img12.xinjunshi.com/allimg/161211/14520L629-0.jpg","http://img12.xinjunshi.com/allimg/161211/14520G648-1.jpg","http://img12.xinjunshi.com/allimg/161211/14520J347-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161211/1450145043-0-lp.jpg","news_show_type":31,"title":"夜店美女亲述从业经历 简直不堪入目","aid":"237423","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503544","category":"环球","red_tag":"热门","author":"xjs_lm","digg":"263","pl":"14","image_arr":["http://img12.xinjunshi.com/allimg/161211/1450145043-0.jpg","http://img12.xinjunshi.com/allimg/161211/1450142I2-1.jpg","http://img12.xinjunshi.com/allimg/161211/1450145R2-2.jpg"]}]
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
             * image : http://img12.xinjunshi.com/allimg/161213/1HKI222-0-lp.jpg
             * news_show_type : 10
             * title : 中国顶级美女都出自哪里？最多的竟是这里
             * aid : 237729
             * channel : 1
             * pubDate : 2016-12-14
             * pubTimestamp : 1481676043
             * category : 环球
             * red_tag : 最新
             * author : 阿修罗KP
             * digg : 2
             * pl : 0
             * image_arr : ["http://img12.xinjunshi.com/allimg/161213/143T43546-0.jpg","http://img12.xinjunshi.com/allimg/161213/143T43M1-1.jpg","http://img12.xinjunshi.com/allimg/161213/143T42414-2.jpg"]
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
