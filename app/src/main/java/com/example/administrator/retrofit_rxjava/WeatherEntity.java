package com.example.administrator.retrofit_rxjava;

import java.util.List;

public class WeatherEntity {


    /**
     * data : {"yesterday":{"date":"7日星期二","high":"高温 28℃","fx":"西南风","low":"低温 14℃","fl":"<![CDATA[3-4级]]>","type":"晴"},"city":"北京","forecast":[{"date":"8日星期三","high":"高温 25℃","fengli":"<![CDATA[<3级]]>","low":"低温 13℃","fengxiang":"西风","type":"多云"},{"date":"9日星期四","high":"高温 30℃","fengli":"<![CDATA[<3级]]>","low":"低温 16℃","fengxiang":"无持续风向","type":"晴"},{"date":"10日星期五","high":"高温 29℃","fengli":"<![CDATA[3-4级]]>","low":"低温 16℃","fengxiang":"南风","type":"多云"},{"date":"11日星期六","high":"高温 30℃","fengli":"<![CDATA[3-4级]]>","low":"低温 16℃","fengxiang":"东南风","type":"多云"},{"date":"12日星期天","high":"高温 24℃","fengli":"<![CDATA[4-5级]]>","low":"低温 12℃","fengxiang":"西北风","type":"多云"}],"ganmao":"各项气象条件适宜，无明显降温过程，发生感冒机率较低。","wendu":"21"}
     * status : 1000
     * desc : OK
     */

    private DataBean data;
    private int status;
    private String desc;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static class DataBean {
        /**
         * yesterday : {"date":"7日星期二","high":"高温 28℃","fx":"西南风","low":"低温 14℃","fl":"<![CDATA[3-4级]]>","type":"晴"}
         * city : 北京
         * forecast : [{"date":"8日星期三","high":"高温 25℃","fengli":"<![CDATA[<3级]]>","low":"低温 13℃","fengxiang":"西风","type":"多云"},{"date":"9日星期四","high":"高温 30℃","fengli":"<![CDATA[<3级]]>","low":"低温 16℃","fengxiang":"无持续风向","type":"晴"},{"date":"10日星期五","high":"高温 29℃","fengli":"<![CDATA[3-4级]]>","low":"低温 16℃","fengxiang":"南风","type":"多云"},{"date":"11日星期六","high":"高温 30℃","fengli":"<![CDATA[3-4级]]>","low":"低温 16℃","fengxiang":"东南风","type":"多云"},{"date":"12日星期天","high":"高温 24℃","fengli":"<![CDATA[4-5级]]>","low":"低温 12℃","fengxiang":"西北风","type":"多云"}]
         * ganmao : 各项气象条件适宜，无明显降温过程，发生感冒机率较低。
         * wendu : 21
         */

        private YesterdayBean yesterday;
        private String city;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 7日星期二
             * high : 高温 28℃
             * fx : 西南风
             * low : 低温 14℃
             * fl : <![CDATA[3-4级]]>
             * type : 晴
             */

            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ForecastBean {
            /**
             * date : 8日星期三
             * high : 高温 25℃
             * fengli : <![CDATA[<3级]]>
             * low : 低温 13℃
             * fengxiang : 西风
             * type : 多云
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
