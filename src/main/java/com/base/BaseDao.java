package com.base;

import java.io.Serializable;
import java.util.List;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/17 20:50
 * @modified By：
 * @version: 1.0
 */
public interface BaseDao<T,PK extends Serializable> {

    /**
     * 根据id查找对象
     * @param id
     * @return
     */
    T getById(PK id);

    /**
     * 查找所有对象
     * @return
     */
    List<T> findList();

    PK save(T entity);
}
