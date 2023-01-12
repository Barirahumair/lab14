package minmaxlab10;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class MAX {

	@Test
	void test() {
		int[] arr = {3, 5, 2, 1, 9, 4};
		MINMAX obj=new MINMAX();
		int output=obj.getMax(arr);
		assertEquals(9, output);
	}

}
