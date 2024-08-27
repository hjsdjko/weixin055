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


import com.cl.dao.DiscusszhiwuyuanxinxiDao;
import com.cl.entity.DiscusszhiwuyuanxinxiEntity;
import com.cl.service.DiscusszhiwuyuanxinxiService;
import com.cl.entity.view.DiscusszhiwuyuanxinxiView;

@Service("discusszhiwuyuanxinxiService")
public class DiscusszhiwuyuanxinxiServiceImpl extends ServiceImpl<DiscusszhiwuyuanxinxiDao, DiscusszhiwuyuanxinxiEntity> implements DiscusszhiwuyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhiwuyuanxinxiEntity> page = this.selectPage(
                new Query<DiscusszhiwuyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhiwuyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper) {
		  Page<DiscusszhiwuyuanxinxiView> page =new Query<DiscusszhiwuyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusszhiwuyuanxinxiView> selectListView(Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhiwuyuanxinxiView selectView(Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
