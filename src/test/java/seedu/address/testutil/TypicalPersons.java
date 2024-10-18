package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_OWED_AMOUNT_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_OWED_AMOUNT_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PAID_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PAID_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_RATE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_RATE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_SCHEDULE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_SCHEDULE_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withSchedule("Sunday-1800-1900").withSubject("Economics")
            .withRate("250.50").withPaid("0").withOwedAmount("250.50").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432").withSchedule("Monday-1800-1900")
            .withSubject("Mathematics").withRate("100.80").withPaid("201.6").withOwedAmount("0").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street")
            .withSchedule("Tuesday-1800-1900").withSubject("Mathematics").withRate("300")
            .withPaid("1200").withOwedAmount("900").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street")
            .withSchedule("Wednesday-1800-1900").withSubject("Mathematics").withRate("450.5")
            .withPaid("450.5").withOwedAmount("901.00").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("94802224")
            .withEmail("werner@example.com").withAddress("michegan ave")
            .withSchedule("Thursday-1800-1900").withSubject("Mathematics").withRate("350")
            .withPaid("2800").withOwedAmount("0").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("94824270")
            .withEmail("lydia@example.com").withAddress("little tokyo")
            .withSchedule("Friday-1800-1900").withSubject("Mathematics").withRate("260.25")
            .withPaid("0").withOwedAmount("520.50").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("94824420")
            .withEmail("anna@example.com").withAddress("4th street").withSchedule("Saturday-1800-1900")
            .withSubject("Mathematics").withRate("120").withPaid("1200").withOwedAmount("0").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("84820424")
            .withEmail("stefan@example.com").withAddress("little india").withSchedule("Sunday-1800-1900")
            .withSubject("Science").withRate("200").withPaid("8000").withOwedAmount("1000").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("84820131")
            .withEmail("hans@example.com").withAddress("chicago ave").withSchedule("Monday-1800-1900")
            .withSubject("Economics").withRate("450").withPaid("900").withOwedAmount("900").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY)
            .withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withSchedule(VALID_SCHEDULE_AMY)
            .withRate(VALID_RATE_AMY).withPaid(VALID_PAID_AMY).withOwedAmount(VALID_OWED_AMOUNT_AMY).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB)
            .withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withSchedule(VALID_SCHEDULE_BOB)
            .withRate(VALID_RATE_BOB).withPaid(VALID_PAID_BOB).withOwedAmount(VALID_OWED_AMOUNT_BOB).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
