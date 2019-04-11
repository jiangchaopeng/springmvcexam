package com.qf.contorller;

import com.qf.pojo.TGoods;
import com.qf.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyContorller {
    @Autowired
    GoodsInfoService goodsInfoService;

    @ResponseBody
    @RequestMapping(value = "findGoodsInfo", method = {RequestMethod.POST})
    public Object findGoodsInfo(@RequestBody(required = false) TGoods tGoods) {
        System.out.println(tGoods);
        List<TGoods> goodsInfo = goodsInfoService.findGoodsInfo(tGoods);
        return goodsInfo;
    }

    @ResponseBody
    @RequestMapping(value = "updateGoodsInfo", method = {RequestMethod.POST})
    public Object updateGoodsInfo(@RequestBody TGoods tGoods) {
        System.out.println(tGoods);
        Integer count = goodsInfoService.updateGoodsInfo(tGoods);
        System.out.println(count);
        Boolean flag = false;
        if (count > 0) {
            flag = true;
            return flag.toString();
        }
        return flag.toString();
    }

    @ResponseBody
    @RequestMapping(value = "findGoodsInfoByID", method = {RequestMethod.POST})
    public Object findGoodsInfoByID(@RequestBody TGoods tGoods) {
        TGoods goodsInfoByID = goodsInfoService.findGoodsInfoByID(tGoods);
        return goodsInfoByID;
    }

    @ResponseBody
    @RequestMapping(value = "delGoodsInfo", method = {RequestMethod.POST})
    public Object delGoodsInfo(@RequestBody TGoods tGoods) {
        System.out.println(tGoods);
        Integer count = goodsInfoService.delGoodsInfo(tGoods);
        System.out.println(count);
        Boolean flag = false;
        if (count > 0) {
            flag = true;
            return flag.toString();
        }
        return flag.toString();

    }

    @ResponseBody
    @RequestMapping(value = "addGoodsInfo", method = {RequestMethod.POST})
    public Object addGoodsInfo(@RequestBody(required = false) TGoods tGoods) {
        System.out.println(tGoods);
        Integer count = goodsInfoService.addGoodsInfo(tGoods);
        System.out.println(count);
        Boolean flag = false;
        if (count > 0) {
            flag = true;
            return flag.toString();
        }
        return flag.toString();

    }
}

