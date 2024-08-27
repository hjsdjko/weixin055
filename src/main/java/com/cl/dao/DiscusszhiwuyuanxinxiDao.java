package com.cl.dao;

import com.cl.entity.DiscusszhiwuyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusszhiwuyuanxinxiView;


/**
 * 植物园信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-12 17:55:30
 */
public interface DiscusszhiwuyuanxinxiDao extends BaseMapper<DiscusszhiwuyuanxinxiEntity> {
	
	List<DiscusszhiwuyuanxinxiView> selectListView(@Param("ew") Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper);

	List<DiscusszhiwuyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper);
	
	DiscusszhiwuyuanxinxiView selectView(@Param("ew") Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper);
	

}
