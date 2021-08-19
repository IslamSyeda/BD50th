Feature: Home Page

@TD
Scenario: Verify search result display

Given Open Application "<URL>"
Then Enter samsung tv in search field
Then Click search
Then Verify search result display

