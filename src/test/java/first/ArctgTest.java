package first;

import lab.first.Arctg;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArctgTest {
    @ParameterizedTest(name = "arctg({0}) = {1}")
    @DisplayName("Проверка в диапазоне [-1; 1]")
    @MethodSource("provideParamsForCheckBetweenMinusOneAndOne")
    public void checkBetweenMinusOneAndOne(double x, double y) {
        assertAll(
                () -> assertEquals(y, Arctg.calc(x, 10000), 0.01)
        );
    }

    @ParameterizedTest(name = "arctg({0}) = {1}")
    @DisplayName("Проверка если x < -1")
    @MethodSource("provideParamsForCheckLessOfMinusOne")
    public void checkLessValueOfMinusOne(double x, double y) {
        assertAll(
                () -> assertEquals(y, Arctg.calc(x, 10000), 0.01)
        );
    }

    @ParameterizedTest(name = "arctg({0}) = {1}")
    @DisplayName("Проверка если x > 1")
    @MethodSource("provideParamsForCheckBiggerValueOfOne")
    public void checkBiggerValueOfOne(double x, double y) {
        assertAll(
                () -> assertEquals(y, Arctg.calc(x, 10000), 0.01)
        );
    }

    private static Stream<Arguments> provideParamsForCheckBetweenMinusOneAndOne() {
        return Stream.of(
                Arguments.of(-1.0, -0.7853981633974483),
                Arguments.of(-0.98, -0.7752974968121263),
                Arguments.of(-0.56, -0.5104883219167758),
                Arguments.of(-0.47, -0.43936088728459144),
                Arguments.of(-0.1, -0.09966865249116204),
                Arguments.of(0.0, 0.0),
                Arguments.of(0.1, 0.09966865249116204),
                Arguments.of(0.37, 0.3543799191234378),
                Arguments.of(0.63, 0.5621867439000292),
                Arguments.of(0.89, 0.7272626879966904),
                Arguments.of(1.0, 0.7853981633974483)
        );
    }

    private static Stream<Arguments> provideParamsForCheckLessOfMinusOne() {
        return Stream.of(
                Arguments.of(-100.2, -1.560816618196244),
                Arguments.of(-56.5, -1.5530990595371263),
                Arguments.of(-10.8, -1.4784669920632976),
                Arguments.of(-2.98, -1.2470337026788887),
                Arguments.of(-1.98, -1.103116481582997),
                Arguments.of(-1.1, -0.8329812666744317)
        );
    }

    private static Stream<Arguments> provideParamsForCheckBiggerValueOfOne() {
        return Stream.of(
                Arguments.of(100.3, 1.5608265673956314),
                Arguments.of(65.8, 1.5555999282846789),
                Arguments.of(14.2, 1.5004898626762722),
                Arguments.of(3.12, 1.2606282660069106),
                Arguments.of(1.54, 0.9948777271765435),
                Arguments.of(1.1, 0.8329812666744317)
        );
    }
}
