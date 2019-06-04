package com.zl.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.Account;

/**
 * 要访问的远程目标端口的方法的声明,依赖框架去找目标方法的ip,端口号,以及方法, BID是application.properties中配置的实例名
 * 依据application.properties的实例名去找,如果有多个端口都提供相同的登录服务 ,那么由系统找一个(默认方式轮训)
 * 访问登陆注册模块的方法声明,只要写登录模块的controller方法声明就行,估计底层用了动态代理生成了实现类
 * 
 */
@FeignClient(value = "ACCOUNT")
public interface AccountClient {
	@ResponseBody
	@RequestMapping("/account/accounts")
	public List<Account> account();
}
