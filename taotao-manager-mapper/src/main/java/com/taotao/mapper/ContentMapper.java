package com.taotao.mapper;

import com.taotao.pojo.Content;
import com.taotao.pojo.ContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int countByExample(ContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int deleteByExample(ContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int insert(Content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int insertSelective(Content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    List<Content> selectByExampleWithBLOBs(ContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    List<Content> selectByExample(ContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    Content selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Content record);
}