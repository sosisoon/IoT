package com.IoT.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.IoT.DAO.DAO;

@Controller
@RequestMapping("set")
public class setRequest {
	@Autowired
	private DAO md;
	
	@RequestMapping("/rain/{rain}")
	void setRain(@PathVariable("rain") int rain, HttpServletResponse response) throws IOException {
		//后面再来改成计算时间，setRain就不需要参数，即接到请求就开始计时
		md.setRain(rain);
	}
	
	@RequestMapping("/threshold/{threshold}")
	void setThreshold(@PathVariable("threshold") int threshold,HttpServletResponse response) throws IOException {
		md.setThreshold(threshold);
	}
	
	@RequestMapping("/redsensor/{redsensor}")
	void setRedsensor(@PathVariable("redsensor") int redsensor,HttpServletResponse response) throws IOException {
		md.setRedsensor(redsensor);
	}
}
