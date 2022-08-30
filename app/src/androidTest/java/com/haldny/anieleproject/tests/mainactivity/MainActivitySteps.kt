package com.haldny.anieleproject.tests.mainactivity

import android.content.Intent
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.adevinta.android.barista.assertion.BaristaAssertions.assertThatBackButtonClosesTheApp
import com.adevinta.android.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.adevinta.android.barista.interaction.BaristaClickInteractions.clickOn
import com.haldny.anieleproject.*
import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivitySteps {

    @get:Rule
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java, true, false)

    @Before
    fun setup() {
        Intents.init()
    }

    @After
    fun cleanup() {
        Intents.release()
    }

    @Given("The app started")
    fun the_app_started() {
        activityRule.launchActivity(Intent())
    }

    @Then("I see Main Activity screen")
    fun i_see_main_activity_screen() {
        intended(hasComponent(MainActivity::class.java.name))

        assertDisplayed(R.string.app_name)
        assertDisplayed(R.string.main_activity_welcome_message)
        assertDisplayed(R.string.main_activity_go_to_screen2)
        assertDisplayed(R.string.main_activity_go_to_screen3)
        assertDisplayed(R.string.main_activity_go_to_screen4)
    }

    @When("I press back in Main Activity")
    fun i_press_back_in_main_activity() {
        // intentionally do nothing, assertion is done in the next step
    }

    @Then("I should exit the app")
    fun i_should_exit_the_app() {
        assertThatBackButtonClosesTheApp()
    }

    @When("I press button 2 in Main Activity")
    fun i_press_button_2_in_main_activity() {
        clickOn(R.id.buttonTela2)
    }

    @When("I press button 3 in Main Activity")
    fun i_press_button_3_in_main_activity() {
        clickOn(R.id.buttonTela3)
    }

    @When("I press button 4 in Main Activity")
    fun i_press_button_4_in_main_activity() {
        clickOn(R.id.buttonTela4)
    }

    @Then("I should navigate to screen 2")
    fun i_should_navigate_to_screen2() {
        validate_screen(Tela2::class.java.name)
    }

    @Then("I should navigate to screen 3")
    fun i_should_navigate_to_screen3() {
        validate_screen(Tela3::class.java.name)
    }

    @Then("I should navigate to screen 4")
    fun i_should_navigate_to_screen4() {
        validate_screen(Tela4::class.java.name)
    }

    private fun validate_screen(screenName: String) {
        intended(
            allOf(
                hasComponent(screenName),
                isInternal(),
                toPackage(activityRule.activity.packageName)
            )
        )
    }
}