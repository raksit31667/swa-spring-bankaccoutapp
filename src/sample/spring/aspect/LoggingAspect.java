package sample.spring.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * @author raksit
 *
 */

@Aspect
@Component
public class LoggingAspect {

	private Logger logger = Logger.getLogger(LoggingAspect.class);
	
	@Pointcut(value="execution(* sample.spring.service.*Service.*(..))")
	public void invokeServiceMethod() {
		
	}
	
	@Before(value="invokeServiceMethod()")
	public void log(JoinPoint joinPoint) {
		logger.info("Entering " + joinPoint.getTarget().getClass().getSimpleName() + "'s " + joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();
		
		for (int i = 0; i < args.length; i++) {
			logger.info(String.format("args[%d] = %s", i, args[i]));
		}
	}
}
