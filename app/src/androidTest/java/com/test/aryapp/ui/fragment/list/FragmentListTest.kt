package com.test.aryapp.ui.fragment.list

import android.R
import android.support.test.rule.ActivityTestRule
import android.view.View
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.test.aryapp.ui.activity.SingleActivity
import org.hamcrest.Matchers
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class FragmentListTest {


   /* @Rule
    var activityRule: ActivityTestRule<SingleActivity> = ActivityTestRule(
        SingleActivity::class.java,
        true,
        true
    )

    @Before
    fun setUp() {
        launchFragmentInContainer<FragmentList>(
            initialState = Lifecycle.State.STARTED
        )
    }

    @Test
    fun testFragmentElements() {
        onView(withId(R.id.rvPhotos)).check(matches(isDisplayed()))
    }

    @Test
    fun testSampleRecyclerVisible() {
        onView(withId(R.id.rvPhotos))
            .inRoot(
                RootMatchers.withDecorView(
                    Matchers.`is`(activityRule.getActivity().getWindow().getDecorView())
                )
            )
            .check(matches(isDisplayed()))
    }

    @Test
    fun testCaseForRecyclerClick() {
        onView(withId(R.id.rvPhotos))
            .inRoot(
                RootMatchers.withDecorView(
                    Matchers.`is`<View>(activityRule.activity.window.decorView)
                )
            )
            .perform(actionOnItemAtPosition(0, click()))
    }

    @Test
    fun testCaseForRecyclerScroll() {

        // Get total item of RecyclerView
        val recyclerView = activityRule.activity.findViewById<RecyclerView>(R.id.rvPhotos)
        val itemCount = recyclerView.adapter!!.itemCount

        // Scroll to end of page with position
        onView(withId(R.id.rvPhotos))
            .inRoot(
                RootMatchers.withDecorView(
                    Matchers.`is`<View>(activityRule.activity.window.decorView)
                )
            )
            .perform(RecyclerViewActions.scrollToPosition(itemCount - 1))
    }




    @After
    fun tearDown() {
    }*/
}