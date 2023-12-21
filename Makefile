openapi-generator-version:=6.0.1
openapi-generator-url:=https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/$(openapi-generator-version)/openapi-generator-cli-$(openapi-generator-version).jar
openapi-generator-jar:=target/openapi-generator-cli.jar
openapi-generator-cli:=java -jar $(openapi-generator-jar)

artifactId=adyen-kotlin-client
generator:=kotlin
library:=multiplatform
modelGen:=acswebhooks balancecontrol balanceplatform binlookup checkout dataprotection legalentitymanagement management payment payout posterminalmanagement recurring transfers storedvalue configurationwebhooks reportwebhooks transferwebhooks managementwebhooks disputes transactionwebhooks
models:=src/commonMain/kotlin/com/adyen/model
services:=src/commonMain/kotlin/com/adyen/service
output:=target/out


# Generate models (for each service)
models: prework $(modelGen) postwork

prework: clean
	rm -f README.md
	cp README.top.md .README-tmp.md
	rm -fr $(models)
	rm -fr $(services)

postwork:
	# No clue why the template generates this file, its not needed
	rm -f src/commonMain/kotlin/com/adyen/model/management/com.adyen.client.infrastructure.OctetByteArray.kt
	mv .README-tmp.md README.md

balancecontrol: spec=BalanceControlService-v1
balancecontrol: smallServiceName=BalanceControlApi
binlookup: spec=BinLookupService-v54
binlookup: smallServiceName=BinLookupApi
checkout: spec=CheckoutService-v71
dataprotection: spec=DataProtectionService-v1
dataprotection: smallServiceName=DataProtectionApi
storedvalue: spec=StoredValueService-v46
storedvalue: smallServiceName=StoredValueApi
posterminalmanagement: spec=TfmAPIService-v1
posterminalmanagement: smallServiceName=PosTerminalManagementApi
payment: spec=PaymentService-v68
payment: smallServiceName=PaymentApi
recurring: spec=RecurringService-v68
recurring: smallServiceName=RecurringApi
payout: spec=PayoutService-v68
management: spec=ManagementService-v3
balanceplatform: spec=BalancePlatformService-v2
transfers: spec=TransferService-v4
legalentitymanagement: spec=LegalEntityService-v3
# Classic Platforms
marketpayaccount: spec=AccountService-v6
marketpayaccount: smallServiceName=ClassicPlatformAccountApi
marketpayfund: spec=FundService-v6
marketpayfund: smallServiceName=ClassicPlatformFundApi
marketpayconfiguration: spec=NotificationConfigurationService-v6
marketpayconfiguration: smallServiceName=ClassicPlatformConfigurationApi
marketpayhop: spec=HopService-v6
marketpayhop: smallServiceName=ClassicPlatformHopApi
marketpaywebhooks: spec=MarketPayNotificationService-v6
# Balance Webhooks
acswebhooks: spec=BalancePlatformAcsNotification-v1
configurationwebhooks: spec=BalancePlatformConfigurationNotification-v1
reportwebhooks: spec=BalancePlatformReportNotification-v1
transferwebhooks: spec=BalancePlatformTransferNotification-v4
transactionwebhooks: spec=BalancePlatformTransactionNotification-v4
# Management Webhooks
managementwebhooks: spec=ManagementNotificationService-v3
# Disputes
disputes: spec=DisputeService-v30
disputes: smallServiceName=DisputesApi

$(modelGen): target/spec $(openapi-generator-jar)
	rm -rf $(models)/$@ $(output)
	rm -rf $(output)/docs
	$(openapi-generator-cli) generate \
		-i target/spec/json/$(spec).json \
		-g $(generator) \
		-t templates \
		-o $(output) \
		--reserved-words-mappings configuration=configuration \
		--ignore-file-override ./.openapi-generator-ignore \
		--skip-validate-spec \
		--model-package $(subst /,.,com.adyen.model.$@) \
		--package-name com.adyen.client \
		--library $(library) \
		--artifact-id $(artifactId) \
		--global-property modelDocs=true \
		--global-property modelTests=false \
		--inline-schema-name-mappings PaymentRequest_paymentMethod=CheckoutPaymentMethod \
		--inline-schema-name-mappings DonationPaymentRequest_paymentMethod=DonationPaymentMethod \
		--additional-properties=dateLibrary=kotlinx-datetime \
		--additional-properties=enumPropertyNaming=PascalCase \
		--additional-properties=groupId=com.adyen.kotlin \
		--additional-properties=resourceClass=$(resourceClass)Resource
	mkdir -p $(models)/$@
	mv $(output)/$(models)/$@ $(models)
	mv $(output)/docs/* ./docs

# Full service + models automation
bigServices:=balanceplatform checkout payout management legalentitymanagement transfers balancecontrol binlookup dataprotection storedvalue posterminalmanagement recurring payment disputes

services: $(bigServices)

$(bigServices): target/spec $(openapi-generator-jar)
	rm -rf $(models)/$@ $(output)
	rm -rf $(services)/$@ $(output)
	rm -rf $(output)/docs
	$(openapi-generator-cli) generate \
		-i target/spec/json/$(spec).json \
		-g $(generator) \
		-t templates \
		-o $(output) \
		--reserved-words-mappings configuration=configuration \
		--ignore-file-override ./.openapi-generator-ignore \
		--skip-validate-spec \
		--model-package $(subst /,.,com.adyen.model.$@) \
		--package-name com.adyen.client \
		--library $(library) \
		--artifact-id $(artifactId) \
		--api-package com.adyen.service.$@ \
		--global-property modelDocs=true \
		--global-property modelTests=false \
		--inline-schema-name-mappings PaymentRequest_paymentMethod=CheckoutPaymentMethod \
		--inline-schema-name-mappings DonationPaymentRequest_paymentMethod=DonationPaymentMethod \
		--additional-properties=dateLibrary=kotlinx-datetime \
		--additional-properties=enumPropertyNaming=PascalCase \
		--additional-properties=groupId=com.adyen.kotlin \

	echo BIGSERVICES $@
	mkdir -p $(models)/$@
	mkdir -p $(services)/$@
	mv $(output)/$(models)/$@ $(models)
	mv $(output)/$(services)/$@ $(services)
	mv $(output)/docs/* ./docs
	cat $(output)/README.md >> ./.README-tmp.md

# Checkout spec (and patch version)
target/spec:
	git clone https://github.com/Adyen/adyen-openapi.git target/spec
	perl -i -pe's/"openapi" : "3.[0-9].[0-9]"/"openapi" : "3.0.0"/' target/spec/json/*.json


# Extract templates (copy them for modifications)
templates: $(openapi-generator-jar)
	$(openapi-generator-cli) author template -g $(generator) --library $(library) -o target/templates


# Download the generator
$(openapi-generator-jar):
	wget --quiet -o /dev/null $(openapi-generator-url) -O $(openapi-generator-jar)


# Discard generated artifacts and changed models
clean:
	rm -rf $(output)
	git checkout $(models)
	git clean -f -d $(models)
	git checkout $(services)
	git clean -f -d $(services)


.PHONY: templates models $(services)
