package com.itheima.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.service.BaseDictService;

@Controller
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	@Value("${fromType.code}")
	private String fromTypeCode;
	
	@RequestMapping(value = "/customer/list")
	public String list(QueryVo vo, Model model) {
		List<BaseDict> fromType = baseDictService.selectBaseDictByCode(fromTypeCode);
		List<BaseDict> industryType = baseDictService.selectBaseDictByCode("001");
		List<BaseDict> levelType = baseDictService.selectBaseDictByCode("006");
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		
		
		return "customer";
	}
	
}
