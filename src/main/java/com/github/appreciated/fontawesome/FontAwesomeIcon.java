package com.github.appreciated.fontawesome;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import static com.github.appreciated.fontawesome.FontAwesomeIcon.Size.NORMAL;

@Tag("font-awesome-test")
@HtmlImport("frontend://com/github/appreciated/font-awesome/font-awesome.html")
public class FontAwesomeIcon extends PolymerTemplate<TemplateModel> implements HasSize, HasComponents {

    @Id("icon")
    IconElement element;

    public FontAwesomeIcon(FontAwesome icon) {
        this();
        setIcon(icon);
    }

    public FontAwesomeIcon() {
        element.addClass("fa");
        setSize(NORMAL);
    }

    public void setIcon(FontAwesome icon) {
        element.addClass(icon.getIcon());
    }

    public void setSize(Size size) {
        element.removeClass(NORMAL.getCssClass());
        element.addClass(size.getCssClass());
    }

    public FontAwesomeIcon withIcon(FontAwesome icon) {
        setIcon(icon);
        return this;
    }

    public FontAwesomeIcon withSize(Size size) {
        setSize(size);
        return this;
    }

    public enum Size {
        SMALL("lg"), NORMAL("fa-2x"), LARGE("fa-3x");

        private String cssClass;

        Size(String className) {
            this.cssClass = className;
        }

        public String getCssClass() {
            return cssClass;
        }
    }
}
