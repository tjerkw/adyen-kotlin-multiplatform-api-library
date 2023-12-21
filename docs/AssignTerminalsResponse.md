
# AssignTerminalsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Array that returns a list of the terminals, and for each terminal the result of assigning it to an account or store.  The results can be:    - &#x60;Done&#x60;: The terminal has been assigned.   - &#x60;AssignmentScheduled&#x60;: The terminal will be assigned asynschronously.   - &#x60;RemoveConfigScheduled&#x60;: The terminal was previously assigned and boarded. Wait for the terminal to synchronize with the Adyen platform. For more information, refer to [Reassigning boarded terminals](https://docs.adyen.com/point-of-sale/managing-terminals/assign-terminals#reassign-boarded-terminals).   - &#x60;Error&#x60;: There was an error when assigning the terminal.  | 



