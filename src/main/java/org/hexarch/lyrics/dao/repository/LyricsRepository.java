package org.hexarch.lyrics.dao.repository;

import org.hexarch.lyrics.dao.model.LyricsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LyricsRepository extends JpaRepository<LyricsEntity, Long> {

    void deleteAllByParticipatingArtist(String name);

    LyricsEntity findByParticipatingArtist(String Name);

    LyricsEntity findByLyrics(String Lyrics);
}
