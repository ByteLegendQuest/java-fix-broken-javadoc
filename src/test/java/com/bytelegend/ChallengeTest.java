package com.bytelegend;

import com.github.hcsp.test.helper.ProjectSourceFileReader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals(3, Challenge.max(1, 2, 3));
        String javadocHtml =
                ProjectSourceFileReader.readFile(
                        "target/site/apidocs/com/bytelegend/Challenge.html");
        System.out.println(javadocHtml);
        Assertions.assertTrue(javadocHtml.contains("don't modify the comments themselves."));

        Document document = Jsoup.parse(javadocHtml);
        Assertions.assertTrue(document.text().contains("Location: C:\\users\\Documents"));
        Assertions.assertTrue(
                document.text()
                        .contains("Fix the maximum number in three numbers, e.g. max(1,2,3) -> 3"));
        Assertions.assertTrue(
                !document.select("span.returnLabel").isEmpty()
                        || document.select("dt").stream()
                                .anyMatch(element -> element.text().contains("Returns")));
    }
}
