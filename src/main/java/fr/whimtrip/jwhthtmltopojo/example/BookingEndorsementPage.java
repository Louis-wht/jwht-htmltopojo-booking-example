package fr.whimtrip.jwhthtmltopojo.example;

import fr.whimtrip.ext.jwhthtmltopojo.annotation.AcceptObjectIf;
import fr.whimtrip.ext.jwhthtmltopojo.annotation.Selector;

import java.util.List;

/**
 * <p>Part of project jwht-htmltopojo-booking-example</p>
 *
 * <p>Booking Endorsement age</p>
 *
 * @author Louis-wht
 * @since 25/07/18
 */
public class BookingEndorsementPage {


    @Selector(
            value = ".dsf_cd_mod_title",
            format = "^What travellers love about (.+)$",
            indexForRegexPattern = 1
    )
    private String cityName;

    @Selector(
        value = ".js-equalize-heights > .dsf_cd_mod_hlist-item"
    )
    // This will filter out all endorsements containing the term "city"
    @AcceptObjectIf(BookingEndorsementFilter.class)
    private List<BookingEndorsement> bookingEndorsements;


    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("BookingEndorsementPage{");
        sb.append("cityName='").append(cityName).append('\'');
        sb.append(", bookingEndorsements=").append("[");

        for(BookingEndorsement be : bookingEndorsements){
            sb.append("\n").append(be);
        }

        sb.append("\n]}");
        return sb.toString();
    }

    public String getCityName() {

        return cityName;
    }

    public BookingEndorsementPage setCityName(String cityName) {

        this.cityName = cityName;
        return this;
    }

    public List<BookingEndorsement> getBookingEndorsements() {

        return bookingEndorsements;
    }

    public BookingEndorsementPage setBookingEndorsements(List<BookingEndorsement> bookingEndorsements) {

        this.bookingEndorsements = bookingEndorsements;
        return this;
    }
}
