package com.example.demo.service;

/**
 * Created by goodwuxuyang on 2019/5/6.
 */
public class Reqimpl implements Req {
    private final int page;
    private final int size;

    public Reqimpl(int page, int size) {
        this.page = page;
        this.size = size;
    }
}
