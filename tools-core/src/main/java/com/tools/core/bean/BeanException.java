package com.tools.core.bean;

import com.tools.core.exceptions.ExceptionUtil;
import com.tools.core.util.StringUtil;

/**
 * Bean异常
 * @author fruit
 */
public class BeanException extends RuntimeException{
	private static final long serialVersionUID = -8096998667745023423L;

	public BeanException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}

	public BeanException(String message) {
		super(message);
	}

	public BeanException(String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params));
	}

	public BeanException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public BeanException(Throwable throwable, String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params), throwable);
	}
}
