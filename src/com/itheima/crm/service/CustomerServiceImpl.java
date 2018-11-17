package com.itheima.crm.service;

import org.springframework.stereotype.Service;

import com.itheima.common.utils.Page;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

/**
 * 客户管理
 * @author jianlongliang
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	public Page<Customer> selectPageByQueryVo(QueryVo vo) {
		Page<Customer> page = new Page<Customer>();
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
			}
			if (null != vo.getCustName() && !"".equals(vo.getCustName().trim())) {
				vo.setCustName(vo.getCustName().trim());
			}
			if (null != vo.getCustSource() && !"".equals(vo.getCustSource().trim())) {
				vo.setCustSource(vo.getCustSource().trim());
			}
			if (null != vo.getCustIndustry() && !"".equals(vo.getCustIndustry().trim())) {
				vo.setCustIndustry(vo.getCustIndustry().trim());
			}
			if (null != vo.getCustLevel() && !"".equals(vo.getCustLevel().trim())) {
				vo.setCustLevel(vo.getCustLevel().trim());
			}
			// 总数
			page.setTotal(total);
		}
		// 每页数
		page.setSize(5);
		return page;
	} 
	
}
