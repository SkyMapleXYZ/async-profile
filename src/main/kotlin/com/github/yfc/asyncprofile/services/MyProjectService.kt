package com.github.yfc.asyncprofile.services

import com.github.yfc.asyncprofile.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
