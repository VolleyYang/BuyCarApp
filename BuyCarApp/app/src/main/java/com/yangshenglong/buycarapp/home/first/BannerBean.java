package com.yangshenglong.buycarapp.home.first;

import java.util.List;

/**
 * Created by VolleyYang on 17/2/8.
 */

public class BannerBean {

    /**
     * data : [{"clickurl":"http://u_2880607.zuodanye.maka.im/viewer/4J6IMW3B","createTime":null,"id":33,"picurl":"http://pic.utonw.com/liB7tgImCE-QDi_jd1ylh3-9wFCZ","postype":1,"sortnum":0,"title":"","updateTime":"2017-01-12 19:21:07"},{"clickurl":"http://u_2880607.zuodanye.maka.im/pcviewer/8EVU4NQT","createTime":null,"id":28,"picurl":"http://pic.utonw.com/lgx6SRdTdK_jmG7GU7OlecY9y10I","postype":1,"sortnum":1,"title":"低息配资","updateTime":"2017-01-12 19:21:13"},{"clickurl":"http://u_2880607.zuodanye.maka.im/pcviewer/70XYJ9PA","createTime":null,"id":29,"picurl":"http://pic.utonw.com/lqfQwpEq1oGN-WPFoxhzXX5yuLXD","postype":1,"sortnum":2,"title":"多图分享朋友圈","updateTime":"2017-01-12 19:20:43"},{"clickurl":"http://u_2880607.zuodanye.maka.im/pcviewer/EKWUIA5Z","createTime":null,"id":30,"picurl":"http://pic.utonw.com/lmMWN7p-PPHfDiw83E5l7vaWd5tk","postype":1,"sortnum":3,"title":"4S保养查询","updateTime":"2017-01-12 19:21:39"},{"clickurl":"http://u_2880607.zuodanye.maka.im/pcviewer/RR78HIXS","createTime":null,"id":31,"picurl":"http://pic.utonw.com/lgMYisBSTSvAq7Lm7Dc2Wdk-DfOZ","postype":1,"sortnum":4,"title":"多功能1","updateTime":"2017-01-12 19:21:27"},{"clickurl":"http://u_2880607.zuodanye.maka.im/pcviewer/DFQTV99K","createTime":null,"id":32,"picurl":"http://pic.utonw.com/ls1NlGIw2p_TqvldPAWvVN3cMee6","postype":1,"sortnum":5,"title":"多功能2","updateTime":"2017-01-12 19:21:22"},{"clickurl":"http://u_2880607.zuodanye.maka.im/pcviewer/UPR2NXPB","createTime":null,"id":34,"picurl":"http://pic.utonw.com/Fmk_-vgxoLEAlDFRXvM9RuOj7HgO","postype":1,"sortnum":7,"title":"有什么好处","updateTime":null}]
     * retCode : 0000
     * retMsg : 操作成功
     */

    private String retCode;
    private String retMsg;
    private List<DataBean> data;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * clickurl : http://u_2880607.zuodanye.maka.im/viewer/4J6IMW3B
         * createTime : null
         * id : 33
         * picurl : http://pic.utonw.com/liB7tgImCE-QDi_jd1ylh3-9wFCZ
         * postype : 1
         * sortnum : 0
         * title :
         * updateTime : 2017-01-12 19:21:07
         */

        private String clickurl;
        private Object createTime;
        private int id;
        private String picurl;
        private int postype;
        private int sortnum;
        private String title;
        private String updateTime;

        public String getClickurl() {
            return clickurl;
        }

        public void setClickurl(String clickurl) {
            this.clickurl = clickurl;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
            this.createTime = createTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public int getPostype() {
            return postype;
        }

        public void setPostype(int postype) {
            this.postype = postype;
        }

        public int getSortnum() {
            return sortnum;
        }

        public void setSortnum(int sortnum) {
            this.sortnum = sortnum;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }
}
