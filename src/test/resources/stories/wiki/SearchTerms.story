Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Verify page title
Given user opens Wiki start page
When user searches for a term '<term>'
Then page page title should be '<title>'
Examples:
|term|title|
|Test automation|Test automation - Wikipedia|
|Ukraine|Ukraine - Wikipedia|
