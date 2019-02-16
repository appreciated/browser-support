package com.github.appreciated.browser;

import com.vaadin.flow.router.Route;

@Route("browser-not-supported")
public class BrowserNotSupportedView extends BrowserUnsupportedView {

    public BrowserNotSupportedView() {
        super("test","test");
    }

    public BrowserNotSupportedView(String supportLine1, String supportLine2) {
        super(supportLine1, supportLine2);
    }
}
