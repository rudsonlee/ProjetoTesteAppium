import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ToDo_Android extends TestBase {

    CreateTaskPage createTaskPage ;
    TasksListPage tasksListPage;

    @Test
    public void test_add_task() throws MalformedURLException {
        Android_setUp();

        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName("Rudson");
        createTaskPage.enterTaskDesc("LEE");
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        tearDown();
    }
}