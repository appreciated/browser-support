package com.github.appreciated;

import com.github.appreciated.browser.BrowserSupportCheck;
import com.github.appreciated.browser.BrowserUnsupportedRoute;
import com.github.appreciated.fontawesome.FontAwesome;
import com.github.appreciated.fontawesome.FontAwesomeIcon;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.router.Route;

@Route("")
@BrowserUnsupportedRoute(value = MyBrowserUnsupportedView.class)
public class DemoView extends Div implements BrowserSupportCheck {

    public DemoView() {
        add(
                new H3("Checkout this Fontawesome icons!"),
                new FontAwesomeIcon().withIcon(FontAwesome.FIREFOX).withSize(FontAwesomeIcon.Size.SMALL),
                new FontAwesomeIcon().withIcon(FontAwesome.CHROME).withSize(FontAwesomeIcon.Size.SMALL),
                new FontAwesomeIcon().withIcon(FontAwesome.INTERNET_EXPLORER).withSize(FontAwesomeIcon.Size.SMALL),
                new FontAwesomeIcon().withIcon(FontAwesome.SAFARI).withSize(FontAwesomeIcon.Size.SMALL),

                new FontAwesomeIcon().withIcon(FontAwesome.FIREFOX).withSize(FontAwesomeIcon.Size.NORMAL),
                new FontAwesomeIcon().withIcon(FontAwesome.CHROME).withSize(FontAwesomeIcon.Size.NORMAL),
                new FontAwesomeIcon().withIcon(FontAwesome.INTERNET_EXPLORER).withSize(FontAwesomeIcon.Size.NORMAL),
                new FontAwesomeIcon().withIcon(FontAwesome.SAFARI).withSize(FontAwesomeIcon.Size.NORMAL),

                new FontAwesomeIcon().withIcon(FontAwesome.FIREFOX).withSize(FontAwesomeIcon.Size.LARGE),
                new FontAwesomeIcon().withIcon(FontAwesome.CHROME).withSize(FontAwesomeIcon.Size.LARGE),
                new FontAwesomeIcon().withIcon(FontAwesome.INTERNET_EXPLORER).withSize(FontAwesomeIcon.Size.LARGE),
                new FontAwesomeIcon().withIcon(FontAwesome.SAFARI).withSize(FontAwesomeIcon.Size.LARGE)
        );
        setSizeFull();
    }
}
