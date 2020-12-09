package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void testEmpiler_tourEmpty_True(){
		Disque d1 = new Disque(1);
		Tour t = new Tour();
				
		boolean expected = true;
		boolean actual = t.empiler(d1);
		assertEquals(expected, actual);
	}

	@Test
	public void Question1() {
		Tour tourInit = new Tour();
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(true, tourInit.empiler(grand));
		assertEquals(true, tourInit.empiler(moyen));
		assertEquals(true, tourInit.empiler(petit));

	}

	@Test
	public void Question1f() {
		Tour tourInit = new Tour();
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(true, tourInit.empiler(moyen));
		assertEquals(false, tourInit.empiler(grand));
		assertEquals(true, tourInit.empiler(petit));
		assertEquals(false, tourInit.empiler(petit));

	}

}
