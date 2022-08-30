package com.haldny.anieleproject.tests.tela2

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.adevinta.android.barista.assertion.BaristaListAssertions.assertDisplayedAtPosition
import com.adevinta.android.barista.assertion.BaristaListAssertions.assertListItemCount
import com.adevinta.android.barista.assertion.BaristaListAssertions.assertListNotEmpty
import com.adevinta.android.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.adevinta.android.barista.interaction.BaristaListInteractions.scrollListToPosition
import cucumber.api.java.en.Then
import com.haldny.anieleproject.R
import cucumber.api.java.en.And
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Tela2Steps {

    @Then("I see Tela2 screen with 13 elements")
    fun i_see_tela2_screen_with_13_elements() {
        assertListNotEmpty(R.id.my_recycler_view)
        assertListItemCount(R.id.my_recycler_view, 13)
    }

    @And("Navigate to element {int}")
    fun navigate_to_element(position: Int) {
        scrollListToPosition(R.id.my_recycler_view, position)
    }

    @Then("I see {string} in title")
    fun i_see_name_in_title(title: String) {
        assertDisplayed(title)
    }

    @Then("I see {string} in description")
    fun i_see_name_in_description(description: String) {
        assertDisplayed(description)
    }
}