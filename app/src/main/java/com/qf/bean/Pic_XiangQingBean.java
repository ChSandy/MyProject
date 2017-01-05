package com.qf.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/17.
 */

public class Pic_XiangQingBean {

    /**
     * mod : show
     * status : 0
     * message : ok
     * data : {"title":"幼儿园建迷你\u201c空中操场\u201d","link":"http://wei.junshi81.com/a/237320.html","image":"http://img12.xinjunshi.com/allimg/161210/15958-1612101322430-L.jpg","description":"河南郑州，桐柏路上一小区内，幼儿园的室外活动场建在了幼儿园楼顶，成了一个迷你的空中操场。左冬辰/视觉中国","content":["河南郑州，桐柏路上一小区内，幼儿园的室外活动场建在了幼儿园楼顶，成了一个迷你的\u201c空中操场\u201d。左冬辰/视觉中国"],"pics":[{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132111.jpg","picstext":""},{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132113.jpg","picstext":""},{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132114.jpg","picstext":""},{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132116.jpg","picstext":""},{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132119.jpg","picstext":""}],"pubDate":"2016-12-10 13:23","category":"图文","author":"xjs_lm","comments":{"count":"0","list":[]},"channel":"2","click":"565","goodpost":"6","badpost":"7","is_favor":"0","add_code_big":{"news_show_type":"14","ad_place_id":0,"aid":"237320-big","channel":"1","category":"推广","red_tag":"推广"},"relations":[{"news_show_type":"13","ad_place_id":"2478457","aid":"237320","channel":"1","category":"推广","red_tag":"推广"}]}
     */

    private String mod;
    private int status;
    private String message;
    private DataBean data;

    public static List<Pic_XiangQingBean> arrayPic_XiangQingBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<Pic_XiangQingBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<Pic_XiangQingBean> arrayPic_XiangQingBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<Pic_XiangQingBean>>() {
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
         * title : 幼儿园建迷你“空中操场”
         * link : http://wei.junshi81.com/a/237320.html
         * image : http://img12.xinjunshi.com/allimg/161210/15958-1612101322430-L.jpg
         * description : 河南郑州，桐柏路上一小区内，幼儿园的室外活动场建在了幼儿园楼顶，成了一个迷你的空中操场。左冬辰/视觉中国
         * content : ["河南郑州，桐柏路上一小区内，幼儿园的室外活动场建在了幼儿园楼顶，成了一个迷你的\u201c空中操场\u201d。左冬辰/视觉中国"]
         * pics : [{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132111.jpg","picstext":""},{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132113.jpg","picstext":""},{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132114.jpg","picstext":""},{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132116.jpg","picstext":""},{"width":"600","height":"450","url":"http://img12.xinjunshi.com/allimg/161210/15958-161210132119.jpg","picstext":""}]
         * pubDate : 2016-12-10 13:23
         * category : 图文
         * author : xjs_lm
         * comments : {"count":"0","list":[]}
         * channel : 2
         * click : 565
         * goodpost : 6
         * badpost : 7
         * is_favor : 0
         * add_code_big : {"news_show_type":"14","ad_place_id":0,"aid":"237320-big","channel":"1","category":"推广","red_tag":"推广"}
         * relations : [{"news_show_type":"13","ad_place_id":"2478457","aid":"237320","channel":"1","category":"推广","red_tag":"推广"}]
         */

        private String title;
        private String link;
        private String image;
        private String description;
        private String pubDate;
        private String category;
        private String author;
        private CommentsBean comments;
        private String channel;
        private String click;
        private String goodpost;
        private String badpost;
        private String is_favor;
        private AddCodeBigBean add_code_big;
        private List<String> content;
        private List<PicsBean> pics;
        private List<RelationsBean> relations;

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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPubDate() {
            return pubDate;
        }

        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
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

        public CommentsBean getComments() {
            return comments;
        }

        public void setComments(CommentsBean comments) {
            this.comments = comments;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getClick() {
            return click;
        }

        public void setClick(String click) {
            this.click = click;
        }

        public String getGoodpost() {
            return goodpost;
        }

        public void setGoodpost(String goodpost) {
            this.goodpost = goodpost;
        }

        public String getBadpost() {
            return badpost;
        }

        public void setBadpost(String badpost) {
            this.badpost = badpost;
        }

        public String getIs_favor() {
            return is_favor;
        }

        public void setIs_favor(String is_favor) {
            this.is_favor = is_favor;
        }

        public AddCodeBigBean getAdd_code_big() {
            return add_code_big;
        }

        public void setAdd_code_big(AddCodeBigBean add_code_big) {
            this.add_code_big = add_code_big;
        }

        public List<String> getContent() {
            return content;
        }

        public void setContent(List<String> content) {
            this.content = content;
        }

        public List<PicsBean> getPics() {
            return pics;
        }

        public void setPics(List<PicsBean> pics) {
            this.pics = pics;
        }

        public List<RelationsBean> getRelations() {
            return relations;
        }

        public void setRelations(List<RelationsBean> relations) {
            this.relations = relations;
        }

        public static class CommentsBean {
            /**
             * count : 0
             * list : []
             */

            private String count;
            private List<?> list;

            public static List<CommentsBean> arrayCommentsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<CommentsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<CommentsBean> arrayCommentsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<CommentsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public List<?> getList() {
                return list;
            }

            public void setList(List<?> list) {
                this.list = list;
            }
        }

        public static class AddCodeBigBean {
            /**
             * news_show_type : 14
             * ad_place_id : 0
             * aid : 237320-big
             * channel : 1
             * category : 推广
             * red_tag : 推广
             */

            private String news_show_type;
            private int ad_place_id;
            private String aid;
            private String channel;
            private String category;
            private String red_tag;

            public static List<AddCodeBigBean> arrayAddCodeBigBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<AddCodeBigBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<AddCodeBigBean> arrayAddCodeBigBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<AddCodeBigBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getNews_show_type() {
                return news_show_type;
            }

            public void setNews_show_type(String news_show_type) {
                this.news_show_type = news_show_type;
            }

            public int getAd_place_id() {
                return ad_place_id;
            }

            public void setAd_place_id(int ad_place_id) {
                this.ad_place_id = ad_place_id;
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
        }

        public static class PicsBean {
            /**
             * width : 600
             * height : 450
             * url : http://img12.xinjunshi.com/allimg/161210/15958-161210132111.jpg
             * picstext :
             */

            private String width;
            private String height;
            private String url;
            private String picstext;

            public static List<PicsBean> arrayPicsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<PicsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<PicsBean> arrayPicsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<PicsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getHeight() {
                return height;
            }

            public void setHeight(String height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getPicstext() {
                return picstext;
            }

            public void setPicstext(String picstext) {
                this.picstext = picstext;
            }
        }

        public static class RelationsBean {
            /**
             * news_show_type : 13
             * ad_place_id : 2478457
             * aid : 237320
             * channel : 1
             * category : 推广
             * red_tag : 推广
             */

            private String news_show_type;
            private String ad_place_id;
            private String aid;
            private String channel;
            private String category;
            private String red_tag;

            public static List<RelationsBean> arrayRelationsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<RelationsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<RelationsBean> arrayRelationsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<RelationsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getNews_show_type() {
                return news_show_type;
            }

            public void setNews_show_type(String news_show_type) {
                this.news_show_type = news_show_type;
            }

            public String getAd_place_id() {
                return ad_place_id;
            }

            public void setAd_place_id(String ad_place_id) {
                this.ad_place_id = ad_place_id;
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
        }
    }
}
