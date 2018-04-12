package ru.stqa.javast.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testContactCreationTest() {
        initContactCreation();
        fillContactData(new ContactData("Иванова", "Грейс", "Ренессанс", "Пенза, Ворошилова, 16-60", "+79273807076", "Грейс"));
        submitContactCreation();
        returnToContactPage();
    }

}
