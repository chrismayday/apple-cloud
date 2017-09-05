package com.cachexic.cloud.generator.bean;


import org.apache.commons.lang3.StringUtils;

/**
 * 字段，数据库字段
 *
 * @author tangmin
 * @date 2016年2月26日
 */
public class EntityField {
    /**
     * entity字段
     */
    String fieldName;

    /**
     * 数据库字段
     */
    String columnName;

    /**
     * 首字母大写，用于模板的get  SET方法
     *
     * @return
     */
    String supFiledName;

    /**
     * 用于判断class java.util.Date
     */
    String fieldTypeClassName;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
        this.supFiledName = StringUtils.capitalize(this.fieldName);
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getSupFiledName() {
        return supFiledName;//首字母大写
    }

    public void setSupFiledName(String supFiledName) {
        this.supFiledName = supFiledName;
    }

    public String getFieldTypeClassName() {
        return fieldTypeClassName;
    }

    public void setFieldTypeClassName(String fieldTypeClassName) {
        this.fieldTypeClassName = fieldTypeClassName;
    }

    @Override
    public String toString() {
        return "EntityField{" +
                "fieldName='" + fieldName + '\'' +
                ", columnName='" + columnName + '\'' +
                ", supFiledName='" + supFiledName + '\'' +
                ", fieldTypeClassName='" + fieldTypeClassName + '\'' +
                '}';
    }
}