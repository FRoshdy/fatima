package Mobi.qa.dispatch.APIs;

import Mobi.qa.dispatch.base.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by fatma on 5/24/2018.
 */
public class GetEndPoint extends TestBase {

@Test
    public void TestGet1()
    {


        given()
                .contentType("application/xml")
                //.header("Authorization", "abcdefgh-123456")
                .header("Tenant-Id", "MOBI-DEMO")
                .header("User-Id", "SuperUser")
                .body("<AddServiceOrdersRequest xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.pointserve.com/Schema/OnPoint/ServiceOrder/v2\" RequestId=\"bc9566ba-bc51-419a-83ea-d55b8b31ff08fr-a\" TenantId=\"MOBI-WOW\" Version=\"2.1\" xsi:schemaLocation=\"http://www.pointserve.com/Schema/OnPoint/ServiceOrder/v2 ../schema/ServiceOrder_v2.xsd\">\r\n" +
                        "  <ServiceOrder>\r\n" +
                        "    <ServiceOrderId>frtest105187</ServiceOrderId>\r\n" +
                        "    <BranchId>AUS;103</BranchId>\r\n" +
                        "    <CustomerId>ZZI</CustomerId>\r\n" +
                        "    <ServiceTypeId>W00O1</ServiceTypeId>\r\n" +
                        "    <ServiceAddress>\r\n" +
                        "      <Street1>3300 Bee Caves</Street1>\r\n" +
                        "      <City>Austin</City>\r\n" +
                        "      <State>TX</State>\r\n" +
                        "      <PostalCode>78746</PostalCode>\r\n" +
                        "      <CountryCode>US</CountryCode>\r\n" +
                        "      <Geocode>\r\n" +
                        "     	<Latitude>31.233529</Latitude>\r\n" +
                        "	<Longitude>-85.403378</Longitude>\r\n" +
                        "       <MatchQuality>MANUAL_MATCH</MatchQuality>\r\n" +
                        "            </Geocode>\r\n" +
                        "    </ServiceAddress>\r\n" +
                        "    <Appointment>\r\n" +
                        "      <ArrivalDate>05/10/2018</ArrivalDate>\r\n" +
                        "      <Date>05/10/2018</Date>\r\n" +
                        "      <Locked>TRUE</Locked>\r\n" +
                        "      <Promised>TRUE</Promised>\r\n" +
                        "      <TimeWindow>\r\n" +
                        "        <Start>01:00</Start>\r\n" +
                        "        <End>16:15</End>\r\n" +
                        "      </TimeWindow>\r\n" +
                        "      <TimeWindowLocked>TRUE</TimeWindowLocked>\r\n" +
                        "      <TimeWindowPromised>TRUE</TimeWindowPromised>\r\n" +
                        "      <Forced>TRUE</Forced>\r\n" +
                        "      <ForcedReason>No reason specified</ForcedReason>\r\n" +
                        "      <ForcedReasonCode>No code specified</ForcedReasonCode>\r\n" +
                        "      <UserScheduled>TRUE</UserScheduled>\r\n" +
                        "      <UserId>2803</UserId>\r\n" +
                        "      <UserName>2803</UserName>\r\n" +
                        "    </Appointment>\r\n" +
                        "    <FloatRange>\r\n" +
                        "      <Start>05/09/2018</Start>\r\n" +
                        "       <End>05/29/2018</End>\r\n" +
                        "    </FloatRange>\r\n" +
                        "    <Duration>10</Duration>\r\n" +
                        "    <Notes>Authorized by: DENNIS \r\n" +
                        "Special Instructions: PLS BRING &amp; INSTALL 1 X DSR600 &amp; RUN1 LINE AT: 122 PHILOSOPHER'S TRAILBRAMPTON ON L6S 5C8</Notes>\r\n" +
                        "  </ServiceOrder>\r\n" +
                        "</AddServiceOrdersRequest>")
                .when()
                .post("url")
                .then()
                .statusCode(200);//getting error 405
    }


}
