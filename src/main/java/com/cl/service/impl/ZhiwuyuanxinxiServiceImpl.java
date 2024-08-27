package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ZhiwuyuanxinxiDao;
import com.cl.entity.ZhiwuyuanxinxiEntity;
import com.cl.service.ZhiwuyuanxinxiService;
import com.cl.entity.view.ZhiwuyuanxinxiView;

@Service("zhiwuyuanxinxiService")
public class ZhiwuyuanxinxiServiceImpl extends ServiceImpl<ZhiwuyuanxinxiDao, ZhiwuyuanxinxiEntity> implements ZhiwuyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiwuyuanxinxiEntity> page = this.selectPage(
                new Query<ZhiwuyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhiwuyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiwuyuanxinxiEntity> wrapper) {
		  Page<ZhiwuyuanxinxiView> page =new Query<ZhiwuyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhiwuyuanxinxiView> selectListView(Wrapper<ZhiwuyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiwuyuanxinxiView selectView(Wrapper<ZhiwuyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
