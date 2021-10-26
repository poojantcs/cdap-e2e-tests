/*
 * Copyright © 2021 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cdap.e2e.pages.actions;

import io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators;
import io.cdap.e2e.pages.locators.CdfStudioLocators;
import io.cdap.e2e.utils.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static io.cdap.e2e.utils.SeleniumHelper.readParameters;
import static io.cdap.e2e.utils.SeleniumHelper.waitElementIsVisible;

/**
 * Represents CdfBigQueryPropertiesActions
 */
public class CdfBigQueryPropertiesActions {
  public static io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators cdfBigQueryPropertiesLocators = null;
  static int run = 0;

  static {
    cdfBigQueryPropertiesLocators =
      PageFactory.initElements(SeleniumDriver.getDriver(),
                               io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators.class);
  }

  public static void enterBigQueryProperties(String arg0) throws InterruptedException, IOException {
    CdfStudioLocators.bigQueryProperties.click();
    io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators.
      bigQueryReferenceName.sendKeys("automation_test");
    io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators.
      projectID.sendKeys(readParameters("Project-ID"));
    io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators.bigQueryDataSet.sendKeys(
      readParameters("Data-Set"));
    io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators.bigQueryTable.sendKeys(arg0);
    io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators.updateTable.click();
    io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators.truncatableSwitch.click();
    io.cdap.e2e.pages.locators.CdfBigQueryPropertiesLocators.validateBttn.click();
    waitElementIsVisible(CdfBigQueryPropertiesLocators.textSuccess, 1);
  }
}
