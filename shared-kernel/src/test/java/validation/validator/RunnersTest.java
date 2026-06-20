package validation.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import validation.model.Severity;
import validation.model.ValidationError;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RunnersTest {

    record Person(String name, int age) {}

    @Test
    @DisplayName("runValidators returns empty list when no validators return errors")
    void runValidatorsNoError() {
        List<Function<String, Optional<ValidationError>>> validators = List.of(
                value -> value.equals("hello")
                        ? Optional.empty()
                        : Optional.of(new ValidationError("value", "unexpected value", Severity.ERROR))
        );
        List<ValidationError> result = Runners.runValidators(validators, "hello");
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("runValidators passes value to validators and collects errors")
    void runValidatorsWithErrors() {
        List<Function<String, Optional<ValidationError>>> validators = List.of(
                value -> value.equals("hello")
                        ? Optional.empty()
                        : Optional.of(new ValidationError("value", "unexpected value", Severity.ERROR))
        );
        List<ValidationError> result = Runners.runValidators(validators, "hola");
        assertEquals(1, result.size());
        assertEquals("value", result.getFirst().code());
        assertEquals("unexpected value", result.getFirst().message());
        assertEquals(Severity.ERROR, result.getFirst().severity());
    }

    @Test
    @DisplayName("runValidators works with record types and custom validators")
    void runValidatorsWithRecord() {
        Function<Person, Optional<ValidationError>> adultValidator =
                person -> person.age() >= 18
                        ? Optional.empty()
                        : Optional.of(new ValidationError("age", "must be adult", Severity.ERROR));
        List<ValidationError> result = Runners.runValidators(List.of(adultValidator), new Person("Ana", 15));
        assertEquals(1, result.size());
        assertEquals("age", result.getFirst().code());
        assertEquals("must be adult", result.getFirst().message());
        assertEquals(Severity.ERROR, result.getFirst().severity());
    }


}
