package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
@Entity
@Table(name = "postinfo", schema = "text", catalog = "")
public class PostinfoEntity {
    private int postid;
    private String posttitle;
    private String postcontent;
    private String postimgandvideo;
    private String postfabulous;
    private String postcomment;
    private String postpreview;
    private String postcollection;
    private Integer posttype;
    private Integer tid;
    private String utelephone;
    private Integer poststate;
    private Integer commentid;
    private Timestamp posttime;
    private String postua;
    private String postub;
    private String postuc;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
    private String posttext;
    private Integer topstate;
    private Integer checkstate;

    @Id
    @Column(name = "postid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    @Basic
    @Column(name = "posttitle")
    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle;
    }

    @Basic
    @Column(name = "postcontent")
    public String getPostcontent() {
        return postcontent;
    }

    public void setPostcontent(String postcontent) {
        this.postcontent = postcontent;
    }

    @Basic
    @Column(name = "postimgandvideo")
    public String getPostimgandvideo() {
        return postimgandvideo;
    }

    public void setPostimgandvideo(String postimgandvideo) {
        this.postimgandvideo = postimgandvideo;
    }

    @Basic
    @Column(name = "postfabulous")
    public String getPostfabulous() {
        return postfabulous;
    }

    public void setPostfabulous(String postfabulous) {
        this.postfabulous = postfabulous;
    }

    @Basic
    @Column(name = "postcomment")
    public String getPostcomment() {
        return postcomment;
    }

    public void setPostcomment(String postcomment) {
        this.postcomment = postcomment;
    }

    @Basic
    @Column(name = "postpreview")
    public String getPostpreview() {
        return postpreview;
    }

    public void setPostpreview(String postpreview) {
        this.postpreview = postpreview;
    }

    @Basic
    @Column(name = "postcollection")
    public String getPostcollection() {
        return postcollection;
    }

    public void setPostcollection(String postcollection) {
        this.postcollection = postcollection;
    }

    @Basic
    @Column(name = "posttype")
    public Integer getPosttype() {
        return posttype;
    }

    public void setPosttype(Integer posttype) {
        this.posttype = posttype;
    }

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "utelephone")
    public String getUtelephone() {
        return utelephone;
    }

    public void setUtelephone(String utelephone) {
        this.utelephone = utelephone;
    }

    @Basic
    @Column(name = "poststate")
    public Integer getPoststate() {
        return poststate;
    }

    public void setPoststate(Integer poststate) {
        this.poststate = poststate;
    }

    @Basic
    @Column(name = "commentid")
    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    @Basic
    @Column(name = "posttime")
    public Timestamp getPosttime() {
        return posttime;
    }

    public void setPosttime(Timestamp posttime) {
        this.posttime = posttime;
    }

    @Basic
    @Column(name = "postua")
    public String getPostua() {
        return postua;
    }

    public void setPostua(String postua) {
        this.postua = postua;
    }

    @Basic
    @Column(name = "postub")
    public String getPostub() {
        return postub;
    }

    public void setPostub(String postub) {
        this.postub = postub;
    }

    @Basic
    @Column(name = "postuc")
    public String getPostuc() {
        return postuc;
    }

    public void setPostuc(String postuc) {
        this.postuc = postuc;
    }

    @Basic
    @Column(name = "image1")
    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    @Basic
    @Column(name = "image2")
    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    @Basic
    @Column(name = "image3")
    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    @Basic
    @Column(name = "image4")
    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    @Basic
    @Column(name = "image5")
    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    @Basic
    @Column(name = "posttext")
    public String getPosttext() {
        return posttext;
    }

    public void setPosttext(String posttext) {
        this.posttext = posttext;
    }

    @Basic
    @Column(name = "topstate")
    public Integer getTopstate() {
        return topstate;
    }

    public void setTopstate(Integer topstate) {
        this.topstate = topstate;
    }

    @Basic
    @Column(name = "checkstate")
    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostinfoEntity that = (PostinfoEntity) o;

        if (postid != that.postid) return false;
        if (posttitle != null ? !posttitle.equals(that.posttitle) : that.posttitle != null) return false;
        if (postcontent != null ? !postcontent.equals(that.postcontent) : that.postcontent != null) return false;
        if (postimgandvideo != null ? !postimgandvideo.equals(that.postimgandvideo) : that.postimgandvideo != null)
            return false;
        if (postfabulous != null ? !postfabulous.equals(that.postfabulous) : that.postfabulous != null) return false;
        if (postcomment != null ? !postcomment.equals(that.postcomment) : that.postcomment != null) return false;
        if (postpreview != null ? !postpreview.equals(that.postpreview) : that.postpreview != null) return false;
        if (postcollection != null ? !postcollection.equals(that.postcollection) : that.postcollection != null)
            return false;
        if (posttype != null ? !posttype.equals(that.posttype) : that.posttype != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (utelephone != null ? !utelephone.equals(that.utelephone) : that.utelephone != null) return false;
        if (poststate != null ? !poststate.equals(that.poststate) : that.poststate != null) return false;
        if (commentid != null ? !commentid.equals(that.commentid) : that.commentid != null) return false;
        if (posttime != null ? !posttime.equals(that.posttime) : that.posttime != null) return false;
        if (postua != null ? !postua.equals(that.postua) : that.postua != null) return false;
        if (postub != null ? !postub.equals(that.postub) : that.postub != null) return false;
        if (postuc != null ? !postuc.equals(that.postuc) : that.postuc != null) return false;
        if (image1 != null ? !image1.equals(that.image1) : that.image1 != null) return false;
        if (image2 != null ? !image2.equals(that.image2) : that.image2 != null) return false;
        if (image3 != null ? !image3.equals(that.image3) : that.image3 != null) return false;
        if (image4 != null ? !image4.equals(that.image4) : that.image4 != null) return false;
        if (image5 != null ? !image5.equals(that.image5) : that.image5 != null) return false;
        if (posttext != null ? !posttext.equals(that.posttext) : that.posttext != null) return false;
        if (topstate != null ? !topstate.equals(that.topstate) : that.topstate != null) return false;
        if (checkstate != null ? !checkstate.equals(that.checkstate) : that.checkstate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postid;
        result = 31 * result + (posttitle != null ? posttitle.hashCode() : 0);
        result = 31 * result + (postcontent != null ? postcontent.hashCode() : 0);
        result = 31 * result + (postimgandvideo != null ? postimgandvideo.hashCode() : 0);
        result = 31 * result + (postfabulous != null ? postfabulous.hashCode() : 0);
        result = 31 * result + (postcomment != null ? postcomment.hashCode() : 0);
        result = 31 * result + (postpreview != null ? postpreview.hashCode() : 0);
        result = 31 * result + (postcollection != null ? postcollection.hashCode() : 0);
        result = 31 * result + (posttype != null ? posttype.hashCode() : 0);
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (utelephone != null ? utelephone.hashCode() : 0);
        result = 31 * result + (poststate != null ? poststate.hashCode() : 0);
        result = 31 * result + (commentid != null ? commentid.hashCode() : 0);
        result = 31 * result + (posttime != null ? posttime.hashCode() : 0);
        result = 31 * result + (postua != null ? postua.hashCode() : 0);
        result = 31 * result + (postub != null ? postub.hashCode() : 0);
        result = 31 * result + (postuc != null ? postuc.hashCode() : 0);
        result = 31 * result + (image1 != null ? image1.hashCode() : 0);
        result = 31 * result + (image2 != null ? image2.hashCode() : 0);
        result = 31 * result + (image3 != null ? image3.hashCode() : 0);
        result = 31 * result + (image4 != null ? image4.hashCode() : 0);
        result = 31 * result + (image5 != null ? image5.hashCode() : 0);
        result = 31 * result + (posttext != null ? posttext.hashCode() : 0);
        result = 31 * result + (topstate != null ? topstate.hashCode() : 0);
        result = 31 * result + (checkstate != null ? checkstate.hashCode() : 0);
        return result;
    }
}
