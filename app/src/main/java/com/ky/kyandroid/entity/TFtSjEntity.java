package com.ky.kyandroid.entity;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author otom3@163.com
 * @String 2017-03-30
 */
@Table(name = "t_tftsj")
public class TFtSjEntity  implements Serializable{
	private static final long serialVersionUID = -7620435178023928252L;

	@Column(name =  "id",isId = true,autoGen = false)
	private String id;

	@Column(name =  "uuid")
	private String  uuid;

	/**
	 * 事件名称
	 */
	@Column(name =  "sjmc")
	private String sjmc;
	
	/**
	 * 发生时间
	 */
	@Column(name =  "fssj")
	private String fssj;
	
	/**
	 * 发生地点
	 */
	@Column(name =  "fsdd")
	private String fsdd;
	
	/**
	 * 上访诉求群体
	 */
	@Column(name =  "sfsqqt")
	private String sfsqqt;
	
	/**
	 * 到场部门
	 */
	@Column(name =  "dcbm")
	private String dcbm;
	
	/**
	 * 涉及领域
	 */
	@Column(name =  "sjly")
	private String sjly;
	
	/**
	 * 主要诉求
	 */
	@Column(name =  "zysq")
	private String zysq;
	
	/**
	 * 事件概要情况
	 */
	@Column(name =  "sjgyqk")
	private String sjgyqk;
	
	/**
	 * 规模
	 */
	@Column(name =  "gm")
	private String gm;
	
	/**
	 * 表现形式
	 */
	@Column(name =  "bxxs")
	private String bxxs;
	
	/**
	 * 是否涉外
	 */
	@Column(name =  "sfsw")
	private String sfsw;
	
	/**
	 * 是否涉疆
	 */
	@Column(name =  "sfsj")
	private String sfsj;
	
	/**
	 * 是否涉舆情
	 */
	@Column(name =  "sfsyq")
	private String sfsyq;
	
	/**
	 * 是否公安处置
	 */
	@Column(name =  "sfgacz")
	private String sfgacz;
	
	/**
	 * 所属街道及社区
	 */
	@Column(name =  "ssjd")
	private String ssjd;
	
	/**
	 * 领导批示
	 */
	@Column(name =  "ldps")
	private String ldps;
	
	/**
	 * 发生地经伟度
	 */
	@Column(name =  "jwd")
	private String jwd;
	
	/**
	 * 处理时限
	 */
	@Column(name =  "clsx")
	private String clsx;
	
	/**
	 * 录入人
	 */
	private String lrr;
	
	/**
	 * 录入部门
	 */
	private String lrbm;
	
	/**
	 * 录入时间
	 */
	private String lrsj;
	
	/**
	 * 事件状态
	 */
	@Column(name =  "zt")
	private String zt;
	/**
	 * 
	 */
	@Column(name =  "sssq")
	private String sssq;//所属社区
	@Column(name =  "ssjwh")
	private String ssjwh;//所属居委会

	@Column(name =  "znbm")
	private String znbm;

	@Column(name = "bxxsfy")
	private String bxxsfy;

	@Column(name = "clsjfy")
	private String clsjfy;

	@Column(name = "xcts")
	private String xcts;

	private String ztname;

	private List<TFtZtlzEntity> anlist;

	public  TFtSjEntity(){}


	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * 获取 事件名称 的属性值
	 * @return sjmc :  事件名称 
	 * @author otom3@163.com
	 */
	public String getSjmc(){
		return this.sjmc;
	}

	/**
	 * 设置 事件名称 的属性值
	 * @param sjmc :  事件名称 
	 * @author otom3@163.com
	 */
	public void setSjmc(String sjmc){
		this.sjmc	= sjmc;
	}
	
	/**
	 * 获取 发生时间 的属性值
	 * @return fssj :  发生时间 
	 * @author otom3@163.com
	 */
	public String getFssj(){
		return this.fssj;
	}

	/**
	 * 设置 发生时间 的属性值
	 * @param fssj :  发生时间 
	 * @author otom3@163.com
	 */
	public void setFssj(String fssj){
		this.fssj	= fssj;
	}
	
	/**
	 * 获取 发生地点 的属性值
	 * @return fsdd :  发生地点 
	 * @author otom3@163.com
	 */
	public String getFsdd(){
		return this.fsdd;
	}

	/**
	 * 设置 发生地点 的属性值
	 * @param fsdd :  发生地点 
	 * @author otom3@163.com
	 */
	public void setFsdd(String fsdd){
		this.fsdd	= fsdd;
	}
	
	/**
	 * 获取 上访诉求群体 的属性值
	 * @return sfsqqt :  上访诉求群体 
	 * @author otom3@163.com
	 */
	public String getSfsqqt(){
		return this.sfsqqt;
	}

	/**
	 * 设置 上访诉求群体 的属性值
	 * @param sfsqqt :  上访诉求群体 
	 * @author otom3@163.com
	 */
	public void setSfsqqt(String sfsqqt){
		this.sfsqqt	= sfsqqt;
	}
	
	/**
	 * 获取 到场部门 的属性值
	 * @return dcbm :  到场部门 
	 * @author otom3@163.com
	 */
	public String getDcbm(){
		return this.dcbm;
	}

	/**
	 * 设置 到场部门 的属性值
	 * @param dcbm :  到场部门 
	 * @author otom3@163.com
	 */
	public void setDcbm(String dcbm){
		this.dcbm	= dcbm;
	}
	
	/**
	 * 获取 涉及领域 的属性值
	 * @return sjly :  涉及领域 
	 * @author otom3@163.com
	 */
	public String getSjly(){
		return this.sjly;
	}

	/**
	 * 设置 涉及领域 的属性值
	 * @param sjly :  涉及领域 
	 * @author otom3@163.com
	 */
	public void setSjly(String sjly){
		this.sjly	= sjly;
	}
	
	/**
	 * 获取 主要诉求 的属性值
	 * @return zysq :  主要诉求 
	 * @author otom3@163.com
	 */
	public String getZysq(){
		return this.zysq;
	}

	/**
	 * 设置 主要诉求 的属性值
	 * @param zysq :  主要诉求 
	 * @author otom3@163.com
	 */
	public void setZysq(String zysq){
		this.zysq	= zysq;
	}
	
	/**
	 * 获取 事件概要情况 的属性值
	 * @return sjgyqk :  事件概要情况 
	 * @author otom3@163.com
	 */
	public String getSjgyqk(){
		return this.sjgyqk;
	}

	/**
	 * 设置 事件概要情况 的属性值
	 * @param sjgyqk :  事件概要情况 
	 * @author otom3@163.com
	 */
	public void setSjgyqk(String sjgyqk){
		this.sjgyqk	= sjgyqk;
	}
	
	/**
	 * 获取 规模 的属性值
	 * @return gm :  规模 
	 * @author otom3@163.com
	 */
	public String getGm(){
		return this.gm;
	}

	/**
	 * 设置 规模 的属性值
	 * @param gm :  规模 
	 * @author otom3@163.com
	 */
	public void setGm(String gm){
		this.gm	= gm;
	}
	
	/**
	 * 获取 表现形式 的属性值
	 * @return bxxs :  表现形式 
	 * @author otom3@163.com
	 */
	public String getBxxs(){
		return this.bxxs;
	}

	/**
	 * 设置 表现形式 的属性值
	 * @param bxxs :  表现形式 
	 * @author otom3@163.com
	 */
	public void setBxxs(String bxxs){
		this.bxxs	= bxxs;
	}
	
	/**
	 * 获取 是否涉外 的属性值
	 * @return sfsw :  是否涉外 
	 * @author otom3@163.com
	 */
	public String getSfsw(){
		return this.sfsw;
	}

	/**
	 * 设置 是否涉外 的属性值
	 * @param sfsw :  是否涉外 
	 * @author otom3@163.com
	 */
	public void setSfsw(String sfsw){
		this.sfsw	= sfsw;
	}
	
	/**
	 * 获取 是否涉疆 的属性值
	 * @return sfsj :  是否涉疆 
	 * @author otom3@163.com
	 */
	public String getSfsj(){
		return this.sfsj;
	}

	/**
	 * 设置 是否涉疆 的属性值
	 * @param sfsj :  是否涉疆 
	 * @author otom3@163.com
	 */
	public void setSfsj(String sfsj){
		this.sfsj	= sfsj;
	}
	
	/**
	 * 获取 是否涉舆情 的属性值
	 * @return sfsyq :  是否涉舆情 
	 * @author otom3@163.com
	 */
	public String getSfsyq(){
		return this.sfsyq;
	}

	/**
	 * 设置 是否涉舆情 的属性值
	 * @param sfsyq :  是否涉舆情 
	 * @author otom3@163.com
	 */
	public void setSfsyq(String sfsyq){
		this.sfsyq	= sfsyq;
	}
	
	/**
	 * 获取 是否公安处置 的属性值
	 * @return sfgacz :  是否公安处置 
	 * @author otom3@163.com
	 */
	public String getSfgacz(){
		return this.sfgacz;
	}

	/**
	 * 设置 是否公安处置 的属性值
	 * @param sfgacz :  是否公安处置 
	 * @author otom3@163.com
	 */
	public void setSfgacz(String sfgacz){
		this.sfgacz	= sfgacz;
	}
	
	
	
	/**
	 * 获取 领导批示 的属性值
	 * @return ldps :  领导批示 
	 * @author otom3@163.com
	 */
	public String getLdps(){
		return this.ldps;
	}

	/**
	 * 设置 领导批示 的属性值
	 * @param ldps :  领导批示 
	 * @author otom3@163.com
	 */
	public void setLdps(String ldps){
		this.ldps	= ldps;
	}
	
	/**
	 * 获取 发生地经伟度 的属性值
	 * @return jwd :  发生地经伟度 
	 * @author otom3@163.com
	 */
	public String getJwd(){
		return this.jwd;
	}

	/**
	 * 设置 发生地经伟度 的属性值
	 * @param jwd :  发生地经伟度 
	 * @author otom3@163.com
	 */
	public void setJwd(String jwd){
		this.jwd	= jwd;
	}
	
	/**
	 * 获取 处理时限 的属性值
	 * @return clsx :  处理时限 
	 * @author otom3@163.com
	 */
	public String getClsx(){
		return this.clsx;
	}

	/**
	 * 设置 处理时限 的属性值
	 * @param clsx :  处理时限 
	 * @author otom3@163.com
	 */
	public void setClsx(String clsx){
		this.clsx	= clsx;
	}
	
	/**
	 * 获取 录入人 的属性值
	 * @return lrr :  录入人 
	 * @author otom3@163.com
	 */
	public String getLrr(){
		return this.lrr;
	}

	/**
	 * 设置 录入人 的属性值
	 * @param lrr :  录入人 
	 * @author otom3@163.com
	 */
	public void setLrr(String lrr){
		this.lrr	= lrr;
	}
	
	/**
	 * 获取 录入部门 的属性值
	 * @return lrbm :  录入部门 
	 * @author otom3@163.com
	 */
	public String getLrbm(){
		return this.lrbm;
	}

	/**
	 * 设置 录入部门 的属性值
	 * @param lrbm :  录入部门 
	 * @author otom3@163.com
	 */
	public void setLrbm(String lrbm){
		this.lrbm	= lrbm;
	}
	
	/**
	 * 获取 录入时间 的属性值
	 * @return lrsj :  录入时间 
	 * @author otom3@163.com
	 */
	public String getLrsj(){
		return this.lrsj;
	}

	/**
	 * 设置 录入时间 的属性值
	 * @param lrsj :  录入时间 
	 * @author otom3@163.com
	 */
	public void setLrsj(String lrsj){
		this.lrsj	= lrsj;
	}
	
	/**
	 * 获取 事件状态 的属性值
	 * @return zt :  事件状态 
	 * @author otom3@163.com
	 */
	public String getZt(){
		return this.zt;
	}

	/**
	 * 设置 事件状态 的属性值
	 * @param zt :  事件状态 
	 * @author otom3@163.com
	 */
	public void setZt(String zt){
		this.zt	= zt;
	}

	public String getSsjd() {
		return ssjd;
	}

	public void setSsjd(String ssjd) {
		this.ssjd = ssjd;
	}

	public String getSssq() {
		return sssq;
	}

	public void setSssq(String sssq) {
		this.sssq = sssq;
	}

	public String getSsjwh() {
		return ssjwh;
	}

	public void setSsjwh(String ssjwh) {
		this.ssjwh = ssjwh;
	}

	public String getZnbm() {
		return znbm;
	}

	public void setZnbm(String znbm) {
		this.znbm = znbm;
	}

	public String getBxxsfy() {
		return bxxsfy;
	}

	public void setBxxsfy(String bxxsfy) {
		this.bxxsfy = bxxsfy;
	}

	public String getClsjfy() {
		return clsjfy;
	}

	public void setClsjfy(String clsjfy) {
		this.clsjfy = clsjfy;
	}

	public String getXcts() {
		return xcts;
	}

	public void setXcts(String xcts) {
		this.xcts = xcts;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getZtname() {
		return ztname;
	}

	public void setZtname(String ztname) {
		this.ztname = ztname;
	}

	public List<TFtZtlzEntity> getAnlist() {
		return anlist;
	}

	public void setAnlist(List<TFtZtlzEntity> anlist) {
		this.anlist = anlist;
	}
}