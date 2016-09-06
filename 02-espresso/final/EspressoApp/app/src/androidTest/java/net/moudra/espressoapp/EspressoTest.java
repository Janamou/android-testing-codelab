package net.moudra.espressoapp;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class EspressoTest {
    private String helloString;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void setUp() {
        helloString = "Hello DevFest Ukraine 2016!";
    }

    @Test
    public void testFormSending() {
        onView(withId(R.id.message_edittext))
                .perform(typeTextIntoFocusedView(helloString))
                .check(matches(withText(helloString)));

        //SystemClock.sleep(2000);
        // Opens new Activity
        onView(withId(R.id.message_btn))
                .perform(click());

        //SystemClock.sleep(2000);
        // Checks the text
        onView(ViewMatchers.withId(R.id.message_textview))
                .check(matches(withText(helloString)));
    }
}