package com.sh.service.impl;

import com.sh.mapper.TbItemMapper;
import com.sh.pojo.TbItem;
import com.sh.pojo.TbItemExample;
import com.sh.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lee leeshuhua@163.com
 * @create 2017-12-11 20:13
 **/
@Service
public class ItemServiceImpl implements ItemsService{

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long id) {
        // 根据主键查询
        // TbItem item = itemMapper.selectByPrimaryKey(id);
        TbItemExample tbItemExample = new TbItemExample();
        TbItemExample.Criteria criteria = tbItemExample.createCriteria();
        // 设置查询条件
        criteria.andIdEqualTo(id);
        //执行查询
        List<TbItem> list = itemMapper.selectByExample(tbItemExample);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
