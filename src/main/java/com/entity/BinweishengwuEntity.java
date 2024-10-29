package com.entity;

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
 * 濒危生物
 *
 * @author 
 * @email
 */
@TableName("binweishengwu")
public class BinweishengwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BinweishengwuEntity() {

	}

	public BinweishengwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 动物
     */
    @TableField(value = "binweishengwu_name")

    private String binweishengwuName;


    /**
     * 所在地区
     */
    @TableField(value = "address_types")

    private Integer addressTypes;


    /**
     * 图片
     */
    @TableField(value = "binweishengwu_photo")

    private String binweishengwuPhoto;


    /**
     * 现存数量
     */
    @TableField(value = "binweishengwu_size")

    private String binweishengwuSize;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 介绍
     */
    @TableField(value = "binweishengwu_content")

    private String binweishengwuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：动物
	 */
    public String getBinweishengwuName() {
        return binweishengwuName;
    }
    /**
	 * 获取：动物
	 */

    public void setBinweishengwuName(String binweishengwuName) {
        this.binweishengwuName = binweishengwuName;
    }
    /**
	 * 设置：所在地区
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }
    /**
	 * 获取：所在地区
	 */

    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getBinweishengwuPhoto() {
        return binweishengwuPhoto;
    }
    /**
	 * 获取：图片
	 */

    public void setBinweishengwuPhoto(String binweishengwuPhoto) {
        this.binweishengwuPhoto = binweishengwuPhoto;
    }
    /**
	 * 设置：现存数量
	 */
    public String getBinweishengwuSize() {
        return binweishengwuSize;
    }
    /**
	 * 获取：现存数量
	 */

    public void setBinweishengwuSize(String binweishengwuSize) {
        this.binweishengwuSize = binweishengwuSize;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：介绍
	 */
    public String getBinweishengwuContent() {
        return binweishengwuContent;
    }
    /**
	 * 获取：介绍
	 */

    public void setBinweishengwuContent(String binweishengwuContent) {
        this.binweishengwuContent = binweishengwuContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Binweishengwu{" +
            "id=" + id +
            ", binweishengwuName=" + binweishengwuName +
            ", addressTypes=" + addressTypes +
            ", binweishengwuPhoto=" + binweishengwuPhoto +
            ", binweishengwuSize=" + binweishengwuSize +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", binweishengwuContent=" + binweishengwuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
