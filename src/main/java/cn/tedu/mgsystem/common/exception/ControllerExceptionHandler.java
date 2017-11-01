package cn.tedu.mgsystem.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {
	@ExceptionHandler(ServiceException.class)
	public void handleServiceException(ServiceException e) {
		e.printStackTrace();
	}
}
