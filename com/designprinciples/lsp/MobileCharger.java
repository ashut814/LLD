package com.designprinciples.lsp;
// LSP Violation
//class MobileCharger {
//    public void charge() {
//        System.out.println("Charging device...");
//    }
//}
//
//class Fan extends MobileCharger {
//    @Override
//    public void charge() {
//        throw new UnsupportedOperationException("Fans cannot be charged!");
//    }
//}

// LSP Fix
// Step 1: Define an interface for chargeable devices

interface Chargeable {
    void charge();
}

// Step2: Implement the interface for chargable devices

class Mobile implements Chargeable {
    @Override
    public void charge() {
        System.out.println("Charging device...");
    }
}

class Fan implements Chargeable {
    @Override
    public void charge() {
        throw new UnsupportedOperationException("Fans cannot be charged!");
    }
}



