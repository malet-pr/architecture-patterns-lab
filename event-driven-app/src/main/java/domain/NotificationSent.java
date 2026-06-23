package domain;

import java.time.Instant;
import java.util.UUID;

record NotificationSent(
        UUID eventId,
        Instant occurredAt,
        Long notificationId
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