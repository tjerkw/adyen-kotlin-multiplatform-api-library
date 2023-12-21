
# OnboardingLinkInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locale** | **kotlin.String** | The language that will be used for the page, specified by a combination of two letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language and [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. See [possible values](https://docs.adyen.com/marketplaces-and-platforms/collect-verification-details/hosted#supported-languages).   If not specified in the request or if the language is not supported, the page uses the browser language. If the browser language is not supported, the page uses **en-US** by default. |  [optional]
**redirectUrl** | **kotlin.String** | The URL where the user is redirected after they complete hosted onboarding. |  [optional]
**settings** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Boolean&gt;** | Boolean key-value pairs indicating the settings for the hosted onboarding page. The keys are the settings.  Possible keys:  By default, these values are set to **true**. Set to **false** to not allow the action.  - **changeLegalEntityType**: The user can change their legal entity type.  - **editPrefilledCountry**: The user can change the country of their legal entity&#39;s address, for example the registered address of an organization.  By default, these values are set to **false**. Set to **true** to allow the action.  - **allowBankAccountFormatSelection**: The user can select the format for their payout account if applicable.  - **allowIntraRegionCrossBorderPayout**: The user can select a payout account in a different EU/EEA country than the country of their legal entity.  By default, these value are set to **false**. Set the following values to **true** to require the user to sign PCI questionnaires based on their sales channels. The user must sign PCI questionnaires for all relevant sales channels.  - **requirePciSignEcommerce**  - **requirePciSignPos**  - **requirePciSignEcomMoto**  - **requirePciSignPosMoto**   |  [optional]
**themeId** | **kotlin.String** | The unique identifier of the hosted onboarding theme. |  [optional]



