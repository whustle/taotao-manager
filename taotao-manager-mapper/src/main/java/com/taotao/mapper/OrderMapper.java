package com.taotao.mapper;


import com.taotao.pojo.Order;
import tk.mybatis.mapper.common.Mapper;

public interface OrderMapper extends Mapper<Order> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * 
     */
    /*int insert(Order record);
*/
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * 
     */
    int insertSelective(Order record);
}