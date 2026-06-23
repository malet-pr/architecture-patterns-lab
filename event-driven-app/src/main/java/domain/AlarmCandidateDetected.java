package domain;

record AlarmCandidateDetected(
        String technicianId,
        String workOrderId,
        String alarmType
) implements DomainEvent {}