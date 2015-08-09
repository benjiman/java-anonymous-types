# java-anonymous-types
Example of how to create anonymous types in java, using intersection casts

```java 
with((Anon & Quacks & Waddles) i -> i, ducklike -> {
    ducklike.quack();
    ducklike.waddle();
});
```

You can also enhance existing types with List with new methods like map
```java
interface Mappable<T> extends DelegatesTo<List<T>> {
    default <R> List<R> map(Function<T,R> mapper) {
        return delegate().stream().map(mapper).collect(Collectors.toList());
    }
}

with((ForwardingList<String> & Mappable<String>)() -> stringList, list -> {
    list.map(String::toUpperCase).forEach(System.out::println);
});
```
