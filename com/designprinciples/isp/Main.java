package com.designprinciples.isp;

public class Main {
}

// A class should not be forced to implement interfaces it does not use.
// Understanding the Principle
// ISP states that interfaces should be small and specific, rather than large and general.
// Avoid "fat" interfaces that force classes to implement methods they don’t need.
// Instead, split interfaces into smaller, focused ones.


//Why is this Important?
// ✅ Prevents unnecessary dependencies.
// ✅ Improves code maintainability.
// ✅ Avoids implementing unused methods in classes.
