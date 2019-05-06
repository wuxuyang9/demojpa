package com.example.demo.common.util;

import lombok.Getter;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 封装一页数据
 */
public class Page<T> implements Iterable<T> {

    private Page() {

    }

    //分页信息
    @Getter
    private Pageable pageable;

    //总数据数
    @Getter
    private long total;

    //数据
    @Getter
    private List<T> data;


    public boolean isEmpty() {
        return total == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return data.iterator();
    }

    public static <T> Page<T> of(Pageable pageable, long total, List<T> data) {
        Page<T> page = new Page<>();
        page.pageable = pageable;
        page.total = total;
        if (data == null) {
            page.data = Collections.emptyList();
        } else {
            page.data = data;
        }
        return page;
    }

    public static <T> Page<T> of(Pageable pageable, List<T> data) {
        if (data == null) {
            return of(pageable, 0, Collections.emptyList());
        }
        return of(pageable, data.size(), data);
    }

    public static <T> Page<T> empty(Pageable pageable) {
        return of(pageable, Collections.emptyList());
    }

    public static <T> Page<T> empty() {
        return of(Pageable.of(), Collections.emptyList());
    }
}
