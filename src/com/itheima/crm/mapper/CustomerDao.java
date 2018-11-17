package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerDao {

	// 总条数
	public Integer customerCountByQueryVo(QueryVo vo);
	
	// 分页结果集
	public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	
}
