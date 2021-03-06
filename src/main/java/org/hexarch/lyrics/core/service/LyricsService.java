package org.hexarch.lyrics.core.service;

import org.hexarch.lyrics.domain.data.LyricsDto;

import java.util.List;

public interface LyricsService {

    void addLyrics(LyricsDto lyricsDto);

    void removeLyrics(LyricsDto lyricsDto);

    void updateLyrics(LyricsDto lyricsDto);

    List<LyricsDto> getAllLyrics();

    LyricsDto getLyricsById(Long lyricsId);

}
