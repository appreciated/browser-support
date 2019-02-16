package com.github.appreciated.browser;

import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;

public interface BrowserSupportCheck extends BeforeEnterObserver {

    @Override
    default void beforeEnter(BeforeEnterEvent event) {
        if (event.getUI().getSession().getBrowser().isChrome()) {
            Class<?> target = event.getNavigationTarget();
            if (target.isAnnotationPresent(BrowserUnsupportedRoute.class)) {
                event.rerouteTo(target.getAnnotation(BrowserUnsupportedRoute.class).value());
            } else {
                throw new TargetMissesAnnotationException(target, BrowserUnsupportedRoute.class);
            }
        }
    }
}
