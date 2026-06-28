package certification.domain;

@FunctionalInterface
public interface CertificationPolicy {
    PolicyDecision evaluate(CertificationRequest request);
}