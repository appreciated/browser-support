package com.github.appreciated.browser;

import com.vaadin.flow.router.NavigationHandler;

public class TargetMissesAnnotationException extends RuntimeException {
    public TargetMissesAnnotationException(Class<?> navigationTarget, Class annotation) {
        super("The Class " + navigationTarget.getName() + " is missing the Annotation " + annotation.getName() + "!");
    }
}
