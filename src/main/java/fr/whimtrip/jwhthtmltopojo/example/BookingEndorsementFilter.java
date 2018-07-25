package fr.whimtrip.jwhthtmltopojo.example;

import fr.whimtrip.core.util.exception.ObjectCreationException;
import fr.whimtrip.ext.jwhthtmltopojo.annotation.Selector;
import fr.whimtrip.ext.jwhthtmltopojo.intrf.AcceptIfResolver;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.lang.reflect.Field;

/**
 * <p>Part of project jwht-htmltopojo-booking-example</p>
 *
 * <p>Useless filter yet used as an example to show what can
 *    be done with this library. Let's filter endorsements
 *    that includes the word "city"
 * </p>
 *
 * @author Louis-wht
 */
public class BookingEndorsementFilter implements AcceptIfResolver {
    @Override
    public boolean accept(Element element, Object parentObject) {

        Elements endorsementName = element.select("div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(1)");
        return !endorsementName.get(0).text().toLowerCase().contains("city");
    }

    @Override
    public void init(Field field, Object parentObject, Selector selector) throws ObjectCreationException {

    }
}
