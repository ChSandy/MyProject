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

public class PaiHangBean {

    /**
     * mod : newslist
     * status : 0
     * message : ok
     * data : {"title":{"typename":"军事","link":"http://m.xinjunshi.com/","description":"环球新军事网手机站（m.xinjunshi.com）提供最新军事新闻、中国军事新闻、国际军事新闻、军事图片等军事资料，以中国军事军情为主，每日更新，打造中国优秀前卫军事网站。"},"item":[{"title":"中国军机遭日本战机干扰 专家称日方明知故犯","aid":"237410","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481434982","category":"军事","author":"鸿小猴_LH","digg":"156","pl":"132","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161211/35-161211134357.jpg","http://img12.xinjunshi.com/allimg/161211/35-161211134357-50.jpg","http://img12.xinjunshi.com/allimg/161211/35-161211134357-51.jpg"],"news_show_type":31,"santu":1,"yituwutu":0,"img_length":3},{"title":"昨天 中国经历15年来最羞辱一天 需牢记","aid":"237534","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481526054","category":"军事","author":"阿修罗KP","digg":"337","pl":"112","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212150302.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212150303.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212150303-50.jpg"],"news_show_type":31,"santu":2,"yituwutu":0,"img_length":3},{"title":"中国突然对日＂下手＂ ：大批日企逃离中国","aid":"237430","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503503","category":"军事","author":"阿修罗KP","digg":"1052","pl":"107","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161211/0P0231423-0.jpg","http://img12.xinjunshi.com/allimg/161211/0P02324X-1.jpg","http://img12.xinjunshi.com/allimg/161211/0P0235322-2.jpg"],"news_show_type":31,"santu":3,"yituwutu":0,"img_length":3},{"title":"台湾10条吹牛语录：大陆人看后笑坏了","aid":"237432","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481454247","category":"军事","author":"阿修罗KP","digg":"142","pl":"102","red_tag":"热点","image":"http://img12.xinjunshi.com/161211/15958-1612110S922O5.jpg","news_show_type":10,"santu":3,"yituwutu":1,"img_length":3},{"title":"中美开战谁的损失更大？答案出乎所有人预料","aid":"237402","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503520","category":"军事","author":"鸿小猴_LH","digg":"183","pl":"86","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161211/35-1612111125230-L.jpg","news_show_type":10,"santu":3,"yituwutu":2,"img_length":3},{"title":"美国帮台湾出一奇招：应对解放军最好的方法","aid":"237435","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481461768","category":"军事","author":"阿修罗KP","digg":"138","pl":"72","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161211/0921442634-0-lp.jpg","news_show_type":10,"santu":0,"yituwutu":3,"img_length":3},{"title":"\u201c二愣子\u201d特朗普玩火自焚，挑衅\u201c一个中国\u201c政策","aid":"237564","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545095","category":"军事","author":"鸿小猴_LH","digg":"162","pl":"67","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212095G7.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212095G8.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212095G9.jpg"],"news_show_type":31,"santu":1,"yituwutu":0,"img_length":3},{"title":"这国开始向中国求饶：还拉上俄罗斯说好话","aid":"237563","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591074","category":"军事","author":"鸿小猴_LH","digg":"234","pl":"65","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/0T0114020-0.jpg","http://img12.xinjunshi.com/allimg/161212/0T011BF-1.jpg","http://img12.xinjunshi.com/allimg/161212/0T01141N-2.jpg"],"news_show_type":31,"santu":2,"yituwutu":0,"img_length":3},{"title":"日本向中国经济抛下原子弹：北京疯狂报复","aid":"237558","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540751","category":"军事","author":"鸿小猴_LH","digg":"355","pl":"56","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/102KWS6-0.jpg","http://img12.xinjunshi.com/allimg/161212/102KTJ9-1.jpg","http://img12.xinjunshi.com/allimg/161212/102KQ062-2.jpg"],"news_show_type":31,"santu":3,"yituwutu":0,"img_length":3},{"title":"中国军机遭日战机拦路？真相让人笑醒","aid":"237433","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481461738","category":"军事","author":"阿修罗KP","digg":"389","pl":"55","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161211/0U01GD7-0-lp.jpg","news_show_type":10,"santu":3,"yituwutu":1,"img_length":3},{"title":"实现两岸统一只能打出来！寄希望别人都是笑话","aid":"237517","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481521740","category":"军事","author":"阿修罗KP","digg":"88","pl":"54","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161212/103T511I-0-lp.jpg","news_show_type":10,"santu":3,"yituwutu":2,"img_length":3},{"title":"猛料：蔡英文两年内下台 下场比朴槿惠更惨","aid":"237566","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481546826","category":"军事","author":"鸿小猴_LH","digg":"407","pl":"53","red_tag":"热点","image":"http://img12.xinjunshi.com/161212/15958-1612120Q31LJ.jpg","news_show_type":10,"santu":0,"yituwutu":3,"img_length":3},{"title":"美国再现恐怖一幕：人民日报发最强警告","aid":"237546","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530224","category":"军事","author":"阿修罗KP","digg":"194","pl":"53","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212161300.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212161300-50.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212161300-51.jpg"],"news_show_type":31,"santu":1,"yituwutu":0,"img_length":3},{"title":"台独大佬放话：美可把台湾当棋子对大陆施压","aid":"237562","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545055","category":"军事","author":"鸿小猴_LH","digg":"98","pl":"52","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212103930.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212104014.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212103932.jpg"],"news_show_type":31,"santu":2,"yituwutu":0,"img_length":3},{"title":"川普被逼要南海宣战：美军竟被一日本人掌控","aid":"237384","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481421408","category":"军事","author":"xjs_lm","digg":"83","pl":"48","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161211/095J4H62-0.jpg","http://img12.xinjunshi.com/allimg/161211/095J41223-1.jpg","http://img12.xinjunshi.com/allimg/161211/095J44252-2.jpg"],"news_show_type":31,"santu":3,"yituwutu":0,"img_length":3},{"title":"中国使出浑身解数：这场外交硬仗还是吃亏了","aid":"237559","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540779","category":"军事","author":"鸿小猴_LH","digg":"166","pl":"47","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161212/102F33624-0-lp.jpg","news_show_type":10,"santu":3,"yituwutu":1,"img_length":3},{"title":"美军说出大实话 最先进武器100%依赖中国","aid":"237458","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481506069","category":"军事","author":"阿修罗KP","digg":"216","pl":"46","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161212/0S3143b3-0-lp.jpg","news_show_type":10,"santu":3,"yituwutu":2,"img_length":3},{"title":"国人都惊呆了！中国最大敌人竟是北方这国","aid":"237510","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481519777","category":"军事","author":"阿修罗KP","digg":"173","pl":"45","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161212/1033521091-0-lp.jpg","news_show_type":10,"santu":0,"yituwutu":3,"img_length":3},{"title":"美国拦都拦不住：这些中国人要去朝拜川普","aid":"237565","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545121","category":"军事","author":"鸿小猴_LH","digg":"71","pl":"43","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/0R44SE4-0.jpg","http://img12.xinjunshi.com/allimg/161212/0R44VT8-1.jpg","http://img12.xinjunshi.com/allimg/161212/0R44W059-2.jpg"],"news_show_type":31,"santu":1,"yituwutu":0,"img_length":3},{"title":"中国打出这张王牌：日本或痛失一大片领土","aid":"237401","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481432506","category":"军事","author":"鸿小猴_LH","digg":"300","pl":"42","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161211/112Ja491-0.jpg","http://img12.xinjunshi.com/allimg/161211/112J91211-1.jpg","http://img12.xinjunshi.com/allimg/161211/112Ja242-2.jpg"],"news_show_type":31,"santu":2,"yituwutu":0,"img_length":3}],"status":0,"maxpage":5}
     */

    private String mod;
    private int status;
    private String message;
    private DataBean data;

    public static List<PaiHangBean> arrayPaiHangBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<PaiHangBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<PaiHangBean> arrayPaiHangBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<PaiHangBean>>() {
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
         * item : [{"title":"中国军机遭日本战机干扰 专家称日方明知故犯","aid":"237410","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481434982","category":"军事","author":"鸿小猴_LH","digg":"156","pl":"132","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161211/35-161211134357.jpg","http://img12.xinjunshi.com/allimg/161211/35-161211134357-50.jpg","http://img12.xinjunshi.com/allimg/161211/35-161211134357-51.jpg"],"news_show_type":31,"santu":1,"yituwutu":0,"img_length":3},{"title":"昨天 中国经历15年来最羞辱一天 需牢记","aid":"237534","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481526054","category":"军事","author":"阿修罗KP","digg":"337","pl":"112","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212150302.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212150303.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212150303-50.jpg"],"news_show_type":31,"santu":2,"yituwutu":0,"img_length":3},{"title":"中国突然对日＂下手＂ ：大批日企逃离中国","aid":"237430","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503503","category":"军事","author":"阿修罗KP","digg":"1052","pl":"107","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161211/0P0231423-0.jpg","http://img12.xinjunshi.com/allimg/161211/0P02324X-1.jpg","http://img12.xinjunshi.com/allimg/161211/0P0235322-2.jpg"],"news_show_type":31,"santu":3,"yituwutu":0,"img_length":3},{"title":"台湾10条吹牛语录：大陆人看后笑坏了","aid":"237432","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481454247","category":"军事","author":"阿修罗KP","digg":"142","pl":"102","red_tag":"热点","image":"http://img12.xinjunshi.com/161211/15958-1612110S922O5.jpg","news_show_type":10,"santu":3,"yituwutu":1,"img_length":3},{"title":"中美开战谁的损失更大？答案出乎所有人预料","aid":"237402","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481503520","category":"军事","author":"鸿小猴_LH","digg":"183","pl":"86","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161211/35-1612111125230-L.jpg","news_show_type":10,"santu":3,"yituwutu":2,"img_length":3},{"title":"美国帮台湾出一奇招：应对解放军最好的方法","aid":"237435","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481461768","category":"军事","author":"阿修罗KP","digg":"138","pl":"72","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161211/0921442634-0-lp.jpg","news_show_type":10,"santu":0,"yituwutu":3,"img_length":3},{"title":"\u201c二愣子\u201d特朗普玩火自焚，挑衅\u201c一个中国\u201c政策","aid":"237564","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545095","category":"军事","author":"鸿小猴_LH","digg":"162","pl":"67","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212095G7.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212095G8.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212095G9.jpg"],"news_show_type":31,"santu":1,"yituwutu":0,"img_length":3},{"title":"这国开始向中国求饶：还拉上俄罗斯说好话","aid":"237563","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591074","category":"军事","author":"鸿小猴_LH","digg":"234","pl":"65","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/0T0114020-0.jpg","http://img12.xinjunshi.com/allimg/161212/0T011BF-1.jpg","http://img12.xinjunshi.com/allimg/161212/0T01141N-2.jpg"],"news_show_type":31,"santu":2,"yituwutu":0,"img_length":3},{"title":"日本向中国经济抛下原子弹：北京疯狂报复","aid":"237558","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540751","category":"军事","author":"鸿小猴_LH","digg":"355","pl":"56","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/102KWS6-0.jpg","http://img12.xinjunshi.com/allimg/161212/102KTJ9-1.jpg","http://img12.xinjunshi.com/allimg/161212/102KQ062-2.jpg"],"news_show_type":31,"santu":3,"yituwutu":0,"img_length":3},{"title":"中国军机遭日战机拦路？真相让人笑醒","aid":"237433","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481461738","category":"军事","author":"阿修罗KP","digg":"389","pl":"55","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161211/0U01GD7-0-lp.jpg","news_show_type":10,"santu":3,"yituwutu":1,"img_length":3},{"title":"实现两岸统一只能打出来！寄希望别人都是笑话","aid":"237517","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481521740","category":"军事","author":"阿修罗KP","digg":"88","pl":"54","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161212/103T511I-0-lp.jpg","news_show_type":10,"santu":3,"yituwutu":2,"img_length":3},{"title":"猛料：蔡英文两年内下台 下场比朴槿惠更惨","aid":"237566","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481546826","category":"军事","author":"鸿小猴_LH","digg":"407","pl":"53","red_tag":"热点","image":"http://img12.xinjunshi.com/161212/15958-1612120Q31LJ.jpg","news_show_type":10,"santu":0,"yituwutu":3,"img_length":3},{"title":"美国再现恐怖一幕：人民日报发最强警告","aid":"237546","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530224","category":"军事","author":"阿修罗KP","digg":"194","pl":"53","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212161300.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212161300-50.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212161300-51.jpg"],"news_show_type":31,"santu":1,"yituwutu":0,"img_length":3},{"title":"台独大佬放话：美可把台湾当棋子对大陆施压","aid":"237562","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545055","category":"军事","author":"鸿小猴_LH","digg":"98","pl":"52","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212103930.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212104014.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212103932.jpg"],"news_show_type":31,"santu":2,"yituwutu":0,"img_length":3},{"title":"川普被逼要南海宣战：美军竟被一日本人掌控","aid":"237384","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481421408","category":"军事","author":"xjs_lm","digg":"83","pl":"48","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161211/095J4H62-0.jpg","http://img12.xinjunshi.com/allimg/161211/095J41223-1.jpg","http://img12.xinjunshi.com/allimg/161211/095J44252-2.jpg"],"news_show_type":31,"santu":3,"yituwutu":0,"img_length":3},{"title":"中国使出浑身解数：这场外交硬仗还是吃亏了","aid":"237559","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540779","category":"军事","author":"鸿小猴_LH","digg":"166","pl":"47","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161212/102F33624-0-lp.jpg","news_show_type":10,"santu":3,"yituwutu":1,"img_length":3},{"title":"美军说出大实话 最先进武器100%依赖中国","aid":"237458","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481506069","category":"军事","author":"阿修罗KP","digg":"216","pl":"46","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161212/0S3143b3-0-lp.jpg","news_show_type":10,"santu":3,"yituwutu":2,"img_length":3},{"title":"国人都惊呆了！中国最大敌人竟是北方这国","aid":"237510","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481519777","category":"军事","author":"阿修罗KP","digg":"173","pl":"45","red_tag":"热点","image":"http://img12.xinjunshi.com/allimg/161212/1033521091-0-lp.jpg","news_show_type":10,"santu":0,"yituwutu":3,"img_length":3},{"title":"美国拦都拦不住：这些中国人要去朝拜川普","aid":"237565","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545121","category":"军事","author":"鸿小猴_LH","digg":"71","pl":"43","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161212/0R44SE4-0.jpg","http://img12.xinjunshi.com/allimg/161212/0R44VT8-1.jpg","http://img12.xinjunshi.com/allimg/161212/0R44W059-2.jpg"],"news_show_type":31,"santu":1,"yituwutu":0,"img_length":3},{"title":"中国打出这张王牌：日本或痛失一大片领土","aid":"237401","channel":"1","pubDate":"2016-12-11","pubTimestamp":"1481432506","category":"军事","author":"鸿小猴_LH","digg":"300","pl":"42","red_tag":"热点","image_arr":["http://img12.xinjunshi.com/allimg/161211/112Ja491-0.jpg","http://img12.xinjunshi.com/allimg/161211/112J91211-1.jpg","http://img12.xinjunshi.com/allimg/161211/112Ja242-2.jpg"],"news_show_type":31,"santu":2,"yituwutu":0,"img_length":3}]
         * status : 0
         * maxpage : 5
         */

        private TitleBean title;
        private int status;
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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
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
             * title : 中国军机遭日本战机干扰 专家称日方明知故犯
             * aid : 237410
             * channel : 1
             * pubDate : 2016-12-11
             * pubTimestamp : 1481434982
             * category : 军事
             * author : 鸿小猴_LH
             * digg : 156
             * pl : 132
             * red_tag : 热点
             * image_arr : ["http://img12.xinjunshi.com/allimg/161211/35-161211134357.jpg","http://img12.xinjunshi.com/allimg/161211/35-161211134357-50.jpg","http://img12.xinjunshi.com/allimg/161211/35-161211134357-51.jpg"]
             * news_show_type : 31
             * santu : 1
             * yituwutu : 0
             * img_length : 3
             * image : http://img12.xinjunshi.com/161211/15958-1612110S922O5.jpg
             */

            private String title;
            private String aid;
            private String channel;
            private String pubDate;
            private String pubTimestamp;
            private String category;
            private String author;
            private String digg;
            private String pl;
            private String red_tag;
            private int news_show_type;
            private int santu;
            private int yituwutu;
            private int img_length;
            private String image;
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

            public String getRed_tag() {
                return red_tag;
            }

            public void setRed_tag(String red_tag) {
                this.red_tag = red_tag;
            }

            public int getNews_show_type() {
                return news_show_type;
            }

            public void setNews_show_type(int news_show_type) {
                this.news_show_type = news_show_type;
            }

            public int getSantu() {
                return santu;
            }

            public void setSantu(int santu) {
                this.santu = santu;
            }

            public int getYituwutu() {
                return yituwutu;
            }

            public void setYituwutu(int yituwutu) {
                this.yituwutu = yituwutu;
            }

            public int getImg_length() {
                return img_length;
            }

            public void setImg_length(int img_length) {
                this.img_length = img_length;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
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
