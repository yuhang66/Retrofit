package com.example.administrator.retrofit_rxjava;

import java.util.List;

public class Translate {

    /**
     * state : access
     * info : 查询成功！
     * data : [{"id":"1","title":"超级管理员"},{"id":"2","title":"浏览权限"},{"id":"3","title":"OEM证书全部权限"},{"id":"4","title":"工作计划全部权限"},{"id":"5","title":"翻译库查看权限"},{"id":"6","title":"翻译库全部权限"},{"id":"9","title":"生产计划全部权限"},{"id":"10","title":"生产计划查看权限"},{"id":"11","title":"生产计划-焊接"},{"id":"12","title":"生产计划-调试"},{"id":"13","title":"生产计划-出厂检验"},{"id":"14","title":"生产计划-包装"},{"id":"15","title":"生产计划-仓库"},{"id":"16","title":"生产计划修改"},{"id":"17","title":"培训计划人事权限"},{"id":"18","title":"培训计划普通权限"},{"id":"19","title":"系统设置"}]
     */

    private String state;
    private String info;
    private List<DataBean> data;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * title : 超级管理员
         */

        private String id;
        private String title;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
