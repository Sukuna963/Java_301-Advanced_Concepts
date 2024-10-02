package org.example.exception;

public class Custom extends Exception {

    @Override
    public String toString() {
        return "ClassroomFullException{ This classroom is full }";
    }
}
