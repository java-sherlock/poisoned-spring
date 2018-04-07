package org.sherlock.s01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Box {
    private String content;

    public void setContent(String content) {
        if (content.contains("poison")) {
            throw new PoisonedException();
        }
        this.content = content;
    }
}
