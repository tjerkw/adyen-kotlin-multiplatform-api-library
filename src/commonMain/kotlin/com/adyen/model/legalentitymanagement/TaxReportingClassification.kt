/**
 * Legal Entity Management API
 *
 * The Legal Entity Management API enables you to manage legal entities that contain information required for verification.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value. For example:  ``` curl -H \"X-API-Key: YOUR_API_KEY\" \\ -H \"Content-Type: application/json\" \\ ... ``` Alternatively, you can use the username and password of your API credential to connect to the API using basic authentication. For example:  ``` curl -U \"ws_123456@Scope.Company_YOUR_COMPANY_ACCOUNT\":\"YourWsPassword\" \\ -H \"Content-Type: application/json\" \\ ... ``` ## Versioning The Legal Entity Management API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://kyc-test.adyen.com/lem/v3/legalEntities ``` >If you are using hosted onboarding, [only use v2](https://docs.adyen.com/release-notes/platforms-and-financial-products#releaseNote=2023-05-01-legal-entity-management-api-3) for your API requests.  ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the API key or the username and password to send requests to `https://kyc-live.adyen.com/lem/v3`.  
 *
 * The version of the OpenAPI document: 3
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

package com.adyen.model.legalentitymanagement


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param businessType The organization's business type.  Possible values: **other**, **listedPublicCompany**, **subsidiaryOfListedPublicCompany**, **governmentalOrganization**, **internationalOrganization**, **financialInstitution**.
 * @param financialInstitutionNumber The Global Intermediary Identification Number (GIIN) required for FATCA. Only required if the organization is a US financial institution and the `businessType` is **financialInstitution**.
 * @param mainSourceOfIncome The organization's main source of income.  Possible values: **businessOperation**, **realEstateSales**, **investmentInterestOrRoyalty**, **propertyRental**, **other**.
 * @param type The tax reporting classification type.  Possible values: **nonFinancialNonReportable**, **financialNonReportable**, **nonFinancialActive**, **nonFinancialPassive**.
 */
@Serializable
data class TaxReportingClassification (

    /* The organization's business type.  Possible values: **other**, **listedPublicCompany**, **subsidiaryOfListedPublicCompany**, **governmentalOrganization**, **internationalOrganization**, **financialInstitution**. */
    @SerialName(value = "businessType") val businessType: TaxReportingClassification.BusinessType? = null,

    /* The Global Intermediary Identification Number (GIIN) required for FATCA. Only required if the organization is a US financial institution and the `businessType` is **financialInstitution**. */
    @SerialName(value = "financialInstitutionNumber") val financialInstitutionNumber: kotlin.String? = null,

    /* The organization's main source of income.  Possible values: **businessOperation**, **realEstateSales**, **investmentInterestOrRoyalty**, **propertyRental**, **other**. */
    @SerialName(value = "mainSourceOfIncome") val mainSourceOfIncome: TaxReportingClassification.MainSourceOfIncome? = null,

    /* The tax reporting classification type.  Possible values: **nonFinancialNonReportable**, **financialNonReportable**, **nonFinancialActive**, **nonFinancialPassive**. */
    @SerialName(value = "type") val type: TaxReportingClassification.Type? = null

) {

    /**
     * The organization's business type.  Possible values: **other**, **listedPublicCompany**, **subsidiaryOfListedPublicCompany**, **governmentalOrganization**, **internationalOrganization**, **financialInstitution**.
     *
     * Values: Other,ListedPublicCompany,SubsidiaryOfListedPublicCompany,GovernmentalOrganization,InternationalOrganization,FinancialInstitutionPeriod
     */
    @Serializable
    enum class BusinessType(val value: kotlin.String) {
        @SerialName(value = "other") Other("other"),
        @SerialName(value = "listedPublicCompany") ListedPublicCompany("listedPublicCompany"),
        @SerialName(value = "subsidiaryOfListedPublicCompany") SubsidiaryOfListedPublicCompany("subsidiaryOfListedPublicCompany"),
        @SerialName(value = "governmentalOrganization") GovernmentalOrganization("governmentalOrganization"),
        @SerialName(value = "internationalOrganization") InternationalOrganization("internationalOrganization"),
        @SerialName(value = "financialInstitution.") FinancialInstitutionPeriod("financialInstitution.");
    }
    /**
     * The organization's main source of income.  Possible values: **businessOperation**, **realEstateSales**, **investmentInterestOrRoyalty**, **propertyRental**, **other**.
     *
     * Values: BusinessOperation,RealEstateSales,InvestmentInterestOrRoyalty,PropertyRental,Other
     */
    @Serializable
    enum class MainSourceOfIncome(val value: kotlin.String) {
        @SerialName(value = "businessOperation") BusinessOperation("businessOperation"),
        @SerialName(value = "realEstateSales") RealEstateSales("realEstateSales"),
        @SerialName(value = "investmentInterestOrRoyalty") InvestmentInterestOrRoyalty("investmentInterestOrRoyalty"),
        @SerialName(value = "propertyRental") PropertyRental("propertyRental"),
        @SerialName(value = "other") Other("other");
    }
    /**
     * The tax reporting classification type.  Possible values: **nonFinancialNonReportable**, **financialNonReportable**, **nonFinancialActive**, **nonFinancialPassive**.
     *
     * Values: NonFinancialNonReportable,FinancialNonReportable,NonFinancialActive,NonFinancialPassive
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "nonFinancialNonReportable") NonFinancialNonReportable("nonFinancialNonReportable"),
        @SerialName(value = "financialNonReportable") FinancialNonReportable("financialNonReportable"),
        @SerialName(value = "nonFinancialActive") NonFinancialActive("nonFinancialActive"),
        @SerialName(value = "nonFinancialPassive") NonFinancialPassive("nonFinancialPassive");
    }
}

