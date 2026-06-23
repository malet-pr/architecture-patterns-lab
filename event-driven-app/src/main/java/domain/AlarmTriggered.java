package domain;

record AlarmTriggered(
        Long alarmId,
        String technicianId
) implements DomainEvent {}