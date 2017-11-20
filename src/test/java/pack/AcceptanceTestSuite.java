package pack;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.Optional;

public class AcceptanceTestSuite extends SerenityStories {
    public static final String STORIES_PATTERN = "marka.stories";

    public AcceptanceTestSuite(){
        prepareStoriesForRunning();
    }

    private void prepareStoriesForRunning(){
        addStoriesByPattern(System.getProperty(STORIES_PATTERN));
    }

    private void addStoriesByPattern(final String storiesPattern) {
        Optional.ofNullable(storiesPattern).ifPresent(this::findStoriesCalled);
    }
}
