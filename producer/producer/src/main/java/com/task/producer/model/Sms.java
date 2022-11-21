package com.task.producer.model;

import java.io.Serializable;

public class Sms implements Serializable {

    private long smsId;
    private String msisdn;
    private String shortcode;
    private String smsData;
    private int connectionPointId;

    public Sms(){

    }

    public Sms(long smsId) {
        this.smsId = smsId;
    }

    public Sms(String shortcode, String smsData, int connectionPointId) {
        this.shortcode = shortcode;
        this.smsData = smsData;
        this.connectionPointId = connectionPointId;
    }

    public long getSmsId() {
        return smsId;
    }

    public void setSmsId(long smsId) {
        this.smsId = smsId;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public String getSmsData() {
        return smsData;
    }

    public void setSmsData(String smsData) {
        this.smsData = smsData;
    }

    public int getConnectionPointId() {
        return connectionPointId;
    }

    public void setConnectionPointId(int connectionPointId) {
        this.connectionPointId = connectionPointId;
    }

    public Sms(String name) {
        this.msisdn = name;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }



//    @Override
//    public String toString() {
//        return
//
//        "{" +
//                "\"msisdn\":\""+ msisdn +"\"" +
//                "}";
//    }

    @Override
    public String toString() {
        return "Sms{" +
                "smsId=" + smsId +
                ", msisdn='" + msisdn + '\'' +
                ", shortcode='" + shortcode + '\'' +
                ", smsData='" + smsData + '\'' +
                ", connectionPointId=" + connectionPointId +
                '}';
    }
//    private String name;
//    private String shortcode;
//    private String smsData;
//    private int connectionPointId;

//    public Sms(){
//
//    }

//    public Sms(String shortcode, String smsData, int connectionPointId) {
//        this.shortcode = shortcode;
//        this.smsData = smsData;
//        this.connectionPointId = connectionPointId;
//    }
//
//
//    public String getShortcode() {
//        return shortcode;
//    }
//
//    public void setShortcode(String shortcode) {
//        this.shortcode = shortcode;
//    }
//
//    public String getSmsData() {
//        return smsData;
//    }
//
//    public void setSmsData(String smsData) {
//        this.smsData = smsData;
//    }
//
//    public int getConnectionPointId() {
//        return connectionPointId;
//    }
//
//    public void setConnectionPointId(int connectionPointId) {
//        this.connectionPointId = connectionPointId;
//    }

//    public Sms(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }



//    @Override
//    public String toString() {
//        return
//
//        "{" +
//                "\"msisdn\":\""+ msisdn +"\"" +
//                "}";
//    }

//    @Override
//    public String toString() {
//        return
//
//                "{" +
//
//                     "\"msisdn\":\"" + msisdn + "\"" +
//                         "\"shortcode\":\"" + shortcode + "\"" +
//
//                "\"smsData\":\"" + smsData + "\"" +
//
//                "\"connectionPointId\":\"" + connectionPointId +
//                "}";
//    }


//    @Override
//    public String toString() {
//        return
//
//                "{" +
//                        "\"name\":\""+ name +"\"" +
//                        "}";
//    }
}
