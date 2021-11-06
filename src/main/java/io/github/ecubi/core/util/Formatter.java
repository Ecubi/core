package io.github.ecubi.core.util;

import java.util.Date;

public class Formatter {
	public static String formatValue(Long value) {

		if (value == null) {
			return null;
		}

		return String.format("%.2f", Double.valueOf(value) / 100);
	}

	public static Date formatDate(Long value) {
		return new Date(value * 1000);
	}
}
