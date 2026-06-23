package domain;

import java.time.Instant;
import java.util.UUID;

sealed interface DomainEvent permits
        AlarmCandidateDetected,
        AlarmResolved,
        AlarmTriggered,
        NotificationSent,
        TechnicianStatusObserved {
    UUID eventId();
    Instant occurredAt();
}
