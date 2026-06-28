package certification.domain;

public record WorkOrderSnapshot(
        String workOrderId,
        WorkOrderType type,
        WorkOrderStatus status,
        boolean materialsComplete,
        boolean hasRequiredEvidence
) {}