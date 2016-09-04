# Part 1 - UI Automator

In this part of the code lab we create Android test using UI Automator library.

UI Automator provides you with a couple of API classes which you can use for writing your tests.

Available classes:

* `UiDevice`
* `UiObject`
* `UiSelector`
* `UiCollection`
* `UiScrollable`

## UiDevice

[UiDevice API documentation](https://developer.android.com/reference/android/support/test/uiautomator/UiDevice.html)

> `UiDevice` provides access to state information about the device. You can also use this class to simulate user actions on the device, such as pressing the d-pad or pressing the Home and Menu buttons.

You use `UiDevice` class during writing your tests very often.

Some methods that might be handy to you:

* `click()`, `drag()` and more gestures
* `findObject()` and `findObjects()`
* `hasObject()`
* `performActionAndWait()`
* `pressBack()`, `pressEnter()`, `pressMenu()` and more actions
* `wait()`
* and more...

## UiObject

[UiObject API documentation](https://developer.android.com/reference/android/support/test/uiautomator/UiObject.html)

> A `UiObject` is a representation of a view. It is not in any way directly bound to a view as an object reference. A UiObject contains information to help it locate a matching view at runtime based on the UiSelector properties specified in its constructor. Once you create an instance of a UiObject, it can be reused for different views that match the selector criteria.

You use `UiObject` class for working with views. When you search for an object through the `findObject()` method, the `UiObject` instance is returned.

We call methods to perform actions on the view and we are also able to retrieve couple of properties.

Some methods that might be handy to you:

* `click()`, `swipeDown()` and more gestures
* `clickAndWaitForNewWindow()`
* `exists()`
* `getChild()`
* `getChildCount()`
* `getClassName()`
* `getContentDescription()`
* `getText()`
* `isChecked()`, `isClickable()`, `isEnabled()`, `isScrollable()` and more
* `setText()`
* and more...

## UiSelector

[UiSelector API documentation](https://developer.android.com/reference/android/support/test/uiautomator/UiSelector.html)

> Specifies the elements in the layout hierarchy for tests to target, filtered by properties such as text value, content-description, class name, and state information. You can also target an element by its location in a layout hierarchy.
  
You use `UiSelector` to search for `UiObject`s on the display. You create a new UiSelector and specify properties of your searched object. Always the first matching element in the layout hierarchy is returned. If no matching UI element is found, a `UiAutomatorObjectNotFoundException` is thrown.

Selector might look like this:

```java
UiObject OkButton = device.findObject(new UiSelector()
    .text("Ok"))
    .className("android.widget.Button"));
```

Some methods that might be handy to you:

* `className()`
* `clickable()`, `checkable()`, `enabled()` and more
* `description()`, `descriptionContains()` and more
* `resourceId()`
* `text()`, `textContains()` and more
* `childSelector()`
* and more...

## UiCollection

[UiCollection API documentation](https://developer.android.com/reference/android/support/test/uiautomator/UiCollection.html)

Use `UiCollection` if you want to simulate user interactions on a collection of views.

> Used to enumerate a container's UI elements for the purpose of counting, or targeting a sub elements by a child's text or description.

## UiScrollable

[UiScrollable API documentation](https://developer.android.com/reference/android/support/test/uiautomator/UiScrollable.html)

> `UiScrollable` is a `UiCollection` and provides support for searching for items in scrollable layout elements. This class can be used with horizontally or vertically scrollable controls.

Use `UiScrollable` when your view is hidden behind a scroll to scroll.

Example:

```java
UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
appViews.setAsHorizontalList();

UiObject app = appViews.getChildByText(new UiSelector()
    .className("android.widget.TextView"), "My super app");
```

Some methods that might be handy to you:

* `getChildByText()`, `getChildByDescription()` and more
* `scrollIntoView()`, `scrollToBeginning()` and more
* `setAsHorizontalList()`, `setAsVerticalList()`
* and more...

## UI Automator Viewer

What we can do and retrieve?

TODO image

## Code lab

### Step 1 - New test

We start with the folder `step_0_start`.

### Result