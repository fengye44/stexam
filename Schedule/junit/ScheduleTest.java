import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ScheduleTest {
   private static Schedule sch = new Schedule();
  
   public List<Work> lw = new ArrayList<Work>(){{
	   add(new Work("w1",0,2));
	   add(new Work("w2",1,2));
	   add(new Work("w3",2,2));
	   add(new Work("w4",3,2));
	   
   }
	   
   };
	   
   
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFCFS() {
		List<Double> l = new ArrayList<Double>(){{
			add(3.5);
			add(1.75);
		}
		};
		assertEquals(l,sch.FCFS(lw));
	}

	@Test
	public void testSJF() {
		List<Double> l = new ArrayList<Double>(){{
			add(3.5);
			add(1.75);
		}
		};
		assertEquals(l,sch.SJF(lw));
	}

}

