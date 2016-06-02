package com.xiaozhuo.tendemo.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ${XZ} on 16-5-31.
 * Email：
 */
public class TextCritic {
    private String mId;
    private String publishtime;
    private String title;
    private String author;
    private String times;
    private String imageforplay;
    private String authorbrief;
    private String realtitle;
    private String text1,text2,text3,text4,text5;
    private String image1,image2,image3,image4,image5;

    public void parseJson(JSONObject jsonObject) throws JSONException {

        if (jsonObject != null) {
            title = jsonObject.getString("title");
            author = jsonObject.getString("author");
            times = jsonObject.getString("times");
            publishtime = jsonObject.getString("publishtime");
            authorbrief = jsonObject.getString("authorbrief");
            realtitle = jsonObject.getString("realtitle");
            text1 = jsonObject.getString("text1");
            text2 = jsonObject.getString("text2");
            text3 = jsonObject.getString("text3");
            text4 = jsonObject.getString("text4");
            text5 = jsonObject.getString("text5");

            image1 = "http://api.shigeten.net/"+jsonObject.getString("image1");
            image2 = "http://api.shigeten.net/"+jsonObject.getString("image2");
            image3 = "http://api.shigeten.net/"+jsonObject.getString("image3");
            image4 = "http://api.shigeten.net/"+jsonObject.getString("image4");
            image5 = "http://api.shigeten.net/"+jsonObject.getString("image5");

            imageforplay = "http://api.shigeten.net/"+jsonObject.getString("imageforplay");

        }
    }

    public String getRealtitle() {
        return realtitle;
    }

    public void setRealtitle(String realtitle) {
        this.realtitle = realtitle;
    }

    public String getAuthorbrief() {
        return authorbrief;
    }

    public void setAuthorbrief(String authorbrief) {
        this.authorbrief = authorbrief;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getImageforplay() {
        return imageforplay;
    }

    public void setImageforplay(String imageforplay) {
        this.imageforplay = imageforplay;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }
}