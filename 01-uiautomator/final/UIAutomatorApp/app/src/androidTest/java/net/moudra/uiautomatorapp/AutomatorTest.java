package net.moudra.uiautomatorapp;

import android.os.SystemClock;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class AutomatorTest {
    private UiDevice uiDevice;

    @Before
    public void beforeTest() {
        uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        uiDevice.pressHome();
    }

    @After
    public void afterTest() {
        uiDevice.pressHome();
    }

    @Test
    public void testCalculator() throws Exception {
        // Home screen apps button
        UiObject appButton = uiDevice.findObject(new UiSelector().descriptionContains("Apps"));
        assertTrue(appButton.exists());

        appButton.clickAndWaitForNewWindow();

        // Scrollable view with apps
        UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
        assertTrue(appViews.exists());

        appViews.setAsHorizontalList();

        // Find calculator application
        UiObject calculatorApp = appViews.getChildByText(new UiSelector()
                .className("android.widget.TextView"), "Calculator");
        assertTrue(calculatorApp.exists());

        calculatorApp.clickAndWaitForNewWindow();

        // Use calculator app
        UiObject clearButton = uiDevice.findObject(new UiSelector().textMatches("clr|del"));
        assertTrue(clearButton.exists());
        clearButton.longClick();

        UiObject threeButton = uiDevice.findObject(new UiSelector().text("3"));
        assertTrue(threeButton.exists());
        threeButton.click();

        UiObject plusButton = uiDevice.findObject(new UiSelector().text("+"));
        assertTrue(plusButton.exists());
        plusButton.click();

        UiObject fiveButton = uiDevice.findObject(new UiSelector().text("5"));
        assertTrue(fiveButton.exists());
        fiveButton.click();

        UiObject equalsButton = uiDevice.findObject(new UiSelector().text("="));
        assertTrue(equalsButton.exists());
        equalsButton.click();

        UiObject display = uiDevice.findObject(new UiSelector()
                .resourceId("com.android.calculator2:id/display"));
        assertTrue(display.exists());

        // Validate
        UiObject displayNumber = display.getChild(new UiSelector().index(0));
        assertTrue(displayNumber.exists());
        assertEquals(displayNumber.getText(), "8");
    }

    @Test
    public void testBrowserApp() throws Exception {
        // Home screen apps button
        UiObject appButton = uiDevice.findObject(new UiSelector().descriptionContains("Apps"));
        assertTrue(appButton.exists());

        appButton.clickAndWaitForNewWindow();

        // Scrollable view with apps
        UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
        assertTrue(appViews.exists());

        appViews.setAsHorizontalList();

        // Find browser application
        UiObject browserApp = appViews.getChildByText(new UiSelector()
                .className("android.widget.TextView"), "Browser");
        assertTrue(browserApp.exists());
        browserApp.clickAndWaitForNewWindow();

        // Browser App set url
        UiObject urlForm = uiDevice.findObject(new UiSelector()
                .resourceId("com.android.browser:id/url"));
        assertTrue(urlForm.exists());
        urlForm.click();
        urlForm.setText("www.google.com");
        uiDevice.pressEnter();

        // Wait to load page
        SystemClock.sleep(10000);

        // Show menu
        uiDevice.pressMenu();

        // Find text on page
        UiObject findButton = uiDevice.findObject(new UiSelector()
                .text("Find on page"));
        assertTrue(findButton.exists());
        findButton.click();

        UiObject findView = uiDevice.findObject(new UiSelector()
                .resourceId("android:id/edit"));
        assertTrue(findView.exists());
        findView.setText("Google");
        uiDevice.pressEnter();

        SystemClock.sleep(2000);

        // Dismiss search
        UiObject okButtonView = uiDevice.findObject(new UiSelector()
                .resourceId("com.android.browser:id/iconcombo"));
        assertTrue(okButtonView.exists());
        okButtonView.click();
    }
}