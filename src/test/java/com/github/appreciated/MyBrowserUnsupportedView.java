package com.github.appreciated;

import com.github.appreciated.browser.BrowserUnsupportedView;
import com.vaadin.flow.router.Route;

@Route("browser-unsupported")
public class MyBrowserUnsupportedView extends BrowserUnsupportedView {
    public MyBrowserUnsupportedView() {
        super("Sorry! This Website does not support your browser.","Please visit again with a browser that supports modern web technologies.");
    }
}
