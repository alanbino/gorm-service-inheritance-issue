package gorm.service.inheritance.issue.service

import gorm.service.inheritance.issue.domain.TangibleThing
import grails.gorm.services.Service

@Service(TangibleThing)
abstract class TangibleService {
    abstract List<TangibleThing> findAllByTangible(String tangible)
    abstract List<TangibleThing> findAllByTangibleAndInherit(String tangible, String inherit)
}
