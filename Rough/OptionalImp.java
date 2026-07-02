import java.util.Optional;

public class OptionalImp {
    public static void main(String[] args) {
        Optional<String> str = Optional.of("Phani");
        System.out.println(str.get());
        // String str2 = null;
        // Optional<String> str3 = null;
        // System.out.println(str3.get().length());
        // str3.ifPresent((a)->System.out.println(a));
    }
}
