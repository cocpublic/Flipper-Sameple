package com.bzl.plugin


import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {
    private static final String TAG = "MyPlugin";

    @Override
    void apply(Project project) {
        project.logger.error("MyPlugin apply")
    }
}