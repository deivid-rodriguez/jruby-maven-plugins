package de.saumya.mojo.gem;

import java.io.File;

import org.apache.maven.plugin.MojoExecutionException;

import de.saumya.mojo.jruby.AbstractJRubyMojo;

/**
 * goal to locally install a given gem
 * 
 * @goal install
 */
public class InstallMojo extends AbstractJRubyMojo {

    /**
     * @parameter default-value="${jruby.gem}" expression=
     *            "${project.build.directory}/${project.build.finalName}-java.gem"
     */
    private final File gemFile = null;

    public void execute() throws MojoExecutionException {
        execute("-S gem install -l " + this.gemFile.getAbsolutePath());
    }

}
