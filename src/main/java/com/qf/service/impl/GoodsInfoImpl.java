package com.qf.service.impl;

import com.qf.mapper.GoodsInfoMapper;
import com.qf.pojo.TGoods;
import com.qf.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsInfoImpl implements GoodsInfoService {
    @Autowired
    GoodsInfoMapper goodsInfoMapper;
    public Integer addGoodsInfo(TGoods tGoods) {
        return goodsInfoMapper.addGoodsInfo(tGoods);
    }

    public Integer delGoodsInfo(TGoods tGoods) {
        return goodsInfoMapper.delGoodsInfo(tGoods);
    }

    public Integer updateGoodsInfo(TGoods tGoods) {
        return goodsInfoMapper.updateGoodsInfo(tGoods);
    }


    public List<TGoods> findGoodsInfo(TGoods tGoods) {
        return goodsInfoMapper.findGoodsInfo(tGoods);
    }

    public TGoods findGoodsInfoByID(TGoods tGoods) {
        return goodsInfoMapper.findGoodsInfoByID(tGoods);
    }
}
