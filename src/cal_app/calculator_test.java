package cal_app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class calculator_test {

	@Test
	public void calTest() {
		assertEquals(31, cal_app.add(11, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, cal_app.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, cal_app.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, cal_app.div(30, 5));
	}

}