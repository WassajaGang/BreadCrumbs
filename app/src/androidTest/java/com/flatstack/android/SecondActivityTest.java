package com.flatstack.android;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class SecondActivityTest {

    @Rule
    public ActivityTestRule<SecondActivity> mActivityRule = new ActivityTestRule<>(SecondActivity.class, false, false);

    @Test
    public void textPresentOnScreen() throws Exception {

        // Act
        mActivityRule.launchActivity(new Intent());

        // Assert
        onView(withText(R.string.second_screen)).check(matches(isDisplayed()));
    }
}