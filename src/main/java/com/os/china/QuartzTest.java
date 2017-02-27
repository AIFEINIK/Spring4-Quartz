package com.os.china;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * 测试类
 * @author ZhangPengFei
 * @Discription
 * @Data 2017-2-25
 * @Version 1.0.0
 */
public class QuartzTest {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("quartz-context.xml");
		SchedulerFactoryBean bean = new SchedulerFactoryBean();
		bean.setJobDetails();
	}
}
