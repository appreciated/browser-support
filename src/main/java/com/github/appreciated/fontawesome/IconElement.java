package com.github.appreciated.fontawesome;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

import java.util.Arrays;

@Tag("i")
public class IconElement extends Component {

    public IconElement() {
    }

    public IconElement(String... classes) {
        addClasses(classes);
    }

    public void addClasses(String... classes) {
        Arrays.stream(classes).forEach(className -> getElement().getClassList().add(className));
    }

    public void addClass(String cssClass) {
        getElement().getClassList().add(cssClass);
    }

    public void removeClass(String cssClass) {
        getElement().getClassList().remove(cssClass);
    }
}
