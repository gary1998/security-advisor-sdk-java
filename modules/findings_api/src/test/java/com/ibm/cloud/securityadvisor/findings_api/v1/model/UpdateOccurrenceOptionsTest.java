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
 * Unit test class for the UpdateOccurrenceOptions model.
 */
public class UpdateOccurrenceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateOccurrenceOptions() throws Throwable {
    SocketAddress socketAddressModel = new SocketAddress.Builder()
      .address("testString")
      .port(Long.valueOf("26"))
      .build();
    assertEquals(socketAddressModel.address(), "testString");
    assertEquals(socketAddressModel.port(), Long.valueOf("26"));

    DataTransferred dataTransferredModel = new DataTransferred.Builder()
      .clientBytes(Long.valueOf("26"))
      .serverBytes(Long.valueOf("26"))
      .clientPackets(Long.valueOf("26"))
      .serverPackets(Long.valueOf("26"))
      .build();
    assertEquals(dataTransferredModel.clientBytes(), Long.valueOf("26"));
    assertEquals(dataTransferredModel.serverBytes(), Long.valueOf("26"));
    assertEquals(dataTransferredModel.clientPackets(), Long.valueOf("26"));
    assertEquals(dataTransferredModel.serverPackets(), Long.valueOf("26"));

    NetworkConnection networkConnectionModel = new NetworkConnection.Builder()
      .direction("testString")
      .protocol("testString")
      .client(socketAddressModel)
      .server(socketAddressModel)
      .build();
    assertEquals(networkConnectionModel.direction(), "testString");
    assertEquals(networkConnectionModel.protocol(), "testString");
    assertEquals(networkConnectionModel.client(), socketAddressModel);
    assertEquals(networkConnectionModel.server(), socketAddressModel);

    RemediationStep remediationStepModel = new RemediationStep.Builder()
      .title("testString")
      .url("testString")
      .build();
    assertEquals(remediationStepModel.title(), "testString");
    assertEquals(remediationStepModel.url(), "testString");

    Context contextModel = new Context.Builder()
      .region("testString")
      .resourceCrn("testString")
      .resourceId("testString")
      .resourceName("testString")
      .resourceType("testString")
      .serviceCrn("testString")
      .serviceName("testString")
      .environmentName("testString")
      .componentName("testString")
      .toolchainId("testString")
      .build();
    assertEquals(contextModel.region(), "testString");
    assertEquals(contextModel.resourceCrn(), "testString");
    assertEquals(contextModel.resourceId(), "testString");
    assertEquals(contextModel.resourceName(), "testString");
    assertEquals(contextModel.resourceType(), "testString");
    assertEquals(contextModel.serviceCrn(), "testString");
    assertEquals(contextModel.serviceName(), "testString");
    assertEquals(contextModel.environmentName(), "testString");
    assertEquals(contextModel.componentName(), "testString");
    assertEquals(contextModel.toolchainId(), "testString");

    Finding findingModel = new Finding.Builder()
      .severity("LOW")
      .certainty("LOW")
      .nextSteps(new java.util.ArrayList<RemediationStep>(java.util.Arrays.asList(remediationStepModel)))
      .networkConnection(networkConnectionModel)
      .dataTransferred(dataTransferredModel)
      .build();
    assertEquals(findingModel.severity(), "LOW");
    assertEquals(findingModel.certainty(), "LOW");
    assertEquals(findingModel.nextSteps(), new java.util.ArrayList<RemediationStep>(java.util.Arrays.asList(remediationStepModel)));
    assertEquals(findingModel.networkConnection(), networkConnectionModel);
    assertEquals(findingModel.dataTransferred(), dataTransferredModel);

    Kpi kpiModel = new Kpi.Builder()
      .value(Double.valueOf("72.5"))
      .total(Double.valueOf("72.5"))
      .build();
    assertEquals(kpiModel.value(), Double.valueOf("72.5"));
    assertEquals(kpiModel.total(), Double.valueOf("72.5"));

    UpdateOccurrenceOptions updateOccurrenceOptionsModel = new UpdateOccurrenceOptions.Builder()
      .accountId("testString")
      .providerId("testString")
      .occurrenceId("testString")
      .noteName("testString")
      .kind("FINDING")
      .id("testString")
      .resourceUrl("testString")
      .remediation("testString")
      .createTime(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .updateTime(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .context(contextModel)
      .finding(findingModel)
      .kpi(kpiModel)
      .build();
    assertEquals(updateOccurrenceOptionsModel.accountId(), "testString");
    assertEquals(updateOccurrenceOptionsModel.providerId(), "testString");
    assertEquals(updateOccurrenceOptionsModel.occurrenceId(), "testString");
    assertEquals(updateOccurrenceOptionsModel.noteName(), "testString");
    assertEquals(updateOccurrenceOptionsModel.kind(), "FINDING");
    assertEquals(updateOccurrenceOptionsModel.id(), "testString");
    assertEquals(updateOccurrenceOptionsModel.resourceUrl(), "testString");
    assertEquals(updateOccurrenceOptionsModel.remediation(), "testString");
    assertEquals(updateOccurrenceOptionsModel.createTime(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(updateOccurrenceOptionsModel.updateTime(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(updateOccurrenceOptionsModel.context(), contextModel);
    assertEquals(updateOccurrenceOptionsModel.finding(), findingModel);
    assertEquals(updateOccurrenceOptionsModel.kpi(), kpiModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateOccurrenceOptionsError() throws Throwable {
    new UpdateOccurrenceOptions.Builder().build();
  }

}