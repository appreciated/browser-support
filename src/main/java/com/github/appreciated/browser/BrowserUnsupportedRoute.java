package com.github.appreciated.browser;

import com.vaadin.flow.component.Component;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface BrowserUnsupportedRoute {
    Class<? extends Component> value();
}
