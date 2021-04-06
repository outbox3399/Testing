package com.automationpractice.configfile;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;



//@RunWith(JUnitReportingRunner.class)
public class RunnerConfiguration extends JUnitStories {
    public RunnerConfiguration() {}

    public Configuration configuration() {
        return new MostUsefulConfiguration()
            .useStoryLoader( new LoadFromClasspath(this.getClass()))
            .useStoryReporterBuilder(new StoryReporterBuilder()
                .withCodeLocation(CodeLocations.codeLocationFromClass(this.getClass()))
                .withDefaultFormats());
    }

    @Override
   /* public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), );
    }*/

    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(
            "src/test/java/com/tne/espanotes/resources",
             //"**/*.story", "" );
            "signUp.story", null );
    }
}