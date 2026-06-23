package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DomainTest {

    @DisplayName("Creates Technician Status Observed Event")
    @Test
    void createsTechnicianStatusObservedEvent() {
        var event = new TechnicianStatusObserved(
                UUID.randomUUID(),
                Instant.parse("2026-06-23T21:00:00Z"),
                "TECH-001",
                "WO-123",
                "EN_ROUTE",
                Instant.parse("2026-06-23T21:05:00Z")
        );
        assertEquals("TECH-001", event.technicianId());
        assertEquals("WO-123", event.workOrderId());
        assertEquals("EN_ROUTE", event.status());
    }

    @DisplayName("Creates Alarm Triggered Event")
    @Test
    void createsAlarmTriggeredEvent() {
        var event = new AlarmTriggered(
                UUID.randomUUID(),
                Instant.parse("2026-06-23T21:00:00Z"),
                1L,
                "TECH-001"
        );
        assertEquals(1L, event.alarmId());
        assertEquals("TECH-001", event.technicianId());
    }

    @DisplayName("Creates Notification Sent Event")
    @Test
    void createsNotificationSentEvent() {
        var event = new NotificationSent(
                UUID.randomUUID(),
                Instant.parse("2026-06-23T21:00:00Z"),
                1L
        );
        assertEquals(1L, event.notificationId());
    }

    @DisplayName("Creates Alarm Resolved Event")
    @Test
    void createsAlarmResolvedEvent() {
        var event = new AlarmResolved(
                UUID.randomUUID(),
                Instant.parse("2026-06-23T21:00:00Z"),
                1L
        );
        assertEquals(1L, event.alarmId());
    }

    @DisplayName("Creates Alarm Candidate Detected Event")
    @Test
    void createsAlarmCandidateDetectedEvent() {
        var event = new AlarmCandidateDetected(
                UUID.randomUUID(),
                Instant.parse("2026-06-23T21:00:00Z"),
                "TECH-001",
                "WO-123",
                "LUNCH_BREAK"
        );
        assertEquals("TECH-001", event.technicianId());
        assertEquals("WO-123", event.workOrderId());
        assertEquals("LUNCH_BREAK", event.alarmType());
    }

}
