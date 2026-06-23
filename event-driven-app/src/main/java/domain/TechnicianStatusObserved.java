package domain;

import java.time.Instant;

record TechnicianStatusObserved(
        String technicianId,
        String workOrderId,
        String status,
        Instant observedAt
) implements DomainEvent {}