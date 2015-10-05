package com.thirdparty;

public class MoneyTool {

	public String format (final int amount) {
		return String.format("TLR %.2f", amount / 100.0);
	}
}
