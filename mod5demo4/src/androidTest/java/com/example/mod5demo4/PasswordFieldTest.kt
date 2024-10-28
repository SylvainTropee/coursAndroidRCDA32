package com.example.mod5demo4

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithContentDescription
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test

class PasswordFieldTest {


    //récupérer l'objet qui permet les tests
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun textFieldPasswordIsWorking(){

        //passer le composant à tester
        composeTestRule.setContent {
            PasswordTextField()
        }

        //test
        composeTestRule.onNodeWithTag("PasswordTextField").assertExists("Input introuvable")

        //scénario
        composeTestRule
            .onNodeWithTag("PasswordTextField")
            .performTextInput("1234")
        composeTestRule
            .onNodeWithContentDescription("Show password")
            .performClick()

        //test
        composeTestRule
            .onNodeWithContentDescription("Hide password")
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithTag("PasswordTextField")
            .assert(hasText("1234"))

    }


}

