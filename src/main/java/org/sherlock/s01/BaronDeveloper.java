package org.sherlock.s01;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class BaronDeveloper {
    @SneakyThrows
    public void use(Box box) {
        String content = box.getContent();
        if (content.contains("poison")) {
            throw new IamDyingException();
        }
        System.out.println(content+" was used");
    }
}

