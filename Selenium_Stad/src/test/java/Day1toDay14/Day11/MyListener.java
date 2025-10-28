package Day1toDay14.Day11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import java.lang.reflect.InvocationTargetException;

public class MyListener implements WebDriverListener {

    @Override
    public void beforeClick(WebElement element) {
        System.out.println("Before clicking on: " + element);
    }

    @Override
    public void afterClick(WebElement element) {
        System.out.println("After clicking on: " + element);
    }

    @Override
    public void onError(Object target, java.lang.reflect.Method method, Object[] args, InvocationTargetException e) {
        System.out.println("Exception occurred: " + e.getTargetException().getMessage());
    }
}
