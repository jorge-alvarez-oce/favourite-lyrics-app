package org.hexarch.lyrics.rest;

import lombok.extern.slf4j.Slf4j;
import org.hexarch.lyrics.core.service.LyricsService;
import org.hexarch.lyrics.domain.data.LyricsDto;
import org.hexarch.lyrics.domain.exception.LyricsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class LyricsControllerImpl implements LyricsController {

    private final LyricsService lyricsService;

    private final Random random = new Random();

    public LyricsControllerImpl(LyricsService lyricsService) {
        this.lyricsService = lyricsService;
    }

    @Override
    public ResponseEntity<Void> addLyrics(LyricsDto lyricsDto) {
        lyricsService.addLyrics(lyricsDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> removeLyrics(LyricsDto lyricsDto) {
        lyricsService.removeLyrics(lyricsDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> updateLyrics(LyricsDto lyricsDto) {
        lyricsService.updateLyrics(lyricsDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<LyricsDto> getLyricsById(Long lyricsId) {
        try {
            return new ResponseEntity<>(lyricsService.getLyricsById(lyricsId), HttpStatus.OK);
        } catch (LyricsNotFoundException ex) {
            log.error("Error!", ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<List<LyricsDto>> getLyrics() {
        return new ResponseEntity<>(lyricsService.getAllLyrics(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<LyricsDto> getRandomLyric() {
        final List<LyricsDto> allLyrics = lyricsService.getAllLyrics();
        final int size = allLyrics.size();
        return new ResponseEntity<>(allLyrics.get(random.nextInt(size)), HttpStatus.OK);
    }
}
