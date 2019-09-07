package io.github.kobylynskyi.graphql.codegen;

import org.apache.maven.plugin.AbstractMojo;

import java.io.File;

/**
 * Goal which touches a timestamp file.
 *
 * @goal touch
 * @phase process-sources
 */
public class MyMojo extends AbstractMojo {

    private File outputDirectory;

    @Override
    public void execute() {
    }
}
