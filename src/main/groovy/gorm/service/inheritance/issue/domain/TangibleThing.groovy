package gorm.service.inheritance.issue.domain

import grails.gorm.annotation.Entity
import groovy.transform.CompileStatic

@CompileStatic
@Entity
class TangibleThing extends AbstractThing {

    String tangible
}
