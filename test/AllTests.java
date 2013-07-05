import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.eventick.api.*;

@RunWith(Suite.class)
@SuiteClasses({ AttendeeTest.class, EventickAPITest.class, EventTest.class, TicketTest.class })
public class AllTests {
}