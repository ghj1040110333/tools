package com.tools.core.convert.impl;

import com.tools.core.convert.AbstractConverter;
import com.tools.core.util.BooleanUtil;
import com.tools.core.util.StringUtil;

/**
 * 字符转换器
 *
 * @author Looly
 *
 */
public class CharacterConverter extends AbstractConverter<Character> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Character convertInternal(Object value) {
		if (value instanceof Boolean) {
			return BooleanUtil.toCharacter((Boolean) value);
		} else {
			final String valueStr = convertToStr(value);
			if (StringUtil.isNotBlank(valueStr)) {
				return valueStr.charAt(0);
			}
		}
		return null;
	}

}
