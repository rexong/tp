package seedu.address.model.meeting;

import static java.util.Objects.requireNonNull;

import java.time.LocalTime;

/**
 * Represents a Meeting's time in MyInsuRec.
 */
public class MeetingTime {
    private final LocalTime time;

    /**
     * Constructs a {@code MeetingTime}.
     *
     * @param meetingTime A valid meeting time.
     */
    public MeetingTime(LocalTime meetingTime) {
        requireNonNull(meetingTime);
        time = meetingTime;
    }

    public String toString() {
        return time.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this
                || (other instanceof MeetingTime
                && time.equals(((MeetingTime) other).time));
    }
}