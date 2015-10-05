package com.thirdparty;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyToolTest {

	MoneyTool tool;

	@Before
	public void setUpSystemUnderTest() {
		tool = new MoneyTool();
	}

	@Test
	public void testFormat() throws Exception {
		final String result = tool.format(2312);

		assertEquals("23,12 ₮",result);
	}

	@Test
	public void testFormatNull() throws Exception {
		final String result = tool.format(0);

		assertEquals("0,00 ₮",result);
	}

}
