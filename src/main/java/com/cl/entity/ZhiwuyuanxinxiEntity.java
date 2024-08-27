package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 植物园信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-12 17:55:30
 */
@TableName("zhiwuyuanxinxi")
public class ZhiwuyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiwuyuanxinxiEntity() {
		
	}
	
	public ZhiwuyuanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 植物园名称
	 */
					
	private String zhiwuyuanmingcheng;
	
	/**
	 * 植物园地址
	 */
					
	private String zhiwuyuandizhi;
	
	/**
	 * 植物园简介
	 */
					
	private String zhiwuyuanjianjie;
	
	/**
	 * 植物园图片
	 */
					
	private String zhiwuyuantupian;
	
	/**
	 * 开园时间
	 */
					
	private String kaiyuanshijian;
	
	/**
	 * 服务电话
	 */
					
	private String fuwudianhua;
	
	/**
	 * 购票须知
	 */
					
	private String goupiaoxuzhi;
	
	/**
	 * 植物园详情
	 */
					
	private String zhiwuyuanxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date reversetime;
	
	/**
	 * 门票价格
	 */
					
	private Double price;
	
	/**
	 * 团购价
	 */
					
	private Double groupprice;
	
	/**
	 * 拼团人数
	 */
					
	private Integer grouppeople;
	
	/**
	 * 当前人数
	 */
					
	private Integer curpeople;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：植物园名称
	 */
	public void setZhiwuyuanmingcheng(String zhiwuyuanmingcheng) {
		this.zhiwuyuanmingcheng = zhiwuyuanmingcheng;
	}
	/**
	 * 获取：植物园名称
	 */
	public String getZhiwuyuanmingcheng() {
		return zhiwuyuanmingcheng;
	}
	/**
	 * 设置：植物园地址
	 */
	public void setZhiwuyuandizhi(String zhiwuyuandizhi) {
		this.zhiwuyuandizhi = zhiwuyuandizhi;
	}
	/**
	 * 获取：植物园地址
	 */
	public String getZhiwuyuandizhi() {
		return zhiwuyuandizhi;
	}
	/**
	 * 设置：植物园简介
	 */
	public void setZhiwuyuanjianjie(String zhiwuyuanjianjie) {
		this.zhiwuyuanjianjie = zhiwuyuanjianjie;
	}
	/**
	 * 获取：植物园简介
	 */
	public String getZhiwuyuanjianjie() {
		return zhiwuyuanjianjie;
	}
	/**
	 * 设置：植物园图片
	 */
	public void setZhiwuyuantupian(String zhiwuyuantupian) {
		this.zhiwuyuantupian = zhiwuyuantupian;
	}
	/**
	 * 获取：植物园图片
	 */
	public String getZhiwuyuantupian() {
		return zhiwuyuantupian;
	}
	/**
	 * 设置：开园时间
	 */
	public void setKaiyuanshijian(String kaiyuanshijian) {
		this.kaiyuanshijian = kaiyuanshijian;
	}
	/**
	 * 获取：开园时间
	 */
	public String getKaiyuanshijian() {
		return kaiyuanshijian;
	}
	/**
	 * 设置：服务电话
	 */
	public void setFuwudianhua(String fuwudianhua) {
		this.fuwudianhua = fuwudianhua;
	}
	/**
	 * 获取：服务电话
	 */
	public String getFuwudianhua() {
		return fuwudianhua;
	}
	/**
	 * 设置：购票须知
	 */
	public void setGoupiaoxuzhi(String goupiaoxuzhi) {
		this.goupiaoxuzhi = goupiaoxuzhi;
	}
	/**
	 * 获取：购票须知
	 */
	public String getGoupiaoxuzhi() {
		return goupiaoxuzhi;
	}
	/**
	 * 设置：植物园详情
	 */
	public void setZhiwuyuanxiangqing(String zhiwuyuanxiangqing) {
		this.zhiwuyuanxiangqing = zhiwuyuanxiangqing;
	}
	/**
	 * 获取：植物园详情
	 */
	public String getZhiwuyuanxiangqing() {
		return zhiwuyuanxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
	/**
	 * 设置：门票价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：门票价格
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * 设置：团购价
	 */
	public void setGroupprice(Double groupprice) {
		this.groupprice = groupprice;
	}
	/**
	 * 获取：团购价
	 */
	public Double getGroupprice() {
		return groupprice;
	}
	/**
	 * 设置：拼团人数
	 */
	public void setGrouppeople(Integer grouppeople) {
		this.grouppeople = grouppeople;
	}
	/**
	 * 获取：拼团人数
	 */
	public Integer getGrouppeople() {
		return grouppeople;
	}
	/**
	 * 设置：当前人数
	 */
	public void setCurpeople(Integer curpeople) {
		this.curpeople = curpeople;
	}
	/**
	 * 获取：当前人数
	 */
	public Integer getCurpeople() {
		return curpeople;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
