package fr.whimtrip.jwhthtmltopojo.example;

import fr.whimtrip.ext.jwhthtmltopojo.HtmlToPojoEngine;
import fr.whimtrip.ext.jwhthtmltopojo.intrf.HtmlAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * <p>Part of project jwht-htmltopojo-booking-example</p>
 *
 * @author Louis-wht
 * @since 25/07/18
 */
public class BookingEndorsmentParser {

    private static final String ALESUND_NORWAY_ENDORSEMENT_HTML_FILE = "alesund-no-booking-endorsement.html";

    public static void main(String[] args) throws IOException {

        HtmlToPojoEngine htmlToPojoEngine = HtmlToPojoEngine.create();

        HtmlAdapter<BookingEndorsementPage> adapter = htmlToPojoEngine.adapter(BookingEndorsementPage.class);

        BookingEndorsementPage bookingEndorsementPage =
                adapter.fromHtml(getHtmlBody());

        System.out.println(bookingEndorsementPage);

    }

    private static String getHtmlBody() throws IOException {

        final File file = new File(ALESUND_NORWAY_ENDORSEMENT_HTML_FILE);
        byte[] encoded = Files.readAllBytes(Paths.get(ALESUND_NORWAY_ENDORSEMENT_HTML_FILE));
        return new String(encoded, Charset.forName("UTF-8"));

    }
}
