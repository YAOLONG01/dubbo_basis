package cn.hjycjc.dubbo.basis.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.hjycjc.dubbo.basis.bean.Employee;
import cn.hjycjc.dubbo.basis.service.impl.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	private EmployeeServiceImpl employeeService;
	
	{
		employeeService=ctx.getBean(EmployeeServiceImpl.class);
	}
	
	@RequestMapping("/test")
	public String test(){
		System.out.println("test:");
		return "success";
	}
	/*
	 * 测试返回success.jsp
	 */
	
	
	@RequestMapping(value="/test/json",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
	public String testJSON(){
		String employeeId="1001";
		Employee result=employeeService.getEmployeeforId(employeeId);
		//Bean转化成JSONObject
		JSONObject json=(JSONObject) JSONObject.toJSON(result);
		System.out.println("testJSON:"+json.toString());
		return json.toJSONString();
	}
	/*
	 * 测试返回JSON串
	 */

}
