package cn.tedu.mgsystem.project.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {
	@ExceptionHandler(ServiceException.class)
	public void handleServiceException(ServiceException e) {
		e.printStackTrace();
	}
}
