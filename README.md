# Bug Scenario
This simple class should illustrate how to use TDD to treat application bugs.
The TimeKeeper class has no restrictions. There are a few scenarios which are not allowed:
1. Input for hour is bigger than 24.
2. Input for minutes and seconds bigger than 60.
3. Input for hour, minutes and seconds are less than 0.

In order to fix these we must first write unit tests for each of them.
