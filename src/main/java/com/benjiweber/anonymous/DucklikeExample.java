package com.benjiweber.anonymous;

import com.benjiweber.anonymous.AnonymousTypes.Anon;

import static com.benjiweber.anonymous.AnonymousTypes.with;

public class DucklikeExample {

    public static void main(String... args) {
        with((Anon & Quacks & Waddles) i -> i, ducklike -> {
            ducklike.quack();
            ducklike.waddle();
        });

        doDucklikeThings((Anon & Quacks & Waddles) i -> i);
    }

    interface Quacks {
        default void quack() {
            System.out.println("Quack");
        }
    }

    interface Waddles {
        default void waddle() {
            System.out.println("Waddle");
        }
    }

    public static <Ducklike extends Quacks & Waddles> void doDucklikeThings(Ducklike ducklike) {
        ducklike.quack();
        ducklike.waddle();
    }
}
