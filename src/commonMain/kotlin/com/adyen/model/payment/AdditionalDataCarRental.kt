/**
 * Adyen Payment API
 *
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.adyen.model.payment


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param carRentalCheckOutDate The pick-up date. * Date format: `yyyyMMdd`
 * @param carRentalCustomerServiceTollFreeNumber The customer service phone number of the car rental company. * Format: Alphanumeric * maxLength: 17 * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros.
 * @param carRentalDaysRented Number of days for which the car is being rented. * Format: Numeric * maxLength: 4 * Must not be all spaces
 * @param carRentalFuelCharges Any fuel charges associated with the rental, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Numeric * maxLength: 12
 * @param carRentalInsuranceCharges Any insurance charges associated with the rental, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Numeric * maxLength: 12 * Must not be all spaces *Must not be all zeros.
 * @param carRentalLocationCity The city where the car is rented. * Format: Alphanumeric * maxLength: 18 * Must not start with a space or be all spaces *Must not be all zeros.
 * @param carRentalLocationCountry The country where the car is rented, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. * Format: Alphanumeric * maxLength: 2
 * @param carRentalLocationStateProvince The state or province where the car is rented. * Format: Alphanumeric * maxLength: 2 * Must not start with a space or be all spaces *Must not be all zeros.
 * @param carRentalNoShowIndicator Indicates if the customer didn't pick up their rental car. * Y - Customer did not pick up their car * N - Not applicable
 * @param carRentalOneWayDropOffCharges The charge for not returning a car to the original rental location, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * maxLength: 12
 * @param carRentalRate The daily rental rate, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Alphanumeric * maxLength: 12
 * @param carRentalRateIndicator Specifies whether the given rate is applied daily or weekly. * D - Daily rate * W - Weekly rate
 * @param carRentalRentalAgreementNumber The rental agreement number for the car rental. * Format: Alphanumeric * maxLength: 9 * Must not start with a space or be all spaces *Must not be all zeros.
 * @param carRentalRentalClassId The classification of the rental car. * Format: Alphanumeric * maxLength: 4 * Must not start with a space or be all spaces *Must not be all zeros.
 * @param carRentalRenterName The name of the person renting the car. * Format: Alphanumeric * maxLength: 26 * If you send more than 26 characters, the name is truncated * Must not start with a space or be all spaces *Must not be all zeros.
 * @param carRentalReturnCity The city where the car must be returned. * Format: Alphanumeric * maxLength: 18 * Must not start with a space or be all spaces *Must not be all zeros.
 * @param carRentalReturnCountry The country where the car must be returned, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. * Format: Alphanumeric * maxLength: 2
 * @param carRentalReturnDate The last date to return the car by. * Date format: `yyyyMMdd` * maxLength: 8
 * @param carRentalReturnLocationId The agency code, phone number, or address abbreviation * Format: Alphanumeric * maxLength: 10 * Must not start with a space or be all spaces *Must not be all zeros.
 * @param carRentalReturnStateProvince The state or province where the car must be returned. * Format: Alphanumeric * maxLength: 3 * Must not start with a space or be all spaces *Must not be all zeros.
 * @param carRentalTaxExemptIndicator Indicates if the goods or services were tax-exempt, or if tax was not paid on them.  Values: * Y - Goods or services were tax exempt * N - Tax was not collected
 * @param travelEntertainmentAuthDataDuration Number of days the car is rented for. This should be included in the auth message. * Format: Numeric * maxLength: 4
 * @param travelEntertainmentAuthDataMarket Indicates what market-specific dataset will be submitted or is being submitted. Value should be 'A' for car rental. This should be included in the auth message. * Format: Alphanumeric * maxLength: 1
 */
@Serializable
data class AdditionalDataCarRental (

    /* The pick-up date. * Date format: `yyyyMMdd` */
    @SerialName(value = "carRental.checkOutDate") val carRentalCheckOutDate: kotlin.String? = null,

    /* The customer service phone number of the car rental company. * Format: Alphanumeric * maxLength: 17 * For US and CA numbers must be 10 characters in length * Must not start with a space * Must not contain any special characters such as + or - *Must not be all zeros. */
    @SerialName(value = "carRental.customerServiceTollFreeNumber") val carRentalCustomerServiceTollFreeNumber: kotlin.String? = null,

    /* Number of days for which the car is being rented. * Format: Numeric * maxLength: 4 * Must not be all spaces */
    @SerialName(value = "carRental.daysRented") val carRentalDaysRented: kotlin.String? = null,

    /* Any fuel charges associated with the rental, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Numeric * maxLength: 12 */
    @SerialName(value = "carRental.fuelCharges") val carRentalFuelCharges: kotlin.String? = null,

    /* Any insurance charges associated with the rental, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Numeric * maxLength: 12 * Must not be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.insuranceCharges") val carRentalInsuranceCharges: kotlin.String? = null,

    /* The city where the car is rented. * Format: Alphanumeric * maxLength: 18 * Must not start with a space or be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.locationCity") val carRentalLocationCity: kotlin.String? = null,

    /* The country where the car is rented, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. * Format: Alphanumeric * maxLength: 2 */
    @SerialName(value = "carRental.locationCountry") val carRentalLocationCountry: kotlin.String? = null,

    /* The state or province where the car is rented. * Format: Alphanumeric * maxLength: 2 * Must not start with a space or be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.locationStateProvince") val carRentalLocationStateProvince: kotlin.String? = null,

    /* Indicates if the customer didn't pick up their rental car. * Y - Customer did not pick up their car * N - Not applicable */
    @SerialName(value = "carRental.noShowIndicator") val carRentalNoShowIndicator: kotlin.String? = null,

    /* The charge for not returning a car to the original rental location, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * maxLength: 12 */
    @SerialName(value = "carRental.oneWayDropOffCharges") val carRentalOneWayDropOffCharges: kotlin.String? = null,

    /* The daily rental rate, in [minor units](https://docs.adyen.com/development-resources/currency-codes). * Format: Alphanumeric * maxLength: 12 */
    @SerialName(value = "carRental.rate") val carRentalRate: kotlin.String? = null,

    /* Specifies whether the given rate is applied daily or weekly. * D - Daily rate * W - Weekly rate */
    @SerialName(value = "carRental.rateIndicator") val carRentalRateIndicator: kotlin.String? = null,

    /* The rental agreement number for the car rental. * Format: Alphanumeric * maxLength: 9 * Must not start with a space or be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.rentalAgreementNumber") val carRentalRentalAgreementNumber: kotlin.String? = null,

    /* The classification of the rental car. * Format: Alphanumeric * maxLength: 4 * Must not start with a space or be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.rentalClassId") val carRentalRentalClassId: kotlin.String? = null,

    /* The name of the person renting the car. * Format: Alphanumeric * maxLength: 26 * If you send more than 26 characters, the name is truncated * Must not start with a space or be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.renterName") val carRentalRenterName: kotlin.String? = null,

    /* The city where the car must be returned. * Format: Alphanumeric * maxLength: 18 * Must not start with a space or be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.returnCity") val carRentalReturnCity: kotlin.String? = null,

    /* The country where the car must be returned, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. * Format: Alphanumeric * maxLength: 2 */
    @SerialName(value = "carRental.returnCountry") val carRentalReturnCountry: kotlin.String? = null,

    /* The last date to return the car by. * Date format: `yyyyMMdd` * maxLength: 8 */
    @SerialName(value = "carRental.returnDate") val carRentalReturnDate: kotlin.String? = null,

    /* The agency code, phone number, or address abbreviation * Format: Alphanumeric * maxLength: 10 * Must not start with a space or be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.returnLocationId") val carRentalReturnLocationId: kotlin.String? = null,

    /* The state or province where the car must be returned. * Format: Alphanumeric * maxLength: 3 * Must not start with a space or be all spaces *Must not be all zeros. */
    @SerialName(value = "carRental.returnStateProvince") val carRentalReturnStateProvince: kotlin.String? = null,

    /* Indicates if the goods or services were tax-exempt, or if tax was not paid on them.  Values: * Y - Goods or services were tax exempt * N - Tax was not collected */
    @SerialName(value = "carRental.taxExemptIndicator") val carRentalTaxExemptIndicator: kotlin.String? = null,

    /* Number of days the car is rented for. This should be included in the auth message. * Format: Numeric * maxLength: 4 */
    @SerialName(value = "travelEntertainmentAuthData.duration") val travelEntertainmentAuthDataDuration: kotlin.String? = null,

    /* Indicates what market-specific dataset will be submitted or is being submitted. Value should be 'A' for car rental. This should be included in the auth message. * Format: Alphanumeric * maxLength: 1 */
    @SerialName(value = "travelEntertainmentAuthData.market") val travelEntertainmentAuthDataMarket: kotlin.String? = null

)

