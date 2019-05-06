package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
@Entity
@Table(name = "vrsources", schema = "text", catalog = "")
public class VrsourcesEntity {
    private int id;
    private String imageurl;
    private String videourl;
    private String title;
    private Timestamp createdate;
    private Integer type;
    private Integer topstate;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "imageurl")
    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Basic
    @Column(name = "videourl")
    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "createdate")
    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "topstate")
    public Integer getTopstate() {
        return topstate;
    }

    public void setTopstate(Integer topstate) {
        this.topstate = topstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VrsourcesEntity that = (VrsourcesEntity) o;

        if (id != that.id) return false;
        if (imageurl != null ? !imageurl.equals(that.imageurl) : that.imageurl != null) return false;
        if (videourl != null ? !videourl.equals(that.videourl) : that.videourl != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (topstate != null ? !topstate.equals(that.topstate) : that.topstate != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "VrsourcesEntity{" +
                "id=" + id +
                ", imageurl='" + imageurl + '\'' +
                ", videourl='" + videourl + '\'' +
                ", title='" + title + '\'' +
                ", createdate=" + createdate +
                ", type=" + type +
                ", topstate=" + topstate +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (imageurl != null ? imageurl.hashCode() : 0);
        result = 31 * result + (videourl != null ? videourl.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (topstate != null ? topstate.hashCode() : 0);
        return result;
    }
}
