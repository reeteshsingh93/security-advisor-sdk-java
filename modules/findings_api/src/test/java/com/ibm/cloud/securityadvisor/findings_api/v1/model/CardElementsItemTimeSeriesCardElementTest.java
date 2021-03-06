/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.securityadvisor.findings_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.securityadvisor.findings_api.v1.utils.TestUtilities;

import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TimeSeriesCardElement model.
 */
public class CardElementsItemTimeSeriesCardElementTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTimeSeriesCardElement() throws Throwable {
    FindingCountValueType findingCountValueTypeModel = new FindingCountValueType.Builder()
      .kind("FINDING_COUNT")
      .findingNoteNames(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .text("testString")
      .build();
    assertEquals(findingCountValueTypeModel.kind(), "FINDING_COUNT");
    assertEquals(findingCountValueTypeModel.findingNoteNames(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(findingCountValueTypeModel.text(), "testString");

    CardElementsItemTimeSeriesCardElement timeSeriesCardElementModel = new CardElementsItemTimeSeriesCardElement.Builder()
      .kind("TimeSeriesCardElement")
      .defaultTimeRange("1d")
      .text("testString")
      .defaultInterval("testString")
      .valueTypes(new java.util.ArrayList<Object>(java.util.Arrays.asList(findingCountValueTypeModel)))
      .build();
    assertEquals(timeSeriesCardElementModel.kind(), "TimeSeriesCardElement");
    assertEquals(timeSeriesCardElementModel.defaultTimeRange(), "1d");
    assertEquals(timeSeriesCardElementModel.text(), "testString");
    assertEquals(timeSeriesCardElementModel.defaultInterval(), "testString");
    assertEquals(timeSeriesCardElementModel.valueTypes(), new java.util.ArrayList<Object>(java.util.Arrays.asList(findingCountValueTypeModel)));

    String json = TestUtilities.serialize(timeSeriesCardElementModel);

    CardElementsItemTimeSeriesCardElement timeSeriesCardElementModelNew = TestUtilities.deserialize(json, CardElementsItemTimeSeriesCardElement.class);
    assertTrue(timeSeriesCardElementModelNew instanceof CardElementsItemTimeSeriesCardElement);
    assertEquals(timeSeriesCardElementModelNew.kind(), "TimeSeriesCardElement");
    assertEquals(timeSeriesCardElementModelNew.defaultTimeRange(), "1d");
    assertEquals(timeSeriesCardElementModelNew.text(), "testString");
    assertEquals(timeSeriesCardElementModelNew.defaultInterval(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTimeSeriesCardElementError() throws Throwable {
    new CardElementsItemTimeSeriesCardElement.Builder().build();
  }

}