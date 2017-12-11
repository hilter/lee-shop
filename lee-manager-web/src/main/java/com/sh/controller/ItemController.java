package com.sh.controller;

import com.sh.pojo.TbItem;
import com.sh.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品管理
 *
 * @author lee leeshuhua@163.com
 * @create 2017-12-11 20:31
 **/
@Controller
public class ItemController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
        TbItem tbItem = itemsService.getItemById(itemId);
        return tbItem;
    }
}
