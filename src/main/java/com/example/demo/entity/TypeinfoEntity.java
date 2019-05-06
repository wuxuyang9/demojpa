package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
@Entity
@Table(name = "typeinfo", schema = "text", catalog = "")
public class TypeinfoEntity {
    private int tid;
    private String ttype;
    private String timage;
    private Integer ispost;
    private Integer sort;

    @Id
    @Column(name = "tid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "ttype")
    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    @Basic
    @Column(name = "timage")
    public String getTimage() {
        return timage;
    }

    public void setTimage(String timage) {
        this.timage = timage;
    }

    @Basic
    @Column(name = "ispost")
    public Integer getIspost() {
        return ispost;
    }

    public void setIspost(Integer ispost) {
        this.ispost = ispost;
    }

    @Basic
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeinfoEntity that = (TypeinfoEntity) o;

        if (tid != that.tid) return false;
        if (ttype != null ? !ttype.equals(that.ttype) : that.ttype != null) return false;
        if (timage != null ? !timage.equals(that.timage) : that.timage != null) return false;
        if (ispost != null ? !ispost.equals(that.ispost) : that.ispost != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + (ttype != null ? ttype.hashCode() : 0);
        result = 31 * result + (timage != null ? timage.hashCode() : 0);
        result = 31 * result + (ispost != null ? ispost.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        return result;
    }
}
