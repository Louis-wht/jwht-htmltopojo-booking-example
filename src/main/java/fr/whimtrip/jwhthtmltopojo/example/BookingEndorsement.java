package fr.whimtrip.jwhthtmltopojo.example;

import fr.whimtrip.ext.jwhthtmltopojo.annotation.ReplaceWith;
import fr.whimtrip.ext.jwhthtmltopojo.annotation.Selector;
import fr.whimtrip.ext.jwhthtmltopojo.impl.ReplacerDeserializer;

/**
 * <p>Part of project jwht-htmltopojo-booking-example</p>
 *
 * <p>Sub POJO contained in {@link BookingEndorsementPage}</p>
 *
 * @author Louis-wht
 * @since 25/07/18
 */
public class BookingEndorsement {

    @Selector(
            value = "div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(1)"
    )
    private String endorsementName;

    @Selector(
            value = "div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(2)",
            format = "([0-9,]+) recommendations",
            indexForRegexPattern = 1,
            useDeserializer = true,
            deserializer = ReplacerDeserializer.class,
            preConvert = true,
            postConvert = false
    )
    // so that the number becomes a valid number as they are shown in this format : 1,926
    @ReplaceWith(value = ",", with = "")
    private Integer endorsementsCount;


    @Selector(
            value = "div:nth-child(2) > h3:nth-child(1)"
    )
    private String question;

    @Selector(
            value = "div.dsf_cd_mod_endr_answers > p:nth-child(2)"
    )
    private String answer;


    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("BookingEndorsement{");
        sb.append("endorsementName='").append(endorsementName).append('\'');
        sb.append(", endorsementsCount=").append(endorsementsCount);
        sb.append(", question='").append(question).append('\'');
        sb.append(", answer='").append(answer).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getEndorsementName() {

        return endorsementName;
    }

    public BookingEndorsement setEndorsementName(String endorsementName) {

        this.endorsementName = endorsementName;
        return this;
    }

    public Integer getEndorsementsCount() {

        return endorsementsCount;
    }

    public BookingEndorsement setEndorsementsCount(Integer endorsementsCount) {

        this.endorsementsCount = endorsementsCount;
        return this;
    }

    public String getQuestion() {

        return question;
    }

    public BookingEndorsement setQuestion(String question) {

        this.question = question;
        return this;
    }

    public String getAnswer() {

        return answer;
    }

    public BookingEndorsement setAnswer(String answer) {

        this.answer = answer;
        return this;
    }
}
