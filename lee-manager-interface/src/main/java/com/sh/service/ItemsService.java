package com.sh.service;

import com.sh.pojo.TbItem;

public interface ItemsService {

    // 根据商品id查询商品
    public TbItem getItemById(long id);
}
