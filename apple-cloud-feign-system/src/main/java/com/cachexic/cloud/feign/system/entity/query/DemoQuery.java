package com.cachexic.cloud.feign.system.entity.query;

import com.cachexic.cloud.common.base.entity.query.BaseQuery;
import com.cachexic.cloud.common.enums.YesOrNoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: DEMO管理
 * @author tangmin
 * @date 2017-10-26 15:17:49
 */
public class DemoQuery extends BaseQuery{
  private static final long serialVersionUID = 1L;

  @ApiModelProperty("姓名")
  private String name;
  private Boolean nameLike = true;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  @ApiModelProperty(value = "出生日期", example = "2018-08-08 09:09:09")  
  private Date birthday;

  @ApiModelProperty("年龄")
  private Integer age;

  @ApiModelProperty("是否班主任")
  private YesOrNoEnum classMater;

  @ApiModelProperty("是否是特级教师")
  private Boolean supper;

  @ApiModelProperty("账户金额")
  private BigDecimal account;

  @ApiModelProperty("类型")
  private String type;
  private Boolean typeLike = false;

  @ApiModelProperty("备注")
  private String memo;
  private Boolean memoLike = false;

  public String getName() {
    return name;
  }

  public DemoQuery setName(String name) {
    this.name = name;
    return this;
  }

  public Boolean getNameLike() {
    return nameLike;
  }

  public DemoQuery setNameLike(Boolean nameLike) {
    this.nameLike = nameLike;
    return this;
  }
  public Date getBirthday() {
    return birthday;
  }

  public DemoQuery setBirthday(Date birthday) {
    this.birthday = birthday;
    return this;
  }

  public Integer getAge() {
    return age;
  }

  public DemoQuery setAge(Integer age) {
    this.age = age;
    return this;
  }

  public YesOrNoEnum getClassMater() {
    return classMater;
  }

  public DemoQuery setClassMater(YesOrNoEnum classMater) {
    this.classMater = classMater;
    return this;
  }

  public Boolean getSupper() {
    return supper;
  }

  public DemoQuery setSupper(Boolean supper) {
    this.supper = supper;
    return this;
  }

  public BigDecimal getAccount() {
    return account;
  }

  public DemoQuery setAccount(BigDecimal account) {
    this.account = account;
    return this;
  }

  public String getType() {
    return type;
  }

  public DemoQuery setType(String type) {
    this.type = type;
    return this;
  }

  public Boolean getTypeLike() {
    return typeLike;
  }

  public DemoQuery setTypeLike(Boolean typeLike) {
    this.typeLike = typeLike;
    return this;
  }
  public String getMemo() {
    return memo;
  }

  public DemoQuery setMemo(String memo) {
    this.memo = memo;
    return this;
  }

  public Boolean getMemoLike() {
    return memoLike;
  }

  public DemoQuery setMemoLike(Boolean memoLike) {
    this.memoLike = memoLike;
    return this;
  }
}