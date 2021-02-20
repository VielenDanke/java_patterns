package kz.danke.patterns.creation.factory.simple;

import java.time.LocalDateTime;

public class NewsPost extends Post {

    private String headline;
    private LocalDateTime newsLine;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDateTime getNewsLine() {
        return newsLine;
    }

    public void setNewsLine(LocalDateTime newsLine) {
        this.newsLine = newsLine;
    }
}
