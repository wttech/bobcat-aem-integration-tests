/*-
 * #%L
 * Bobcat
 * %%
 * Copyright (C) 2016 Wunderman Thompson Technology
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.cognifide.qa.bobcumber.steps;

import static org.junit.Assert.assertTrue;

import com.cognifide.bdd.demo.po.publish.pages.WomensPage;
import com.google.inject.Inject;

import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class WomensPublishPageSteps {

  @Inject
  private WomensPage womensPage;

  @Then("^woman page is displayed$")
  public void womanPageIsDisplayed() {
    assertTrue(womensPage.isDisplayed());
  }

}
