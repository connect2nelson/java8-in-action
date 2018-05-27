public interface Converter<From, To> {
    To convert(From from);
}
