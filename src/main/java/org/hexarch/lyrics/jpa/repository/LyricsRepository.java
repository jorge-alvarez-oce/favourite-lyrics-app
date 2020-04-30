package org.hexarch.lyrics.jpa.repository;

import org.hexarch.lyrics.jpa.model.LyricsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LyricsRepository extends JpaRepository<LyricsEntity, Long> {

    void deleteAllByParticipatingArtist(String name);

    LyricsEntity findByParticipatingArtist(String Name);

    LyricsEntity findByLyrics(String Lyrics);
}
