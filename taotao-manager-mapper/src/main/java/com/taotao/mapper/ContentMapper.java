package com.taotao.mapper;


import com.taotao.pojo.Content;
import tk.mybatis.mapper.common.Mapper;

public interface ContentMapper extends Mapper<Content> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * 
     */
    int insert(Content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * 
     */
    int insertSelective(Content record);
}