import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LabOneTest {

	@Test
	public void testFindInterest() {
		assertEquals(8235.0474884514, LabOne.findInterest(5000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest2() {
		assertEquals(9882.05698614168, LabOne.findInterest(6000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest3() {
		assertEquals(11529.06648383196, LabOne.findInterest(7000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest4() {
		assertEquals(13176.07598152224, LabOne.findInterest(8000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest5() {
		assertEquals(14823.085479212521, LabOne.findInterest(9000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest6() {
		assertEquals(16470.0949769028, LabOne.findInterest(10000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest7() {
		assertEquals(18117.10447459308, LabOne.findInterest(11000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest8() {
		assertEquals(19764.11397228336, LabOne.findInterest(12000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest9() {
		assertEquals(21411.12346997364, LabOne.findInterest(13000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest10() {
		assertEquals(23058.13296766392, LabOne.findInterest(14000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest11() {
		assertEquals(24705.1424653542, LabOne.findInterest(15000, 5, 12, 10));
	}
	
	@Test
	public void testFindInterest12() {
		assertEquals(26352.15196304448, LabOne.findInterest(16000, 5, 12, 10));
	}
}
