package com.benjiweber.anonymous;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

interface ForwardingList<T> extends DelegatesTo<List<T>>, List<T> {
    default int size() {
        return delegate().size();
    }

    default Stream<T> stream() {
        return delegate().stream();
    }

    default boolean add(T t) {
        return delegate().add(t);
    }

    default boolean addAll(Collection<? extends T> c) {
        return delegate().addAll(c);
    }

    default T set(int index, T element) {
        return delegate().set(index, element);
    }

    default Object[] toArray() {
        return delegate().toArray();
    }

    default boolean remove(Object o) {
        return delegate().remove(o);
    }

    default void sort(Comparator<? super T> c) {
        delegate().sort(c);
    }

    default boolean retainAll(Collection<?> c) {
        return delegate().retainAll(c);
    }

    default void clear() {
        delegate().clear();
    }

    default int indexOf(Object o) {
        return delegate().indexOf(o);
    }

    default boolean containsAll(Collection<?> c) {
        return delegate().containsAll(c);
    }

    default Iterator<T> iterator() {
        return delegate().iterator();
    }

    default void add(int index, T element) {
        delegate().add(index, element);
    }

    default int lastIndexOf(Object o) {
        return delegate().lastIndexOf(o);
    }

    default ListIterator<T> listIterator(int index) {
        return delegate().listIterator(index);
    }

    default List<T> subList(int fromIndex, int toIndex) {
        return delegate().subList(fromIndex, toIndex);
    }

    default T remove(int index) {
        return delegate().remove(index);
    }

    default Stream<T> parallelStream() {
        return delegate().parallelStream();
    }

    default boolean contains(Object o) {
        return delegate().contains(o);
    }

    default void forEach(Consumer<? super T> action) {
        delegate().forEach(action);
    }

    default Spliterator<T> spliterator() {
        return delegate().spliterator();
    }

    default boolean removeIf(Predicate<? super T> filter) {
        return delegate().removeIf(filter);
    }

    default boolean removeAll(Collection<?> c) {
        return delegate().removeAll(c);
    }

    default boolean addAll(int index, Collection<? extends T> c) {
        return delegate().addAll(index, c);
    }

    default void replaceAll(UnaryOperator<T> operator) {
        delegate().replaceAll(operator);
    }

    default <T1> T1[] toArray(T1[] a) {
        return delegate().toArray(a);
    }

    default ListIterator<T> listIterator() {
        return delegate().listIterator();
    }

    default boolean isEmpty() {
        return delegate().isEmpty();
    }

    default T get(int index) {
        return delegate().get(index);
    }
}