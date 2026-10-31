package com.so.revelation.lua.Baidu;

import java.util.List;

/* loaded from: classes.dex */
public class TranslateResult {
    private String from;

    /* renamed from: to */
    private String f3259to;
    private List<TransResultBean> trans_result;

    public static class TransResultBean {
        private String dst;
        private String src;

        public String getDst() {
            return this.dst;
        }

        public String getSrc() {
            return this.src;
        }

        public void setDst(String str) {
            this.dst = str;
        }

        public void setSrc(String str) {
            this.src = str;
        }
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.f3259to;
    }

    public List<TransResultBean> getTrans_result() {
        return this.trans_result;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setTo(String str) {
        this.f3259to = str;
    }

    public void setTrans_result(List<TransResultBean> list) {
        this.trans_result = list;
    }
}
