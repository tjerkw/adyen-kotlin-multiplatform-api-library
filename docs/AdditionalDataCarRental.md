
# AdditionalDataCarRental

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carRentalCheckOutDate** | **kotlin.String** | The pick-up date. * Date format: &#x60;yyyyMMdd&#x60; |  [optional]
**carRentalCustomerServiceTollFreeNumber** | **kotlin.String** | The customer service phone number of the car rental company. * Format: Alphanumeric * maxLength: 17 * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros. |  [optional]
**carRentalDaysRented** | **kotlin.String** | Number of days for which the car is being rented. * Format: Numeric * maxLength: 4 * Must not be all spaces |  [optional]
**carRentalFuelCharges** | **kotlin.String** | Any fuel charges associated with the rental, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Numeric * maxLength: 12 |  [optional]
**carRentalInsuranceCharges** | **kotlin.String** | Any insurance charges associated with the rental, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Numeric * maxLength: 12 * Must not be all spaces *Must not be all zeros. |  [optional]
**carRentalLocationCity** | **kotlin.String** | The city where the car is rented. * Format: Alphanumeric * maxLength: 18 * Must not start with a space or be all spaces *Must not be all zeros. |  [optional]
**carRentalLocationCountry** | **kotlin.String** | The country where the car is rented, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. * Format: Alphanumeric * maxLength: 2 |  [optional]
**carRentalLocationStateProvince** | **kotlin.String** | The state or province where the car is rented. * Format: Alphanumeric * maxLength: 2 * Must not start with a space or be all spaces *Must not be all zeros. |  [optional]
**carRentalNoShowIndicator** | **kotlin.String** | Indicates if the customer didn&#39;t pick up their rental car. * Y - Customer did not pick up their car * N - Not applicable |  [optional]
**carRentalOneWayDropOffCharges** | **kotlin.String** | The charge for not returning a car to the original rental location, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * maxLength: 12 |  [optional]
**carRentalRate** | **kotlin.String** | The daily rental rate, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Alphanumeric * maxLength: 12 |  [optional]
**carRentalRateIndicator** | **kotlin.String** | Specifies whether the given rate is applied daily or weekly. * D - Daily rate * W - Weekly rate |  [optional]
**carRentalRentalAgreementNumber** | **kotlin.String** | The rental agreement number for the car rental. * Format: Alphanumeric * maxLength: 9 * Must not start with a space or be all spaces *Must not be all zeros. |  [optional]
**carRentalRentalClassId** | **kotlin.String** | The classification of the rental car. * Format: Alphanumeric * maxLength: 4 * Must not start with a space or be all spaces *Must not be all zeros. |  [optional]
**carRentalRenterName** | **kotlin.String** | The name of the person renting the car. * Format: Alphanumeric * maxLength: 26 * If you send more than 26 characters, the name is truncated * Must not start with a space or be all spaces *Must not be all zeros. |  [optional]
**carRentalReturnCity** | **kotlin.String** | The city where the car must be returned. * Format: Alphanumeric * maxLength: 18 * Must not start with a space or be all spaces *Must not be all zeros. |  [optional]
**carRentalReturnCountry** | **kotlin.String** | The country where the car must be returned, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. * Format: Alphanumeric * maxLength: 2 |  [optional]
**carRentalReturnDate** | **kotlin.String** | The last date to return the car by. * Date format: &#x60;yyyyMMdd&#x60; * maxLength: 8 |  [optional]
**carRentalReturnLocationId** | **kotlin.String** | The agency code, phone number, or address abbreviation * Format: Alphanumeric * maxLength: 10 * Must not start with a space or be all spaces *Must not be all zeros. |  [optional]
**carRentalReturnStateProvince** | **kotlin.String** | The state or province where the car must be returned. * Format: Alphanumeric * maxLength: 3 * Must not start with a space or be all spaces *Must not be all zeros. |  [optional]
**carRentalTaxExemptIndicator** | **kotlin.String** | Indicates if the goods or services were tax-exempt, or if tax was not paid on them.  Values: * Y - Goods or services were tax exempt * N - Tax was not collected |  [optional]
**travelEntertainmentAuthDataDuration** | **kotlin.String** | Number of days the car is rented for. This should be included in the auth message. * Format: Numeric * maxLength: 4 |  [optional]
**travelEntertainmentAuthDataMarket** | **kotlin.String** | Indicates what market-specific dataset will be submitted or is being submitted. Value should be &#39;A&#39; for car rental. This should be included in the auth message. * Format: Alphanumeric * maxLength: 1 |  [optional]



