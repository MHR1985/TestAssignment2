# Assignment 2
## Reflections
### Computer mouse
* Test each button and verify correct input returned.
* Test multiple buttons pressed at the same time and verify correct input.
* Test scroll movement.
* Test scroll speed.
### Catastrophic failure
Nuclear reactor control system reads wrong temperature in reactor as it is missing a conversion from Celcius to Kelvin, causing it to believe that the reactor is too hot. Several tests verifying that the temperature is converted correctly would have prevented this. 
## Two katas
See code.
## Investigation of tools
### JUNIT 5
* @Tag
  - With the @tag tag, it is possible to group quests, so only those of a specific tag will be run.
* @Disabled
  - The test will not be run
* @RepeatedTest
  - Run the test a specified amount of times
* @BeforeEach, @AfterEach
  - BeforeEach can be used to make general setup of each test before they are run individually.
  - AfterEach will be run after each test and could be used for cleanup/close() and so on.
* @BeforeAll, @AfterAll
  - BeforeAll is run before any tests are run.
  -  AfterAll is run after all tests have run.  
* @DisplayName
  - What the test will be called, used instead of method name.
* @Nested
  - Mark a nested class, so that it's tests will be run.
* assumeFalse, assumeTrue
  - assummeFalse disables the test if the condition of the test evaluates as true.
  - assumeTrue disables the if the condition of the test evaluates as false.
### Mocking Frameworks
#### Mockito vs. EasyMock:
* What are their similarities:
  - Open source
  - Support mocks
  - Can be used with JUunit
  - Both use annotations to define mock objects.

* What are their differences:
  - Different licences (Mockito: MIT, EasyMock: Apache)
  - Mockito support spies as well
  - EasyMock cannot mock final and private methods.
  - Easymock have to replay in every mock.

* Which one would you prefer, if any, and why:
  - I think I prefer mockito, as it seems it can do more and is easier to use. Though reading through material online, there is a third option: JMockit, but that is outside the scope of this comparison.
