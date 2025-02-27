package com.designprinciples.dip;

public class Main {
}


// Understanding the Principle
// DIP ensures that high-level modules (business logic) don’t depend directly on low-level modules (concrete implementations). Instead, both should depend on abstractions (interfaces or abstract classes).

// Why is this Important?
//    ✅ Makes the system loosely coupled → easier to change & extend.
//    ✅ Improves testability since dependencies can be mocked.
//    ✅ Prevents rigid code that is hard to modify when implementations change.