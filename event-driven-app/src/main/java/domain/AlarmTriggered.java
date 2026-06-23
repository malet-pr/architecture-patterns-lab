package domain;

import java.time.Instant;
import java.util.UUID;

record AlarmTriggered(
        UUID eventId,
        Instant occurredAt,
        Long alarmId,
        String technicianId
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