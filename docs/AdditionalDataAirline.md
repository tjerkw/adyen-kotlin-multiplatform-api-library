
# AdditionalDataAirline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**airlinePassengerName** | **kotlin.String** | The passenger&#39;s name, initials, and title. * Format: last name + first name or initials + title * Example: *FLYER / MARY MS* * minLength: 1 character * maxLength: 20 characters * If you send more than 20 characters, the name is truncated * Must not be all spaces  *Must not be all zeros. | 
**airlineAgencyInvoiceNumber** | **kotlin.String** | The reference number for the invoice, issued by the agency. * Encoding: ASCII * minLength: 1 character * maxLength: 6 characters |  [optional]
**airlineAgencyPlanName** | **kotlin.String** | The two-letter agency plan identifier. * Encoding: ASCII * minLength: 2 characters * maxLength: 2 characters |  [optional]
**airlineAirlineCode** | **kotlin.String** | The [IATA](https://www.iata.org/services/pages/codes.aspx) 3-digit accounting code (PAX) that identifies the carrier. * Format: IATA 3-digit accounting code (PAX) * Example: KLM &#x3D; 074 * minLength: 3 characters * maxLength: 3 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineAirlineDesignatorCode** | **kotlin.String** | The [IATA](https://www.iata.org/services/pages/codes.aspx) 2-letter accounting code (PAX) that identifies the carrier. * Encoding: ASCII * Example: KLM &#x3D; KL * minLength: 2 characters * maxLength: 2 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineBoardingFee** | **kotlin.String** | The amount charged for boarding the plane, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Encoding: Numeric * minLength: 1 character * maxLength: 18 characters |  [optional]
**airlineComputerizedReservationSystem** | **kotlin.String** | The [CRS](https://en.wikipedia.org/wiki/Computer_reservation_system) used to make the reservation and purchase the ticket. * Encoding: ASCII * minLength: 4 characters * maxLength: 4 characters |  [optional]
**airlineCustomerReferenceNumber** | **kotlin.String** | The alphanumeric customer reference number. * Encoding: ASCII * maxLength: 20 characters * If you send more than 20 characters, the customer reference number is truncated * Must not be all spaces |  [optional]
**airlineDocumentType** | **kotlin.String** | A code that identifies the type of item bought. The description of the code can appear on credit card statements. * Encoding: ASCII * Example: Passenger ticket &#x3D; 01 * minLength: 2 characters * maxLength: 2 characters |  [optional]
**airlineFlightDate** | **kotlin.String** | The flight departure date. Local time &#x60;(HH:mm)&#x60; is optional. * Date format: &#x60;yyyy-MM-dd&#x60; * Date and time format: &#x60;yyyy-MM-dd HH:mm&#x60; * minLength: 10 characters * maxLength: 16 characters |  [optional]
**airlineLegCarrierCode** | **kotlin.String** | The [IATA](https://www.iata.org/services/pages/codes.aspx) 2-letter accounting code (PAX) that identifies the carrier. This field is required if the airline data includes leg details. * Example: KLM &#x3D; KL * minLength: 2 characters * maxLength: 2 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineLegClassOfTravel** | **kotlin.String** | A one-letter travel class identifier.  The following are common:  * F: first class * J: business class * Y: economy class * W: premium economy  * Encoding: ASCII * minLength: 1 character * maxLength: 1 character * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineLegDateOfTravel** | **kotlin.String** |   Date and time of travel in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format &#x60;yyyy-MM-dd HH:mm&#x60;. * Encoding: ASCII * minLength: 16 characters * maxLength: 16 characters |  [optional]
**airlineLegDepartAirport** | **kotlin.String** | The [IATA](https://www.iata.org/services/pages/codes.aspx) three-letter airport code of the departure airport. This field is required if the airline data includes leg details.  * Encoding: ASCII * Example: Amsterdam &#x3D; AMS * minLength: 3 characters * maxLength: 3 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineLegDepartTax** | **kotlin.String** | The amount of [departure tax](https://en.wikipedia.org/wiki/Departure_tax) charged, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Encoding: Numeric * minLength: 1 * maxLength: 12 *Must not be all zeros. |  [optional]
**airlineLegDestinationCode** | **kotlin.String** | The [IATA](https://www.iata.org/services/pages/codes.aspx) 3-letter airport code of the destination airport. This field is required if the airline data includes leg details. * Example: Amsterdam &#x3D; AMS * Encoding: ASCII * minLength: 3 characters * maxLength: 3 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineLegFareBaseCode** | **kotlin.String** | The [fare basis code](https://en.wikipedia.org/wiki/Fare_basis_code), alphanumeric. * minLength: 1 character * maxLength: 6 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineLegFlightNumber** | **kotlin.String** | The flight identifier. * minLength: 1 character * maxLength: 5 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineLegStopOverCode** | **kotlin.String** | A one-letter code that indicates whether the passenger is entitled to make a stopover. Can be a space, O if the passenger is entitled to make a stopover, or X if they are not. * Encoding: ASCII * minLength: 1 character * maxLength: 1 character |  [optional]
**airlinePassengerDateOfBirth** | **kotlin.String** | The passenger&#39;s date of birth.  Date format: &#x60;yyyy-MM-dd&#x60; * minLength: 10 * maxLength: 10 |  [optional]
**airlinePassengerFirstName** | **kotlin.String** | The passenger&#39;s first name. &gt; This field is required if the airline data includes passenger details or leg details. * Encoding: ASCII |  [optional]
**airlinePassengerLastName** | **kotlin.String** | The passenger&#39;s last name. &gt; This field is required if the airline data includes passenger details or leg details. * Encoding: ASCII |  [optional]
**airlinePassengerTelephoneNumber** | **kotlin.String** | The passenger&#39;s telephone number, including country code. This is an alphanumeric field that can include the &#39;+&#39; and &#39;-&#39; signs. * Encoding: ASCII * minLength: 3 characters * maxLength: 30 characters |  [optional]
**airlinePassengerTravellerType** | **kotlin.String** | The IATA passenger type code (PTC). * Encoding: ASCII * minLength: 3 characters * maxLength: 6 characters |  [optional]
**airlineTicketIssueAddress** | **kotlin.String** | The address of the organization that issued the ticket. * minLength: 0 characters * maxLength: 16 characters |  [optional]
**airlineTicketNumber** | **kotlin.String** | The ticket&#39;s unique identifier. * minLength: 1 character * maxLength: 15 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineTravelAgencyCode** | **kotlin.String** | The unique identifier from IATA or ARC for the travel agency that issues the ticket. * Encoding: ASCII * minLength: 1 character * maxLength: 8 characters * Must not be all spaces *Must not be all zeros. |  [optional]
**airlineTravelAgencyName** | **kotlin.String** | The name of the travel agency.  * Encoding: ASCII * minLength: 1 character * maxLength: 25 characters * Must not be all spaces *Must not be all zeros. |  [optional]


