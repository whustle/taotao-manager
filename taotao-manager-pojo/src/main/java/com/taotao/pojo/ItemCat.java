package com.taotao.pojo;

import java.util.Date;

public class ItemCat {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.id
     *
     * 
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.parent_id
     *
     * 
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.name
     *
     * 
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.status
     *
     * 
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.sort_order
     *
     * 
     */
    private Integer sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.is_parent
     *
     * 
     */
    private Boolean isParent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.created
     *
     * 
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_cat.updated
     *
     * 
     */
    private Date updated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.id
     *
     * @return the value of tb_item_cat.id
     *
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.id
     *
     * @param id the value for tb_item_cat.id
     *
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.parent_id
     *
     * @return the value of tb_item_cat.parent_id
     *
     * 
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.parent_id
     *
     * @param parentId the value for tb_item_cat.parent_id
     *
     * 
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.name
     *
     * @return the value of tb_item_cat.name
     *
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.name
     *
     * @param name the value for tb_item_cat.name
     *
     * 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.status
     *
     * @return the value of tb_item_cat.status
     *
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.status
     *
     * @param status the value for tb_item_cat.status
     *
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.sort_order
     *
     * @return the value of tb_item_cat.sort_order
     *
     * 
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.sort_order
     *
     * @param sortOrder the value for tb_item_cat.sort_order
     *
     * 
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.is_parent
     *
     * @return the value of tb_item_cat.is_parent
     *
     * 
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.is_parent
     *
     * @param isParent the value for tb_item_cat.is_parent
     *
     * 
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.created
     *
     * @return the value of tb_item_cat.created
     *
     * 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.created
     *
     * @param created the value for tb_item_cat.created
     *
     * 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_cat.updated
     *
     * @return the value of tb_item_cat.updated
     *
     * 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_cat.updated
     *
     * @param updated the value for tb_item_cat.updated
     *
     * 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}