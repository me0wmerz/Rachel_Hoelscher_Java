package com.bestrecs.musicstorerecommendations.exception;

public class BadAlbumRecIdException extends RuntimeException{
    public BadAlbumRecIdException(String message) {super(message);}

    public BadAlbumRecIdException() {super();}
}
