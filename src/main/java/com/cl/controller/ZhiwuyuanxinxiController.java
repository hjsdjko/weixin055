package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;
import com.cl.entity.OrdersEntity;
import com.cl.service.OrdersService;

import com.cl.entity.ZhiwuyuanxinxiEntity;
import com.cl.entity.view.ZhiwuyuanxinxiView;

import com.cl.service.ZhiwuyuanxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 植物园信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 17:55:30
 */
@RestController
@RequestMapping("/zhiwuyuanxinxi")
public class ZhiwuyuanxinxiController {
    @Autowired
    private ZhiwuyuanxinxiService zhiwuyuanxinxiService;

    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiwuyuanxinxiEntity zhiwuyuanxinxi,
		HttpServletRequest request){
        EntityWrapper<ZhiwuyuanxinxiEntity> ew = new EntityWrapper<ZhiwuyuanxinxiEntity>();

		PageUtils page = zhiwuyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwuyuanxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiwuyuanxinxiEntity zhiwuyuanxinxi, 
		HttpServletRequest request){
        EntityWrapper<ZhiwuyuanxinxiEntity> ew = new EntityWrapper<ZhiwuyuanxinxiEntity>();

		PageUtils page = zhiwuyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwuyuanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiwuyuanxinxiEntity zhiwuyuanxinxi){
       	EntityWrapper<ZhiwuyuanxinxiEntity> ew = new EntityWrapper<ZhiwuyuanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiwuyuanxinxi, "zhiwuyuanxinxi")); 
        return R.ok().put("data", zhiwuyuanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiwuyuanxinxiEntity zhiwuyuanxinxi){
        EntityWrapper< ZhiwuyuanxinxiEntity> ew = new EntityWrapper< ZhiwuyuanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiwuyuanxinxi, "zhiwuyuanxinxi")); 
		ZhiwuyuanxinxiView zhiwuyuanxinxiView =  zhiwuyuanxinxiService.selectView(ew);
		return R.ok("查询植物园信息成功").put("data", zhiwuyuanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiwuyuanxinxiEntity zhiwuyuanxinxi = zhiwuyuanxinxiService.selectById(id);
		zhiwuyuanxinxi.setClicktime(new Date());
		zhiwuyuanxinxiService.updateById(zhiwuyuanxinxi);
		zhiwuyuanxinxi = zhiwuyuanxinxiService.selectView(new EntityWrapper<ZhiwuyuanxinxiEntity>().eq("id", id));
        return R.ok().put("data", zhiwuyuanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiwuyuanxinxiEntity zhiwuyuanxinxi = zhiwuyuanxinxiService.selectById(id);
		zhiwuyuanxinxi.setClicktime(new Date());
		zhiwuyuanxinxiService.updateById(zhiwuyuanxinxi);
		zhiwuyuanxinxi = zhiwuyuanxinxiService.selectView(new EntityWrapper<ZhiwuyuanxinxiEntity>().eq("id", id));
        return R.ok().put("data", zhiwuyuanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiwuyuanxinxiEntity zhiwuyuanxinxi, HttpServletRequest request){
    	zhiwuyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiwuyuanxinxi);
        zhiwuyuanxinxiService.insert(zhiwuyuanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiwuyuanxinxiEntity zhiwuyuanxinxi, HttpServletRequest request){
    	zhiwuyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiwuyuanxinxi);
        zhiwuyuanxinxiService.insert(zhiwuyuanxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhiwuyuanxinxiEntity zhiwuyuanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiwuyuanxinxi);
        zhiwuyuanxinxiService.updateById(zhiwuyuanxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiwuyuanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZhiwuyuanxinxiEntity zhiwuyuanxinxi, HttpServletRequest request,String pre){
        EntityWrapper<ZhiwuyuanxinxiEntity> ew = new EntityWrapper<ZhiwuyuanxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = zhiwuyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwuyuanxinxi), params), params));
        return R.ok().put("data", page);
    }

        /**
     * 按用户购买推荐
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ZhiwuyuanxinxiEntity zhiwuyuanxinxi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String goodtypeColumn = "zhiwuyuanmingcheng";
        List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>().eq("userid", userId).eq("tablename", "zhiwuyuanxinxi").orderBy("addtime", false));
        List<String> goodtypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<ZhiwuyuanxinxiEntity> zhiwuyuanxinxiList = new ArrayList<ZhiwuyuanxinxiEntity>();
	//去重
    	List<OrdersEntity> ordersDist = new ArrayList<OrdersEntity>();
    	for(OrdersEntity o1 : orders) {
    		boolean addFlag = true;
    		for(OrdersEntity o2 : ordersDist) {
    			if(o1.getGoodid()==o2.getGoodid() || o1.getGoodtype().equals(o2.getGoodtype())) {
    				addFlag = false;
    				break;
    			}
    		}
    		if(addFlag) ordersDist.add(o1);
    	}
        if(ordersDist!=null && ordersDist.size()>0) {
                for(OrdersEntity o : ordersDist) {
                        zhiwuyuanxinxiList.addAll(zhiwuyuanxinxiService.selectList(new EntityWrapper<ZhiwuyuanxinxiEntity>().eq(goodtypeColumn, o.getGoodtype())));
                }
        }
        EntityWrapper<ZhiwuyuanxinxiEntity> ew = new EntityWrapper<ZhiwuyuanxinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = zhiwuyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwuyuanxinxi), params), params));
        List<ZhiwuyuanxinxiEntity> pageList = (List<ZhiwuyuanxinxiEntity>)page.getList();
        if(zhiwuyuanxinxiList.size()<limit) {
                int toAddNum = (limit-zhiwuyuanxinxiList.size())<=pageList.size()?(limit-zhiwuyuanxinxiList.size()):pageList.size();
                for(ZhiwuyuanxinxiEntity o1 : pageList) {
                    boolean addFlag = true;
                    for(ZhiwuyuanxinxiEntity o2 : zhiwuyuanxinxiList) {
                        if(o1.getId().intValue()==o2.getId().intValue()) {
                            addFlag = false;
                            break;
                        }
                    }
                    if(addFlag) {
                        zhiwuyuanxinxiList.add(o1);
                        if(--toAddNum==0) break;
                    }   
                }
        } else if(zhiwuyuanxinxiList.size()>limit) {
            zhiwuyuanxinxiList = zhiwuyuanxinxiList.subList(0, limit);
        }
        page.setList(zhiwuyuanxinxiList);
        return R.ok().put("data", page);
    }







}
