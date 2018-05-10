package com.flatstack.android.main_screen;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import com.flatstack.android.R;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class, false, false);

    @Test
    public void buttonOpenSecondScreen() throws Exception {
        // Arrange
        mActivityRule.launchActivity(new Intent());

        // Act
        onView(withId(R.id.button)).perform(click());

        // Assert
        onView(withText(R.string.second_screen)).check(matches(isDisplayed()));
    }
}