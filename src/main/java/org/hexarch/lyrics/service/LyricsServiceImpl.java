package org.hexarch.lyrics.service;

import org.hexarch.lyrics.domain.LyricsDto;
import org.hexarch.lyrics.dao.LyricsDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LyricsServiceImpl implements LyricsService {

    private final LyricsDao lyricsDao;

    public LyricsServiceImpl(LyricsDao lyricsDao) {
        this.lyricsDao = lyricsDao;
    }

    @Override
    public void addLyrics(LyricsDto lyricsDto) {
        lyricsDao.addLyrics(lyricsDto);
    }

    @Override
    @Transactional
    public void removeLyrics(LyricsDto lyricsDto) {
        lyricsDao.removeLyrics(lyricsDto);
    }

    @Override
    public void updateLyrics(LyricsDto lyricsDto) {
        lyricsDao.updateLyrics(lyricsDto);
    }

    @Override
    public List<LyricsDto> getAllLyrics() {
        return lyricsDao.getAllLyrics();
    }

    @Override
    public LyricsDto getLyricsById(Long lyricsId) {
        return lyricsDao.getLyricsById(lyricsId);
    }
}
