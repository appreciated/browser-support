package com.github.appreciated.browser;

import com.github.appreciated.fontawesome.FontAwesome;
import com.github.appreciated.fontawesome.FontAwesomeIcon;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class BrowserUnsupportedView extends VerticalLayout {
    public BrowserUnsupportedView(String supportLine1, String supportLine2) {
        HorizontalLayout browserSupportGrid = new HorizontalLayout(
                new FontAwesomeIcon().withIcon(FontAwesome.FIREFOX).withSize(FontAwesomeIcon.Size.LARGE),
                new FontAwesomeIcon().withIcon(FontAwesome.EDGE).withSize(FontAwesomeIcon.Size.LARGE),
                new FontAwesomeIcon().withIcon(FontAwesome.CHROME).withSize(FontAwesomeIcon.Size.LARGE),
                new FontAwesomeIcon().withIcon(FontAwesome.SAFARI).withSize(FontAwesomeIcon.Size.LARGE)
        );
        VerticalLayout gridWrapper = new VerticalLayout();
        if (supportLine1 != null) {
            gridWrapper.add(new H3(supportLine1));
        }
        if (supportLine2 != null) {
            gridWrapper.add(new H3(supportLine2));
        }
        gridWrapper.add(browserSupportGrid);
        gridWrapper.setAlignItems(Alignment.CENTER);
        gridWrapper.setJustifyContentMode(JustifyContentMode.CENTER);
        gridWrapper.setSizeUndefined();

        add(gridWrapper);
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setSizeFull();
    }
}
