package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class UserData {
    public String
            testName = "Dmitrii",
            testEmail = "Airplay1x6@gmail.com";

    public String testImage = "testimage.jpg";

    private final Faker fakeEN = new Faker(new Locale("EN"));
    public String
            fakeName = fakeEN.address().firstName(),
            fakeEmail = fakeEN.internet().emailAddress();

}
