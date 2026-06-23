package domain;

record NotificationSent(
        Long notificationId
) implements DomainEvent {}