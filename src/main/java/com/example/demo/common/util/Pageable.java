package com.example.demo.common.util;

import lombok.Getter;

/**
 * 封装分页参数
 */
public class Pageable {

    //每页数据数
    @Getter
    private int size;

    //第几页，从1开始
    @Getter
    private int number;

    private Pageable() {

    }

    /**
     * 第一条记录的偏移量，从0开始
     */
    public long offset() {
        return size * (number - 1);
    }

    /**
     * 允许最大返回的记录数
     */
    public int max() {
        return size;
    }

    public static Pageable of(int number, int size) {
        Pageable pageable = new Pageable();
        if (number < 1) {
            throw new IllegalArgumentException("页数必须大于或等于1");
        }
        pageable.number = number;
        if (size < 1) {
            throw new IllegalArgumentException("每页数据数必须大于或等于1");
        }
        pageable.size = size;
        return pageable;
    }

    /**
     * 默认每页大小为15
     */
    public static Pageable of(int number) {
        return of(number, 15);
    }

    /**
     * 第一页，每页15条数据
     */
    public static Pageable of() {
        return of(1, 15);
    }
}
