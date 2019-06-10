package com.zl.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zl.projo.Grades;
import com.zl.projo.MD5;
@Controller
@EnableAutoConfiguration//自动配置，相当于配置了spring文件
public class OpenAccountController {
	@RequestMapping("/updateRiskAssessment")
	public String updateRiskAssessment(Grades GS) {//刚赋值时打印是拿不到总分的，get方法拿到分数
		int allgrades;
		  try {
		allgrades=GS.getAllGrades();//如果出现空指针异常就返回当前页面
		  }catch(Exception e) {
			  System.out.println("获取总分失败");
			  return "assessment.html";  
		  }
		  System.out.println("成功得到总分："+allgrades);
		  return "salesDepartment.html";		 
	}
	
	
	@RequestMapping("/salesDepartment")
	public String salesDepartment(String provence,String city,String area) {//开户地信息					 
		  return "accounttype.html";		 
	}
	
	
	@RequestMapping("/accounttype")
	public String accounttype(String shanghaiA,String shenzhenB) {//选择的开户类型				 
		  return "transactionpassword.html";		 
	}
	
	
	@RequestMapping("/transactionpassword")
	public String transactionpassword(String transactionpassword) {//设置交易密码		
		String pswd=MD5.encode(transactionpassword);
		System.out.println("加密后的交易密码是:"+pswd);			 
		  return "selectbank.html";		 
	}
	
	
	@RequestMapping("/selectbank")
	public String selectbank() {//设置银行账号				 
		  return "finishaccount.html";
	}
	

}
