
# GetTerminalDetailsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyAccount** | **kotlin.String** | The company account that the terminal is associated with. If this is the only account level shown in the response, the terminal is assigned to the inventory of the company account. | 
**terminal** | **kotlin.String** | The unique terminal ID. | 
**bluetoothIp** | **kotlin.String** | The Bluetooth IP address of the terminal. |  [optional]
**bluetoothMac** | **kotlin.String** | The Bluetooth MAC address of the terminal. |  [optional]
**country** | **kotlin.String** | The country where the terminal is used. |  [optional]
**deviceModel** | **kotlin.String** | The model name of the terminal. |  [optional]
**dhcpEnabled** | **kotlin.Boolean** | Indicates whether assigning IP addresses through a DHCP server is enabled on the terminal. |  [optional]
**displayLabel** | **kotlin.String** | The label shown on the status bar of the display. This label (if any) is specified in your Customer Area. |  [optional]
**ethernetIp** | **kotlin.String** | The terminal&#39;s IP address in your Ethernet network. |  [optional]
**ethernetMac** | **kotlin.String** | The terminal&#39;s MAC address in your Ethernet network. |  [optional]
**firmwareVersion** | **kotlin.String** | The software release currently in use on the terminal. |  [optional]
**iccid** | **kotlin.String** | The integrated circuit card identifier (ICCID) of the SIM card in the terminal. |  [optional]
**lastActivityDateTime** | **kotlin.String** | Date and time of the last activity on the terminal. Not included when the last activity was more than 14 days ago. |  [optional]
**lastTransactionDateTime** | **kotlin.String** | Date and time of the last transaction on the terminal. Not included when the last transaction was more than 14 days ago. |  [optional]
**linkNegotiation** | **kotlin.String** | The Ethernet link negotiation that the terminal uses:   - &#x60;auto&#x60;: Auto-negotiation  - &#x60;100full&#x60;: 100 Mbps full duplex |  [optional]
**merchantAccount** | **kotlin.String** | The merchant account that the terminal is associated with. If the response doesn&#39;t contain a &#x60;store&#x60; the terminal is assigned to this merchant account. |  [optional]
**merchantInventory** | **kotlin.Boolean** | Boolean that indicates if the terminal is assigned to the merchant inventory. This is returned when the terminal is assigned to a merchant account.  - If **true**, this indicates that the terminal is in the merchant inventory. This also means that the terminal cannot be boarded.  - If **false**, this indicates that the terminal is assigned to the merchant account as an in-store terminal. This means that the terminal is ready to be boarded, or is already boarded. |  [optional]
**permanentTerminalId** | **kotlin.String** | The permanent terminal ID. |  [optional]
**serialNumber** | **kotlin.String** | The serial number of the terminal. |  [optional]
**simStatus** | **kotlin.String** | On a terminal that supports 3G or 4G connectivity, indicates the status of the SIM card in the terminal: ACTIVE or INVENTORY. |  [optional]
**store** | **kotlin.String** | The store code of the store that the terminal is assigned to. |  [optional]
**storeDetails** | [**Store**](Store.md) |  |  [optional]
**terminalStatus** | [**inline**](#TerminalStatus) | The status of the terminal:   - &#x60;OnlineToday&#x60;, &#x60;OnlineLast1Day&#x60;, &#x60;OnlineLast2Days&#x60; etcetera to &#x60;OnlineLast7Days&#x60;: Indicates when in the past week the terminal was last online.   - &#x60;SwitchedOff&#x60;: Indicates it was more than a week ago that the terminal was last online.   - &#x60;ReAssignToInventoryPending&#x60;, &#x60;ReAssignToStorePending&#x60;, &#x60;ReAssignToMerchantInventoryPending&#x60;: Indicates the terminal is scheduled to be reassigned. |  [optional]
**wifiIp** | **kotlin.String** | The terminal&#39;s IP address in your Wi-Fi network. |  [optional]
**wifiMac** | **kotlin.String** | The terminal&#39;s MAC address in your Wi-Fi network. |  [optional]


<a name="TerminalStatus"></a>
## Enum: terminalStatus
Name | Value
---- | -----
terminalStatus | OnlineLast1Day, OnlineLast2Days, OnlineLast3Days, OnlineLast4Days, OnlineLast5Days, OnlineLast6Days, OnlineLast7Days, OnlineToday, ReAssignToInventoryPending, ReAssignToMerchantInventoryPending, ReAssignToStorePending, SwitchedOff



