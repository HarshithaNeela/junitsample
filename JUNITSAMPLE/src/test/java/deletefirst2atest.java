import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

class deletefirst2atest 
{
	/*
	 * "ABCD"    =>   "BCD" success
       "AACD"    =>   "CD"  success
       "BACD"    =>   "BCD" success
       "BBAA"    =>    "BBAA" success
       "AABAA"   =>   "BAA" success
       ""        =>    "" success 
       "A"       =>   "" success
	 */
	deleteacharclass obj;
	@BeforeEach
	void setup() {obj=new deleteacharclass();}
	@Test
	void testdeleteAcharatfirstplace() {
		assertEquals("BCD",obj.deletefunc("ABCD"));
	}
	@Test
    void testdeleteAcharatfirstandsecond() {
	assertEquals("CD",obj.deletefunc("AACD"));
	}
	@Test
	void testdeleteAcharatsecond() {
	assertEquals("BCD",obj.deletefunc("BACD"));
	}
	@Test
	void testnodeletionstwobb() {
    assertEquals("BBAA",obj.deletefunc("BBAA"));		
	}
	@Test
	void testDeletiondigit5() {
	assertEquals("BAA",obj.deletefunc("AABAA"));
	}
	@Test
	void testdeleteachar() {
	assertEquals("",obj.deletefunc(""));
	}
	@Test
	void testnoiput() {
	assertEquals("",obj.deletefunc("A"));
	}
  }
