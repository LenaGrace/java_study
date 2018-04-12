package ru.stqa.javast.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreationTest() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test3", "test2"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
