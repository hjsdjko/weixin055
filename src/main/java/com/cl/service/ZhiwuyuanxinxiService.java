package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhiwuyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhiwuyuanxinxiView;


/**
 * 植物园信息
 *
 * @author 
 * @email 
 * @date 2024-03-12 17:55:30
 */
public interface ZhiwuyuanxinxiService extends IService<ZhiwuyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiwuyuanxinxiView> selectListView(Wrapper<ZhiwuyuanxinxiEntity> wrapper);
   	
   	ZhiwuyuanxinxiView selectView(@Param("ew") Wrapper<ZhiwuyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiwuyuanxinxiEntity> wrapper);
   	

}

