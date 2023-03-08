Feature: User borrow power calculator estimation

@borrow
Scenario Outline: user borrow estimate on current income and existing financial commitments

Given User is on Calculators and tools page
When user adds details application type as single and zero dependants
And user Added following income details
| 80000  | 10000 |
And user adds following existing financial commitments
| 500 | 0 | 100 | 0 |
And user adds following credit card limits <10000>
Then User calculates borrow estimate

@borrow
Scenario Outline: user borrow estimate on current income and existing financial commitments

Given User is on Calculators and tools page
When user adds details application type as single and zero dependants
And user adds following existing financial commitments
| 1 |
Then user encounters message of estimation