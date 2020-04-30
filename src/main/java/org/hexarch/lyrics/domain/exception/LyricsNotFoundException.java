package org.hexarch.lyrics.domain.exception;

public class LyricsNotFoundException extends RuntimeException {

    public LyricsNotFoundException(Long id) {
        super("Lyrics with id %s not found!" + id);
    }
}
