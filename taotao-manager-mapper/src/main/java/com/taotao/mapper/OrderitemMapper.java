package com.taotao.mapper;

import com.taotao.pojo.Orderitem;
import tk.mybatis.mapper.common.Mapper;

public interface OrderitemMapper extends Mapper<Orderitem> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * 
     */
   /* int insert(Orderitem record);*/

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_item
     *
     * 
     */
    int insertSelective(Orderitem record);
}