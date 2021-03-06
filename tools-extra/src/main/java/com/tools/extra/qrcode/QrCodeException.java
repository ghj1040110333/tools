package com.tools.extra.qrcode;

import com.tools.core.exceptions.ExceptionUtil;
import com.tools.core.util.StringUtil;

/**
 * Qrcode异常
 *
 * @author fruit
 */
public class QrCodeException extends RuntimeException {
	private static final long serialVersionUID = 8247610319171014183L;

	public QrCodeException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}

	public QrCodeException(String message) {
		super(message);
	}

	public QrCodeException(String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params));
	}

	public QrCodeException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public QrCodeException(Throwable throwable, String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params), throwable);
	}
}
