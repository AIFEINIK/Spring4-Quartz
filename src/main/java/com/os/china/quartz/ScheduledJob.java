package com.os.china.quartz;

import com.os.china.scheduling.TowBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ScheduledJob extends QuartzJobBean{

	private TowBean towBean;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		towBean.outMessage();
	}

	public void setTowBean(TowBean towBean) {
		this.towBean = towBean;
	}
}
