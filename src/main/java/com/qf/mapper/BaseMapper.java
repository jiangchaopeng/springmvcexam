package com.qf.mapper;

import java.util.List;

public interface BaseMapper<T> {
   Integer addGoodsInfo(T t);
   Integer delGoodsInfo(T t);
   Integer updateGoodsInfo(T t);
   List<T> findGoodsInfo(T t);
    T findGoodsInfoByID(T t);
}
