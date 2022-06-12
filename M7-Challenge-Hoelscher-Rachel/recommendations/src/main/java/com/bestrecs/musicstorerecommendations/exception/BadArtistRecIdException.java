package com.bestrecs.musicstorerecommendations.exception;

public class BadArtistRecIdException extends RuntimeException{
    public BadArtistRecIdException(String message) {super(message);}

    public BadArtistRecIdException() {super();}
}
