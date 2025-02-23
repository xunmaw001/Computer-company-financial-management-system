package com.entity.vo;

import com.entity.ZhipiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 支票信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 15:19:31
 */
public class ZhipiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 收款单位
	 */
	
	private String shoukuandanwei;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
		
	/**
	 * 用途
	 */
	
	private String yongtu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 开票日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaipiaoriqi;
				
	
	/**
	 * 设置：收款单位
	 */
	 
	public void setShoukuandanwei(String shoukuandanwei) {
		this.shoukuandanwei = shoukuandanwei;
	}
	
	/**
	 * 获取：收款单位
	 */
	public String getShoukuandanwei() {
		return shoukuandanwei;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：用途
	 */
	 
	public void setYongtu(String yongtu) {
		this.yongtu = yongtu;
	}
	
	/**
	 * 获取：用途
	 */
	public String getYongtu() {
		return yongtu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：开票日期
	 */
	 
	public void setKaipiaoriqi(Date kaipiaoriqi) {
		this.kaipiaoriqi = kaipiaoriqi;
	}
	
	/**
	 * 获取：开票日期
	 */
	public Date getKaipiaoriqi() {
		return kaipiaoriqi;
	}
			
}
