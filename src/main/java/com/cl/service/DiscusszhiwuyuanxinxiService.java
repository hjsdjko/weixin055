package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusszhiwuyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusszhiwuyuanxinxiView;


/**
 * 植物园信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-12 17:55:30
 */
public interface DiscusszhiwuyuanxinxiService extends IService<DiscusszhiwuyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhiwuyuanxinxiView> selectListView(Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper);
   	
   	DiscusszhiwuyuanxinxiView selectView(@Param("ew") Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhiwuyuanxinxiEntity> wrapper);
   	

}

