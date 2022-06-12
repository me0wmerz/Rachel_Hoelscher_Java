package com.bestrecs.musicstorerecommendations.exception;

public class BadTrackRecIdException extends RuntimeException{
    public BadTrackRecIdException(String message) {super(message);}

    public BadTrackRecIdException() {super();}
}
