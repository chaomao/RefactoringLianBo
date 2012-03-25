import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {
    @Test
    public void should_get_manager() {
        Person manager = new Person();
        Department department = new Department(manager);

        Person john = new Person();
        john.setDepartment(department);

        assertThat(john.getDepartment().getManager(), is(manager));
    }
}
