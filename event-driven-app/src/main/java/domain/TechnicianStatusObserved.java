package domain;

import java.time.Instant;
import java.util.UUID;

record TechnicianStatusObserved(
        UUID eventId,
        Instant occurredAt,
        String technicianId,
        String workOrderId,
        String status,
        Instant observedAt
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
        return observedAt;
    }
}