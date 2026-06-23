package domain;

import java.time.Instant;
import java.util.UUID;

record AlarmCandidateDetected(
        UUID eventId,
        Instant occurredAt,
        String technicianId,
        String workOrderId,
        String alarmType
) implements DomainEvent {
    /**
     * @return 
     */
    @Override
    public UUID eventId() {
        return eventId;
    }

    /**
     * @return 
     */
    @Override
    public Instant occurredAt() {
        return occurredAt;
    }
}