package com.cl.dao;

import com.cl.entity.ZhiwuyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhiwuyuanxinxiView;


/**
 * 植物园信息
 * 
 * @author 
 * @email 
 * @date 2024-03-12 17:55:30
 */
public interface ZhiwuyuanxinxiDao extends BaseMapper<ZhiwuyuanxinxiEntity> {
	
	List<ZhiwuyuanxinxiView> selectListView(@Param("ew") Wrapper<ZhiwuyuanxinxiEntity> wrapper);

	List<ZhiwuyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiwuyuanxinxiEntity> wrapper);
	
	ZhiwuyuanxinxiView selectView(@Param("ew") Wrapper<ZhiwuyuanxinxiEntity> wrapper);
	

}
