package org.springframework.roo.addon.web.mvc.jsp.i18n.languages.greek;

import java.io.InputStream;
import java.util.Locale;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.springframework.roo.addon.web.mvc.jsp.i18n.AbstractLanguage;
import org.springframework.roo.support.util.FileUtils;

/** 
 * Greek language support.
 *
 */
@Component(immediate = true)
@Service
public class GreekLanguage extends AbstractLanguage {

    public Locale getLocale() {
        return new Locale("el");
    }
    
    public String getLanguage() {
        return "Ελληνικά";
    }

    public InputStream getFlagGraphic() {
        return FileUtils.getInputStream(getClass(), "gr.png");
    }

    public InputStream getMessageBundle() {
        return FileUtils.getInputStream(getClass(), "messages_el.properties");
    }
}
