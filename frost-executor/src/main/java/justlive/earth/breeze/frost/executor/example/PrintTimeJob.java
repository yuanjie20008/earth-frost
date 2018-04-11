package justlive.earth.breeze.frost.executor.example;

import java.time.LocalDateTime;
import justlive.earth.breeze.frost.core.job.IJob;
import justlive.earth.breeze.frost.core.job.Job;
import justlive.earth.breeze.frost.core.job.JobContext;
import lombok.extern.slf4j.Slf4j;

/**
 * 打印时间job，例子
 * 
 * @author wubo
 *
 */
@Slf4j
@Job("printTimeJob")
public class PrintTimeJob implements IJob {

  @Override
  public void execute(JobContext ctx) {
    log.info("current time is {}", LocalDateTime.now());
  }

}