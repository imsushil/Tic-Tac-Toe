package com.systemdesign;

public enum Symbol {
    X('X'), O('O'), BLANK('_');

    private char value;

    Symbol(char value) {
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }
}
