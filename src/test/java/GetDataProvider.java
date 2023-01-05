import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

class GetDataProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of("0"),
                Arguments.of("101"),
                Arguments.of("-1"),
                Arguments.of("1000000000"),
                Arguments.of("!@#$%^&*()"),
                Arguments.of("!@#$%^&*()100"),
                Arguments.of("98!@#$%^&*()"),
                Arguments.of(" 76"),
                Arguments.of(" 77 "),
                Arguments.of("44sgrgsrgsrsrh"),
                Arguments.of("rhfkgukgukgyky75"),
                Arguments.of("gsgsgs75segesges"),
                Arguments.of((Object) null)
        );
    }
}


