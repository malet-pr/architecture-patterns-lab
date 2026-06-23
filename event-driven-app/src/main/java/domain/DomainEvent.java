package domain;

sealed interface DomainEvent permits
        AlarmCandidateDetected,
        AlarmResolved,
        AlarmTriggered,
        NotificationSent,
        TechnicianStatusObserved { }
