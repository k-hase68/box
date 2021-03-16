
package org.hoge.api.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * email object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "value",
    "date",
    "arrayBin",
    "other"
})
public class Email {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("")
    private String type;
    /**
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("")
    private String value;
    /**
     * date only
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("date only")
    private String date;
    /**
     * array binary data
     * 
     */
    @JsonProperty("arrayBin")
    @JsonPropertyDescription("array binary data")
    private List<String> arrayBin = new ArrayList<String>();
    /**
     * 
     */
    @JsonProperty("other")
    @JsonPropertyDescription("")
    private Email.Other other;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * date only
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * date only
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * array binary data
     * 
     */
    @JsonProperty("arrayBin")
    public List<String> getArrayBin() {
        return arrayBin;
    }

    /**
     * array binary data
     * 
     */
    @JsonProperty("arrayBin")
    public void setArrayBin(List<String> arrayBin) {
        this.arrayBin = arrayBin;
    }

    /**
     * 
     */
    @JsonProperty("other")
    public Email.Other getOther() {
        return other;
    }

    /**
     * 
     */
    @JsonProperty("other")
    public void setOther(Email.Other other) {
        this.other = other;
    }

    public enum Other {

        one("one"),
        two("two");
        private final String value;
        private final static Map<String, Email.Other> CONSTANTS = new HashMap<String, Email.Other>();

        static {
            for (Email.Other c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Other(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Email.Other fromValue(String value) {
            Email.Other constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
