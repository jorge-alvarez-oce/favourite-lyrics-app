package org.hexarch.lyrics.dao;

import org.hexarch.lyrics.domain.LyricsDto;

import java.util.List;

public interface LyricsDao {

    void addLyrics(LyricsDto lyricsDto);

    void removeLyrics(LyricsDto lyricsDto);

    void updateLyrics(LyricsDto lyricsDto);

    List<LyricsDto> getAllLyrics();

    LyricsDto getLyricsById(Long lyricsId);
}
