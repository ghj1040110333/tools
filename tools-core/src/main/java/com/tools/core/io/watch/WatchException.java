package com.tools.core.io.watch;

import com.tools.core.exceptions.ExceptionUtil;
import com.tools.core.util.StringUtil;

/**
 * 监听异常
 * @author Looly
 *
 */
public class WatchException extends RuntimeException {
	private static final long serialVersionUID = 8068509879445395353L;

	public WatchException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}

	public WatchException(String message) {
		super(message);
	}

	public WatchException(String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params));
	}

	public WatchException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public WatchException(Throwable throwable, String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params), throwable);
	}
}
