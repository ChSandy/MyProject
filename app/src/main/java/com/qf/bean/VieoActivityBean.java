package com.qf.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/15.
 */

public class VieoActivityBean {
    @Override
    public String toString() {
        return "VieoActivityBean{" +
                "mod='" + mod + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * mod : show
     * status : 0
     * message : ok
     * data : {"title":"日本也要部署\u201c萨德\u201d？专家：中国有应对手段","link":"http://wei.junshi81.com/a/237873.html","image":"http://img12.xinjunshi.com/allimg/161215/21-1612150Z2150-L.jpg","video_play":"http://open.iqiyi.com/developer/player_js/coopPlayerIndex.html?vid=08d22f851ca74a37e46dfed1d96754a5&tvId=584834700&accessToken=2.f22860a2479ad60d8da7697274de9346&appKey=3955c3425820435e86d0f4cdfe56f5e7&appId=1368&height=100%&width=100%","video_html":"","video_photo":"http://img12.xinjunshi.com/allimg/161215/21-1612150Z2150-L.jpg","description":"","content":[""],"pics":[],"pubDate":"2016-12-15 09:00","category":"视频栏目","author":"阿修罗KP","comments":{"count":"0","list":[]},"channel":"18","click":"564","goodpost":"5","badpost":"0","is_favor":"0","add_code_big":{"news_show_type":"14","ad_place_id":"2784777","aid":"237873-big","channel":"1","category":"推广","red_tag":"推广"},"relations":[{"aid":"237693","title":"中国大喜！日共产党出手 安倍遭致命一击","image":"http://img12.xinjunshi.com/allimg/161213/21-1612131642230-L.jpg","channel":"1"},{"news_show_type":"13","ad_place_id":"2478457","aid":"237873","channel":"1","category":"推广","red_tag":"推广"},{"aid":"237685","title":"河南男子吃黄焖鸡米饭吃出带毛肉 还有一对牙","image":"http://img12.xinjunshi.com/allimg/161213/35-1612131440330-L.jpg","channel":"1"},{"aid":"237655","title":"大汉王朝的荒唐：宫女穿着开裆裤进进出出","image":"http://img12.xinjunshi.com/allimg/161213/35-161213105H70-L.jpg","channel":"1"},{"aid":"237637","title":"明星出道前居然经历了这些不为人知的屈辱","image":"http://img12.xinjunshi.com/allimg/161213/35-1612131043270-L.jpg","channel":"1"}]}
     */

    private String mod;
    private int status;
    private String message;
    private DataBean data;

    public static List<VieoActivityBean> arrayVieoActivityBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<VieoActivityBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<VieoActivityBean> arrayVieoActivityBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<VieoActivityBean>>() {
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

        @Override
        public String toString() {
            return "DataBean{" +
                    "title='" + title + '\'' +
                    ", link='" + link + '\'' +
                    ", image='" + image + '\'' +
                    ", video_play='" + video_play + '\'' +
                    ", video_html='" + video_html + '\'' +
                    ", video_photo='" + video_photo + '\'' +
                    ", description='" + description + '\'' +
                    ", pubDate='" + pubDate + '\'' +
                    ", category='" + category + '\'' +
                    ", author='" + author + '\'' +
                    ", comments=" + comments +
                    ", channel='" + channel + '\'' +
                    ", click='" + click + '\'' +
                    ", goodpost='" + goodpost + '\'' +
                    ", badpost='" + badpost + '\'' +
                    ", is_favor='" + is_favor + '\'' +
                    ", add_code_big=" + add_code_big +
                    ", content=" + content +
                    ", pics=" + pics +
                    ", relations=" + relations +
                    '}';
        }

        /**
         * title : 日本也要部署“萨德”？专家：中国有应对手段
         * link : http://wei.junshi81.com/a/237873.html
         * image : http://img12.xinjunshi.com/allimg/161215/21-1612150Z2150-L.jpg
         * video_play : http://open.iqiyi.com/developer/player_js/coopPlayerIndex.html?vid=08d22f851ca74a37e46dfed1d96754a5&tvId=584834700&accessToken=2.f22860a2479ad60d8da7697274de9346&appKey=3955c3425820435e86d0f4cdfe56f5e7&appId=1368&height=100%&width=100%
         * video_html :
         * video_photo : http://img12.xinjunshi.com/allimg/161215/21-1612150Z2150-L.jpg
         * description :
         * content : [""]
         * pics : []
         * pubDate : 2016-12-15 09:00
         * category : 视频栏目
         * author : 阿修罗KP
         * comments : {"count":"0","list":[]}
         * channel : 18
         * click : 564
         * goodpost : 5
         * badpost : 0
         * is_favor : 0
         * add_code_big : {"news_show_type":"14","ad_place_id":"2784777","aid":"237873-big","channel":"1","category":"推广","red_tag":"推广"}
         * relations : [{"aid":"237693","title":"中国大喜！日共产党出手 安倍遭致命一击","image":"http://img12.xinjunshi.com/allimg/161213/21-1612131642230-L.jpg","channel":"1"},{"news_show_type":"13","ad_place_id":"2478457","aid":"237873","channel":"1","category":"推广","red_tag":"推广"},{"aid":"237685","title":"河南男子吃黄焖鸡米饭吃出带毛肉 还有一对牙","image":"http://img12.xinjunshi.com/allimg/161213/35-1612131440330-L.jpg","channel":"1"},{"aid":"237655","title":"大汉王朝的荒唐：宫女穿着开裆裤进进出出","image":"http://img12.xinjunshi.com/allimg/161213/35-161213105H70-L.jpg","channel":"1"},{"aid":"237637","title":"明星出道前居然经历了这些不为人知的屈辱","image":"http://img12.xinjunshi.com/allimg/161213/35-1612131043270-L.jpg","channel":"1"}]
         */

        private String title;
        private String link;
        private String image;
        private String video_play;
        private String video_html;
        private String video_photo;
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
        private List<?> pics;
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

        public String getVideo_play() {
            return video_play;
        }

        public void setVideo_play(String video_play) {
            this.video_play = video_play;
        }

        public String getVideo_html() {
            return video_html;
        }

        public void setVideo_html(String video_html) {
            this.video_html = video_html;
        }

        public String getVideo_photo() {
            return video_photo;
        }

        public void setVideo_photo(String video_photo) {
            this.video_photo = video_photo;
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

        public List<?> getPics() {
            return pics;
        }

        public void setPics(List<?> pics) {
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
             * ad_place_id : 2784777
             * aid : 237873-big
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

        public static class RelationsBean {
            /**
             * aid : 237693
             * title : 中国大喜！日共产党出手 安倍遭致命一击
             * image : http://img12.xinjunshi.com/allimg/161213/21-1612131642230-L.jpg
             * channel : 1
             * news_show_type : 13
             * ad_place_id : 2478457
             * category : 推广
             * red_tag : 推广
             */

            private String aid;
            private String title;
            private String image;
            private String channel;
            private String news_show_type;
            private String ad_place_id;
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

            public String getAid() {
                return aid;
            }

            public void setAid(String aid) {
                this.aid = aid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
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
