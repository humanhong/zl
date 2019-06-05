package com.zl.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zl.projo.Grades;
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
		  System.out.println("开户地信息："+provence);			 
		  return "accounttype.html";		 
	}
	
	
	@RequestMapping("/accounttype")
	public String accounttype(String shanghaiA,String shenzhenB) {//选择的开户类型		
		  System.out.println("开户省份：");			 
		  return "transactionpassword.html";		 
	}
	
	
	@RequestMapping("/transactionpassword")
	public String transactionpassword(String transactionpassword) {//设置交易密码		
		  System.out.println("交易密码是");			 
		  return "selectbank.html";		 
	}
	
	
	@RequestMapping("/selectbank")
	public String selectbank() {//设置银行账号		
		  System.out.println("保存了银行");			 
		/* return "uploadvideo.html"; */
		  return "finishaccount.html";
	}
	
	
	/*
	 * @RequestMapping("/uploadvideo") public String uploadvideo(String
	 * transactionpassword) {//上传视频认证 System.out.println("得到了视频认证"); return
	 * "finishaccount.html"; }
	 */
	
}
