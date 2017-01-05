package com.qf.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/12.
 */

public class NewBean {


    /**
     * mod : newslist
     * status : 0
     * message : ok
     * data : {"title":{"typename":"军事","link":"http://m.xinjunshi.com/","description":"环球新军事网手机站（m.xinjunshi.com）提供最新军事新闻、中国军事新闻、国际军事新闻、军事图片等军事资料，以中国军事军情为主，每日更新，打造中国优秀前卫军事网站。"},"nav":[{"name":"推荐","url":"app.php?mod=newslist&act=index"},{"name":"排行","url":"app.php?mod=rank_list"},{"name":"图片","url":"app.php?mod=newslist&act=tuwen"},{"name":"环球","url":"app.php?mod=newslist&act=2"},{"name":"历史","url":"app.php?mod=newslist&act=6"},{"name":"资料","url":"","showtype":1}],"slide":[{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130UQ40-L.jpg","news_show_type":12,"title":"朴槿惠被弹劾后韩发生这事:中国笑了","aid":"237571","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481589988","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"21","pl":"3"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130T4470-L.jpg","news_show_type":12,"title":"号称无敌的美间谍神器:头疼中国渔民","aid":"237570","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481589506","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"33","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130S6220-L.jpg","news_show_type":12,"title":"安倍送狗惨遭侮辱：日网民这样评论","aid":"237569","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481588940","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"32","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130R6340-L.png","news_show_type":12,"title":"中国一大动作：丢掉朝最后救命稻草","aid":"237568","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481588554","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"63","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121542200-L.jpg","news_show_type":12,"title":"早间资讯：2016年12月13日（周二）","aid":"237540","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481577300","category":"军事","red_tag":"军事","author":"阿修罗KP","digg":"32","pl":"2"}],"top":[],"item":[{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130943080-L.jpg","news_show_type":10,"title":"美国白宫10天内3次重申：坚定奉行一个中国政策","aid":"237586","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481593287","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"1","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130941140-L.jpg","news_show_type":10,"title":"默克尔称坚持\u201c一个中国\u201d政策 不可能跟随特朗普","aid":"237585","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481593216","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"4","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130939350-L.jpg","news_show_type":10,"title":"日：中国国产航母日夜赶工 最早明年初下水","aid":"237584","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481593039","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"2","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130936310-L.jpg","news_show_type":10,"title":"中国应准备与特朗普掰手腕 从严惩\u201c台独\u201d做起","aid":"237583","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481592835","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"7","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130932110-L.jpg","news_show_type":10,"title":"我外长再对川蔡通话表态：最终只能搬石头砸自己脚","aid":"237582","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481592684","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"10","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130930400-L.jpg","news_show_type":10,"title":"台军妄称解放军战机若故障迫降台湾 台方将人道救援","aid":"237581","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481592545","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"7","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/0PS55426-0-lp.jpg","news_show_type":31,"title":"川普竟被自己人忽悠了！真相令人大跌眼镜","aid":"237567","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481546846","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"134","pl":"31","image_arr":["http://img12.xinjunshi.com/allimg/161212/0PS55426-0.jpg","http://img12.xinjunshi.com/allimg/161212/0PS55405-1.jpg","http://img12.xinjunshi.com/allimg/161212/0PS54219-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161209/17905-1612091014010-L.jpg","news_show_type":10,"title":"真正的福利：它比这个翘臀的美女还要惹火！","aid":"237162","channel":"98","redirecturl":"http://m.shop.xinjunshi.com/goods.php?id=40&from=app","pubDate":"2016-12-09","pubTimestamp":"1481249599","category":"推广","red_tag":"推广","author":"君品汇","digg":"0","pl":"0"},{"image":"http://img12.xinjunshi.com/161212/15958-1612120Q31LJ.jpg","news_show_type":10,"title":"猛料：蔡英文两年内下台 下场比朴槿惠更惨","aid":"237566","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481546826","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"336","pl":"50"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-161213091I20-L.jpg","news_show_type":20,"title":"歼20机载大屏幕触摸显示器被公开 竟然可以声控","aid":"237579","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481591746","category":"视频","red_tag":"最新","author":"阿修罗KP","digg":"4","pl":"0"},{"news_show_type":"13","ad_place_id":"2478457","aid":"aid1","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/0R44SE4-0-lp.jpg","news_show_type":10,"title":"美国拦都拦不住：这些中国人要去朝拜川普","aid":"237565","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545121","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"55","pl":"36"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-161212095Z70-L.jpg","news_show_type":10,"title":"\u201c二愣子\u201d特朗普玩火自焚，挑衅\u201c一个中国\u201c政策","aid":"237564","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545095","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"137","pl":"58"},{"image":"http://img12.xinjunshi.com/allimg/161212/0T0114020-0-lp.jpg","news_show_type":10,"title":"这国开始向中国求饶：还拉上俄罗斯说好话","aid":"237563","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591074","category":"军事","red_tag":"最新","author":"鸿小猴_LH","digg":"162","pl":"46"},{"image":"http://img12.xinjunshi.com/allimg/161212/14312-1612121601000-L.jpg","news_show_type":10,"title":"水浒中那些极度雷人的男女奸情事件曝光！","aid":"237543","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591118","category":"历史","red_tag":"最新","author":"阿修罗KP","digg":"37","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121042000-L.jpg","news_show_type":31,"title":"台独大佬放话：美可把台湾当棋子对大陆施压","aid":"237562","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545055","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"87","pl":"41","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212103930.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212104014.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212103932.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/1F2194W6-0-lp.jpg","news_show_type":10,"title":"中国十种比熊猫还珍贵的动物：竟然还有它","aid":"237574","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591048","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"5","pl":"0"},{"news_show_type":"14","ad_place_id":"2784767","aid":"aid1","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/10255423M-0-lp.jpg","news_show_type":10,"title":"特朗普一通电话要了朴槿惠的命：中国大胜","aid":"237561","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545031","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"142","pl":"18"},{"image":"http://img12.xinjunshi.com/allimg/161212/10262351H-0-lp.jpg","news_show_type":10,"title":"中国这次不忍了！出狠手吊打2个白眼狼国家","aid":"237560","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540809","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"295","pl":"33"},{"image":"http://img12.xinjunshi.com/allimg/161212/102F33624-0-lp.jpg","news_show_type":10,"title":"中国使出浑身解数：这场外交硬仗还是吃亏了","aid":"237559","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540779","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"133","pl":"39"},{"image":"http://img12.xinjunshi.com/allimg/161212/17-161212102K60-L.jpg","news_show_type":10,"title":"日本向中国经济抛下原子弹：北京疯狂报复","aid":"237558","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540751","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"289","pl":"48"},{"news_show_type":"13","ad_place_id":"2478457","aid":"aid2","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/14312-161212155Q90-L.jpg","news_show_type":10,"title":"史上最有钱的十大名妓：个个都能靠身体吃饭","aid":"237542","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481529775","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"14","pl":"4"},{"image":"http://img12.xinjunshi.com/allimg/161212/1030512932-0-lp.jpg","news_show_type":31,"title":"跨界总统川菜来了：中美俄三国，谁是谁的菜？","aid":"237557","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540727","category":"军事","red_tag":"军事","author":"鸿小猴_LH","digg":"41","pl":"5","image_arr":["http://img12.xinjunshi.com/allimg/161212/1030512932-0.jpg","http://img12.xinjunshi.com/allimg/161212/103051BA-1.jpg","http://img12.xinjunshi.com/allimg/161212/1030511B0-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130915360-L.jpg","news_show_type":10,"title":"美媒:中国准备试射反卫星武器 将成北京杀手锏","aid":"237577","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481591635","category":"视频","red_tag":"最新","author":"阿修罗KP","digg":"2","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/10313Q1b-0-lp.jpg","news_show_type":10,"title":"川普蔡英文通话：送中国一意想不到的大礼","aid":"237556","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481539962","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"60","pl":"15"},{"image":"http://img12.xinjunshi.com/allimg/161209/17905-1612091012480-L.jpg","news_show_type":10,"title":"套住男人的不仅只有杜蕾斯，这个神器让你无法拒绝！","aid":"237161","channel":"98","redirecturl":"http://m.shop.xinjunshi.com/goods.php?id=42&from=app","pubDate":"2016-12-09","pubTimestamp":"1481249244","category":"推广","red_tag":"推广","author":"君品汇","digg":"0","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121620240-L.jpg","news_show_type":10,"title":"日本人终于承认：这一领域我们不如中国","aid":"237548","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530699","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"145","pl":"11"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-161212161K00-L.jpg","news_show_type":10,"title":"中国加入WTO15年赚了多少钱？西方后悔死","aid":"237547","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530507","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"170","pl":"27"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121614310-L.jpg","news_show_type":10,"title":"美国再现恐怖一幕：人民日报发最强警告","aid":"237546","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530224","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"183","pl":"53"},{"news_show_type":"13","ad_place_id":"2478457","aid":"aid3","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121610050-L.jpg","news_show_type":10,"title":"推崇中国为王取代美国地位？英媒爆出内情","aid":"237545","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530056","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"100","pl":"11"},{"news_show_type":"14","ad_place_id":"2784767","aid":"aid2","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121606210-L.jpg","news_show_type":10,"title":"又一国突然宣布废除纸币：效仿印度","aid":"237544","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481529817","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"51","pl":"10"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121522410-L.jpg","news_show_type":10,"title":"军情纵览：2016年12月12日（周一）","aid":"237538","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481592169","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"52","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121511360-L.jpg","news_show_type":10,"title":"口气真不小！蔡英文喊出对大陆战略原则","aid":"237536","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481526529","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"57","pl":"26"}],"is_recom":0,"maxpage":10}
     */

    private String mod;
    private int status;
    private String message;
    private DataBean data;

    public static List<NewBean> arrayNewBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<NewBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<NewBean> arrayNewBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<NewBean>>() {
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
         * nav : [{"name":"推荐","url":"app.php?mod=newslist&act=index"},{"name":"排行","url":"app.php?mod=rank_list"},{"name":"图片","url":"app.php?mod=newslist&act=tuwen"},{"name":"环球","url":"app.php?mod=newslist&act=2"},{"name":"历史","url":"app.php?mod=newslist&act=6"},{"name":"资料","url":"","showtype":1}]
         * slide : [{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130UQ40-L.jpg","news_show_type":12,"title":"朴槿惠被弹劾后韩发生这事:中国笑了","aid":"237571","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481589988","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"21","pl":"3"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130T4470-L.jpg","news_show_type":12,"title":"号称无敌的美间谍神器:头疼中国渔民","aid":"237570","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481589506","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"33","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130S6220-L.jpg","news_show_type":12,"title":"安倍送狗惨遭侮辱：日网民这样评论","aid":"237569","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481588940","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"32","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130R6340-L.png","news_show_type":12,"title":"中国一大动作：丢掉朝最后救命稻草","aid":"237568","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481588554","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"63","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121542200-L.jpg","news_show_type":12,"title":"早间资讯：2016年12月13日（周二）","aid":"237540","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481577300","category":"军事","red_tag":"军事","author":"阿修罗KP","digg":"32","pl":"2"}]
         * top : []
         * item : [{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130943080-L.jpg","news_show_type":10,"title":"美国白宫10天内3次重申：坚定奉行一个中国政策","aid":"237586","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481593287","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"1","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130941140-L.jpg","news_show_type":10,"title":"默克尔称坚持\u201c一个中国\u201d政策 不可能跟随特朗普","aid":"237585","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481593216","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"4","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130939350-L.jpg","news_show_type":10,"title":"日：中国国产航母日夜赶工 最早明年初下水","aid":"237584","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481593039","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"2","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130936310-L.jpg","news_show_type":10,"title":"中国应准备与特朗普掰手腕 从严惩\u201c台独\u201d做起","aid":"237583","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481592835","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"7","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130932110-L.jpg","news_show_type":10,"title":"我外长再对川蔡通话表态：最终只能搬石头砸自己脚","aid":"237582","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481592684","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"10","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130930400-L.jpg","news_show_type":10,"title":"台军妄称解放军战机若故障迫降台湾 台方将人道救援","aid":"237581","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481592545","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"7","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/0PS55426-0-lp.jpg","news_show_type":31,"title":"川普竟被自己人忽悠了！真相令人大跌眼镜","aid":"237567","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481546846","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"134","pl":"31","image_arr":["http://img12.xinjunshi.com/allimg/161212/0PS55426-0.jpg","http://img12.xinjunshi.com/allimg/161212/0PS55405-1.jpg","http://img12.xinjunshi.com/allimg/161212/0PS54219-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161209/17905-1612091014010-L.jpg","news_show_type":10,"title":"真正的福利：它比这个翘臀的美女还要惹火！","aid":"237162","channel":"98","redirecturl":"http://m.shop.xinjunshi.com/goods.php?id=40&from=app","pubDate":"2016-12-09","pubTimestamp":"1481249599","category":"推广","red_tag":"推广","author":"君品汇","digg":"0","pl":"0"},{"image":"http://img12.xinjunshi.com/161212/15958-1612120Q31LJ.jpg","news_show_type":10,"title":"猛料：蔡英文两年内下台 下场比朴槿惠更惨","aid":"237566","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481546826","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"336","pl":"50"},{"image":"http://img12.xinjunshi.com/allimg/161213/21-161213091I20-L.jpg","news_show_type":20,"title":"歼20机载大屏幕触摸显示器被公开 竟然可以声控","aid":"237579","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481591746","category":"视频","red_tag":"最新","author":"阿修罗KP","digg":"4","pl":"0"},{"news_show_type":"13","ad_place_id":"2478457","aid":"aid1","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/0R44SE4-0-lp.jpg","news_show_type":10,"title":"美国拦都拦不住：这些中国人要去朝拜川普","aid":"237565","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545121","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"55","pl":"36"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-161212095Z70-L.jpg","news_show_type":10,"title":"\u201c二愣子\u201d特朗普玩火自焚，挑衅\u201c一个中国\u201c政策","aid":"237564","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545095","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"137","pl":"58"},{"image":"http://img12.xinjunshi.com/allimg/161212/0T0114020-0-lp.jpg","news_show_type":10,"title":"这国开始向中国求饶：还拉上俄罗斯说好话","aid":"237563","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591074","category":"军事","red_tag":"最新","author":"鸿小猴_LH","digg":"162","pl":"46"},{"image":"http://img12.xinjunshi.com/allimg/161212/14312-1612121601000-L.jpg","news_show_type":10,"title":"水浒中那些极度雷人的男女奸情事件曝光！","aid":"237543","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591118","category":"历史","red_tag":"最新","author":"阿修罗KP","digg":"37","pl":"2"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121042000-L.jpg","news_show_type":31,"title":"台独大佬放话：美可把台湾当棋子对大陆施压","aid":"237562","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545055","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"87","pl":"41","image_arr":["http://img12.xinjunshi.com/allimg/161212/21-161212103930.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212104014.jpg","http://img12.xinjunshi.com/allimg/161212/21-161212103932.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161212/1F2194W6-0-lp.jpg","news_show_type":10,"title":"中国十种比熊猫还珍贵的动物：竟然还有它","aid":"237574","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481591048","category":"环球","red_tag":"最新","author":"阿修罗KP","digg":"5","pl":"0"},{"news_show_type":"14","ad_place_id":"2784767","aid":"aid1","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/10255423M-0-lp.jpg","news_show_type":10,"title":"特朗普一通电话要了朴槿惠的命：中国大胜","aid":"237561","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481545031","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"142","pl":"18"},{"image":"http://img12.xinjunshi.com/allimg/161212/10262351H-0-lp.jpg","news_show_type":10,"title":"中国这次不忍了！出狠手吊打2个白眼狼国家","aid":"237560","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540809","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"295","pl":"33"},{"image":"http://img12.xinjunshi.com/allimg/161212/102F33624-0-lp.jpg","news_show_type":10,"title":"中国使出浑身解数：这场外交硬仗还是吃亏了","aid":"237559","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540779","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"133","pl":"39"},{"image":"http://img12.xinjunshi.com/allimg/161212/17-161212102K60-L.jpg","news_show_type":10,"title":"日本向中国经济抛下原子弹：北京疯狂报复","aid":"237558","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540751","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"289","pl":"48"},{"news_show_type":"13","ad_place_id":"2478457","aid":"aid2","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/14312-161212155Q90-L.jpg","news_show_type":10,"title":"史上最有钱的十大名妓：个个都能靠身体吃饭","aid":"237542","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481529775","category":"历史","red_tag":"历史","author":"阿修罗KP","digg":"14","pl":"4"},{"image":"http://img12.xinjunshi.com/allimg/161212/1030512932-0-lp.jpg","news_show_type":31,"title":"跨界总统川菜来了：中美俄三国，谁是谁的菜？","aid":"237557","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481540727","category":"军事","red_tag":"军事","author":"鸿小猴_LH","digg":"41","pl":"5","image_arr":["http://img12.xinjunshi.com/allimg/161212/1030512932-0.jpg","http://img12.xinjunshi.com/allimg/161212/103051BA-1.jpg","http://img12.xinjunshi.com/allimg/161212/1030511B0-2.jpg"]},{"image":"http://img12.xinjunshi.com/allimg/161213/21-1612130915360-L.jpg","news_show_type":10,"title":"美媒:中国准备试射反卫星武器 将成北京杀手锏","aid":"237577","channel":"18","pubDate":"2016-12-13","pubTimestamp":"1481591635","category":"视频","red_tag":"最新","author":"阿修罗KP","digg":"2","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/10313Q1b-0-lp.jpg","news_show_type":10,"title":"川普蔡英文通话：送中国一意想不到的大礼","aid":"237556","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481539962","category":"军事","red_tag":"热门","author":"鸿小猴_LH","digg":"60","pl":"15"},{"image":"http://img12.xinjunshi.com/allimg/161209/17905-1612091012480-L.jpg","news_show_type":10,"title":"套住男人的不仅只有杜蕾斯，这个神器让你无法拒绝！","aid":"237161","channel":"98","redirecturl":"http://m.shop.xinjunshi.com/goods.php?id=42&from=app","pubDate":"2016-12-09","pubTimestamp":"1481249244","category":"推广","red_tag":"推广","author":"君品汇","digg":"0","pl":"0"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121620240-L.jpg","news_show_type":10,"title":"日本人终于承认：这一领域我们不如中国","aid":"237548","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530699","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"145","pl":"11"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-161212161K00-L.jpg","news_show_type":10,"title":"中国加入WTO15年赚了多少钱？西方后悔死","aid":"237547","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530507","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"170","pl":"27"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121614310-L.jpg","news_show_type":10,"title":"美国再现恐怖一幕：人民日报发最强警告","aid":"237546","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530224","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"183","pl":"53"},{"news_show_type":"13","ad_place_id":"2478457","aid":"aid3","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121610050-L.jpg","news_show_type":10,"title":"推崇中国为王取代美国地位？英媒爆出内情","aid":"237545","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481530056","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"100","pl":"11"},{"news_show_type":"14","ad_place_id":"2784767","aid":"aid2","channel":"1","category":"推广","red_tag":"推广"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121606210-L.jpg","news_show_type":10,"title":"又一国突然宣布废除纸币：效仿印度","aid":"237544","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481529817","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"51","pl":"10"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121522410-L.jpg","news_show_type":10,"title":"军情纵览：2016年12月12日（周一）","aid":"237538","channel":"1","pubDate":"2016-12-13","pubTimestamp":"1481592169","category":"军事","red_tag":"最新","author":"阿修罗KP","digg":"52","pl":"5"},{"image":"http://img12.xinjunshi.com/allimg/161212/21-1612121511360-L.jpg","news_show_type":10,"title":"口气真不小！蔡英文喊出对大陆战略原则","aid":"237536","channel":"1","pubDate":"2016-12-12","pubTimestamp":"1481526529","category":"军事","red_tag":"热门","author":"阿修罗KP","digg":"57","pl":"26"}]
         * is_recom : 0
         * maxpage : 10
         */

        private TitleBean title;
        private int is_recom;
        private int maxpage;
        private List<NavBean> nav;
        private List<SlideBean> slide;
        private List<?> top;
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

        public List<NavBean> getNav() {
            return nav;
        }

        public void setNav(List<NavBean> nav) {
            this.nav = nav;
        }

        public List<SlideBean> getSlide() {
            return slide;
        }

        public void setSlide(List<SlideBean> slide) {
            this.slide = slide;
        }

        public List<?> getTop() {
            return top;
        }

        public void setTop(List<?> top) {
            this.top = top;
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

        public static class NavBean {
            /**
             * name : 推荐
             * url : app.php?mod=newslist&act=index
             * showtype : 1
             */

            private String name;
            private String url;
            private int showtype;

            public static List<NavBean> arrayNavBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<NavBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<NavBean> arrayNavBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<NavBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getShowtype() {
                return showtype;
            }

            public void setShowtype(int showtype) {
                this.showtype = showtype;
            }
        }

        public static class SlideBean {
            /**
             * image : http://img12.xinjunshi.com/allimg/161213/21-1612130UQ40-L.jpg
             * news_show_type : 12
             * title : 朴槿惠被弹劾后韩发生这事:中国笑了
             * aid : 237571
             * channel : 1
             * pubDate : 2016-12-13
             * pubTimestamp : 1481589988
             * category : 军事
             * red_tag : 最新
             * author : 阿修罗KP
             * digg : 21
             * pl : 3
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

            public static List<SlideBean> arraySlideBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<SlideBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<SlideBean> arraySlideBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<SlideBean>>() {
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

        public static class ItemBean {
            /**
             * image : http://img12.xinjunshi.com/allimg/161213/21-1612130943080-L.jpg
             * news_show_type : 10
             * title : 美国白宫10天内3次重申：坚定奉行一个中国政策
             * aid : 237586
             * channel : 1
             * pubDate : 2016-12-13
             * pubTimestamp : 1481593287
             * category : 军事
             * red_tag : 最新
             * author : 阿修罗KP
             * digg : 1
             * pl : 0
             * image_arr : ["http://img12.xinjunshi.com/allimg/161212/0PS55426-0.jpg","http://img12.xinjunshi.com/allimg/161212/0PS55405-1.jpg","http://img12.xinjunshi.com/allimg/161212/0PS54219-2.jpg"]
             * redirecturl : http://m.shop.xinjunshi.com/goods.php?id=40&from=app
             * ad_place_id : 2478457
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
            private String redirecturl;
            private String ad_place_id;
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

            public String getRedirecturl() {
                return redirecturl;
            }

            public void setRedirecturl(String redirecturl) {
                this.redirecturl = redirecturl;
            }

            public String getAd_place_id() {
                return ad_place_id;
            }

            public void setAd_place_id(String ad_place_id) {
                this.ad_place_id = ad_place_id;
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
