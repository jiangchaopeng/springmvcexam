package com.qf.service;

import java.util.List;

public interface BaseService<T>{
    Integer addGoodsInfo(T t);
    Integer delGoodsInfo(T t);
    Integer updateGoodsInfo(T t);
    List<T> findGoodsInfo(T t);
    T findGoodsInfoByID(T t);
}
