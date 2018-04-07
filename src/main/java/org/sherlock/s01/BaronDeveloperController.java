package org.sherlock.s01;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/baron/developer")
@RequiredArgsConstructor
public class BaronDeveloperController {
    private final BaronDeveloper baronDeveloper;
    @PostMapping("/box")
    public String receiveBox(@RequestBody Box box) {
        try {
            baronDeveloper.use(box);
        } catch (RuntimeException e) {
            System.out.println("Барон был отравлен, но я вылечил его");
        }
        return "Оличная вещица...";
    }
}
