package com.test.aryapp.ui.fragment.detail

import android.R
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.After
import org.junit.Before
import org.junit.Test


class FragmentDetailTest  {


/*
    @Before
    fun setUp() {
        launchFragmentInContainer<FragmentDetail>(
            initialState = Lifecycle.State.STARTED
        )
    }

    @Test
    fun testFragmentElements() {
        onView(withId(R.id.cvImage))
            .check(matches(isDisplayed()))
    }

    @Test
    fun testTextViews() {
        onView(withId(R.id.txtTitle)).check(matches(withText("Title:")))
        onView(withId(R.id.txtMTitle)).check(matches(withText("Content:")))
    }


    @After
    fun tearDown() {
    }*/
}