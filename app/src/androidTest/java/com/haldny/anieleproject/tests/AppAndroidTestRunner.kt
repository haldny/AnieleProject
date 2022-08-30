package com.haldny.anieleproject.tests

import cucumber.api.CucumberOptions
import cucumber.api.android.CucumberAndroidJUnitRunner

@CucumberOptions(
    glue = ["com.haldny.anieleproject.tests"],
    features = ["features"],
    tags = ["~@wip"]
)
class AppAndroidTestRunner : CucumberAndroidJUnitRunner()
