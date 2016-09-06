# Part 2 - Espresso

In this part of the code lab we create Android test using Espresso library. You can use Espresso to test one application and you need to have app source codes to be able to write the test.

Espresso provides you with a couple of API classes which you can use for writing your tests.

Some of available classes:

* `ActivityTestRule`
* `ViewMatchers`
* `ViewActions`
* `ViewAssertions`

## ActivityTestRule

[ActivityTestRule API documentation](https://developer.android.com/reference/android/support/test/rule/ActivityTestRule.html)

> This rule provides functional testing of a single activity. The activity under test will be launched before each test annotated with Test and before methods annotated with Before. It will be terminated after the test is completed and methods annotated with After are finished. During the duration of the test you will be able to manipulate your Activity directly.

## ViewMatchers

[ViewMatchers API documentation](https://developer.android.com/reference/android/support/test/espresso/matcher/ViewMatchers.html)

> A collection of hamcrest matchers that match Views.

Some methods that might be handy to you:

* `assertThat()`
* `hasContentDescription()`
* `isChecked()`, `isClickable()`, `isSelected()` and more
* `withClassName()`, `withContentDescription()`, `withId()`, `withText()` and more
* and more

## ViewActions

[ViewActions API documentation](https://developer.android.com/reference/android/support/test/espresso/action/ViewActions.html)

> A collection of common ViewActions.
  
Some methods that might be handy to you:

* `click()`, `doubleClick()`, `longClick()` and more
* `clearText()`, `replaceText()`, `typeText()`
* `pressBack()`, `pressKey()`, `pressMenuKey()` and more
* `scrollTo()`, `swipeDown()` and more
* and more

## ViewAssertions
 
[ViewAssertions API documentation](https://developer.android.com/reference/android/support/test/espresso/assertion/ViewAssertions.html)
 
> A collection of common ViewAssertions.

Usually we use the `matches()` method if the view is matched by the view matcher.