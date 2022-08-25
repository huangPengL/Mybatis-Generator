package com.hpl;

import java.io.Serializable;
import java.util.Date;

public class advertise implements Serializable {
    private Integer id;

    private Byte position;

    private String titleZh;

    private String titleEn;

    private String picZh;

    private String picEn;

    private String svgaZh;

    private String svgaEn;

    private Byte shareStatus;

    private String shareTextZh;

    private String shareTextEn;

    private Byte redirectType;

    private String redirectUrl;

    private String redirectUrlAndroid;

    private String redirectUrlIos;

    private Date startTime;

    private Date endTime;

    private Integer showOrder;

    private Byte status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getPosition() {
        return position;
    }

    public void setPosition(Byte position) {
        this.position = position;
    }

    public String getTitleZh() {
        return titleZh;
    }

    public void setTitleZh(String titleZh) {
        this.titleZh = titleZh == null ? null : titleZh.trim();
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }

    public String getPicZh() {
        return picZh;
    }

    public void setPicZh(String picZh) {
        this.picZh = picZh == null ? null : picZh.trim();
    }

    public String getPicEn() {
        return picEn;
    }

    public void setPicEn(String picEn) {
        this.picEn = picEn == null ? null : picEn.trim();
    }

    public String getSvgaZh() {
        return svgaZh;
    }

    public void setSvgaZh(String svgaZh) {
        this.svgaZh = svgaZh == null ? null : svgaZh.trim();
    }

    public String getSvgaEn() {
        return svgaEn;
    }

    public void setSvgaEn(String svgaEn) {
        this.svgaEn = svgaEn == null ? null : svgaEn.trim();
    }

    public Byte getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(Byte shareStatus) {
        this.shareStatus = shareStatus;
    }

    public String getShareTextZh() {
        return shareTextZh;
    }

    public void setShareTextZh(String shareTextZh) {
        this.shareTextZh = shareTextZh == null ? null : shareTextZh.trim();
    }

    public String getShareTextEn() {
        return shareTextEn;
    }

    public void setShareTextEn(String shareTextEn) {
        this.shareTextEn = shareTextEn == null ? null : shareTextEn.trim();
    }

    public Byte getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(Byte redirectType) {
        this.redirectType = redirectType;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl == null ? null : redirectUrl.trim();
    }

    public String getRedirectUrlAndroid() {
        return redirectUrlAndroid;
    }

    public void setRedirectUrlAndroid(String redirectUrlAndroid) {
        this.redirectUrlAndroid = redirectUrlAndroid == null ? null : redirectUrlAndroid.trim();
    }

    public String getRedirectUrlIos() {
        return redirectUrlIos;
    }

    public void setRedirectUrlIos(String redirectUrlIos) {
        this.redirectUrlIos = redirectUrlIos == null ? null : redirectUrlIos.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}