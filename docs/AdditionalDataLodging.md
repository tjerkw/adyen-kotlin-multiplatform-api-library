
# AdditionalDataLodging

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lodgingCheckInDate** | **kotlin.String** | The arrival date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**. |  [optional]
**lodgingCheckOutDate** | **kotlin.String** | The departure date. * Date format: **yyyyMmDd**. For example, for 2023 April 22, **20230422**. |  [optional]
**lodgingCustomerServiceTollFreeNumber** | **kotlin.String** | The toll-free phone number for the lodging. * Format: numeric * Max length: 17 characters. * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros. |  [optional]
**lodgingFireSafetyActIndicator** | **kotlin.String** | Identifies that the facility complies with the Hotel and Motel Fire Safety Act of 1990. Must be &#39;Y&#39; or &#39;N&#39;. * Format: alphabetic * Max length: 1 character |  [optional]
**lodgingFolioCashAdvances** | **kotlin.String** | The folio cash advances, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters |  [optional]
**lodgingFolioNumber** | **kotlin.String** | The card acceptor’s internal invoice or billing ID reference number. * Max length: 25 characters. * Must not start with a space *Must not be all zeros. |  [optional]
**lodgingFoodBeverageCharges** | **kotlin.String** | Any charges for food and beverages associated with the booking, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters |  [optional]
**lodgingNoShowIndicator** | **kotlin.String** | Indicates if the customer didn&#39;t check in for their booking.  Possible values:  * **Y**: the customer didn&#39;t check in  * **N**: the customer checked in |  [optional]
**lodgingPrepaidExpenses** | **kotlin.String** | The prepaid expenses for the booking. * Format: numeric * Max length: 12 characters |  [optional]
**lodgingPropertyPhoneNumber** | **kotlin.String** | The lodging property location&#39;s phone number. * Format: numeric. * Min length: 10 characters * Max length: 17 characters * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros. |  [optional]
**lodgingRoom1NumberOfNights** | **kotlin.String** | The total number of nights the room is booked for. * Format: numeric * Must be a number between 0 and 99 * Max length: 4 characters |  [optional]
**lodgingRoom1Rate** | **kotlin.String** | The rate for the room, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number |  [optional]
**lodgingTotalRoomTax** | **kotlin.String** | The total room tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number |  [optional]
**lodgingTotalTax** | **kotlin.String** | The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: numeric * Max length: 12 characters * Must not be a negative number |  [optional]
**travelEntertainmentAuthDataDuration** | **kotlin.String** | The number of nights. This should be included in the auth message. * Format: numeric * Max length: 4 characters |  [optional]
**travelEntertainmentAuthDataMarket** | **kotlin.String** | Indicates what market-specific dataset will be submitted. Must be &#39;H&#39; for Hotel. This should be included in the auth message.  * Format: alphanumeric * Max length: 1 character |  [optional]



