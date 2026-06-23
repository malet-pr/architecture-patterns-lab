package domain;

record AlarmResolved(
        Long alarmId
) implements DomainEvent {}